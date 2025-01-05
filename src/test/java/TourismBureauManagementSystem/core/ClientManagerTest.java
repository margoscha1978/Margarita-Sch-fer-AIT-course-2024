package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
/*
1. **`testAddClient()`:**
        - Проверяет правильность добавления нового клиента и увеличение общей численности клиентов.

        2. **`testAddDuplicateClient()`:**
        - Проверяет, что при добавлении дубликата выбрасывается `IllegalArgumentException`.

        3. **`testRemoveClient()`:**
        - Проверяет удаление клиента по ID и уменьшение общего количества клиентов.

        4. **`testRemoveNonExistingClient()`:**
        - Проверяет удаление несуществующего клиента, что должно вернуть `false`.

        5. **`testGetClientById()`:**
        - Проверяет возможность получения клиента по ID и подтверждает правильность полученных данных.

6. **`testGetNonExistingClientById()`:**
        - Проверяет попытку получения несуществующего клиента, возвращая `Optional.empty()`.

        7. **`testGetAllClients()`:**
        - Проверяет получение всех зарегистрированных клиентов и их количество.

        8. **`testFindClientById()`:**
        - Проверяет, что клиент найден по ID.

9. **`testFindClientsByName()`:**
        - Проверяет поиск клиента по имени, ожидая, что будет найден правильный клиент.

10. **`testUpdateContactInfo()`:**
        - Проверяет обновление контактной информации клиента и ее правильность после обновления.

        11. **`testUpdateContactInfo_NonExistingClient()`:**
        - Проверяет, что обновление контактной информации для несуществующего клиента возвращает `false`.
*/

class ClientManagerTest {
    private ClientManager clientManager;

    @BeforeEach
    void setUp() {
        clientManager = new ClientManager();
        clientManager.registerClient("Ivan", "Ivanov", "ivan@example.com");
        clientManager.registerClient("Petr", "Petrov", "petr@example.com");
        clientManager.registerClient("Anna", "Sidorova", "anna@example.com");
    }

    @Test
    void testRegisterClient() {
            Client newClient = new Client("Mikhail", "Mikhailov", "mikhail@example.com");
            clientManager.registerClient("Ivan","Ivanov","ivan@example.co");
            assertEquals(4, clientManager.getAllClients().size());
    }

    @Test
    void testRegisterDuplicateClient() {
        // Убедитесь, что этот клиент уже зарегистрирован
        clientManager.registerClient("Ivan", "Ivanov", "ivan@example.com");

        Client duplicateClient = new Client("Ivan", "Ivanov", "ivan@example.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            clientManager.registerClient("Ivan", "Ivanov", "ivan@example.com");
        });
        assertEquals("Client with the same ID or contact info already exists.", exception.getMessage());
    }

    @Test
    void testRemoveClient() {
        assertTrue(clientManager.removeClient("1")); // Удаление клиента с ID 1
        assertEquals(2, clientManager.getAllClients().size());
        assertFalse(clientManager.getClient("1").isPresent());
    }

    @Test
    void testRemoveNonExistingClient() {
        assertFalse(clientManager.removeClient("99")); // Не существующий клиент
    }

    @Test
    void testGetClientById() {
        Client client = clientManager.getClient("1").orElse(null);
        assertNotNull(client);
        assertEquals("Ivan", client.getFirstName());
    }

    @Test
    void testGetNonExistingClientById() {
        assertFalse(clientManager.getClient("99").isPresent());
    }

    @Test
    void testGetAllClients() {
        List<Client> clients = clientManager.getAllClients();
        assertEquals(3, clients.size());
        assertEquals("Ivanov", clients.get(0).getLastName());
        assertEquals("Petrov", clients.get(1).getLastName());
        assertEquals("Sidorova", clients.get(2).getLastName());
    }

    @Test
    void testFindClientById() {
        // Предполагается, что вы зарегистрировали несколько клиентов в setUp
        Optional<Client> foundClient = clientManager.findClientById(1); // Убедитесь, что ID 1 существует
        assertTrue(foundClient.isPresent(), "Клиент должен существовать");
        assertEquals("Ivanov", foundClient.get().getLastName());
    }

    @Test
    void testFindClientsByName() {
        List<Client> foundClients = clientManager.findClientsByName("Anna");
        assertEquals(1, foundClients.size());
        assertEquals("Sidorova", foundClients.get(0).getLastName());
    }

    @Test
    void testUpdateContactInfo() {
        boolean updated = clientManager.updateContactInfo(1, "ivan.new@example.com");
        assertTrue(updated);
        assertEquals("ivan.new@example.com", clientManager.getClient("1").get().getContactInfo());
    }

    @Test
    void testUpdateContactInfo_NonExistingClient() {
        assertFalse(clientManager.updateContactInfo(99, "nonexisting@example.com"));
    }

} // test ended