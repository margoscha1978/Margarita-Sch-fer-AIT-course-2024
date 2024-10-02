import ClassWork14.ArrayMethods;

public class RandomNumbers {
    public static void main(String[] args) {

    // massiv 20 chisel sozdat,sortirovat,est li tam null?naiti indeks null i ego mesto esli nego net

   int[] numbers = new int[20];//sozdali massiv

        ArrayMethods.fillArray( -100,100,20);

        ArrayMethods.printArray(numbers);
        ArrayMethods.bubbleSort(numbers);
        ArrayMethods.printArray(numbers);

        int index = ArrayMethods.binarySearch(numbers,0);
        index = (index > 0) ? index : - index -1;

        System.out.println(index);
    }

}
