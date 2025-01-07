public class AirTemperaturAnalyzer {
    public static void main(String[] args) {

   //  temperatura za nedelju,dnevnaja

   double [] temperatures = { 5.0, 7.5, 8.0, 10.0, 6.5, 4.0, 3.5 };//dni nedeli v temperature

   // vtornik,indeks 2
        System.out.println( " Temperatures of tuesday : " + temperatures[1] + "°C");

    // chetwerg,indeks 4
        System.out.println( " Temperatures of thursday: " + temperatures[3] + "°C");

        // srednjaja temperatura nedeli
        double sum = 0;
        for( double temp : temperatures){
         sum += temp;

        }
     double average = sum / temperatures.length;// srednee znachenie

        System.out.println( "Average temperature(sum): " + average + "°C");


    }
}
