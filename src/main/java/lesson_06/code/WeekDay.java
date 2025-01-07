import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input number of Day...");
        int weekDay = scanner.nextInt();

        switch (weekDay) {
            case 1 -> {
                System.out.println("This is Mondey");
            }
            case 2 -> {
                System.out.println("This is Tuesdey");
            }
            case 3 -> {
                System.out.println("This is Wensdey");
            }
            case 4 -> {
                System.out.println("This is Thursday");
            }
            case 5 -> {
                System.out.println("This is Friday");
            }
            case 6 -> {
                System.out.println("This is Saturday");
            }
            case 7 -> {
                System.out.println("this is Sunday");
            }
            default -> System.out.println("Wrong input!");
        }
       switch (weekDay){
            case 1, 2, 3, 4, 5 ->{
           System.out.println("This is Woorkday");
       }
        case 6, 7 -> {
            System.out.println("Weekend!");
        }
        default -> System.out.println("Wrong Input!");
        }


        } //end of main
    }//end of klass
