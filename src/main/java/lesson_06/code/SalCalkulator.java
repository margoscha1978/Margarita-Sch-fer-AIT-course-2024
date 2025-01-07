import java.util.Scanner;

public class SalCalkulator {
    public static void main(String[] args) {

        double baseSalary = 500.0;
        double bonusPercentage = 0.0;
        double finalSalary;

        Scanner scanner = new Scanner(System.in);
        // zuzahlung %
        System.out.println("Number of years of experienze?");
        int yearsOfExsperience = scanner.nextInt();
        //%
        if (yearsOfExsperience >= 15) {
            bonusPercentage = 1.5; //150%
        } else if(yearsOfExsperience >= 10) {
            bonusPercentage = 1.0; // 100%
        } else if (yearsOfExsperience >= 5) {
            bonusPercentage = 0.5; //50%
        } else if (yearsOfExsperience >= 3) {
            bonusPercentage = 0.1; //10%
        }
        // lohn
        finalSalary = baseSalary + (baseSalary * bonusPercentage);
        System.out.println("FinalSalary " + finalSalary );



    }//ende main
}// ende klass

