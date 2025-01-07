import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {

        int totalTosses = 100;
        int headsCoint = 0;
        int tailsCoint = 0;

        Random random = new Random();

        // brosaem monetky
        for (int i = 0; i < totalTosses; i++) {

            // generator slychainoi storoni: orel = 0,reschka = 1
            if(random.nextInt(2) == 0) {
                headsCoint ++;
            } else {
                tailsCoint ++;
            }
        }
        // cchitaem primernoe kolichestvo pojavlenii orla ili reschki
        double headsProbability = (double) headsCoint / totalTosses;
        double tailsProbabitily = (double) tailsCoint / totalTosses;

        System.out.println( " Number of heats : " + headsCoint );
        System.out.println( " number of tails : " + tailsCoint );
        // verojatnoct vipadenija
        System.out.printf(" Probability heats: %.2fn ",headsProbability);
        System.out.printf(" Probability tails: %2fn",tailsProbabitily);


    }
}
