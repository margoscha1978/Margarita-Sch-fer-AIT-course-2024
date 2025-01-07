package homework20;
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.

public class Triangle extends Shape  {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calcArea() {
        area = (base * height) / 2;
        return area;
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }
}
