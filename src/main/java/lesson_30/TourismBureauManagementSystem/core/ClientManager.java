package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private List<Client> clients;

    public ClientManager() {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public boolean updateContactInfo(int clientId, String firstName, String lastName, String newContactInfo) {
        for (Client client : clients) {
            if (client.getClientId() == clientId &&
                    client.getFirstName().equals(firstName) &&
                    client.getLastName().equals(lastName)) {
                client.setContactInfo(newContactInfo);
                return true;
            }
        }
        return false;
    }

    public boolean removeClient(int clientId) {
        return clients.removeIf(client -> client.getClientId() == clientId);
    }

    public Client findClientById(int clientId) {
        for (Client client : clients) {
            if (client.getClientId() == clientId) {
                return client;
            }
        }
        return null;
    }

    public List<Client> listAllClients() {
        return new ArrayList<>(clients);
    }

    public boolean updateClientName(int clientId, String newFirstName, String newLastName) {
        Client client = findClientById(clientId);
        if (client != null) {
            client.setFirstName(newFirstName);
            client.setLastName(newLastName);
            return true;
        }
        return false;
    }

    public List<Client> findClientByContactInfo(String contactInfo) {
        List<Client> foundClients = new ArrayList<>();
        for (Client client : clients) {
            if (client.getContactInfo().equals(contactInfo)) {
                foundClients.add(client);
            }
        }
        return foundClients;
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
 */
