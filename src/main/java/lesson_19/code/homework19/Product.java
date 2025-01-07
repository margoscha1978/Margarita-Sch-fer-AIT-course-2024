package homework19;

import java.util.Objects;

//Задача 1. Создать класс Product, с полями:
 //Во всех классах переопределить метод toString.
public class Product {

    private double price;
    private String name;
    private String barCode;

    public Product(double price, String name, String barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append(", barCode='").append(barCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(barCode, product.barCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }

}



