package homework11;
/*
Упражнение 3: Проверка формата банковского счета (IBAN)
Задание:
Напишите программу, которая запрашивает у пользователя номер
банковского счета в формате IBAN и проверяет его на
соответствие длине (например, для немецкого IBAN — 22 символа).
Подсказки:
• Используйте метод length() для проверки длины строки.
Пример:
Введите номер IBAN: DE89370400440532013000
Вывод:
IBAN корректен.
 */

import java.util.Scanner;

public class BankAppTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your IBAN or 0 to exit: ");
            String iban = scanner.nextLine().trim();
            String stop = "0";
            String message = "Your IBAN is not correct!!! Enter your IBAN again";

            if (stop.equalsIgnoreCase(iban)) {
                System.out.println("Goodbye!!!");
                break;
            }

            else if (iban.isEmpty()) {
                System.out.println(message);

            } else {

                String lettersPart = iban.substring(0, 2);
                // int letterConvert = Integer.parseInt(letterPart);
                String lettersPartToUpperCase = lettersPart.toUpperCase();

                if (lettersPartToUpperCase.equals("DE") && (iban.length() == 22)) {
                    System.out.println(" Your IBAN is correct: ");
                    break;

                } else {
                    System.out.println(message);
                }
            }
        }

        while (true);
        scanner.close();

    }

}// klass ende

// int letterConvert = Integer.parseInt(lettersPart); //"2" --> 2
// letterPart.matches(\\d+) || letterPart.matches(“.*[0-9]+.*“)