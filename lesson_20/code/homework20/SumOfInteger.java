package homework20;

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа, разделенные пробелами:");

        // Считываем строку от пользователя
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+"); // Разделяем строку по пробелам

        int sum = 0;

        // Обрабатываем каждое число из массива строк
        for (String numStr : numbers) {
            try {
                // Преобразуем строку в объект Integer и получаем его значение
                Integer number = Integer.valueOf(numStr);
                sum += number; // Добавляем к сумме
            } catch (NumberFormatException e) {
                System.out.println(numStr + " не является целым числом, пропускаем.");
            }
        }

        // Выводим итоговую сумму
        System.out.println("Сумма целых чисел: " + sum);

        scanner.close();
    }
}