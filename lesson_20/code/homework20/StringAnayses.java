package homework20;

import java.util.Scanner;

public class StringAnayses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        // Вызываем методы для анализа строки
        int totalChars = countTotalCharacters(input);
        int upperCaseChars = countUpperCaseCharacters(input);
        int digitChars = countDigitCharacters(input);
        int spaceChars = countSpaceCharacters(input);
        String sentenceType = determineSentenceType(input);

        // Вывод результатов
        System.out.println("Количество символов в строке: " + totalChars);
        System.out.println("Количество символов в верхнем регистре: " + upperCaseChars);
        System.out.println("Количество цифр: " + digitChars);
        System.out.println("Количество пробелов: " + spaceChars);
        System.out.println("Тип предложения: " + sentenceType);

        scanner.close();
    }

    public static int countTotalCharacters(String str) {
        return str.length();
    }

    public static int countUpperCaseCharacters(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countDigitCharacters(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaceCharacters(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
    }

    public static String determineSentenceType(String str) {
        if (str.endsWith("?")) {
            return "Вопросительное предложение";
        } else if (str.endsWith("!")) {
            return "Восклицательное предложение";
        } else {
            return "Повестительное предложение";
        }
    }
}
