package lesson_42.homework42;
/*
Задание 2: Запись отзыва о путешествии в файл
1. Создание файла для отзыва:
   - проверить, что есть файл с именем travel_review.txt в той же папке проекта. Если его нет, программа его создаст.
2. Импортируем необходимые классы:
   -  для записи в файл и считывания с консоли:
3. Запрос отзыва у пользователя:
   - Используем Scanner для чтения отзыва:
   Scanner scanner = new Scanner(System.in);
   System.out.println("Please enter your review:");
   String review = scanner.nextLine();
4. Записываем отзыв в файл:
   - используем метод Files.writeString с опцией APPEND:
   Path reviewPath = Paths.get("travel_review.txt");
   Files.writeString(reviewPath, review + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
5. Вывод сообщения об успешной записи:
   - После записи, выведи сообщение подтверждения:
   System.out.println("Your review has been saved!");
 */
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Scanner;

public class TravelReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your review:");
        String review = scanner.nextLine();

        Path reviewPath = Paths.get("travel_review.txt");
        try {
            Files.writeString(reviewPath, review + System.lineSeparator(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            System.out.println("Your review has been saved!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

} // klass ended

