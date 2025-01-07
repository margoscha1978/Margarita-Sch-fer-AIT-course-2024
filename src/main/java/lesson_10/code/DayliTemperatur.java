public class DayliTemperatur {
    public static void main(String[] args) {
        
   // neskoliko znachenii kachdii den
   
   double [] [] temperatures = {
           {3.0, 7.0, 5.5}, // nonedelnik
           {3.5, 7.5, 2.0},// vtornik
           {8.0, 2.0, 7.0},// sreda
           {10.0, 1.0, 6.5},//chetverg
           {5.0, 6.0, 9.0},// pjatniza
           {1.5, 3.5, 7.5},// subbota
           {1.0, 2.0, 3.0},// voskresenie
   };       
           // temperatura vo vtornik

        System.out.println( "Temperatures of tuesday :  ");
        for (int i = 0; i < temperatures [1].length; i++ ) {
            System.out.println( temperatures[1][i] + "°C" );
        }
           
        // temperatura v chetwerg

        System.out.println( "Temperatures of thursday : " );
        for( int i = 0; i < temperatures [3].length; i++ ) {
            System.out.println(temperatures[3][i] + "°C");
        }
        
        // srednjaja temperatura
        
        double totalSum = 0;//peremennaja
        int count = 0;// schetchik

        for( double [] dayliTemps : temperatures ) {
          for ( int j = 0; j < dayliTemps.length; j++ ) {

              totalSum += dayliTemps[j];//summa vseh temperatur
                count++;//yvelichenie schetchika
            }
        }

            //summa vsex pokazateley
            double average = totalSum / count;
            count++;
            
            // srednjaja temperatura

            System.out.println( "Average temperature : " + average +  "°C");

           
   }  

        
}

