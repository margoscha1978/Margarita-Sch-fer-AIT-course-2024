package lesson_30.TourismBureauManagementSystem.model;

import java.util.Objects;
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
    private int id; // Уникальный идентификатор тура
    private String destination; // Направление
    private String date; // Дата начала
    private int duration; // Продолжительность
    private double price; // Стоимость
    private int availableSeats; // Количество доступных мест

    // Конструктор
    public Tour(int id, String destination, String date, int duration, double price, int availableSeats) {
        this.id = id;
        this.destination = destination;
        this.date = date;
        this.duration = duration;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
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
    public void updateAvailableSeats(int change) {
        // Проверка на наличие достаточно мест
        if (availableSeats + change < 0) {
            throw new IllegalArgumentException("Недостаточно доступных мест.");
        }
        availableSeats += change; // Обновляем доступные места
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
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
