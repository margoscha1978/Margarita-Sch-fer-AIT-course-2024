package homework11;

import java.util.Scanner;

public class BankAppTask3 {
    static int balance;
    static String operator;
    static int sum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your start balance: ");
        balance = scanner.nextInt();
        scanner.nextLine();
        while (true) {
            System.out.println("Enter operator('+' for top up/'-' for withdrawal): ");
            operator = scanner.nextLine();if (operator.equals("+") || operator.equals("-")) {
                System.out.println("Enter the amount: ");
                sum = scanner.nextInt();
                scanner.nextLine();
                performOperation();
            } else {
                System.out.println("Invalid request");
                System.out.println("Your balance is: " + balance);
            }
            System.out.println("Do you want to continue(Press '000' to exit or 'yes' to continue)?");
            String exit = scanner.nextLine();
            if (exit.equals("000")) {
                break;
            }
        }
        scanner.close();
    }

    public static void performOperation() {
        //switch-case !!!
        if (operator.equals("+")) {
            balance += sum;
            System.out.println("The operation was successful!");
            System.out.println("Your balance is: " + balance);
        } else if (operator.equals("-")) {
            if (balance > sum) {
                balance = balance - sum;
                System.out.println("The operation was successful!");
                System.out.println("Your balance is: " + balance);
            } else {
                System.out.println("Not enough funds");
                System.out.println("Your balance is: " + balance);
            }
        }
    }
}
