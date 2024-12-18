package TourismBureauManagementSystem.model;


import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Objects;

public class Tour {
    private static final Logger log = LoggerFactory.getLogger(Tour.class);

    private String id; // Уникальный идентификатор
    private String destination; // Направление
    private LocalDate date; // Дата начала
    private int duration; // Продолжительность
    private double price; // Стоимость
    private int availableSeats; // Количество доступных мест

    // Конструктор класса Tour
    public Tour(String id, String destination, LocalDate date, int duration, double price, int availableSeats) {
        this.id = id;
        this.destination = destination;
        this.date = date;
        this.duration = duration;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public String getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Метод для обновления доступных мест
    public void updateAvailableSeats(int change) {
        if (availableSeats + change < 0) {
            log.warn("Попытка уменьшить доступные места до отрицательного значения. Операция отменена.");
            return;
        }
        availableSeats += change;
        log.info("Обновлено количество доступных мест для тура с ID {}. Новое количество: {}", id, availableSeats);
    }

    // Метод для бронирования тура
    public boolean bookTour(int seats) {
        if (seats <= 0) {
            log.warn("Количество мест для бронирования должно быть положительным.");
            return false;
        }
        if (availableSeats < seats) {
            log.warn("Недостаточно доступных мест для бронирования. Доступно мест: {}", availableSeats);
            return false;
        }
        updateAvailableSeats(-seats); // Уменьшаем доступные места
        log.info("Заказано {} мест для тура с ID {}", seats, id);
        return true; // Успешное бронирование
    }

    // Метод для отмены бронирования
    public void cancelBooking(int seats) {
        if (seats <= 0) {
            log.warn("Количество мест для отмены бронирования должно быть положительным.");
            return;
        }
        updateAvailableSeats(seats); // Возвращаем доступные места
        log.info("Отменено {} мест для тура с ID {}", seats, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour tour)) return false;
        return Double.compare(tour.price, price) == 0 &&
                Double.compare(tour.duration, duration) == 0 &&
                availableSeats == tour.availableSeats &&
                id.equals(tour.id) &&
                destination.equals(tour.destination) &&
                date.equals(tour.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destination, date, duration, price, availableSeats);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id='" + id + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", price=" + price +
                ", availableSeats=" + availableSeats +
                '}';
    }

} // klass ended

/*
 Создать класс Tour c уникальными полями:
 - id (уникальный идентификатор).
 - destination (направление).
 - date (дата начала).package TourismBureauManagementSystem.model;
 - duration (продолжительность).
 - price (стоимость).
 - availableSeats (количество доступных мест).
 И методами:
 - updateAvailableSeats(int change)
 - создание туров с указанием направления, даты, продолжительности, стоимости и доступного количества мест.
 - поиск доступных туров по направлению, дате и стоимости.
 - бронирование тура для клиента с обновлением доступного количества мест.
 - отмена бронирования с возвратом мест в доступный список.
 Использование коллекций HashMap и ArrayList для хранения данных в памяти
 */