public class TriangleExperement {
    public static void main(String[] args) {
        // seiten vom Dreieck
       double a= 3.0;
       double b= 4.0;
        double c= 5.0;
     // prüfung
     boolean isTriangle = ( (a + b > c) &&  (a + c > b) && (b + c > a));
     if (isTriangle){
         System.out.println( "Triangle is true");
     }else{
         System.out.println("Triangle is false");
     }







    }
}
