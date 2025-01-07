public class Pokupka {
    public static void main(String[] args) {
        //waren kosten
        double priceA = 100.0;
        double priceB = 50.0;
        double diskountA = 10.0;
        double diskountB = 20.0;
        int N = 3;//Aprice
        int M = 2;//Bprice
        double totalPriseA = diskountA * 3 * (1 - priceA / 100);
        double totalPriseB = diskountB * 2 * (1 - priceB / 100);
        double totalPrise = totalPriseA + totalPriseB;

        if (totalPrise > 100){
            totalPrise *= 0.95;
        }

    System.out.println( totalPrise + " euro ");




    }
}