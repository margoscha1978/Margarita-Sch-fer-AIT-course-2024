import java.util.Scanner;

public class DraftTrafikLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "LightColor( 1 - Red, 2 - Yellow, 3 - Green): ");
        int lightColor = scanner.nextInt();
        if ( lightColor == 1) {
            System.out.println( "Stop!");
        } else if ( lightColor == 2) {
            System.out.println("Wait!");
        } else if ( lightColor == 3) {
            System.out.println( "Go!!!");

        }

    }//main
}//klass
