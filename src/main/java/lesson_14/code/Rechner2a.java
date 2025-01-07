import java.math.BigInteger;

public class Rechner2a {

public static void main(String[] args) {
    BigInteger produkt = BigInteger.ONE;
    for (int i = 11; i < 100; i += 2) { // chisla ot 11 do 99 hechetnie
        produkt = produkt.multiply(java.math.BigInteger.valueOf(i));
    }
    System.out.println(" Produkt of all odd numbers : " + produkt);
   }
}