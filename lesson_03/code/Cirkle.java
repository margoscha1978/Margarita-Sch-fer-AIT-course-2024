public class Cirkle {
    public static void main(String[] args) {

 // S=PI*r²

 double r= 200;
 double PI= 3.14159;
 double areaOfCirkle= PI*r*r;
        System.out.println( areaOfCirkle);


 //metod
 double  l = areaOfCirkleMetodht(r);
        System.out.println("Area of Cirkle witch radius" + r + "=" +l);
    }
    private static double areaOfCirkleMetodht(double r){
        return Math.PI*r*r;
    }
}
