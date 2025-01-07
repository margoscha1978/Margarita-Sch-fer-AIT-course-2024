package homework20;
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.

public class Cirkle extends Shape {
    private double radius;

    public Cirkle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
