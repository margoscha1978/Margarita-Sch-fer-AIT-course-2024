package equation.model;

public class QuadraticEquation {
    private double a, b, c;
    //konstruktor

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
  // getter,setter
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
  //metod dlja uravnenija
  public void display() {
      System.out.printf( "%.2fx°^2 + %.2f = 0%n",a, b, c ) ;
  }
  //diskriminant
    public double delta(){
       return b * b - 4 * a * c;
    }
  //korni
    public int quantityRoots(){
        double d = delta();
        if (d > 0){
        return 2;// esli 2 kornja
        } else if ( d== 0){
        return 1;// esli 1 koren
        } else {
            return 0;// net korhja
        }

    }

}//ende klass
