import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // skaner napisannogo
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Dial line: ");
        String userInput = scanner.nextLine();

        // schitaem slova
        String[] words = userInput.split( "\\s+");
        int wordCount = words.length;

        //schitaem bukwi
        int letterCount = userInput.replace(" ","").length();
        // perevorot stroki,clova
        String reversedString = new StringBuilder(userInput).reverse().toString();

        //print
        System.out.println(" Number of words per line: " + wordCount);
        System.out.println(" Number of letters per line: " + letterCount);
        System.out.println( "Reverses a string: " + reversedString);
        System.out.println();

    }
}
