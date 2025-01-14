package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Booking;
import lesson_30.TourismBureauManagementSystem.model.Client;
/*
 Управляет списком бронирований и клиентскими запросами.
 Он включает методы для добавления бронирований, их отмены,
 а также для управления очередью запросов клиентов.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class BookingManager {
    private ArrayList<Booking> bookings; // Список бронирований
    private int nextBookingId; // Генератор уникальных id для бронирований

    public BookingManager() {
        bookings = new ArrayList<>();
        nextBookingId = 1; // Начнем с первого id
    }

    // Метод для добавления бронирования
    public Booking addBooking(Client client, String service, String dateTime) {
        Booking booking = new Booking(nextBookingId++, client, service, dateTime);
        bookings.add(booking);
        System.out.println("Бронирование добавлено: " + booking);
        return booking; // Возвращаем созданное бронирование
    }

    // Метод для отмены бронирования по id
    public boolean cancelBooking(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getId() == bookingId && !booking.isCancelled()) {
                booking.cancelBooking();
                System.out.println("Бронирование отменено: " + booking);
                return true; // Бронирование успешно отменено
            }
        }
        System.out.println("Бронирование с id " + bookingId + " не найдено или уже отменено.");
        return false; // Бронирование не найдено или уже отменено
    }

    // Метод для просмотра всех бронирований
    public void viewBookings() {
        System.out.println("Список всех бронирований:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
} // klass ended

/*
Метод для добавления бронирования, addBooking;
Метод для отмены бронирования по id, cancelBooking;
Метод для добавления клиента в очередь, addClientToQueue;
Метод для вызова следующего клиента из очереди, callNextClient;
Метод для просмотра текущей очереди, viewCurrentQueue;
 */