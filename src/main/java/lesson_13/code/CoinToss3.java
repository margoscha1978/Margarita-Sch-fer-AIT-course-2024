import java.util.Random;
import java.util.Scanner;

public class CoinToss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totallTosses = 0;

        // rabota s polzovatelem
        System.out.println(" Pls...Enter tne number of tosses from 1 to 100 : ");
        totallTosses = scanner.nextInt();

        // proverka na oschibku vvoda
        if (totallTosses < 1 || totallTosses > 100) {
            System.out.println(" Error, pls number from 1to 100. ");
            return;
        }
        int headsCount = 0;
        int tailsCount = 0;
        Random random = new Random();

        //kolichestvo broskov
        for (int i = 0; i < totallTosses; i++) {
            if (random.nextBoolean()) {
            headsCount++;
        } else {
                tailsCount++;
            }
        }
    //resultat
    System.out.println( " Number of heads : " + headsCount );
    System.out.println( " Number of tails ; " + tailsCount );

    }//ende main

}// ende klass