package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Booking;
import lesson_30.TourismBureauManagementSystem.model.Client;
/*
Демонстрирует возможности системы по управлению бронированиями и очередями,
проверяем работы выбранных для класса BookingManager методов.
Простейший интерфейс для пользователя или менеджера для ввода данных клиента.
Примеры клиентов.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BookingManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookingManager bookingManager = new BookingManager();
        ClientManager clientManager = new ClientManager();

        // Пример: добавление клиента
        clientManager.addClient(new Client(1, "Иванов", "Иван",
                "ivan@example.com"));

        // Пример: создание бронирования
        bookingManager.addBooking(clientManager.findClientById(1), "Консультация",
                "2023-10-10 10:00");

        // Просмотр бронирований
        bookingManager.viewBookings();

        scanner.close();
    }
} // klass ended
