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
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.logging.Logger;

public class Booking {
    private static final Logger logger = Logger.getLogger(Booking.class.getName());

    private int id; // Уникальный идентификатор бронирования
    private Client client; // Клиент, которому принадлежит бронирование
    private String service; // Услуга, которую забронировал клиент
    private LocalDateTime dateTime; // Дата и время бронирования (измените на LocalDateTime)
    private boolean isCancelled; // Статус отмены бронирования

    // Конструктор
    public Booking(int id, Client client, String service, LocalDateTime dateTime) { // Обновлено
        if (client == null) {
            throw new IllegalArgumentException("Client cannot be null.");
        }
        if (service == null || service.isEmpty()) {
            throw new IllegalArgumentException("Service cannot be null or empty.");
        }
        this.id = id;
        this.client = client;
        this.service = service;
        this.dateTime = dateTime; // Обновлено
        this.isCancelled = false;

        logger.info("Booking created: " + this.toString());
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

    public LocalDateTime getDateTime() { // Обновлено
        return dateTime; // Обновлено
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    // Метод для отмены бронирования
    public void cancelBooking() {
        if (isCancelled) {
            logger.warning("Attempted to cancel an already cancelled booking: " + this.id);
            throw new IllegalStateException("Booking is already cancelled.");
        }
        this.isCancelled = true;
        logger.info("Booking cancelled: " + this.toString());
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
        sb.append(", dateTime=").append(dateTime); // Обновлено
        sb.append(", isCancelled=").append(isCancelled);
        sb.append('}');
        return sb.toString();
    }

} // klass ended

/*
1. Логирование: Добавлены сообщения для создания и отмены бронирования. Логируется предупреждение,
   если попытка отмены уже отменённого бронирования.
2. Проверка входных параметров:
   - В конструкторе добавлены проверки на null для клиента и на пустую строку для услуги.
   - В методе cancelBooking добавлена проверка на статус отмены, чтобы избежать отмены уже отменённого бронирования.
3. Исключения:
   - IllegalArgumentException выбрасывается, когда некорректные параметры передаются в конструктор.
   - IllegalStateException выбрасывается при попытке отмены уже отмененного бронирования.
 */