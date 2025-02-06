package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Booking;
import lesson_30.TourismBureauManagementSystem.model.Client;
/*
Демонстрирует возможности системы по управлению бронированиями и очередями,
проверяем работы выбранных для класса BookingManager методов.
Простейший интерфейс для пользователя или менеджера для ввода данных клиента.
Примеры клиентов.
 */
import java.time.LocalDateTime;
import java.util.Scanner;

public class BookingManagerApp {
    private static BookingManager bookingManager = new BookingManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n----- Меню -----");
            System.out.println("1. Добавить бронирование");
            System.out.println("2. Отменить бронирование");
            System.out.println("3. Добавить клиента в очередь");
            System.out.println("4. Вызвать следующего клиента");
            System.out.println("5. Просмотреть текущую очередь");
            System.out.println("6. Просмотреть все бронирования");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Считывание переноса строки после числа

            switch (option) {
                case 1:
                    addBooking();
                    break;
                case 2:
                    cancelBooking();
                    break;
                case 3:
                    addClientToQueue();
                    break;
                case 4:
                    callNextClient();
                    break;
                case 5:
                    bookingManager.viewCurrentQueue();
                    break;
                case 6:
                    bookingManager.viewBookings();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void addBooking() {
        System.out.print("Введите имя клиента: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите фамилию клиента: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите услугу: ");
        String service = scanner.nextLine();

        System.out.print("Введите дату и время (например, 2023-10-01T10:30): ");
        String dateTime = scanner.nextLine();

        Client client = new Client(1, firstName, lastName, lastName + "@example.com", LocalDateTime.now());
        bookingManager.addBooking(client, service, dateTime);
    }

    private static void cancelBooking() {
        System.out.print("Введите ID бронирования для отмены: ");
        int bookingId = scanner.nextInt();
        if (bookingManager.cancelBooking(bookingId)) {
            System.out.println("Бронирование успешно отменено.");
        } else {
            System.out.println("Не удалось отменить бронирование.");
        }
    }

    private static void addClientToQueue() {
        System.out.print("Введите имя клиента для добавления в очередь: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите фамилию клиента: ");
        String lastName = scanner.nextLine();

        Client client = new Client(1, firstName, lastName, lastName + "@example.com", LocalDateTime.now());
        bookingManager.addClientToQueue(client);
    }

    private static void callNextClient() {
        Client nextClient = bookingManager.callNextClient();
        if (nextClient != null) {
            System.out.println("Следующий клиент: " + nextClient);
        } else {
            System.out.println("Очередь клиентов пуста.");
        }
    }

} // klass ended

/*
 Методы для выполнения операций:
   - addBooking(): Собирает информацию о клиенте и услуге для создания нового бронирования.
   - cancelBooking(): Позволяет пользователю отменить бронирование, вводя его ID.
   - addClientToQueue(): Добавляет нового клиента в очередь.
   - callNextClient(): Вызывает следующего клиента из очереди.
 */