package TourismBureauManagementSystem.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Objects;
/*
     Создать класс QueueItem с уникальными полями:
     - clientId (идентификатор клиента).
     - requestType (тип запроса от клиента на тур).
     - timestamp (время постановки клиента в очередь).
     И методами:
     - getWaitingTime()
     - постановка клиента в очередь на обслуживание с указанием типа запроса(бронирование, консультация, возврат).
     - управление очередью: вызов следующего клиента.
     - просмотр текущей очереди (имена клиентов, типы запросов).
     Использование коллекций HashMap и ArrayList для хранения данных в памяти.
         */
public class QueueItem {
    public static final Logger log = LoggerFactory.getLogger(QueueItem.class);

    // Перечисление для типов запросов
    public enum RequestType {
        BOOKING,
        CONSULTATION,
        CANCELLATION
    }

    private String clientId; // Идентификатор клиента
    private RequestType requestType; // Тип запроса от клиента
    private LocalDateTime timestamp; // Время постановки клиента в очередь

    // Конструктор класса QueueItem.
    // clientId идентификатор клиента (должен быть уникальным и не null)
    // requestType тип запроса от клиента
    // timestamp время постановки клиента в очередь

    public QueueItem(String clientId, RequestType requestType, LocalDateTime timestamp) {
        if (clientId == null || clientId.isEmpty()) {
            log.error("Попытка создать QueueItem с пустым идентификатором клиента");
            throw new IllegalArgumentException("clientId не может быть null или пустым");
        }
        this.clientId = clientId;
        this.requestType = requestType;
        this.timestamp = timestamp;
        log.info("Создан QueueItem: {}", this);
    }

    public String getClientId() {
        return clientId;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

     // Метод для вычисления времени ожидания
    public long getWaitingTime() {
        Duration duration = Duration.between(timestamp, LocalDateTime.now());
        long waitingMinutes = duration.toMinutes();
        log.info("Время ожидания для клиента {}: {} минут", clientId, waitingMinutes);
        return waitingMinutes; // Возвращает время ожидания в минутах
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QueueItem queueItem)) return false;
        return Objects.equals(clientId, queueItem.clientId) &&
                requestType == queueItem.requestType &&
                Objects.equals(timestamp, queueItem.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, requestType, timestamp);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueueItem{");
        sb.append("clientId='").append(clientId).append('\'');
        sb.append(", requestType=").append(requestType);
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }


} // klass ended