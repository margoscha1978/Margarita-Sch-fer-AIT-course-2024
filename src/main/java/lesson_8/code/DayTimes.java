import java.util.Scanner;

public class DayTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int stunde;
        while (true) {
            System.out.println(" Wie spät es ist ? ( 0- 23): ");
            stunde = scanner.nextInt();

            if (stunde >= 0 && stunde <= 23) {
                break;
            } else {
                System.out.println(" Fehler: Zahl von 0 bis 23 ");
            }
        }
        if (stunde >= 5 && stunde < 12) {
            System.out.println(" Guten Morgen! ");
        } else if (stunde >= 12 && stunde < 18) {
            System.out.println(" Gute Tag ! ");
        } else if (stunde >= 18 && stunde < 22) {
            System.out.println(" Guten Abend ! ");
        } else {
            System.out.println(" Gute Nacht ! ");
        }
    }

}

