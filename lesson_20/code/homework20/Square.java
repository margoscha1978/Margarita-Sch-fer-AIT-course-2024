package homework20;
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.

public class Square extends Shape  {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        area = side * side;
        return area;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }
}
