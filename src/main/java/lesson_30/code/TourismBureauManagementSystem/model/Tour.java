package TourismBureauManagementSystem.model;

import java.time.LocalDate;
import java.util.Objects;

public class Tour {
        private static int idCounter = 0;
        private int id;
        private String destination;
        private LocalDate date;
        private int duration;
        private double price;
        private int availableSeats;

        public Tour(String destination, LocalDate date, int duration, double price, int availableSeats) {
            this.id = ++idCounter;
            this.destination = destination;
            this.date = date;
            this.duration = duration;
            this.price = price;
            this.availableSeats = availableSeats;
        }

        // Геттеры и сеттеры
        public int getId() {
            return id;
        }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getDestination() {
            return destination;
        }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public LocalDate getLocalDate() {
            return date;
        }

        public int getDuration() {
            return duration;
        }

        public double getPrice() {
            return price;
        }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной.");
        }
        this.price = newPrice;
    }
    public String getSummary() {
        return String.format("Тур в %s на %d дней за %.2f. Дата: %s, Доступные места: %d.",
                destination, duration, price, date, availableSeats);
    }

        public void updateAvailableSeats(int change) {
            this.availableSeats += change;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Tour{");
            sb.append("id=").append(id);
            sb.append(", destination='").append(destination).append('\'');
            sb.append(", date=").append(date);
            sb.append(", duration=").append(duration);
            sb.append(", price=").append(price);
            sb.append(", availableSeats=").append(availableSeats);
            sb.append('}');
            return sb.toString();
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
