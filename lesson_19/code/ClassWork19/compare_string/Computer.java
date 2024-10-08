package ClassWork19.compare_string;

//- cpu
//- ram
//- ssd
//- brand
//- price

import java.util.Objects;

public class Computer {

    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private double price;

    public Computer(String cpu, int ram, int ssd, String brand, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // сравниваем объект сам с собой, возвращаем true
        if (!(o instanceof Computer computer)) return false; // это объект не из клаcса Computer, возвращаем false
        return ram == computer.ram && ssd == computer.ssd && Double.compare(price, computer.price) == 0 && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, price);
    }
}
