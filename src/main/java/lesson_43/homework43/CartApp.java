package lesson_43.homework43;

import java.util.List;

/*
Демонстрация работы:
    Продумайте, как вы будете проверять вашу реализацию в коде (не пишите здесь готовые методы, а только план).
    Создайте несколько объектов разных типов (книги, электроника и т.д.), добавьте их в соответствующие корзины.
    Попробуйте удалить товар по названию и выведите результат (получилось ли удалить).
    Посчитайте суммарную стоимость в корзине после добавления и удаления товаров.
    Выведите информацию обо всех товарах, например, при помощи переопределённого метода описания.
 */
public class CartApp {
    public static void main(String[] args) {
        // Создание корзины для книг
        Cart<Book> bookCart = new Cart<>();
        bookCart.addProduct(new Book("Война и мир", 500, "Лев Толстой"));
        bookCart.addProduct(new Book("1984", 300, "Джордж Оруэлл"));

        // Создание корзины для электроники
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addProduct(new Electronics("Телевизор", 15000, "Samsung"));

        // Вывод информации о товарах
        System.out.println("Кошелек с книгами:");
        bookCart.printItems();
        System.out.println("Итоговая стоимость книг: " + bookCart.getTotalPrice());

        System.out.println("\nКорзина с электроникой:");
        electronicsCart.printItems();
        System.out.println("Итоговая стоимость электроники: " + electronicsCart.getTotalPrice());

        // Удаление книги "1984"
        bookCart.removeProduct("1984");
        System.out.println("\nПосле удаления книги \"1984\":");
        bookCart.printItems();
        System.out.println("Итоговая стоимость книг: " + bookCart.getTotalPrice());

        // Сортировка книг
        bookCart.sortProducts();
        System.out.println("Книги отсортированы по цене:");
        bookCart.printItems();

        // Сортировка электроники
        electronicsCart.sortProducts();
        System.out.println("Электроника отсортирована по цене:");
        electronicsCart.printItems();

        // Фильтрация книг по цене
        List<Book> filteredBooks = bookCart.filterByPrice(200, 600);
        System.out.println("Книги с ценой от 200 до 600:");
        for (Book book : filteredBooks) {
            System.out.println(book.getDescription());
        }
    }

} // klass ended
