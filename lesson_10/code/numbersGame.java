public class numbersGame {
    public static void main(String[] args) {

        //zadani chisla,naiti max element i indeks massiva

        int[] array = { 56, 73, -10, 37, -14, 24, 65, 33, 38 };

        int maxValue = array[0];//pervii element
        int maxIndex = 0;//indekc

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            maxIndex = i;

            }
        }

        System.out.println( " Index max = " + maxIndex  );
    }

}