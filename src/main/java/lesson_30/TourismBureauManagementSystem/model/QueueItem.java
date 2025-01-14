package lesson_30.TourismBureauManagementSystem.model;

import java.time.LocalDateTime;
/*
Идентификатор клиента id;
Тип запроса клиента, группы;
Время, когда клиент был добавлен в очередь;
Метод:
getWaitingTime, время ожидания для клиента.
 */
public class QueueItem {
    private int clientId; // Идентификатор клиента
    private String requestType; // Тип запроса
    private LocalDateTime timestamp; // Время, когда клиент был добавлен в очередь

    // Конструктор
    public QueueItem(int clientId, String requestType) {
        this.clientId = clientId;
        this.requestType = requestType;
        this.timestamp = LocalDateTime.now();
    }

    // Геттеры
    public int getClientId() {
        return clientId;
    }

    public String getRequestType() {
        return requestType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // Метод для получения времени ожидания в очереди
    public long getWaitingTime() {
        return java.time.Duration.between(timestamp, LocalDateTime.now()).toMinutes();
    }

    @Override
    public String toString() {
        return "QueueItem{" +
                "clientId=" + clientId +
                ", requestType='" + requestType + '\'' +
                ", timestamp=" + timestamp +
                ", waitingTime=" + getWaitingTime() + " minutes" +
                '}';
    }
} // klass ended
