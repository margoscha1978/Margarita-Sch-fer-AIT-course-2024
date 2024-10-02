import ClassWork14.ArrayMethods;

public class PositiveNumbers {
    public static void main(String[] args) {

        int [] numbers = ArrayMethods .fillArray(-100, 100, 20);
        ArrayMethods.printArray(numbers);
        int positive = countPositiveNumbers(numbers);
        System.out.println("Positive numbers in array: " + positive);

    }

    public static int countPositiveNumbers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
            }
        }
        return count;
    }
}
