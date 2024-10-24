package ClassWork12;

import java.util.Random;
import java.util.Scanner;

public class ArrayAndMetods {
    public static void main(String[] args) {

        //slichainie chisla ot 1do 100,zapros k polzovatelju,metod,kotori ischet chislo,naiti ego

        Random random = new Random();

        //zapolhjaem massiw

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
            // raspechateem

            printArray(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" input positive integer number : ");
        int n = scanner.nextInt();//vvod polzovatelja

        boolean isInArray = searchInArray(numbers, n);

        System.out.println( " Number " + n + " is in array : " + isInArray );

    }//ende main


    private static boolean searchInArray(int[] numbers, int n) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
return true;
            }
        }
        return false;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println( "             ");
    }

}//ende klass