package homework17cube.model;

public class Cube  {
    double side;// ctorona kuba
    //construktor
    public Cube(double side) {
        this.side = side;
    }
   //P
   public double calkulatePerimeter(){
        return 12 * side;
   }
   //S
    public double calculateSurfaceArea(){
        return 6 * (side * side);//
    }
   //V
   public double calculateVolume() {
        return side * side * side;// a v kube
   }

}//klass ende
