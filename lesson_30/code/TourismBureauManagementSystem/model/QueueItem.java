package TourismBureauManagementSystem.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class QueueItem {
    public enum RequestType {
        BOOKING, CONSULTATION, CANCELLATION // Добавьте другие типы запросов по необходимости
    }

    private String clientId;
    private RequestType requestType;
    private LocalDateTime timestamp;

    public QueueItem(String clientId, RequestType requestType, LocalDateTime timestamp) {
        this.clientId = clientId;
        this.requestType = requestType;
        this.timestamp = timestamp;
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

    public long getWaitingTime() {
        return java.time.Duration.between(timestamp, LocalDateTime.now()).toMinutes();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QueueItem queueItem = (QueueItem) o;
        return clientId == queueItem.clientId && Objects.equals(requestType, queueItem.requestType)
                && Objects.equals(timestamp, queueItem.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, requestType, timestamp);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueueItem{");
        sb.append("clientId=").append(clientId);
        sb.append(", requestType='").append(requestType).append('\'');
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
} // klass ended
