package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Client;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClientManagerTest {
    private ClientManager clientManager;

    @Before
    public void setUp() {
        clientManager = new ClientManager(); // Инициализация
    }

    @Test
    public void testAddClient() {
        Client client = new Client(1, "Иван", "Иванов", "ivan@example.com");
        clientManager.addClient(client);
        assertEquals(1, clientManager.listAllClients().size());
    }

   /* @Test
    public void testUpdateContactInfo() {
        Client client = new Client(1, "Иван", "Иванов", "ivan@example.com");
        clientManager.addClient(client);
        boolean updated = clientManager.updateContactInfo(1, "Иван", "Иванов",
                "ivan_new@example.com");
        assertTrue(updated);
        assertEquals("ivan_new@example.com", clientManager.findClientById(1).getContactInfo());
   } */

    @Test
    public void testRemoveClient() {
        Client client = new Client(1, "Иван", "Иванов", "ivan@example.com");
        clientManager.addClient(client);
        boolean removed = clientManager.removeClient(1);
        assertTrue(removed);
        assertNull(clientManager.findClientById(1));
    }

    @Test
    public void testListAllClients() {
        clientManager.addClient(new Client(1, "Иван", "Иванов",
                "ivan@example.com"));
        clientManager.addClient(new Client(2, "Петр", "Петров",
                "petr@example.com"));
        List<Client> clients = clientManager.listAllClients();
        assertEquals(2, clients.size());
    }

    @Test
    public void testUpdateClientName() {
        Client client = new Client(1, "Иван", "Иванов", "ivan@example.com");
        clientManager.addClient(client);
        boolean updated = clientManager.updateClientName(1, "Сергей", "Иванов");
        assertTrue(updated);
        assertEquals("Сергей", clientManager.findClientById(1).getFirstName());
    }

    @Test
    public void testFindClientById() {
        Client client = new Client(1, "Иван", "Иванов", "ivan@example.com");
        clientManager.addClient(client);
        Client foundClient = clientManager.findClientById(1);
        assertNotNull(foundClient);
        assertEquals("Иван", foundClient.getFirstName());
    }

    @Test
    public void testFindClientByNonExistentId() {
        Client foundClient = clientManager.findClientById(100);
        assertNull(foundClient);
    }

    @Test
    public void testRemoveNonExistentClient() {
        boolean removed = clientManager.removeClient(100);
        assertFalse(removed);
    }

    @Test
    public void testFindClientByContactInfo() {
        Client client = new Client(1, "Иван", "Иванов", "ivan@example.com");
        clientManager.addClient(client);
        List<Client> foundClients = clientManager.findClientByContactInfo("ivan@example.com");
        assertEquals(1, foundClients.size());
    }

    @Test
    public void testFindClientsByNonExistentContactInfo() {
        List<Client> foundClients = clientManager.findClientByContactInfo("nonexistent@example.com");
        assertTrue(foundClients.isEmpty());
    }
} // test ended

/*
Описание тестов
1. testAddClient: Проверяет, что клиент добавляется в список.
2. testUpdateContactInfo: Проверяет обновление контактной информации клиента.
3. testRemoveClient: Проверяет удаление клиента по его ID.
4. testListAllClients: Проверяет, что список всех клиентов возвращает правильное количество клиентов.
5. testUpdateClientName: Проверяет обновление имени и фамилии клиента.
6. testFindClientById: Проверяет, что можно найти клиента по его ID.
7. testFindClientByNonExistentId: Проверяет, что поиск по не существующему ID возвращает null.
8. testRemoveNonExistentClient: Проверяет, что попытка удалить несуществующего клиента возвращает false.
9. testFindClientByContactInfo: Проверяет, что можно найти клиентов по контактной информации.
10.testFindClientsByNonExistentContactInfo: Проверяет, что поиск по несуществующей контактной информации
   возвращает пустой список.
 */