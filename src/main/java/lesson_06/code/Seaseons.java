import java.util.Scanner;

public class Seaseons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput number os Seaseon");

        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1 -> {
                System.out.println("January");
            }
           case 2 -> {
               System.out.println("February");
            }
            case 3 -> {
                System.out.println("March");
            }
            case 4 -> {
                System.out.println("April");
            }
            case 5 -> {
                System.out.println("Maybe");
            }
            case 6 -> {
                System.out.println("June");
            }
            case 7 -> {
                System.out.println("Juli");
            }
            case 8-> {
                System.out.println("August");
            }
            case 9 -> {
                System.out.println("September");
            }
            case 10 -> {
                System.out.println("Oktober");
            }
            case 11 -> {
                System.out.println("November");
            }
            case 12 -> {
                System.out.println("Decembr");
            }
            default  -> System.out.println("Wrong imput...");
        }

        switch (monthNumber) {

          case  1, 2, 12  -> {
              System.out.println(" This is Winter");
          }
          case  3, 4, 5 -> {
              System.out.println("This is Spring");
          }
          case 6, 7, 8 -> {
              System.out.println("This is Summer");
          }
          case 9, 10, 11 -> {
              System.out.println("This is Autumm");
          }
          default -> System.out.println("Wrong imput!");

        }
    } //main
} //klass
