package TourismBureauManagementSystem.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Booking {
    static final Logger log = LoggerFactory.getLogger(Booking.class);

    private String id; // Уникальный идентификатор бронирования
    private String clientId; // Идентификатор клиента
    private String tourId; // Идентификатор тура
    private LocalDate date; // Дата бронирования

    public Booking(String id, String clientId, String tourId, LocalDate date) {
        this.id = id;
        this.clientId = clientId;
        this.tourId = tourId;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public String getTourId() {
        return tourId;
    }

    public LocalDate getDate() {
        return date;
    }

    // Метод для отмены бронирования
    public void cancelBooking(Tour tour) {
        if (tour != null) {
            tour.updateAvailableSeats(1); // Возвращаем одно место в туре
            log.info("Бронирование с ID {} отменено. Доступные места обновлены.", id);
        } else {
            log.warn("Не удалось отменить бронирование. Тур не найден.");
        }
    }

    // Метод для создания бронирования тура
    public static Booking createBooking(String clientId, String tourId, Tour tour) {
        if (clientId == null || tourId == null || tour == null) {
            log.warn("Неверные данные для бронирования. Пожалуйста, проверьте идентификаторы.");
            return null;
        }

        if (tour.getAvailableSeats() <= 0) {
            log.warn("Недостаточно доступных мест для бронирования.");
            return null;
        }

        // Генерация уникального ID для бронирования
        String bookingId = UUID.randomUUID().toString();
        LocalDate bookingDate = LocalDate.now();

        // Бронируем тур
        tour.updateAvailableSeats(-1); // Уменьшаем количество доступных мест
        Booking newBooking = new Booking(bookingId, clientId, tourId, bookingDate);
        log.info("Бронирование создано: {}", newBooking);

        return newBooking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking booking)) return false;
        return Objects.equals(id, booking.id) &&
                Objects.equals(clientId, booking.clientId) &&
                Objects.equals(tourId, booking.tourId) &&
                Objects.equals(date, booking.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, tourId, date);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", tourId='" + tourId + '\'' +
                ", date=" + date +
                '}';
    }
}
