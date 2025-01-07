import java.util.Scanner;

public class BankDepost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Deposit amout (s) : ");
        double intialDeposit = scanner.nextDouble();// summa s
        System.out.println( " Number of years (n) : ");
        int years = scanner.nextInt();//kolichestvo let

        double interestRate = 0.03;
        double finalAmount = intialDeposit  + (intialDeposit * interestRate * years );

        // proverjaem godi
        for (int i = 0; i < years; i++) {
            finalAmount *=1.03;// 3% na vklad kaschdii god
        }
        System.out.printf("The deposit amount in: " + years + " Years will be : " + String.format( " %.2f",finalAmount ) + " rubel " ) ;

    }
}
