package ClassWork16.car_object.model;

public class CarAppl {
    public static void main(String[] args) {

        Car1 myCar =  new Car1( "VW",2014,15500,"silver",false );//perenesli konstruktor

        myCar.toString();

        System.out.println(myCar);

        myCar.move();
        myCar.stop();

    }
}
