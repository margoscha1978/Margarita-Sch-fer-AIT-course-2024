package TourismBureauManagementSystem.model;

import java.util.Objects;

public class Client {

    private static int idCounter = 0;
    private final int id; // Уникальный ID клиента
    private String firstName;
    private String lastName;
    private String contactInfo;

    public Client(String firstName, String lastName, String contactInfo) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void updateContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName)
                && Objects.equals(contactInfo, client.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, contactInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactInfo='").append(contactInfo).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // klass ended
