package lesson_41.homework41;
/*
создадим несколько видов товара, что бы проверить работу класса Store
 */

public class StoreApp {
    public static void main(String[] args) {
        Store store = new Store();

        // Добавление товаров
        store.addProduct(new Product("LEGO", 1000.00, 5, "PROMO2020"));
        store.addProduct(new Product("SWAPP", 500.00, 10, "PROMO2023"));
        store.addProduct(new Product("Bär",250.00,15,"PROMO2021"));
        store.addProduct(new Product("Tiger",350.00,20,"PROMO2022"));
        store.addProduct(new Product("Auto",150.00,25,"PROMO2024"));

        // Сериализация товаров
        store.serializeProducts("products.dat");

        // Очистка списка для демонстрации десериализации
        store = new Store();

        // Десериализация товаров
        store.deserializeProducts("products.dat");

        // Вывод информации о товарах
        store.displayProducts();

        // Обновление количества товара
        store.updateProductQuantity("LEGO", 3); // Увеличиваем количество
        store.displayProducts(); // Показываем обновленный список
    }

} // klass ended
