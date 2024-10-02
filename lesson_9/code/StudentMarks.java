public class StudentMarks {
    public static void main(String[] args) {

    // v attestate 20 ozenok,nahodim srednii ball

        int[] marks= { 1,6,1,3,4,2,1,2,5,6,1,2,3,4,5,6,1,2,1,2 };//massiv gotov,zadali.

        // summa vsex ozenok.

        int sum= 0;// mochno zadati i doubl,esli znaem,chto budet zapjataja

        for (int i = 0; i < marks.length; i++) {

            sum= sum + marks[i]; //otsilka na massiv int[]marks.

        }

        System.out.println( "Sum = " + sum);

        // srednii ball studenta

        double averageMark= (double)sum / marks.length; // chislo droblennoe,est chisla posle sapjatoi,kasting v double;
                                                       //double daet ostatki cheres zapjatuju.

        System.out.println( "Average mark = " + averageMark );

    }
}
