import java.util.Random;

public class Experiment {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[20];// chisla ot 10 do 30 proizvolnie

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(21) + 10;//chisla ot 10 do 30

        }

        System.out.println(" Sourse arrray");
        printArray(array);
        int temp = array[0];
        array[array.length - 1] = temp;
        System.out.println("Replacing elementcin an array ");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j + " ");
            System.out.println();
        }
    }
}