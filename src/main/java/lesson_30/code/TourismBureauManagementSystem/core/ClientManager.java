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
    private int idCounter;
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
    // Метод для добавления нового клиента
    public void addClient(String firstName, String lastName, String contactInfo) {
        int newId = ++idCounter; // Увеличение счетчика для получения нового уникального ID
        Client newClient = new Client(firstName, lastName, contactInfo);
        clients.put(newId, newClient); // Сохраняем клиента в HashMap с уникальным ID
        System.out.println("Клиент " + firstName + " " + lastName + " добавлен с ID " + newId);
    }
    
    // Метод для удаления клиента по контактной информации
    public boolean removeClient(String contactInfo) {
        Client toRemove = null;

        // Находим клиента по контактной информации
        for (Client client : clients.values()) {
            if (client.getContactInfo().equals(contactInfo)) {
                toRemove = client;
                break;
            }
        }

        if (toRemove != null) {
            // Удаляем клиента из HashMap по его уникальному ID
            clients.values().remove(toRemove);
            // Вы можете также удалить клиент по ID, если у вас доступен ID
            // clients.remove(toRemove.getId());
            System.out.println("Клиент с контактной информацией " + contactInfo + " удален.");
        } else {
            System.out.println("Клиент с контактной информацией " + contactInfo + " не найден.");
        }
        return false;
    }

} // klass ended

/*
 Описание каждого метода

1. registerClient(...),addClient: Создает нового клиента и добавляет его в коллекцию clients, используя его уникальный ID.
2. findClientById(int id): Ищет клиента по его ID и возвращает его в виде Optional<Client>
 для безопасного обращения к объекту.
3. getAllClients(): Возвращает список всех клиентов в виде List<Client>.
4. removeClientById(int id),removeClient: Удаляет клиента по его ID из коллекции. Возвращает true,
если клиент был успешно найден и удален, и false, если клиента с таким ID не существует, можно и без ID
5. updateContactInfo(int id, String newContactInfo): Обновляет контактную информацию клиента.
 Если клиент с указанным ID найден, его информация обновляется, и метод возвращает true.
  Если клиента не существует, возвращает false.
 */
