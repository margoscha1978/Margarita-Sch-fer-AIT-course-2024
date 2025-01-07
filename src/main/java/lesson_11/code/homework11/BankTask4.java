package homework11;

import java.util.Scanner;

public class BankTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пин-код: ");
        String pinCode = scanner.next();
        System.out.println("Введите сдвиг для шифра Цезаря (от 0 до 9): ");
        int cipherCaesar = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < pinCode.length(); i++){

            char num = pinCode.charAt(i);
            if (num >= '0' && num <= '9') {
                char shiftedNum = (char) (num + cipherCaesar);

                if (shiftedNum > '9') {
                    shiftedNum = (char) (shiftedNum - 10);
                }
                result.append(shiftedNum);
            } else {
                result.append(num);
            }
        }
        System.out.println("Зашифрованный пин-код: " + result);

        scanner.close();
    }
}
