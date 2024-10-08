package homework19;

import java.util.Objects;

//Задача 1. Создать класс Product, с полями:
 //Во всех классах переопределить метод toString.
public class Product {

    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public long getBarCode() {
        return barCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && barCode == product.barCode && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }
}//klass ende