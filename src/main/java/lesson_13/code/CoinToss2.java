import java.util.Random;

public class CoinToss2 {
    public static void main(String[] args) {

        int totalTosses = 100;
        int headsCoint = 0;
        int tailsCoint = 0;

        Random random = new Random();

        // zadaem verojatnost
        double headsProbability = 0.6;
        double tailsProbability = 0.4;

         //summa verojatnostei = 1!
         //brosaem monetky

        for (int i = 0; i < totalTosses; i++) {

            // generator slychainoi storoni: orel = 0,reschka = 1
            if(random.nextDouble() < headsProbability) {
                headsCoint ++;
            } else {
                tailsCoint ++;
            }
        }
        // cchitaem primernoe kolichestvo pojavlenii orla ili reschki
        double calkulateheadsProbability = (double) headsCoint / totalTosses;
        double calkelatetailsProbabitily = (double) tailsCoint / totalTosses;

        System.out.println( " Number of heats : " + headsCoint );
        System.out.println( " number of tails : " + tailsCoint );

        // verojatnoct vipadenija
        System.out.printf(" Probability heats: %.2fn ",calkelatetailsProbabitily);
        System.out.printf(" Probability tails: %2fn",calkulateheadsProbability);

    }
}
