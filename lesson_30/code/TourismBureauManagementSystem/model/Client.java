package TourismBureauManagementSystem.model;
/*
- Класс Client: Описывает клиента с уникальными полями и методами для управления данными.
- Методы:
- registerClient: Регистрирует нового клиента.
- findClientById: Находит клиента по-уникальному ID.
- findClientsByName: Находит клиентов по имени или фамилии (независимо от регистра).
- removeClientById: Удаляет клиента по-уникальному ID.
- updateContactInfo: Обновляет контактную информацию клиента.
- Пример использования: В main методе показан пример регистрации клиентов, их поиска, обновления данных и удаления.
 */

import java.util.Objects;

public class Client {
    private static int idCounter = 0; // Счетчик для генерации уникальных ID
    private int id; // Уникальный идентификатор клиента
    private String firstName; // Имя клиента
    private String lastName; // Фамилия клиента
    private String contactInfo; // Контактная информация (например, email)

    public Client(String firstName, String lastName, String contactInfo) {
        this.id = ++idCounter; // Генерируем новый ID
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
    }

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

    // Метод для обновления контактной информации
    public void setContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }

    // Переопределяем equals и hashCode для правильного сравнения клиентов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(contactInfo, client.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactInfo);
    }
}



