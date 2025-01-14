package lesson_30.TourismBureauManagementSystem.core;
/*
 Активная работа с пользователем, или
 проверка работы выбранных для класса ClientManager методов.
 Простейший интерфейс для пользователя или менеджера для ввода данных клиента.
 */
import lesson_30.TourismBureauManagementSystem.model.Client;

import java.util.List;
import java.util.Scanner;

public class ClientManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClientManager clientManager = new ClientManager();
        BookingManager bookingManager = new BookingManager();

        // Добавление клиентов
        clientManager.addClient(new Client(1, "Иванов", "Иван",
                "ivan@example.com"));
        clientManager.addClient(new Client(2, "Петров", "Петр",
                "petr@example.com"));

        // Просмотр клиентов
        clientManager.viewClients();

        // Создание бронирований
        bookingManager.addBooking(clientManager.findClientById(1), "Консультация",
                "2023-10-10 10:00");
        bookingManager.addBooking(clientManager.findClientById(2), "Бронирование стола",
                "2023-10-10 12:00");

        // Просмотр всех бронирований
        bookingManager.viewBookings();

        // Отмена бронирования
        bookingManager.cancelBooking(1); // Указываем ID бронирования

        // Просмотр всех бронирований после отмены
        bookingManager.viewBookings();

        scanner.close();
    }
} // klass ended
