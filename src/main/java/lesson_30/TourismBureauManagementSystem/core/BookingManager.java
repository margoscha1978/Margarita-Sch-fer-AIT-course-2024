package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Booking;
import lesson_30.TourismBureauManagementSystem.model.Client;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.logging.Logger;

/*
 Управляет списком бронирований и клиентскими запросами.
 Он включает методы для добавления бронирований, их отмены,
 а также для управления очередью запросов клиентов.
 */
public class BookingManager {
    private static final Logger logger = Logger.getLogger(BookingManager.class.getName());
    private ArrayList<Booking> bookings; // Список бронирований
    private int nextBookingId; // Генератор уникальных id для бронирований
    private Queue<Client> clientQueue; // Очередь клиентов

    public BookingManager() {
        bookings = new ArrayList<>();
        nextBookingId = 1; // Начнем с первого id
    }

    // Метод для добавления бронирования
    public Booking addBooking(Client client, String service, String dateTime) {
        if (client == null) {
            logger.severe("Попытка добавить бронирование с нулевым клиентом.");
            throw new IllegalArgumentException("Клиент не может быть null.");
        }
        if (service == null || service.isEmpty() || dateTime == null || dateTime.isEmpty()) {
            logger.severe("Попытка добавить бронирование с некорректными данными.");
            throw new IllegalArgumentException("Сервис и дата/время не могут быть null или пустыми.");
        }

        // Преобразование строки в LocalDateTime
        LocalDateTime bookingDateTime;
        try {
            // Используйте формат, соответствующий вашему дата-времени
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            bookingDateTime = LocalDateTime.parse(dateTime, formatter);
        } catch (DateTimeParseException e) {
            logger.severe("Ошибка при анализе даты/времени: " + e.getMessage());
            throw new IllegalArgumentException("Некорректный формат даты/времени. Ожидается 'yyyy-MM-dd HH:mm'.");
        }

        // Создаем новое бронирование
        Booking booking = new Booking(nextBookingId++, client, service, bookingDateTime);
        bookings.add(booking);
        logger.info("Бронирование добавлено: " + booking);
        return booking; // Возвращаем созданное бронирование
    }

    // Метод для отмены бронирования по id
    public boolean cancelBooking(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getId() == bookingId && !booking.isCancelled()) {
                booking.cancelBooking();
                logger.info("Бронирование отменено: " + booking);
                return true; // Бронирование успешно отменено
            }
        }
        logger.warning("Бронирование с id " + bookingId + " не найдено или уже отменено.");
        return false; // Бронирование не найдено или уже отменено
    }

    // Метод для просмотра всех бронирований
    public void viewBookings() {
        logger.info("Список всех бронирований:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    // метод для добавления клиента в очередь
    public void addClientToQueue(Client client) {
        if (client == null) {
            logger.severe("Попытка добавить клиента в очередь с нулевым значением.");
            throw new IllegalArgumentException("Клиент не может быть null.");
        }
        clientQueue.add(client);
        logger.info("Клиент добавлен в очередь: " + client);
    }

    //  метод для вызова следующего клиента из очереди
    public Client callNextClient() {
            Client nextClient = clientQueue.poll(); // Извлекаем и удаляем первого клиента из очереди
            if (nextClient != null) {
                logger.info("Следующий клиент вызван: " + nextClient);
            } else {
                logger.warning("Очередь клиентов пуста.");
            }

        return nextClient;
    }

    //  метод для просмотра текущей очереди
    public void viewCurrentQueue() {
        logger.info("Просмотр текущей очереди клиентов:");
        for (Client client : clientQueue) {
            System.out.println(client);
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

