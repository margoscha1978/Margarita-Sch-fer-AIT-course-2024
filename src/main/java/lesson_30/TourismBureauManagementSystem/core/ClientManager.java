package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private ArrayList<Client> clients; // Список клиентов

    public ClientManager() {
        clients = new ArrayList<>();
    }

    // 1. Метод для удаления клиента из списка по уникальному идентификатору.
    public boolean removeClient(int clientId) {
        for (Client client : clients) {
            if (client.getClientId() == clientId) {
                clients.remove(client);
                System.out.println("Клиент с id " + clientId + " успешно удален.");
                return true; // Клиент успешно удален
            }
        }
        System.out.println("Клиент с id " + clientId + " не найден.");
        return false; // Клиент не найден
    }

    // 2. Метод для поиска клиента по уникальному идентификатору.
    public Client findClientById(int clientId) {
        for (Client client : clients) {
            if (client.getClientId() == clientId) {
                return client; // Клиент найден
            }
        }
        return null; // Клиент не существует
    }

    // 3. Метод, который возвращает список всех клиентов.
    public List<Client> listAllClients() {
        return new ArrayList<>(clients); // Возвращаем копию списка клиентов
    }

    // 4. Метод для обновления имени и фамилии клиента по уникальному идентификатору.
    public boolean updateClientName(int clientId, String newFirstName, String newLastName) {
        Client client = findClientById(clientId);
        if (client != null) {
            // Предполагается, что есть методы для обновления имени и фамилии
            client.setFirstName(newFirstName);
            client.setLastName(newLastName);
            System.out.println("Имя клиента с id " + clientId + " успешно обновлено.");
            return true; // Имя успешно обновлено
        }
        System.out.println("Клиент с id " + clientId + " не найден.");
        return false; // Клиент не найден
    }

    // 5. Метод для поиска клиентов по контактной информации.
    public List<Client> findClientByContactInfo(String contactInfo) {
        List<Client> foundClients = new ArrayList<>();
        for (Client client : clients) {
            if (client.getContactInfo().equals(contactInfo)) {
                foundClients.add(client); // Добавляем клиента с совпадающим контактом
            }
        }
        return foundClients; // Возвращаем список найденных клиентов
    }
    // 6. Метод для добавления клиента в список
    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Клиент добавлен: " + client);
    }
    // 7. Метод для отображения всех клиентов
    public void viewClients() {
        System.out.println("Список клиентов:");
        for (Client client : clients) {
            System.out.println(client);
        }
    }
} // klass ended

/*
 1. removeClient(int clientId)
 Метод для удаления клиента из списка по уникальному идентификатору.
 Возвращает true, если клиент успешно удален, или false, если клиента не найдено.
 2. findClientById(int clientId)
 Метод для поиска клиента по уникальному идентификатору.
 Возвращает объект Client, если найден, или null, если клиента не существует.
 3. listAllClients()
 Метод, который возвращает список всех клиентов. Полезен для отображения всех данных о клиентах.
 4. updateClientName(int clientId, String newFirstName, String newLastName)
 Метод для обновления имени и фамилии клиента по уникальному идентификатору.
 Возвращает true, если имя успешно обновлено, или false, если клиент не найден.
 5. findClientByContactInfo(String contactInfo)
 Метод для поиска клиентов по контактной информации.
 Возвращает список клиентов, которые имеют указанную контактную информацию.
 6. addClient, метод для добавления клиента в список
 7. Метод viewClients() для отображения всех клиентов
 */
