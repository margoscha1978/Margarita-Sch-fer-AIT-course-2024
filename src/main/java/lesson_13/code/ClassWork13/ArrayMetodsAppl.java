package ClassWork13;

public class ArrayMetodsAppl {

    private static int  n;

    public static void main(String[] args) {

      int[] myArray =  { 10, 20, 30, 40, 50};
        
        System.out.println( ArrayMethods.linearSearch(myArray, 10 ));
        System.out.println(ArrayMethods.linearSearch(myArray, 100));

        System.out.println("------------------------ ");// novoe zadanie

        int index = ArrayMethods.binarySearch(myArray,25);
        System.out.println(index);

        System.out.println("------------------------ ");



    }
}
