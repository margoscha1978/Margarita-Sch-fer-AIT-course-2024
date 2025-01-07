package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientManager {
    // Словарь для хранения клиентов с их уникальными ID
    private final HashMap<Integer, Client> clients = new HashMap<>();
    // private static int idCounter = 0; // Счетчик для уникальных ID клиентов

    // Метод для регистрации нового клиента
    public Client registerClient(String firstName, String lastName, String contactInfo) {
        // Создаем нового клиента с уникальным ID
        Client client = new Client(firstName, lastName, contactInfo);
        // Сохраняем клиента в словаре, используя его ID как ключ
        clients.put(client.getId(), client);
        return client;
    }

    // Метод для поиска клиента по ID
    public Optional<Client> findClientById(int id) {
        // Возвращаем клиента, оборачивая его в Optional
        return Optional.ofNullable(clients.get(id));
    }

    // Метод для получения всех клиентов
    public List<Client> getAllClients() {
        // Возвращаем список всех клиентов
        return new ArrayList<>(clients.values());
    }

    // Метод для удаления клиента по ID
    public boolean removeClientById(int id) {
        if (clients.containsKey(id)) {
            clients.remove(id);
            return true; // Возвращаем true, если удаление произошло успешно
        }
        return false; // Возвращаем false, если клиент не найден
    }

    // Метод для обновления контактной информации клиента
    public boolean updateContactInfo(int id, String newContactInfo) {
        Optional<Client> clientOpt = findClientById(id);
        if (clientOpt.isPresent()) {
            Client client = clientOpt.get();
            client.updateContactInfo(newContactInfo);
            return true; // Возвращаем true, если обновление произошло успешно
        }
        return false; // Возвращаем false, если клиент не найден
    }

    // Метод для поиска клиентов по имени или фамилии
    public List<Client> findClientsByName(String name) {
        // Ищем клиентов, у которых имя или фамилия соответствует переданному параметру
        return clients.values().stream()
                .filter(client -> client.getFirstName().equalsIgnoreCase(name) ||
                        client.getLastName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
} // klass ended
/*
 Описание каждого метода

1. registerClient(...): Создает нового клиента и добавляет его в коллекцию clients, используя его уникальный ID.
2. findClientById(int id): Ищет клиента по его ID и возвращает его в виде Optional<Client>
 для безопасного обращения к объекту.
3. getAllClients(): Возвращает список всех клиентов в виде List<Client>.
4. removeClientById(int id): Удаляет клиента по его ID из коллекции. Возвращает true,
если клиент был успешно найден и удален, и false, если клиента с таким ID не существует.
5. updateContactInfo(int id, String newContactInfo): Обновляет контактную информацию клиента.
 Если клиент с указанным ID найден, его информация обновляется, и метод возвращает true.
  Если клиента не существует, возвращает false.
 */
