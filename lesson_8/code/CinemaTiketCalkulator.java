import java.util.Scanner;

public class CinemaTiketCalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double basePrise = 10.0;// standart Tiket

        //daten und status von Mensch
        System.out.println(" enter data pls... ( rentner, standart, student): ");//student,rentner,standart
        String status = scanner.nextLine();
        double basePrice = 10.0;

        //interrese für VIP
        System.out.println(" wollen Sie VIP Ticket ? ( ja, nein ) ");// ja.nein
        String isVIPin = scanner.nextLine();
        boolean isVIP = isVIPin == (" ja" );
        System.out.println();

        //rabbat
        if (status == "student") {
            basePrice *= 0.9;// 10%
        }
        if (status == "rentner") {
            basePrice *= 0.75;//25%
        }
        if (isVIP) {
            basePrice *= 1.25;
        }
        System.out.println( " Price of Ticket: %.2f " + basePrice );
        System.out.println();

        }
    }

