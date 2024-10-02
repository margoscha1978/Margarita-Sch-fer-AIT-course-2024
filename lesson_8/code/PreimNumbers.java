import java.util.Scanner;

public class PreimNumbers {
    public static void main(String[] args) {

// vvodim naturalnoe chislo,i reschaem prostoe li ono,to est delitsja na samo sebja ili na odin
// zapretit otrizatelnoe chislo
        // 31, 37...11, 13...17, 19...2, 3, 5, 7...59, 61...79...

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input integer positive number: ");

        int number = scanner.nextInt();

        // proverka na tochnost chisla, otrizatelnoe ne rabotaet

        while (number <= 0) {

            System.out.println(" Wrong input! ");
            System.out.println(" Ty again,pls...");
            number = scanner.nextInt();

        } //ende zikl

        boolean isPreim = isPreimNumber(number);
        System.out.println( number + " is preim " + isPreim );

    }// main ende
private static boolean isPreimNumber(int number) {

    int div = 2;

    while (div < number) {

        if (number % div == 0) {

            return false;

        }

    div++;
}

return true;

} //while ende

}// klass ende
