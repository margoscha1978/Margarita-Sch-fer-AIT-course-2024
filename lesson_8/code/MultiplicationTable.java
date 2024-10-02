public class MultiplicationTable {
    public static void main(String[] args) {

        // zikl v zikle,proverka
        int i =1, j = 1;

        while ( i <= 10) {

            while ( j <= 10) {

                System.out.println( i + " x " + j + " = " + ( i * j ) + "  " );// x znak dlja tablizi
                j++;

         } // j ende

         j = 1;
          i++;
            System.out.println();//perexod na stroki

        }// i ende

    } // end main
}// end klass
