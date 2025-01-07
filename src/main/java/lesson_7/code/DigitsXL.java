import java.util.Scanner;

public class DigitsXL {
    public static void main(String[] args) {
        // 1 725
        // 1 725 % 10 = 5 erste von rechts
        //1 725 / 10 = 1 72
        // zikl teilen 1 725 auf 10 > 0

        Scanner scanner = new Scanner(System.in);

        System.out.println( " input positive integer number: " );
        int number = scanner.nextInt();
        int summ = 0;

        while (number > 0) {
            summ = summ + number % 10;
            number = number / 10;// parametr von zikl
        }

        System.out.println(" Sum of digits ist " + summ );



    }//ende zikl
}//ende klass





