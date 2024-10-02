package ClassWork14;

import ClassWork14.ArrayMethods;

public class ArrayMethodAppl {
    public static void main(String[] args) {

        // create array with random numbers
//        int[] myArray = ArrayMethods.fillArray(0, 100, 10);
//
//        // print array
//        ArrayMethods.printArray(myArray);
//
//        // sort array
//        ArrayMethods.bubbleSort(myArray);
//
//        // print array
//        ArrayMethods.printArray(myArray);

        int[] newArray =  ClassWork14.ArrayMethods.fillArray(1, 20, 6);
        ClassWork14.ArrayMethods.printArray(newArray);
        ClassWork14.ArrayMethods.reverseArray(newArray);
        ClassWork14.ArrayMethods .printArray(newArray);

//        int[] myArray = ArrayMethods.fillArray(-10, 10, 20);
//
//        ArrayMethods.printArray(myArray);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number for searching: ");
//        int n = scanner.nextInt();
//
//        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
//        System.out.println("Number " + n + " is in array: " + isInArray);

//        int[] myArray = {10, 20, 30, 40, 50};
//        System.out.println(ArrayMethods.linearSearch(myArray, 10));
//        System.out.println(ArrayMethods.linearSearch(myArray, 100));
//
//        System.out.println("-------------------------------------------");
//
//        int index = ArrayMethods.binarySearch(myArray, 20);
//        System.out.println(index);

    }

}
