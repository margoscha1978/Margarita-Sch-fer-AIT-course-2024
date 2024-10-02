package ClassWork16.car_object.model;

public class CarAppl {
    public static void main(String[] args) {

        Car myCar =  new Car ( "VW",2014,15500,"silver",false );//perenesli konstruktor

        myCar.toString();

        System.out.println(myCar);

        myCar.move();
        myCar.stop();

    }
}
