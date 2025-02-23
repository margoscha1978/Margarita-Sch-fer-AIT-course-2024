package lesson_41.homework41;
/*
Класс Store:
    Хранит коллекцию (список) объектов Product.
    Обеспечивает сериализацию (запись списка продуктов в файл, например, products.dat).
    Обеспечивает десериализацию (чтение списка продуктов из файла).
    После чтения файлов выведите данные о каждом товаре и убедитесь, что поле promoCode не восстановилось
    (значение по умолчанию, например null).
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Store {
    private static final Logger logger = Logger.getLogger(Store.class.getName()); // Логирование
    private List<Product> products = new ArrayList<>(); // Список продуктов

    // Метод для добавления нового продукта
    public void addProduct(Product product) {
        products.add(product);
        logger.log(Level.INFO, "Product added: {0}", product.getName());
    }

    // Метод для сериализации списка продуктов в файл
    public void serializeProducts(String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(products); // Сериализация списка продуктов
            logger.info("Products serialized successfully.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Serialization error", e);
        }
    }

    // Метод для десериализации списка продуктов из файла
    @SuppressWarnings("unchecked") // Предупреждение компилятора о возможной ошибке класса
    public void deserializeProducts(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            products = (List<Product>) ois.readObject(); // Десериализация списка продуктов
            logger.info("Products deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            logger.log(Level.SEVERE, "Deserialization error", e);
        }
    }

    // Метод для вывода информации о всех продуктах
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        for (Product product : products) {
            System.out.println("Name: " + product.getName() +
                    ", Price: " + product.getPrice() +
                    ", Quantity: " + product.getQuantity() +
                    ", Promo Code: " + product.getPromoCode()); // promoCode должен быть null
        }
    }

    // Дополнительный метод для изменения количества товара
    public void updateProductQuantity(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                product.setQuantity(product.getQuantity() + quantity);
                logger.log(Level.INFO, "Updated quantity for {0}: {1}", new Object[]{productName, product.getQuantity()});
                return;
            }
        }
        logger.warning("Product not found: " + productName);
    }

} // klass ended

/*
1. Логирование:
   - Создаем объект Logger, который будет использоваться для записи информации о действиях в консоль или в файл.
    Это важно для отладки, контроля и отслеживания работы программы.
2. Список продуктов:
   - private List<Product> products = new ArrayList<>(); - здесь мы объявляем список для хранения продуктов.
    ArrayList позволяет добавлять и удалять элементы.
3. Метод addProduct:
   - Этот метод добавляет продукт в список и записывает информацию о добавлении в лог.
4. Метод serializeProducts:
   - Этот метод осуществляет запись списка продуктов в файл.
   - Он использует FileOutputStream для открытия файла и ObjectOutputStream для записи сериализованных объектов.
5. Метод deserializeProducts:
   - Данный метод читает список продуктов из файла.
   - @SuppressWarnings("unchecked") используется для предотвращения предупреждения компилятора
    о некорректной работе программы или ошибки, он может выбросить исключения, поэтому нам нужно его обработать.
6. Метод displayProducts:
   - Метод выводит в консоль информацию о каждом продукте в списке.
   - Если список пуст, выводится сообщение о том, что товаров нет.
7. Метод updateProductQuantity(добавила для лучшего управления и контроля):
   - Этот метод позволяет изменять количество товара по его названию. Если товар найден, его количество обновляется,
    и изменение записывается в лог.
 */