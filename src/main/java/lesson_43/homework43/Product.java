package lesson_43.homework43;
/*
 Абстрактный класс Product:
    Создайте абстрактный класс, отражающий понятие «товар» (product).
    Определите в нём необходимые поля:
        название (name);
        цена (price).
    Реализуйте абстрактный метод, который будет возвращать описание товара (псевдо-метод getDescription()).
 */
    abstract class Product implements Comparable<Product> {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

} // klass ended
