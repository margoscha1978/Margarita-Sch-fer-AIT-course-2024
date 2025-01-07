package interesse;
/*
Обзор программы
Пользователь может добавлять вопросы и ответы в программу.
По истечении времени пользователю нужно будет ответить на вопрос.
Если ответ неверный, программа покажет правильный ответ.
Используем таймер для того, чтобы задавать временные ограничения на ответ.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizTrainer {
    private static final int ANSWER_TIME_LIMIT = 10; // Время на ответ в секундах
    private Map<String, String> questions = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addQuestion(String question, String answer) {
        questions.put(question, answer);
    }

    public void startQuiz() {
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            askQuestion(entry.getKey(), entry.getValue());
        }
        System.out.println("Тренировка завершена!");
    }

    private void askQuestion(String question, String correctAnswer) {
        System.out.println("Вопрос: " + question);
        Timer timer = new Timer();
        final boolean[] answered = {false};

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!answered[0]) {
                    System.out.println("\nВремя вышло! Правильный ответ: " + correctAnswer);
                }
                System.exit(0); // Завершить программу при истечении времени
            }
        }, ANSWER_TIME_LIMIT * 1000); // Таймер в миллисекундах

        System.out.print("Ваш ответ: ");
        String userAnswer = scanner.nextLine();
        answered[0] = true;
        timer.cancel(); // Остановить таймер

        // Проверка ответа
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Верно!\n");
        } else {
            System.out.println("Неверно! Правильный ответ: " + correctAnswer + "\n");
        }
    }

    public static void main(String[] args) {
        QuizTrainer quizTrainer = new QuizTrainer();
        quizTrainer.addQuestion("Какой язык программирования используется для разработки Android?",
                "Java");
        quizTrainer.addQuestion("Что означает OOP?", "Объектно-ориентированное программирование");
        quizTrainer.addQuestion("Сколько бит в байте?", "8");

        quizTrainer.startQuiz();
    }

} // klass ended

/*
Объяснение кода:
1. Добавление вопросов и ответов: Используем HashMap для хранения вопросов и ответов.
2. Таймер: Мы используем класс Timer для создания таймера, который будет отсчитывать 10 секунд на ответ.
   Если время истекает, программа сообщает, что время вышло, и выводит правильный ответ.
3. Проверка ответа: После получения ответа от пользователя программа проверяет его на соответствие правильному ответу
   и выводит соответствующее сообщение.
4. Главный метод: Здесь вы добавляете вопросы и запускаете проверку.
*/