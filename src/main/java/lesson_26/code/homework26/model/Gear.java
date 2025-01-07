package homework26.model;
// Дочерний класс Gear (шестеренка) с полями: radius: double tooth: int

public class Gear extends Detail {

    private double radius;
    private int tooth;


    public Gear(long barCode, double size, String material, int vendor, double weight) {
        super(barCode, size, material, vendor, weight);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

}// klass ende
