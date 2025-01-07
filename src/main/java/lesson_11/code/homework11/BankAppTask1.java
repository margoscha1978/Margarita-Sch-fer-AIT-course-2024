package homework11;

import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у
 * пользователя номер банковской карты (16 цифр)
 * и выводит его в отформатированном виде с разделением на группы по
 * 4 цифры, например: “1234 5678 9101 1121”.
 *
 * Write a program that asks the user for a bank card number (16 digits)
 * and outputs it in a formatted way with groups of 4 digits,
 * for example: “1234 5678 9101 1121”.
 */
public class BankAppTask1 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения пользовательского ввода
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод номера карты
        // Prompt the user to enter the card number
        System.out.print("Введите номер банковской карты (16 цифр): ");
        String cardNumber = scanner.nextLine().trim(); // Читаем строку и удаляем пробелы по краям
        // Read the input string and trim any surrounding spaces

        // Проверяем, что длина введенного номера карты равна 16
        // Check if the entered card number has exactly 16 digits
        if (cardNumber.length() == 16) {

            // Форматируем номер карты с пробелами между каждыми 4 цифрами
            // Format the card number with spaces between every 4 digits
            String formattedCardNumber = cardNumber.substring(0, 4) + " " +
                    cardNumber.substring(4, 8) + " " +
                    cardNumber.substring(8, 12) + " " +
                    cardNumber.substring(12, 16);

            // Выводим отформатированный номер карты
            // Output the formatted card number
            System.out.println("Отформатированный номер карты: " + formattedCardNumber);
        } else {
            // Выводим сообщение об ошибке, если номер карты не 16 символов
            // Output an error message if the card number is not 16 digits long
            System.err.println("Номер карты должен содержать ровно 16 цифр.");
        }
        // Закрываем сканер
        // Close the scanner
        scanner.close();
    }

}// klass ende

