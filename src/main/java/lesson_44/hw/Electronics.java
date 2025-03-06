package lesson_44.hw;


public class Electronics  extends Product {

    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + getName() + " brand: " + brand + " price: " + getPrice();
    }

} // klass ended