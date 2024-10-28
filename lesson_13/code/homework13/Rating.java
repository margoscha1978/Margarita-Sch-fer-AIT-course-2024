package homework13;
// Упражнение 3:Рейтинги театральных постановок: Напишите программу, которая
// запрашивает у пользователя количество театральных постановок и рейтинг каждой
// постановки (по шкале от 1 до 10). Программа должна вывести средний рейтинг всех
// постановок и определить постановку с наивысшим рейтингом.
// Пример ввода:
// Введите количество постановок: 3
// Введите рейтинг постановки 1: 8
// Введите рейтинг постановки 2: 9
// Введите рейтинг постановки 3: 7
// Пример вывода:
// Средний рейтинг всех постановок: 8.0
// Наивысший рейтинг у постановки 2: 9

import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Шаг 1: Ввод количества театральных постановок
        System.out.print("Введите количество постановок: ");
        int numPerformances = scanner.nextInt();

        // Массив для хранения рейтингов
        int[] ratings = new int[numPerformances];
        int totalRatings = 0;
        int highestRating = 0;
        int highestIndex = -1;

        // Шаг 2: Ввод рейтингов для каждой постановки
        for (int i = 0; i < numPerformances; i++) {
            System.out.print("Введите рейтинг постановки " + (i + 1) + ": ");
            ratings[i] = scanner.nextInt();
            totalRatings += ratings[i]; // Суммируем рейтинги

            // Проверяем, является ли текущий рейтинг наивысшим
            if (ratings[i] > highestRating) {
                highestRating = ratings[i];
                highestIndex = i + 1; // Сохраняем номер постановки (индекс + 1)
            }
        }

        // Шаг 3: Подсчет среднего рейтинга
        double averageRating = (double) totalRatings / numPerformances;

        // Шаг 4: Вывод результатов
        System.out.printf("Средний рейтинг всех постановок: %.1f\n", averageRating);
        System.out.println("Наивысший рейтинг у постановки " + highestIndex + ": " + highestRating);

        // Закрываем сканер
        scanner.close();

    }

} // klass ende