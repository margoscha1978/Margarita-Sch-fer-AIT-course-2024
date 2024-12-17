package TourismBureauManagementSystem.core;

/*
Создаем класс ClientManager:
- Основная задача класса - управление информацией о клиентах (добавление, удаление, получение данных).
- Структура класса:
  - поле для хранения списка клиентов (как List<Client>).
  - методы для работы с клиентами:
    - void addClient(Client client): добавление нового клиента, проверка на случай появления дубликатов.
    - void removeClient(String clientId): удаление клиента по идентификатору.
    - Client getClient(String clientId): получение клиента по идентификатору.
    - List<Client> getAllClients(): получение всех клиентов.
 */

import TourismBureauManagementSystem.model.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private List<Client> clients; // создаем лист для клиентов

    public ClientManager() {
        clients = new ArrayList<>(); // инициализируем список клиентов
    }

    public void addClient(Client client) { // добавляем клиента и проверяем
        // Проверка на дубликаты
        if (findClientById(client.getId()) == null) {
            clients.add(client);
            System.out.println("Клиент добавлен: " + client);
        } else {
            System.out.println("Клиент с ID " + client.getId() + " уже существует.");
        }
    }

    public Client findClientById(String id) { // поиск клиента по id
        // Использование Stream для поиска клиента
        return clients.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst()
                .orElse(null); // Если клиент не найден
    }

    public boolean removeClient(String id) { // удаление клиента
        Client client = findClientById(id);
        if (client != null) {
            clients.remove(client);
            System.out.println("Клиент с ID " + id + " был удалён.");
            return true;
        } else {
            System.out.println("Клиент с ID " + id + " не найден.");
            return false;
        }
    }

    // список клиентов после всех операций
    public List<Client> getAllClients() {
        return new ArrayList<>(clients); // Возвращаем копию списка
    }

} // klass ended



