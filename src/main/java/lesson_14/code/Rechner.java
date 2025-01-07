import java.math.BigInteger;

public class Rechner {
    public static void main(String[] args) {

    long produkt = 1;
    boolean hasOddNumbers  = false;
        for (int i = 11; i < 100 ; i += 2) { // nechethie do 100
            produkt *= i;
            hasOddNumbers  = true;
        }
    if(hasOddNumbers) {
        System.out.println( " Produkt of all odd numbers : " + produkt);
    } else {

       }
    }
}
// sistema perepolnehha,podskasali  ispolzovat BigInteger

