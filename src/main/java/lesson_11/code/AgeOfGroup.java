public class AgeOfGroup {
    public static void main(String[] args) {

       // massiv { 47, 49, 37,47,52,60,44, 34, 38, 59, 18, 38, 35, 41, 18, 43 }

        int[]ageOfGRoup = { 47, 49, 37,47,52,60,44, 34, 38, 59, 18, 38, 35, 41, 18, 43 };

        // vse zifri

        System.out.print( " Group age: " );
        for ( int age: ageOfGRoup ){

            System.out.print( age + " ");
        }

        // srednii vozrast

        int sum = 0;
        for ( int age : ageOfGRoup ) {
            sum += age;// summa
        }
        double averageAge = (double) sum / ageOfGRoup.length;
        System.out.println( " \n Average age of the group " + averageAge ) ;

    }//ende main

}// ende klass
