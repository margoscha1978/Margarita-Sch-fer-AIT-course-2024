package lesson_30.TourismBureauManagementSystem.model;
/*
Поля:
Уникальный идентификатор бронирования тура;
Идентификатор клиента;
Идентификатор тура;
Дата бронирования тура;
Статус отмены бронирования
Метод:
предоставляет метод для отмены бронирования, cancelBooking;
 */
import java.util.Objects;

public class Booking {
    private int id; // Уникальный идентификатор бронирования
    private Client client; // Клиент, которому принадлежит бронирование
    private String service; // Услуга, которую забронировал клиент
    private String dateTime; // Дата и время бронирования
    private boolean isCancelled; // Статус отмены бронирования


    // Конструктор
    public Booking(int id, Client client, String service, String dateTime) {
        this.id = id;
        this.client = client;
        this.service = service;
        this.dateTime = dateTime;
        this.isCancelled = false;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public String getService() {
        return service;
    }

    public String getDateTime() {
        return dateTime;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    // Метод для отмены бронирования
    public void cancelBooking() {
        this.isCancelled = true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id && isCancelled == booking.isCancelled && Objects.equals(client, booking.client)
                && Objects.equals(service, booking.service) && Objects.equals(dateTime, booking.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, service, dateTime, isCancelled);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Booking{");
        sb.append("id=").append(id);
        sb.append(", client=").append(client);
        sb.append(", service='").append(service).append('\'');
        sb.append(", dateTime='").append(dateTime).append('\'');
        sb.append(", isCancelled=").append(isCancelled);
        sb.append('}');
        return sb.toString();
    }
} // klass ended
