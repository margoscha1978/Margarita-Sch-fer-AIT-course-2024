import java.util.Scanner;
public class DraftTrafik {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("Input color of light (green, yellow, red): ");

String color = scanner.nextLine();

        switch (color){
        case"green":
        System.out.

println("Green! You can ride!");
                break;
                        case"yellow":
                        System.out.

println("Yellow! Be ready to stop or ride.");
                break;
                        case"red":
                        System.out.

println("Red! Stop!");
                break;
default:
        System.out.

println("Wrong input!");
}//main ende
        }
                }//class ende
