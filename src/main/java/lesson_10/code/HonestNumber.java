import java.util.Arrays;

public class HonestNumber {
    public static void main(String[] args) {

        int[] honestNumbers = new int[26];// dlinna macciva

        // racpechatat chetnie chisla

        for (int i = 0; i < honestNumbers.length; i++) {

            honestNumbers[i] = i * 2;//chetnie

        }

        System.out.println(" Honest  numbers from 0 to 50 in asceding ordner: ");
        System.out.println(Arrays.toString(honestNumbers));

        System.out.println(" Honest  numbers from 50 to 0 in desceding ordner: ");

        reverseArray(honestNumbers);
        System.out.println(Arrays.toString(honestNumbers) );
    }
        private static void reverseArray(int[]array) {

            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;

            }

        }

    }

