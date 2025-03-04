package lesson_43.homework43;
/*
 Обобщённый класс Cart<T extends Product>
    Определите класс, моделирующий «корзину» для определённого типа товаров.
    Задайте в классе поле для хранения списка товаров (например, List<T>).
    Добавьте методы для работы с корзиной:
        добавление товара;
        удаление товара по названию;
        подсчёт итоговой стоимости;
        вывод информации о каждом товаре в корзине.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Cart<T extends Product> {
    private List<T> items = new ArrayList<>();

    public void sortProducts() {
        Collections.sort(items);
    }

    public void addProduct(T item) {
        items.add(item);
    }

    public void removeProduct(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    public double getTotalPrice() {
        double total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printItems() {
        for (T item : items) {
            System.out.println(item.getDescription());
        }
    }
    public List<T> filterByPrice(double minPrice, double maxPrice) {
        return items.stream()
                .filter(item -> item.getPrice() >= minPrice && item.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

} // klass ended
