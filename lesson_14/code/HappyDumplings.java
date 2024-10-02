import java.util.Random;

public class HappyDumplings {
    public static void main(String[] args) {

     int numDumplings = 30;
     int[] weights = new int[numDumplings];

     //zapolnim massiv pelmenjami,ves 35 gramm
        for (int i = 0; i < numDumplings ; i++) {
            weights[i] = 35;
        }
     // ischem schastlivi pelmen
        Random random = new Random();
        int happyDumplingsIndex = random.nextInt( numDumplings);//sluchainii index
         weights[happyDumplingsIndex] += 15;// ves schstlivogo pelmehja

      // resultat,probuem
        System.out.println( " Weights of dumplings : ");
        for( int i = 0; i < numDumplings; i++ )
        System.out.println( " Dumplings " + ( i + 1) + " : " + weights[i] + " gramm ");
// index pelmenja

        System.out.println( " Happy dumplings : " + ( happyDumplingsIndex + 1) + "(weights " + weights[happyDumplingsIndex] +  " gramm )" );
    }
}
