package interesse;

import java.io.*;
import java.util.*;

import static homework15.Accounting.scanner;

// создать тестовую версию программы тесты(вопрос - ответ)
// ввести возможность ввода с клавиатуры вопросов и ответов
// сохранять введенные вопросы и ответы
// вызывать их и тестировать возможности ответов(правильно - не правильно)
// вызывать определенное количество вопросов - здесь 5
// дать возможность пользователю выйти из программы

public class QuestionTrainer1 {
    private List<Question> questions;
    private static final String FILE_NAME = "questions.txt";
    private static final int ANSWER_TIME_LIMIT = 30; // Таймер на 30 секунд

    public QuestionTrainer1() {
        questions = loadQuestions();
    }

    public void addQuestion(String question, String answer) {
        questions.add(new Question(question, answer));
        saveQuestions();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void saveQuestions() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Question q : questions) {
                writer.write(q.getQuestion() + "|" + q.getAnswer());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Question> loadQuestions() {
        List<Question> loadedQuestions = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return loadedQuestions; // Возвращаем пустой список, если файла нет
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 2) {
                    loadedQuestions.add(new Question(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedQuestions;
    }

    public void startTesting() {
        if (questions.isEmpty()) {
            System.out.println("Нет вопросов для тестирования.");
            return;
        }
        Random random = new Random(); // Генератор случайных чисел
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Math.min(5, questions.size()); i++) { // Ограничиваем до доступного числа вопросов
            Question q = questions.get(random.nextInt(questions.size()));
            askQuestion(q);
        }
    }

    private void askQuestion(Question question) {
        System.out.println("Вопрос: " + question.getQuestion());
        Timer timer = new Timer();
        final boolean[] answered = {false}; // Флаг, чтобы отслеживать, отвечен ли вопрос

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!answered[0]) {
                    System.out.println("\nВремя вышло! Правильный ответ: " + question.getAnswer());
                }
                System.exit(0); // Завершить программу при истечении времени
            }
        }, ANSWER_TIME_LIMIT * 1000); // Таймер в миллисекундах

        System.out.print("Ваш ответ: ");
        String userAnswer = scanner.nextLine();
        answered[0] = true; // Установить флаг ответ
        timer.cancel(); // Остановить таймер

        // Проверка ответа
        if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
            System.out.println("Правильно!\n");
        } else {
            System.out.println("Неправильно. Правильный ответ: " + question.getAnswer() + "\n");
        }
    }

    public static void main(String[] args) {
        QuestionTrainer1 trainer = new QuestionTrainer1(); // Создаем экземпляр тренера
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить вопрос");
            System.out.println("2. Начать тестирование");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка ввода

                switch (choice) {
                    case 1:
                        System.out.print("Введите вопрос: ");
                        String question = scanner.nextLine();
                        System.out.print("Введите ответ: ");
                        String answer = scanner.nextLine();
                        trainer.addQuestion(question, answer); // Добавляем вопрос
                        System.out.println("Вопрос добавлен!");
                        break;
                    case 2:
                        trainer.startTesting(); // Начинаем тестирование
                        break;
                    case 0:
                        System.out.println("Выход...");
                        scanner.close();
                        return; // Выход из программы
                    default:
                        System.out.println("Некорректный выбор, попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод. Пожалуйста, введите число.");
                scanner.nextLine(); // Очистка некорректного ввода
            }
        }
    }
} // klass ended