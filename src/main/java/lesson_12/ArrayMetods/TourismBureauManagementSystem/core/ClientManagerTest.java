package lesson_12.ArrayMetods.TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.core.ClientManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientManagerTest {
    private ClientManager clientManager;

    @BeforeEach
    void setUp() {
        clientManager = new ClientManager();
    }

    @Test
    void testAddNewClient() {
        Client client = new Client("3", "Светлана"," Сидорова","svetlana@mail.ru");
        clientManager.addClient(client);
        assertEquals(1, clientManager.getAllClients().size());
        assertEquals(true, clientManager.getAllClients().contains(client)); // Проверяем, что клиент добавлен в список
    }

    @Test
    void testAddDuplicateClient() {
        Client client = new Client("3", "Светлана"," Сидорова","svetlana@mail.ru");
        clientManager.addClient(client);
        clientManager.addClient(client); // Попытка добавить дубликат
        assertEquals(1, clientManager.getAllClients().size()); // В списке должно остаться 1 клиент
    }

    @Test
    void testRemoveExistingClient() {
        Client client = new Client("3", "Светлана"," Сидорова","svetlana@mail.ru");
        clientManager.addClient(client);
        assertTrue(clientManager.removeClient("3"));
        assertTrue(clientManager.getAllClients().isEmpty()); // Список клиентов должен быть пустым
    }

    @Test
    void testRemoveNonExistingClient() {
        assertFalse(clientManager.removeClient("non_existing_id"));
    }

    @Test
    void testGetExistingClientById() {
        Client client = new Client("1", "Иван"," Иванов","ivan@mail.ru");
        clientManager.addClient(client);

        List<Client> clients = clientManager.getAllClients();
        assertEquals(1, clients.size()); // Убедитесь, что размер списка клиентов равен 1
        assertTrue(clients.contains(client)); // Подтвердите, что клиент есть в списке
    }

    @Test
    void testGetNonExistingClientById() {
        List<Client> clients = clientManager.getAllClients();
        assertNotNull(clients); // Убедитесь, что список не равен null
        assertTrue(clients.isEmpty()); // Убедитесь, что список пуст
    }

    @Test
    void testGetAllClients() {
        Client client1 = new Client("1", "Иван", "Иванов","ivan@mail.ru");
        Client client2 = new Client("6", "Петр"," Петров","petr@mail.ru");
        clientManager.addClient(client1);
        clientManager.addClient(client2);
        List<Client> clients = clientManager.getAllClients();
        assertEquals(2, clients.size());
        assertTrue(clients.contains(client1));
        assertTrue(clients.contains(client2));
    }

    @Test
    void testInitializationOfClientsList() {
        assertTrue(clientManager.getAllClients().isEmpty());
    }

    @Test
    void testGetAllClientsReturnsCopy() {
        Client client = new Client("1", "Иван"," Иванов","ivan@mail.ru");
        clientManager.addClient(client);
        List<Client> clients = clientManager.getAllClients();
        clients.remove(client); // Удаляем из возвращенного списка
        assertEquals(1, clientManager.getAllClients().size()); // Оригинальный список все еще должен содержать 1 клиента

    }

    @Test
    void testRemoveMultipleClients() {
        Client client1 = new Client("1", "Иван"," Иванов","ivan@mail.ru");
        Client client2 = new Client("6", "Петр"," Петров","petr@mail.ru");

        clientManager.addClient(client1);
        clientManager.addClient(client2);

        // Удаляем client1 и проверяем, что удаление прошло успешно
        assertTrue(clientManager.removeClient("1"));

        // Пытаемся удалить client1 снова, должно вернуть false
        assertFalse(clientManager.removeClient("1"));

        // Проверяем, что в списке клиентов остался только один клиент
        List<Client> remainingClients = clientManager.getAllClients();
        assertEquals(1, remainingClients.size());

        // Проверяем, что оставшийся клиент - это client2
        assertTrue(remainingClients.contains(client2)); // Проверяем, что client2 есть в списке
        assertFalse(remainingClients.contains(client1)); // Проверяем, что client1 отсутствует в списке
    }

} // klass ended