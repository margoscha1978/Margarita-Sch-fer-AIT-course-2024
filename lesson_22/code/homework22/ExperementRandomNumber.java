package homework22;

public class ExperementRandomNumber {
    public static void main(String[] args) {
        RandomNumberArray randomArray = new RandomNumberArray(100);

        System.out.println("Количество положительных чисел: " + randomArray.countPositive());
        System.out.println("Количество отрицательных чисел: " + randomArray.countNegative());
        System.out.println("Количество нулей: " + randomArray.countZeros());
        System.out.println("Количество четных чисел: " + randomArray.countEven());
        System.out.println("Количество нечетных чисел: " + randomArray.countOdd());

    }
}
