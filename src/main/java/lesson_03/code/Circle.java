public class Circle {
    public static void main(String[] args) {

        // cirkle = 2*PI*r

      double PI =3.14159;
      double r = 100;

      double lenghtOfCircle = 2* PI* r;
        System.out.println(lenghtOfCircle);

        //metod

       double l = lengthOfCircleMetodht(r);
        System.out.println("Length of circle witch radius "+ r +" = "+ l);
    }

    private static double lengthOfCircleMetodht(double r){
        return 2 * Math.PI * r*r;

    }
}
