package TourismBureauManagementSystem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueItemTest {

    @Test
    void testQueueItemCreation() {
        QueueItem item = new QueueItem(1, "Booking");
        assertEquals(1, item.getClientId());
        assertEquals("Booking", item.getRequestType());
    }

    @Test
    void testWaitingTime() {
        QueueItem item = new QueueItem(1, "Booking");
        // Подождем 1 секунду и проверим
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertTrue(item.getWaitingTime() >= 1);
    }
} // test ended