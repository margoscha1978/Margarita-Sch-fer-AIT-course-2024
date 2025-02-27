package lesson_41.homework41;
/*
интерфейс для работы с товарами и управлением контроля, движения товаров, их наличия
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить товар");
            System.out.println("2. Посмотреть все товары");
            System.out.println("3. Сохранить товары в файл");
            System.out.println("4. Загрузить товары из файла");
            System.out.println("5. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер

            switch (choice) {
                case 1:
                    // Добавление товара
                    System.out.println("Введите название товара:");
                    String name = scanner.nextLine();
                    System.out.println("Введите цену товара:");
                    double price = scanner.nextDouble();
                    System.out.println("Введите количество на складе:");
                    int quantity = scanner.nextInt();
                    System.out.println("Введите промо-код:");
                    String promoCode = scanner.next();
                    store.addProduct(new Product(name, price, quantity, promoCode));
                    break;
                case 2:
                    // Показать все товары
                    store.displayProducts();
                    break;
                case 3:
                    // Сохранить товары в файл
                    System.out.println("Введите имя файла для сохранения:");
                    String saveFileName = scanner.nextLine();
                    store.serializeProducts(saveFileName);
                    break;
                case 4:
                    // Загрузить товары из файла
                    System.out.println("Введите имя файла для загрузки:" + "");

                    String loadFileName = scanner.nextLine();
                    store.deserializeProducts(loadFileName);
                    break;
                case 5:
                    // Выйти
                    running = false;
                    break;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }

} // klass ended

 /*
 В интерфейс, в зависимости от пользователя, например не пользователь, а сотрудник управляющий магазином,
 можно добавить дополнительные функции и улучшения:
- Удаление товара: Позволяет пользователю удалить товар из списка.
- Изменение товара: Позволяет изменять данные о товаре (например, количество или цену).
- Фильтры: Возможность фильтровать товары по категории, цене или фирме производителю.
- Поиск товаров: Функция для поиска продукта по имени или части названия.
- Сортировка: Возможность сортировать список продуктов по цене или названию.
  */