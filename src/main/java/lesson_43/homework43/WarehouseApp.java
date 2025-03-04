package lesson_43.homework43;
/*
Проверяем работу расширенного класса Warehouse...
 */
public class WarehouseApp {
    public class Main {
        public static void main(String[] args) {
            // Создание склада для книг
            Warehouse<Book> bookWarehouse = new Warehouse<>();
            bookWarehouse.addProduct(new Book("Война и мир", 500, "Лев Толстой"));
            bookWarehouse.addProduct(new Book("1984", 300, "Джордж Оруэлл"));

            // Вывод информации о товарах на складе
            System.out.println("Товары на складе книг:");
            bookWarehouse.printStock();

            // Количество книг по названию
            System.out.println("Количество книг \"1984\": " + bookWarehouse.getQuantity("1984"));
        }
    }

} // klass ended
