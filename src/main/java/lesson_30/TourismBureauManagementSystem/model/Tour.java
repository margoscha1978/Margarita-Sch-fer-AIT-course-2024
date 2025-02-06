package lesson_30.TourismBureauManagementSystem.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

/*
Поля:
уникальный идентификатор тура id;
направление выбранное клиентом;
дата начала тура;
продолжительность тура;
стоимость тура;
количество мест доступных в туре или для тура если едет группа;
Метод:
updateAvailableSeats(int change);
 */
public class Tour {
    private static final Logger logger = Logger.getLogger(Tour.class.getName());

    private int id; // Уникальный идентификатор тура
    private String destination; // Направление
    private LocalDate date; // Дата начала
    private int duration; // Продолжительность
    private double price; // Стоимость
    private int availableSeats; // Количество доступных мест

    // Конструктор
    public Tour(int id, String destination, LocalDate date,int duration,double price , int availableSeats) {
        if (availableSeats < 0) {
            throw new IllegalArgumentException("Количество доступных мест не может быть отрицательным.");
        }
        this.id = id;
        this.destination = destination;
        this.date = date;
        this.duration = duration;
        this.price = price;
        this.availableSeats = availableSeats;
        logger.info("Tour created: " + this.toString());
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Метод обновления количества доступных мест
    public void updateAvailableSeats(int change) {
        if (availableSeats + change < 0) {
            logger.severe("Failed to update available seats: Not enough available seats.");
            throw new IllegalArgumentException("Недостаточно доступных мест.");
        }
        availableSeats += change; // Обновляем доступные места
        logger.info("Updated available seats for tour ID " + id + ": " + availableSeats);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", price=" + price +
                ", availableSeats=" + availableSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return id == tour.id && duration == tour.duration && Double.compare(price, tour.price) == 0
                && availableSeats == tour.availableSeats && Objects.equals(destination, tour.destination)
                && Objects.equals(date, tour.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destination, date, duration, price, availableSeats);
    }

} // klass ended

/*
1. Добавление логирования: Мы будем логировать создание тура и изменения количества доступных мест.
2. Обработка исключений: Те же принципы, что и в классе Client, мы применим и здесь для лучшего контроля
   и управления данными
3. Формат даты: Возможно, имеет смысл использовать LocalDate (или LocalDateTime), чтобы лучше управлять датой.
 */