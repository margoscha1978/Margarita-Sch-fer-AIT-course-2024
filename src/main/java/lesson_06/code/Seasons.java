 import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number from 1 to 12: ");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("It's spring.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("It's sommer.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("It's autumn.");
                break;
            default:
                System.out.println("Wrong input! Enter from 1 to 12.");
                break;
        }

        scanner.close();
    }//end of main
}


