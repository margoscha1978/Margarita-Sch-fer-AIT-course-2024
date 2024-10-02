public class Power {
    public static void main(String[] args) {

    int pow = (int) Math.pow(3, 10);// casting,umstelluni auf eine ander model
        System.out.println(pow);

    // aufgabe

        int count = 0;// zikl parametr
        int res = 1;

        while (count < 10) {

         res = res * 3;
         count++;// endung von zikl parametr
            System.out.println( res + " = 3 in power " + count );

        }//zikl ende

    } //ende main
} //ende klass
