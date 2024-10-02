import java.util.Scanner;

public class Konstruktor {
    public static void main(String[] args) {
        // vvod stroki
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dial line: ");
        String str = "I'am proud to learn Java! Java is the most famous programming language!!!";

        // 1 simvol
        char fristChar = str.charAt(0);
        System.out.println("First simbol: " + fristChar);

        // gde Java?position
        int javaPosition = str.indexOf("Java");
        System.out.println("Java position: " + javaPosition );

        //est li Java v predlochwnii
        boolean  hasJava = javaPosition != -1 ;
        System.out.println("Is there a Java word here?: " + hasJava);

        //zamena o na a
        String replaceString = str.replace("o","a");
        System.out.println("Replaces 'o' with 'a': " + replaceString);

        //vrchnii registr
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        //nocshnii registr
        String lowerCase = str.toLowerCase();
        System.out.println("Lovwecase: " + lowerCase);

        //viresaem Java
        String javaSubstring = str.substring(javaPosition,javaPosition + "java".length());
        System.out.println("Cut out the word Java: " + javaSubstring);

        // prowerka est li !!!
        String endsWithExclamation  = ("!!!");
        System.out.println("The line ended at: '!!!'?: " + endsWithExclamation);

        // nachinaetsja li stroka c  "I'am proud
        boolean startsWithProud = str.startsWith("I'am proud: ");
        System.out.println(" The line starts with: 'I'am proud:':" + startsWithProud);

    }
}
