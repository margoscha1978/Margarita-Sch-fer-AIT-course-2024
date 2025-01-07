package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
class ClientManagerTest {
private ClientManager clientManager;
    @BeforeEach
    void setUp() {
    }

    @Test
    void registerClient() {
        Client client = clientManager.registerClient("John", "Doe", "john@example.com");

        // Проверяем, что клиент не равен null и правильные данные
        assertNotNull(client);
        assertEquals("John", client.getFirstName());
        assertEquals("Doe", client.getLastName());
        assertEquals("john@example.com", client.getContactInfo());
    }

    @Test
    void findClientById() {
        Client client = clientManager.registerClient("Alice", "Smith", "alice@example.com");
        int clientId = client.getId(); // Получаем ID добавленного клиента

        // Проверяем, можем ли мы найти клиента по ID
        Optional<Client> foundClient = clientManager.findClientById(clientId);
        assertTrue(foundClient.isPresent()); // Убедимся, что клиент был найден
        assertEquals(client, foundClient.get()); // Проверяем, что это тот же клиент
    }

    @Test
    void getAllClients() {
        clientManager.registerClient("Bob", "Brown", "bob@example.com");
        clientManager.registerClient("Charlie", "Black", "charlie@example.com");

        List<Client> clients = clientManager.getAllClients();
        assertEquals(2, clients.size()); // Проверяем, что количество клиентов отображается правильно
    }

    @Test
    void removeClientById() {
        Client client = clientManager.registerClient("David", "White", "david@example.com");
        int clientId = client.getId(); // Получаем ID клиента

        // Удаляем клиента
        boolean removed = clientManager.removeClientById(clientId);
        assertTrue(removed); // Проверяем, что удаление прошло успешно

        // Проверяем, что клиент больше не найден
        Optional<Client> foundClient = clientManager.findClientById(clientId);
        assertFalse(foundClient.isPresent()); // Убедимся, что клиент не найден
    }

    @Test
    void updateContactInfo() {
        Client client = clientManager.registerClient("Eve", "Green", "eve@example.com");
        int clientId = client.getId(); // Получаем ID клиента

        // Обновляем контактную информацию
        boolean updated = clientManager.updateContactInfo(clientId, "eve_new@example.com");
        assertTrue(updated); // Проверяем, что обновление прошло успешно

        // Проверяем, что контактная информация обновилась
        Optional<Client> foundClient = clientManager.findClientById(clientId);
        assertTrue(foundClient.isPresent());
        assertEquals("eve_new@example.com", foundClient.get().getContactInfo());
    }
    @Test
    public void testUpdateNonExistentClient() {
        // Проверяем обновление контактной информации несуществующего клиента
        boolean updated = clientManager.updateContactInfo(999, "test@example.com"); // ID несуществующего клиента
        assertFalse(updated); // Убедитесь, что метод возвращает false
    }
} // test ended