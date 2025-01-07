package lesson_12.ArrayMetods.TourismBureauManagementSystem.model;
import TourismBureauManagementSystem.model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/*
1.testRegisterClient_Success: Проверяет успешную регистрацию нового клиента.
2.testRegisterClient_DuplicateID: Проверяет, что при попытке зарегистрировать клиента с уже существующим
  ID выбрасывается исключение.
3.testFindClientById_Found: Проверяет, что клиент найден по ID.
4.testFindClientById_NotFound: Проверяет, что невозможно найти клиента, если он не зарегистрирован.
5.testFindClientsByName_Found: Проверяет, что корректно найдены клиенты по имени.
6.testFindClientsByName_NoMatch: Проверяет, что нет совпадений при поиске по имени, если клиент отсутствует.
7.testRemoveClientById_Success: Проверяет успешное удаление клиента по ID.
8.testRemoveClientById_NotFound: Проверяет, что нельзя удалить клиента по ID, если он отсутствует, и возвращает false.
9.testUpdateContactInfo: Проверяет, что контактная информация клиента обновляется корректно.
10.testToString: Проверяет, что метод toString() возвращает ожидаемое строковое представление объекта клиента.
 */

class ClientTest {
    @BeforeEach
    void setUp() {
        // Сначала очищаем список клиентов перед каждым тестом
        Client.getClientsList().clear();
    }

    @Test
    void testRegisterClient_Success() { // регистрируем нового клиента.
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        assertEquals(1, Client.getClientsList().size());
    }

    @Test
    void testRegisterClient_DuplicateID() { // проверяем нет ли копии id
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Client.registerClient("1", "Дмитрий", "Дмитриев", "dmitry@mail.ru");
        });
        assertTrue(exception.getMessage().contains("Клиент с ID 1 уже зарегистрирован."));
    }

    @Test
    void testFindClientById_Found() { // поиск клиента по id
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Client foundClient = Client.findClientById("1");
        assertNotNull(foundClient);
        assertEquals("Иван", foundClient.getFirstName());
    }

    @Test
    void testFindClientById_NotFound() { // выясняем есть ли ошибки при регистрации id
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Client foundClient = Client.findClientById("2");
        assertNull(foundClient);
    }

    @Test
    void testFindClientsByName_Found() { // поиск по имени
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Client.registerClient("5", "Петр", "Петров", "petr@mail.ru");
        List<Client> clients = Client.findClientsByName("Иван");
        assertEquals(1, clients.size());
    }

    @Test
    void testFindClientsByName_NoMatch() { // есть ли клиенты с похожими именами, если мы удалили клиента
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        List<Client> clients = Client.findClientsByName("Петр");
        assertTrue(clients.isEmpty());
    }

    @Test
    void testRemoveClientById_Success() { // удаляем клиента по id
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        boolean removed = Client.removeClientById("1");
        assertTrue(removed);
        assertEquals(0, Client.getClientsList().size());
    }

    @Test
    void testRemoveClientById_NotFound() { // проверка после удаления по id, клиент уже удален
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        boolean removed = Client.removeClientById("2");
        assertFalse(removed);
        assertEquals(1, Client.getClientsList().size());
    }

    @Test
    void testUpdateContactInfo() { // обновление данных клиента, исправление ошибок при добавлении клиента
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Client client = Client.findClientById("1");
        assertNotNull(client);
        client.updateContactInfo("new_ivan@mail.ru");
        assertEquals("new_ivan@mail.ru", client.getContactInfo());
    }

    @Test
    void testToString() {
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Client client = Client.findClientById("1");
        assertEquals("Client{id='1', firstName='Иван', lastName='Иванов', contactInfo='ivan@mail.ru'}", client.toString());
    }

} // test ended

