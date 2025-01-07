import java.util.Random;

// streljalka sluchainaja 10 raz

public class ShootingSimulator {
    public static void main(String[] args) {
        Random random = new Random();

        int attempts = 10;
        int totalScore = 0;
        boolean hitCenter = false;

        // massiv resultatov ctrelibi

        int[] shots = new int[attempts];

        // generator 10 vistrelov

        for (int i = 0; i < attempts; i++) {
            shots[i] = random.nextInt(10) + 1;
            totalScore += shots[i];// summa ochkov
            if (shots[i] == 1) {
             hitCenter = true;
            }
        }
        //rezultat

        System.out.println( " Shot results: " ) ;
        for( int shot : shots ) {
            System.out.println( shot + " ");
        }
        System.out.println( "\n Total points: " + totalScore ) ;
        System.out.println( " Hitting the Zentr: " + ( hitCenter ? " yes " : " no ")) ;

    }// main ende

}// klass ende
