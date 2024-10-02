import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        // 5 467
        // 5 467 % 10 = 7 erste von rechts
        //5 467 / 10 = 546
        // zikl teilen 5 467 auf 10 > 0

        Scanner scanner = new Scanner(System.in);
        System.out.println( " input positive integer number: " );
        int number = scanner.nextInt();
        int number1 = number;
        int count = 0;

        while (number > 0 ){

            number = number / 10; // parametr von zikl
            System.out.println(number);
            count++;

        }//ende zikl

        System.out.println( " Digits in number " + number1 + " are = " + count );

    }//ende main
} // ende klass



