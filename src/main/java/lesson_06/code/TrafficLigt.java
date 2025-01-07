import java.util.Scanner;

public class TrafficLigt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// info für Nutzer
        System.out.println("Enter a Number ( 1 - rot, 2 - yellow,3 - green):");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println(" Red - Stop! ");
        } else if (input == 2) {
            System.out.println(" Yellow - Wait! ");
        } else if (input == 3) {
            System.out.println(" Geen - Go! ");
        }
    }//main ende
}//klass ende


