import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many years have you been working?");
        int years = scanner.nextInt();
        double salary = 500;
        double finalSalary = totalSalary(salary, years);

        System.out.println("Final salary: " + finalSalary + " $");
    }
    public static double totalSalary(double salary, int years) {
        double bonus = 0;

        if (years >= 15) {
            bonus = 150;
        } else if (years >= 10) {
            bonus = 100;
        } else if (years >= 5) {
            bonus = 50;
        } else if (years >= 3) {
            bonus = 10;
        }
        return salary + (salary * bonus / 100);
    }
}
