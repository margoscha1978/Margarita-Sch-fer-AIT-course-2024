package homework17;
import javax.sound.sampled.*;
        import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExperimentGuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            int randomNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            int timeLimit = 30; // Ограничение времени в секундах
            long startTime = System.currentTimeMillis();
            boolean correctGuess = false;

            // Запуск потока для отображения таймера
            new Thread(() -> {
                for (int i = timeLimit; i > 0; i--) {
                    System.out.println("Осталось времени: " + i + " секунд");
                    try {
                        Thread.sleep(100); // Ждем 1 секунду
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            System.out.println("Я загадала число от 1 до 100, попробуйте угадать... У вас " + timeLimit + " секунд.");

            while (!correctGuess && attempts < maxAttempts) {
                // Проверка времени
                long elapsedTime = (System.currentTimeMillis() - startTime) / 100; // время в секундах
                if (elapsedTime >= timeLimit) {
                    playSound("time_up.wav"); // Звуковой файл проекте
                    System.out.println("Время вышло! Загаданное число было: " + randomNumber);
                    break; // Завершаем цикл
                }

                System.out.println("Пожалуйста, введите число от 1 до 100: ");
                int guess = getUserInput(scanner);

                attempts++; // Увеличиваем количество попыток

                // Игра
                if (guess < randomNumber) {
                    System.out.println(guess <= randomNumber - 20 ?
                            "Число слишком маленькое, попробуйте больше..." :
                            "Число маленькое, но ближе... Попробуйте чуть больше...");
                } else if (guess > randomNumber) {
                    System.out.println(guess >= randomNumber + 20 ?
                            "Это число слишком большое, выберите меньше..." :
                            "Это близкое число, попробуйте уменьшить его немного...");
                } else {
                    correctGuess = true; // Угадали
                }
            }

            if (correctGuess) {
                System.out.println("Поздравляем, вы угадали число " + randomNumber + " за " + attempts + " попыток.");
            }

            // Спрашиваем пользователя
            System.out.println("Хотите сыграть ещё? (yes/no): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Вы играли отлично, приходите снова!");
        scanner.close();
    }

    private static int getUserInput(Scanner scanner) {
        while (true) {
            try {
                int guess = Integer.parseInt(scanner.nextLine());
                if (guess < 1 || guess > 100) {
                    System.out.println("Введите число от 1 до 100, попробуйте снова...");
                } else {
                    return guess; // Ввели верно, выходим из цикла
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное число от 1 до 100...");
            }
        }
    }

    // Метод для проигрывания звука
    public static void playSound(String soundFile) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}