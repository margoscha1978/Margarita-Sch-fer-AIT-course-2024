package TourismBureauManagementSystem.core;
import TourismBureauManagementSystem.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientManager {
    private List<Client> clients; // Список клиентов

    // Конструктор
    public ClientManager() {
        this.clients = new ArrayList<>(); // Инициализируем список
    }

    // Метод для регистрации нового клиента
    public void registerClient(String firstName, String lastName, String contactInfo) {
        // Создаем нового клиента
        Client newClient = new Client(firstName, lastName, contactInfo);

        // Проверка наличия клиента с теми же контактными данными
        for (Client existingClient : clients) {
            if (existingClient.getContactInfo().equals(newClient.getContactInfo())) {
                throw new IllegalArgumentException("Client with the same contact info already exists.");
            }
        }

        // Добавляем нового клиента в список
        clients.add(newClient);

    }
    // Метод для поиска клиента по ID
    public Optional<Client> findClientById(int id) {
        return clients.stream()
                .filter(client -> client.getId() == id) // Фильтруем клиентов по ID
                .findFirst(); // Возвращаем первого найденного клиента
    }

    // Метод для удаления клиента по идентификатору
    public boolean removeClient(String clientId) {
        return clients.removeIf(client -> String.valueOf(client.getId()).equals(clientId));
        // Удаляет клиента на основе ID
    }

    // Метод для получения клиента по идентификатору
    public Optional<Client> getClient(String clientId) {
        return clients.stream()
                .filter(client -> String.valueOf(client.getId()).equals(clientId))
                .findFirst(); // Возвращает первого клиента, соответствующего ID
    }

    // Метод для получения всех клиентов
    public List<Client> getAllClients() {
        return new ArrayList<>(clients); // Возвращает копию списка клиентов
    }

    // Метод для поиска клиентов по имени или фамилии (независимо от регистра)
    public List<Client> findClientsByName(String name) {
        String nameLowerCase = name.toLowerCase();
        List<Client> foundClients = new ArrayList<>();
        for (Client client : clients) {
            if (client.getFirstName().toLowerCase().contains(nameLowerCase) ||
                    client.getLastName().toLowerCase().contains(nameLowerCase)) {
                foundClients.add(client); // Добавляет клиента в список при совпадении имени или фамилии
            }
        }
        return foundClients; // Возвращает список найденных клиентов
    }

    // Метод для обновления контактной информации клиента
    public boolean updateContactInfo(int id, String newContactInfo) {
        Optional<Client> clientOpt = findClientById(id);
        if (clientOpt.isPresent()) {
            clientOpt.get().setContactInfo(newContactInfo);
            return true; // Возвращаем true, если обновление прошло успешно
        }
        return false; // Возвращает false, если клиент не найден
    }

}
