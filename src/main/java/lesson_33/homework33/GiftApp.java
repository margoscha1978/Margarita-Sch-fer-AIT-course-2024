package lesson_33.homework33;
/*
4. Класс GiftApp: Основной класс, который реализует консольный интерфейс.
 Позволяет пользователю взаимодействовать с системой через меню.
    - пользователь может добавить новый подарок.
    - пользователь может вывести список всех подарков.
    - пользователь может отфильтровать подарки по категории.
    - пользователь может обновить статус подарка.
 */

import java.util.List;
import java.util.Scanner;

public class GiftApp {
    public static void main(String[] args) {
        GiftManager giftManager = new GiftManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить подарок");
            System.out.println("2. Показать все подарки");
            System.out.println("3. Фильтровать подарки по категории");
            System.out.println("4. Обновить статус подарка");
            System.out.println("0. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистим буфер

            switch (choice) {
                case 1:
                    System.out.println("Введите название подарка:");
                    String name = scanner.nextLine();
                    System.out.println("Введите категорию подарка (ELECTRONICS, TOYS, BOOKS, CLOTHING, " +
                            "HOME_APPLIANCES):");
                    GiftCategory category = GiftCategory.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Введите статус подарка (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED):");
                    GiftStatus status = GiftStatus.valueOf(scanner.nextLine().toUpperCase());
                    giftManager.addGift(new Gift(name, category, status));
                    break;

                case 2:
                    List<Gift> allGifts = giftManager.getAllGifts();
                    allGifts.forEach(System.out::println);
                    break;

                case 3:
                    System.out.println("Введите категорию для фильтрации:");
                    GiftCategory filterCategory = GiftCategory.valueOf(scanner.nextLine().toUpperCase());
                    List<Gift> filteredGifts = giftManager.filterByCategory(filterCategory);
                    filteredGifts.forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("Введите название подарка для изменения статуса:");
                    String giftName = scanner.nextLine();
                    System.out.println("Введите новый статус подарка (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED):");
                    GiftStatus newStatus = GiftStatus.valueOf(scanner.nextLine().toUpperCase());
                    giftManager.updateGiftStatus(giftName, newStatus);
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

} // klass ended
