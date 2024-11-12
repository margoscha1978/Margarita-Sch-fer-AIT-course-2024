package interesse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// создать тестовую версию программы тесты(вопрос - ответ)
// ввести возможность ввода с клавиатуры вопросов и ответов
// сохранять введенные вопросы и ответы
// вызывать их и тестировать возможности ответов(правильно - не правильно)
// вызывать определенное количество вопросов - здесь 5
// дать возможность пользователю выйти из программы

public class QuestionTrainer1 {
    private List<Question> questions;
    private static final String FILE_NAME = "questions.txt";

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

        Random random = new Random();
        // считываем ввод
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { // Пример: 5 вопросов за тест
            Question q = questions.get(random.nextInt(questions.size()));
            System.out.println("Вопрос: " + q.getQuestion());
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(q.getAnswer())) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно. Правильный ответ: " + q.getAnswer());
            }
        }
    }

    public static void main(String[] args) {
        QuestionTrainer1 trainer = new QuestionTrainer1();
        // считываем ввод
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить вопрос");
            System.out.println("2. Начать тестирование");
            System.out.println("0. Выход");

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
                        trainer.startTesting();
                        break;
                    case 0:
                        System.out.println("Выход...");
                        return; // Выход из программы
                    default:
                        System.out.println("Пожалуйста, выберите корректный пункт меню.");
                }
            } else {
                System.out.println("Пожалуйста, введите число.");
                scanner.nextLine(); // Очистка некорректного ввода
            }
        }
    }

} // klass ended
