import java.util.Scanner;

public class Konstruktor {
    public static void main(String[] args) {
        // вводим строку
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dial line: ");
        String str = "I'am proud to learn Java! Java is the most famous programming language!!!";

        // первый символ
        char fristChar = str.charAt(0);
        System.out.println("First simbol: " + fristChar);

        // где в Java?position - позиция
        int javaPosition = str.indexOf("Java");
        System.out.println("Java position: " + javaPosition );

        // есть ли Java в предложении
        boolean  hasJava = javaPosition != -1 ;
        System.out.println("Is there a Java word here?: " + hasJava);

        // замена о на а
        String replaceString = str.replace("o","a");
        System.out.println("Replaces 'o' with 'a': " + replaceString);

        // верхний регистр
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // нижний регистр
        String lowerCase = str.toLowerCase();
        System.out.println("Lovwecase: " + lowerCase);

        // вырезаем Java
        String javaSubstring = str.substring(javaPosition,javaPosition + "java".length());
        System.out.println("Cut out the word Java: " + javaSubstring);

        // проверяем есть ли !!!
        String endsWithExclamation  = ("!!!");
        System.out.println("The line ended at: '!!!'?: " + endsWithExclamation);

        // начинается ли строка с определенных знаков, слов, символов - здесь "I'am proud
        boolean startsWithProud = str.startsWith("I'am proud: ");
        System.out.println(" The line starts with: 'I'am proud:':" + startsWithProud);

    }

} // klass ended
