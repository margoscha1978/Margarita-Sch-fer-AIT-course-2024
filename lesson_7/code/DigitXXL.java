import java.util.Scanner;

public class DigitXXL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input positive integer number");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("input positive integer number ");
        }
        int sum = 0;
        int number1 = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
            System.out.println(" number: " + digit + "sum: " + sum);
        }
        System.out.println(" sum " + number1 + " = "  +  sum );
    }
}


