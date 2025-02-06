package lesson_30.TourismBureauManagementSystem.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.logging.Logger;

/*
Поля:
уникальный идентификатор id;
firstName имя клиента;
lastName фамилия клиента;
contactInfo контактные данные, например электронная почта;
Метод:
updateContactInfo(String newContact);
 */
public class Client {
    private static final Logger logger = Logger.getLogger(Client.class.getName());

    private int clientId;
    private String firstName;
    private String lastName;
    private String contactInfo;
    private LocalDateTime createdAt;

    // Конструктор

    public Client(int clientId, String firstName, String lastName, String contactInfo, LocalDateTime createdAt) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.createdAt = createdAt;
    logger.info("Client created: " + this.toString());
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // Геттеры и сеттеры
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // методы
    public void updateContactInfo(String newContactInfo) {
        if (newContactInfo == null || newContactInfo.isEmpty()) {
            logger.severe("Failed to update contact info: " + newContactInfo);
            throw new IllegalArgumentException("Contact information cannot be null or empty");
        }
        this.setContactInfo(newContactInfo);
        logger.info("Updated contact information for client ID " + clientId + ": " + newContactInfo);
    }

    // Остальные методы (equals, hashCode, toString)...


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(contactInfo, client.contactInfo) && Objects.equals(createdAt, client.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, firstName, lastName, contactInfo, createdAt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("clientId=").append(clientId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactInfo='").append(contactInfo).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append('}');
        return sb.toString();
    }

} // klass ended

/*
 - Логирование: каждое создание экземпляра клиента и обновление контактной информации теперь логируется.
 - Обработка исключений: при попытке установить пустую или null контактную информацию будет выброшено исключение
   с соответствующим сообщением в логах.
 */