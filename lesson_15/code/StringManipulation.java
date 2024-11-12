import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // сканируем то, что написал пользователь
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Dial line: ");
        String userInput = scanner.nextLine();

        // считаем слова
        String[] words = userInput.split( "\\s+");
        int wordCount = words.length;

        // считаем буквы
        int letterCount = userInput.replace(" ","").length();
        // переворот строки или слова
        String reversedString = new StringBuilder(userInput).reverse().toString();

        // print - печатаем
        System.out.println(" Number of words per line: " + wordCount);
        System.out.println(" Number of letters per line: " + letterCount);
        System.out.println( "Reverses a string: " + reversedString);
        System.out.println();

    }
} // klass ended
