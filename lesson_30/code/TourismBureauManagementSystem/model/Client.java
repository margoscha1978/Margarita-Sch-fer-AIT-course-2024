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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String id; // Уникальный идентификатор клиента
    private String firstName; // Имя клиента
    private String lastName; // Фамилия клиента
    private String contactInfo; // Контактная информация клиента

    private static List<Client> clientsList = new ArrayList<>(); // Статический список клиентов

    // Конструктор
    public Client(String id, String firstName, String lastName, String contactInfo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName; // Инициализируем фамилию
        this.contactInfo = contactInfo; // Инициализируем контактную информацию
        clientsList.add(this); // Добавляем клиента в статический список
    }

    // Геттеры
    public String getId() {
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

    public static List<Client> getClientsList() {
        return clientsList;
    }

    // Метод для регистрации нового клиента
    public static void registerClient(String id, String firstName, String lastName, String contactInfo) {
        if (findClientById(id) != null) {
            throw new IllegalArgumentException("Клиент с ID " + id + " уже зарегистрирован.");
        }
        new Client(id, firstName, lastName, contactInfo); // Создаем нового клиента с полными данными
    }

    // Метод для поиска клиента по ID
    public static Client findClientById(String id) {
        return clientsList.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Метод для поиска клиентов по имени
    public static List<Client> findClientsByName(String name) {
        List<Client> foundClients = new ArrayList<>();
        for (Client client : clientsList) {
            if (client.getFirstName().equalsIgnoreCase(name) || client.getLastName().equalsIgnoreCase(name)) {
                foundClients.add(client);
            }
        }
        return foundClients;
    }

    // Метод для удаления клиента по ID
    public static boolean removeClientById(String id) {
        Client client = findClientById(id);
        if (client != null) {
            clientsList.remove(client);
            return true; // Успешное удаление
        }
        return false; // Клиент не найден
    }

    // Метод для обновления контактной информации
    public void updateContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }

    @Override
    public String toString() {
        return String.format("Client{id='%s', firstName='%s', lastName='%s', contactInfo='%s'}", id, firstName, lastName, contactInfo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(id, client.id) &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(contactInfo, client.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, contactInfo);
    }

} // klass ended



