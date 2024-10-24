package homework11;
//номер карты банка, группировка по 4 цифры

import java.util.Scanner;

public class BankAppTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер банковской карты (16 цифр): ");
        String cardNumber = scanner.nextLine();

        if (cardNumber.length() == 16) {

            String formattedCardNumber = cardNumber.substring(0, 4) + " " +
                    cardNumber.substring(4, 8) + " " +
                    cardNumber.substring(8, 12) + " " +
                    cardNumber.substring(12, 16);

            System.out.println("Отформатированный номер карты: " + formattedCardNumber);
        } else {
            System.out.println("Номер карты должен содержать ровно 16 цифр.");
        }
        scanner.close();

    }// main ende

} // klass ende
