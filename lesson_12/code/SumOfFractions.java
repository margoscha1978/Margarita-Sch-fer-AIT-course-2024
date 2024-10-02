import java.util.Scanner;

public class SumOfFractions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" Bitte zahl n : ");

            while (!scanner.hasNext()) {
                System.out.println(" bitte,korrekte zahl. ");
                scanner.next();
            }
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(" bitte pozitive zahl. ");
                return;
            }
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }

            System.out.printf(" Summe vom 1 bis 1%d ist : %. 5f\n",n,sum);


        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}