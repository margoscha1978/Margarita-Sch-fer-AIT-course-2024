public class Laptop extends Computer {

   private double displaySize;
   private double weight;
   private int battaryLife;
   private String color;

    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int battaryLife, String color) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.battaryLife = battaryLife;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBattaryLife() {
        return battaryLife;
    }

    public void setBattaryLife(int battaryLife) {
        this.battaryLife = battaryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", battaryLife=" + battaryLife +
                ", color='" + color + '\'' +
                "}" + super.toString();
    }
}
