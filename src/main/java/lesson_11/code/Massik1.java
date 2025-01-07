public class Massik1 {
    public static void main(String[] args) {

     // zadaem macciv { 65, 37, 51, -17, 73, -41, 52, 56, -55, 83 }

        int[] numbers = { 65, 37, 51, -17, 73, -41, 52, 56, -55, 83 };

        int maxNumber = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers [i] > maxNumber ) {
                maxNumber  = numbers [i];
                maxIndex  = i;

            }

        }

        // menjaem mestami

        int temp = numbers[0];
        numbers[0] = numbers[maxIndex];
        numbers[maxIndex] = temp;

        System.out.println( " Maxsimale number: " + maxNumber );
        System.out.println(" Maxsimale index: " + maxIndex );

        System.out.print( " Array with maximum number first: ");
        for (int number : numbers) {

            System.out.print( number + " ");

        }

    }// ende main

}// ende klass
