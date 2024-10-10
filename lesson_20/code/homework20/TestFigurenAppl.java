package homework20;
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
// Добавьте в массив два круга, один треугольник и один квадрат.
// Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class TestFigurenAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        // Создаем объекты фигур
        shapes[0] = new Cirkle(2.0) ; // Первый круг
        shapes[1] = new Cirkle(3.0) ; // Второй круг
        shapes[2] = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0); // Треугольник
        shapes[3] = new Square(4.0); // Квадрат

        double totalArea = 0;
        double totalPerimeter = 0;

        // Рассчитываем общую площадь и периметр
        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
            totalPerimeter += shape.calcPerimeter();
        }

        // Выводим результаты
        System.out.println("Общая площадь фигур: " + totalArea);

        System.out.println("Общий периметр фигур: " + totalPerimeter);

    }
}
