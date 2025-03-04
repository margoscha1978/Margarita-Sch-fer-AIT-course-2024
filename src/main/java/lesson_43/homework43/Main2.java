package lesson_43.homework43;
/*
1. addBooks: Метод для добавления книг в корзину.
2. addElectronics: Метод для добавления электроники в корзину.
3. printCart: Метод для вывода информации о корзине и итоговой стоимости. Здесь используется дженерик
  ? extends Product, который позволяет передавать корзины с любыми подтипами Product.
4. removeProductFromCart: Метод для удаления товара из корзины по названию.
 */
public class Main2 {
    public static void main(String[] args) {
        // Создание корзин
        Cart<Book> bookCart = new Cart<>();
        Cart<Electronics> electronicsCart = new Cart<>();

        // Добавление товаров
        addBooks(bookCart);
        addElectronics(electronicsCart);

        // Вывод информации о товарах и итоговые стоимости
        printCart(bookCart, "Корзина с книгами");
        printCart(electronicsCart, "Корзина с электроникой");

        // Пример удаления товара
        removeProductFromCart(bookCart, "1984");

        // Вывод информации после удаления
        printCart(bookCart, "Корзина с книгами после удаления");
    }

    private static void addBooks(Cart<Book> cart) {
        cart.addProduct(new Book("Война и мир", 500, "Лев Толстой"));
        cart.addProduct(new Book("1984", 300, "Джордж Оруэлл"));
    }

    private static void addElectronics(Cart<Electronics> cart) {
        cart.addProduct(new Electronics("Телевизор", 15000, "Samsung"));
        cart.addProduct(new Electronics("Смартфон", 7500, "Apple"));
    }

    private static void printCart(Cart<? extends Product> cart, String title) {
        System.out.println(title + ":");
        cart.printItems();
        System.out.println("Итоговая стоимость: " + cart.getTotalPrice());
        System.out.println();
    }

    private static void removeProductFromCart(Cart<Book> cart, String name) {
        cart.removeProduct(name);
        System.out.println("Удалена книга \"" + name + "\".");
    }

} // klass ended
