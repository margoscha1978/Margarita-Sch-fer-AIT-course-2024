package homework26.model;
// - Дочерний класс Lever (рычаг) с полями: power: double

public class Lever extends Detail {
    private double power; // Исправлено название поля


    public Lever(long barCode, double size, String material, int vendor, double weight) {
        super(barCode, size, material, vendor, weight);
    }

    public double getPower() {

        return power;
    }

    public void setPower(double power) {

        this.power = power;
    }

    public Lever(long barCode, double size, String material, int vendor, double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }

}//klass ende
