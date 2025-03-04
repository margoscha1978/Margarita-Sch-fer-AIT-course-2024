package lesson_43.homework43;
/*
Создадим расширенный класс Warehouse,
который будет хранить множество товаров одного типа и предоставлять методы для работы с ними.
 */
import java.util.ArrayList;
import java.util.List;

class Warehouse<T extends Product> {
    private List<T> stock = new ArrayList<>();

    public void addProduct(T product) {
        stock.add(product);
    }

    public void removeProduct(String name) {
        stock.removeIf(item -> item.getName().equals(name));
    }

    public void printStock() {
        for (T item : stock) {
            System.out.println(item.getDescription());
        }
    }

    public int getQuantity(String name) {
        return (int) stock.stream().filter(item -> item.getName().equals(name)).count();
    }

} // klass ended
