package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ClientManager {
    private static final Logger logger = Logger.getLogger(ClientManager.class.getName());
    private ArrayList<Client> clients; // Список клиентов

    public ClientManager() {
        clients = new ArrayList<>();
    }

    // 1. Метод для удаления клиента из списка по уникальному идентификатору.
    public boolean removeClient(int clientId) {
        for (Client client : clients) {
            if (client.getClientId() == clientId) {
                clients.remove(client);
                logger.info("Клиент с id " + clientId + " успешно удален.");
                return true; // Клиент успешно удален
            }
        }
        logger.warning("Клиент с id " + clientId + " не найден.");
        return false; // Клиент не найден
    }

    // 2. Метод для поиска клиента по уникальному идентификатору.
    public Client findClientById(int clientId) {
        for (Client client : clients) {
            if (client.getClientId() == clientId) {
                return client; // Клиент найден
            }
        }
        logger.warning("Клиент с id " + clientId + " не найден.");
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
            client.setFirstName(newFirstName);
            client.setLastName(newLastName);
            logger.info("Имя клиента с id " + clientId + " успешно обновлено.");
            return true; // Имя успешно обновлено
        }
        logger.warning("Клиент с id " + clientId + " не найден.");
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
        if (foundClients.isEmpty()) {
            logger.warning("Клиенты с контактной информацией '" + contactInfo + "' не найдены.");
        }
        return foundClients; // Возвращаем список найденных клиентов
    }

    // 6. Метод для добавления клиента в список
    public void addClient(Client client) {
        if (client == null) {
            logger.severe("Попытка добавить клиента с нулевым значением.");
            throw new IllegalArgumentException("Клиент не может быть null.");
        }
        clients.add(client);
        logger.info("Клиент добавлен: " + client);
    }

    // 7. Метод для отображения всех клиентов
    public void viewClients() {
        logger.info("Список клиентов:");
        for (Client client : clients) {
            System.out.println(client); // Можно заменить на logger.info
        }
    }
} // класс завершен

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
 6. addClient, метод для добавления клиента в список,
    проверка на null, с последующим выбрасыванием IllegalArgumentException.
 7. Метод viewClients() для отображения всех клиентов
 */
