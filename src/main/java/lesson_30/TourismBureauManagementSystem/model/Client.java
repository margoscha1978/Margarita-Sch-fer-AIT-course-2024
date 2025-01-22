package lesson_30.TourismBureauManagementSystem.model;

import java.util.Objects;
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
   private int clientId;
   private String firstName;
   private String lastName;
   private String contactInfo;

    // конструктор
    public Client(int clientId, String firstName, String lastName, String contactInfo) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
    }

   // Геттеры
   public int getClientId() {
       return clientId;
   }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Методы для обновления имени и фамилии
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
        }

        // Метод обновления информации о контакте
        public void updateContactInfo(String newContactInfo) {
            if (newContactInfo == null || newContactInfo.isEmpty()) {
                throw new IllegalArgumentException("Contact information cannot be null or empty");
            }
            this.setContactInfo(newContactInfo);
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName) && Objects.equals(contactInfo, client.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, firstName, lastName, contactInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("clientId=").append(clientId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactInfo='").append(contactInfo).append('\'');
        sb.append('}');
        return sb.toString();
    }

} // klass ended
