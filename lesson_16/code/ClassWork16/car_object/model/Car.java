package ClassWork16.car_object.model;

public class Car {
    // zapros: zena,zwet,vozrast,god vipuska...
    private String brand;
    private int year;
    private double price;
    private String color;
    private boolean isNew;

    //construktor - metod,nichego ne daet,nuchno ctroit
    public Car(String brand, int year, double price, String color, boolean isNew) { // argumenti i faktori
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNew = isNew;
    }

    // getters and setters,poluchatel i ustanovschik,metodi dlja raboti,pravaja knopka mischki visivaet
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    }//metod ende

    public void move() {
        System.out.println("Car is moving...");
    }
    public void stop(){
        System.out.println("Car stopped...");

    }

}//klass ende