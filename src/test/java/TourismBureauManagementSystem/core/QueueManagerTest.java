package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.QueueItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueueManagerTest {

    private QueueManager<QueueItem> queueManager;

    @BeforeEach
    public void setUp() {
        queueManager = new QueueManager<>();
    }

    @Test
    public void testAddClient() {
        QueueItem item = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        queueManager.addClient(item);

        assertFalse(queueManager.isQueueEmpty());
    }

    @Test
    public void testRemoveClient() {
        QueueItem item = new QueueItem("1", QueueItem.RequestType.CONSULTATION, LocalDateTime.now());
        queueManager.addClient(item);

        QueueItem removedItem = queueManager.removeClient();
        assertEquals(item.getClientId(), removedItem.getClientId());
        assertTrue(queueManager.isQueueEmpty());
    }

    @Test
    public void testPeekNextClient() {
        QueueItem item1 = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        QueueItem item2 = new QueueItem("2", QueueItem.RequestType.CANCELLATION, LocalDateTime.now());

        queueManager.addClient(item1);
        queueManager.addClient(item2);

        QueueItem nextItem = queueManager.peekNextClient();
        assertEquals(item1.getClientId(), nextItem.getClientId());
    }

    @Test
    public void testIsQueueEmpty() {
        assertTrue(queueManager.isQueueEmpty());

        QueueItem item = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        queueManager.addClient(item);

        assertFalse(queueManager.isQueueEmpty());
        queueManager.removeClient();
        assertTrue(queueManager.isQueueEmpty());
    }

    @Test
    public void testGetQueueSize() {
        assertEquals(0, queueManager.getQueueSize());

        QueueItem item1 = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        queueManager.addClient(item1);

        assertEquals(1, queueManager.getQueueSize());

        QueueItem item2 = new QueueItem("2", QueueItem.RequestType.CANCELLATION, LocalDateTime.now());
        queueManager.addClient(item2);

        assertEquals(2, queueManager.getQueueSize());

        queueManager.removeClient();
        assertEquals(1, queueManager.getQueueSize());
    }

    @Test
    public void testAddNullClient() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            queueManager.addClient(null);
        });
        assertEquals("Клиент не может быть null", exception.getMessage());
    }

    @Test
    public void testRemoveClientFromEmptyQueue() {
        QueueItem removedItem = queueManager.removeClient();
        assertNull(removedItem);
        assertTrue(queueManager.isQueueEmpty());
    }

    @Test
    public void testGetQueueItems() {
        QueueItem item1 = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        QueueItem item2 = new QueueItem("2", QueueItem.RequestType.CANCELLATION, LocalDateTime.now());

        queueManager.addClient(item1);
        queueManager.addClient(item2);

        List<QueueItem> items = queueManager.getQueueItems();
        assertEquals(2, items.size());
    }

    @Test
    public void testGetQueueItemsImmutable() {
        QueueItem item1 = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        queueManager.addClient(item1);

        List<QueueItem> items = queueManager.getQueueItems();
        assertThrows(UnsupportedOperationException.class, () -> {
            items.add(new QueueItem("2", QueueItem.RequestType.CANCELLATION, LocalDateTime.now()));
        });
    }

    @Test
    public void testOrderOfQueueItems() {
        QueueItem item1 = new QueueItem("1", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        QueueItem item2 = new QueueItem("2", QueueItem.RequestType.CANCELLATION, LocalDateTime.now());

        queueManager.addClient(item1);
        queueManager.addClient(item2);

        QueueItem firstRemoved = queueManager.removeClient();
        assertEquals("1", firstRemoved.getClientId());

        QueueItem secondRemoved = queueManager.removeClient();
        assertEquals("2", secondRemoved.getClientId());
    }
}
/*
1. testAddClient: Проверяет, что клиент был успешно добавлен в очередь.
2. testRemoveClient: Проверяет правильность возврата удаляемого клиента и подтверждает,
 что очередь пуста после удаления.
3. testPeekNextClient: Проверяет, что метод peekNextClient возвращает правильный следующий элемент в очереди.
4. testIsQueueEmpty: Убедитесь, что метод isQueueEmpty возвращает правильное значение.
5. testGetQueueSize: Проверяет размеры очереди после добавления и удаления клиентов.
6. testAddNullClient: Проверяет, что при добавлении null выбрасывается исключение.
7. testRemoveClientFromEmptyQueue: Проверяет, что при удалении из пустой очереди возвращается null.
8. testGetQueueItems: Убедитесь, что полученные элементы очереди верны.
9. testGetQueueItemsImmutable: Проверяет, что очередь возвращает неизменяемый список элементов.
10. testOrderOfQueueItems: Проверяет, что порядок элементов в очереди сохраняется.
 */