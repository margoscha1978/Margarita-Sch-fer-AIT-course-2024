package ClassWork15;
// 1. Меню приложения: При запуске программы должно выводиться меню с возможным
//2. Добавление товара: Позволяет пользователю добавить товар в список, указав
//3. Удаление товара: Позволяет пользователю удалить товар по его названию.
//4. Поиск товара: Позволяет искать товар по названию.
//5. Обновление товара: Позволяет обновить название товара.
//6. Сортировка товаров: Позволяет отсортировать товары по алфавиту.
//7. Отображение товаров: Позволяет просмотреть текущий список товаров.
//8. Очистка списка: Очищает весь список товаров.
//9. Выход: Завершает программу.

    //1.  Меню: Метод showMenu() выводит на экран меню с возможными действиями. Пол
    //2. Добавление товара: Метод addProduct() добавляет товар в список.
    //3. Удаление товара: Метод removeProduct() удаляет товар по названию.
    //4. Поиск товара: Метод searchProduct() проверяет наличие товара в списке.
    //5. Обновление товара: Метод updateProduct() изменяет название существующего
    //6. Сортировка товаров: Метод sortProducts() сортирует список по алфавиту.
    //7. Отображение списка товаров: Метод showProducts() выводит все текущие товара
    //8. Очистка списка товаров: Метод clearProducts() полностью очищает список товара
    //9. Выход: Завершает программу, если пользователь выбирает действие 8.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PetShopApp {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> products = new ArrayList<>();

    public static void main(String[] args) {

        boolean runnning = true;

        while (runnning) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> removeProduct();
                case 3 -> searchProduct();
                case 4 -> updateProduct();
                case 5 -> sortProducts();
                case 6 -> showProducts();
                case 7 -> clearProducts();
                case 8 -> {
                    System.out.println("Программа завершена.");
                    scanner.close();
                    runnning = false;
                }
                default -> System.err.println("Неверный ввод, попробуйте снова.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- 😻  Меню управления зоомагазином 😼 ---");
        System.out.println("1. Добавить товар");
        System.out.println("2. Удалить товар");
        System.out.println("3. Найти товар");
        System.out.println("4. Обновить товар");
        System.out.println("5. Отсортировать товары");
        System.out.println("6. Показать список товаров");
        System.out.println("7. Очистить список товаров");
        System.out.println("8. Выйти");
        System.out.println("Выберите действие: ");
    }

    private static void addProduct() {
        scanner.nextLine();
        System.out.print("Введите название товара: ");
        String productName = scanner.nextLine();
        products.add(productName);
        System.out.println("Товар добавлен.");
    }

    private static void removeProduct() {
        scanner.nextLine();
        System.out.print("Введите название товара для удаления: ");
        String productNameToRemove = scanner.nextLine().trim();
        if (products.contains(productNameToRemove)) {
            Iterator<String> iterator = products.iterator();
            while (iterator.hasNext()) {
                String product = iterator.next();
                if (product.equals(productNameToRemove)) {
                    iterator.remove(); // Удаление с помощью итератора // Remove using the iterator
                }
            }
            System.out.println("Товар удален.");
        } else {
            System.out.println("Товар " + productNameToRemove + " не найден");
        }

    }

    private static void searchProduct() {
        scanner.nextLine();
        System.out.println("Введите название товара для поиска: ");
        String productToSearch = scanner.nextLine().trim();
        if (products.contains(productToSearch)) {
            System.out.println("Товар найден: " + productToSearch);
        } else {
            System.out.println("Tовар не найден.");
        }
    }

    private static void updateProduct() {
        scanner.nextLine();
        System.out.println("Введите название товара для обновления: ");
        String productNameToUpdate = scanner.nextLine().trim();
        if (!products.contains(productNameToUpdate)) {
            System.out.println("Товар " + productNameToUpdate + " не найден");
        } else {
            System.out.print("Введите новое название: ");
            String newProductName = scanner.nextLine().trim();
            int index = products.indexOf(productNameToUpdate);
            products.set(index, newProductName);
            System.out.println("Товар обновлен.");
        }
    }

    private static void sortProducts() {
        Collections.sort(products);
        System.out.println("Список товаров отсортирован.");
    }

    private static void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Список товаров пуст.");
        } else {
            System.out.println("Список товаров:");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
        }
    }

    private static void clearProducts() {
        products.clear();
        System.out.println("Список товаров очищен.");
    }

} // klass ended