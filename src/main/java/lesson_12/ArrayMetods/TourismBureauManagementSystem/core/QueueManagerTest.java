package lesson_12.ArrayMetods.TourismBureauManagementSystem.core;

import static org.junit.jupiter.api.Assertions.*;

import TourismBureauManagementSystem.core.QueueManager;
import TourismBureauManagementSystem.model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
1. testAddClient: проверяем, что клиент был успешно добавлен в очередь, увеличивая её размер.
2. testRemoveClient: проверяем, что клиент удаляется корректно из очереди и что очередь становится пустой.
3. testRemoveClientFromEmptyQueue: проверяем, что при удалении из пустой очереди возвращается null.
4. testPeekNextClient: проверяем корректность метода peekNextClient и правильность возвращаемого клиента.
5. testPeekDoesNotRemoveClient: убеждаемся, что метод peek не удаляет клиента из очереди.
6. testIsQueueEmpty: проверяем правильность работы метода isQueueEmpty.
7. testGetQueueSize: убеждаемся, что метод getQueueSize корректно отражает изменения в очереди.
8. testGetQueueItems: проверяем, что метод возвращает копию элементов в очереди.
9. testAddNullClient: проверяем, что метод addClient выбрасывает исключение при попытке добавить null.
10.testPeekNextClientEmptyQueue: проверяем, что peekNextClient возвращает null для пустой очереди.
 */
import java.util.List;

public class QueueManagerTest {
    private QueueManager<Client> queueManager;

    @BeforeEach
    public void setUp() {
        queueManager = new QueueManager<>();
    }

    // проверим, добавили ли мы клиента в очередь
    @Test
    public void testAddClient() {
        Client client = new Client("Иван","Иванов","ivan@mail.ru");
        queueManager.addClient(client);
        assertEquals(1, queueManager.getQueueSize());
    }

    // проверяем, удалили ли мы клиента из очереди
    @Test
    public void testRemoveClient() {
        Client client = new Client("Петр", "Петров","petr@mail.ru");
        queueManager.addClient(client);
        Client removedClient = queueManager.removeClient();
        assertEquals(client, removedClient);
        assertTrue(queueManager.isQueueEmpty());
    }

    // проверяем, удаление клиента из пустой очереди
    @Test
    public void testRemoveClientFromEmptyQueue() {
        Client removedClient = queueManager.removeClient();
        assertNull(removedClient);
    }

    // проверяем наличие следующего клиента в очереди
    @Test
    public void testPeekNextClient() {
        Client client = new Client("Мария", "Петрова","maria@mail.ru");
        queueManager.addClient(client);
        Client nextClient = queueManager.peekNextClient();
        assertEquals(client, nextClient);
    }

    // проверка, что метод peek не удалил клиента и он остался в списке после добавления
    @Test
    public void testPeekDoesNotRemoveClient() {
        Client client = new Client("Николай", "Федоров","nikolai@mail.ru");
        queueManager.addClient(client);
        queueManager.peekNextClient();
        assertEquals(1, queueManager.getQueueSize());
    }

    // проверяем, пустая ли у нас очередь
    @Test
    public void testIsQueueEmpty() {
        assertTrue(queueManager.isQueueEmpty());
        queueManager.addClient(new Client("Светлана", "Сидорова","svetlana@mail.ru"));
        assertFalse(queueManager.isQueueEmpty());
    }

    // проверка размера очереди после нескольких операций
    @Test
    public void testGetQueueSize() {
        assertEquals(0, queueManager.getQueueSize());
        queueManager.addClient(new Client("Светлана", "Сидорова","svetlana@mail.ru"));
        queueManager.addClient(new Client("Мария", "Петрова","maria@mail.ru"));
        assertEquals(2, queueManager.getQueueSize());
        queueManager.removeClient();
        assertEquals(1, queueManager.getQueueSize());
    }

    // проверяем есть ли дубликаты клиентов в очереди
    @Test
    public void testGetQueueItems() {
        Client client1 = new Client("Мария", "Петрова","maria@mail.ru");
        Client client2 = new Client("Иван", "Иванов","ivan@mail.ru");
        queueManager.addClient(client1);
        queueManager.addClient(client2);

        List<Client> queueItems = queueManager.getQueueItems();
        assertEquals(2, queueItems.size());
        assertTrue(queueItems.contains(client1));
        assertTrue(queueItems.contains(client2));
    }

    // проверка исключения при добавлении null клиента
    @Test
    public void testAddNullClient() {
        assertThrows(IllegalArgumentException.class, () -> {
            queueManager.addClient(null);
        });
    }

    // проверка поведения peek на пустой очереди
    @Test
    public void testPeekNextClientEmptyQueue() {
        Client nextClient = queueManager.peekNextClient();
        assertNull(nextClient);
    }

} // test ended