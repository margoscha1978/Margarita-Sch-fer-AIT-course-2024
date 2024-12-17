package TourismBureauManagementSystem.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
1. Конструктор: проверяем создание объектов с корректными данными.
2. getWaitingTime(): проверяем вычисление времени ожидания.
3. equals() и hashCode(): проверяем равенство и корректность хеш-кода.
4. toString(): проверяем, что строка соответствует ожидаемому формату.
 */
class QueueItemTest {

    @Test
    void testConstructorValid() {
        // Создаем объект QueueItem с корректными данными
        LocalDateTime timestamp = LocalDateTime.now();
        QueueItem item = new QueueItem("123", QueueItem.RequestType.BOOKING, timestamp);

        assertNotNull(item);
        assertEquals("123", item.getClientId());
        assertEquals(QueueItem.RequestType.BOOKING, item.getRequestType());
        assertEquals(timestamp, item.getTimestamp());
    }

    @Test
    void testConstructorInvalidClientId() {
        // Проверяем, что при создании с некорректным clientId выбрасывается исключение
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new QueueItem("", QueueItem.RequestType.BOOKING, LocalDateTime.now());
        });

        assertEquals("clientId не может быть null или пустым", exception.getMessage());
    }

    @Test
    void testGetWaitingTime() {
        // Проверяем, что метод returns корректное время ожидания
        LocalDateTime timestamp = LocalDateTime.now().minus(5, ChronoUnit.MINUTES);
        QueueItem item = new QueueItem("123", QueueItem.RequestType.CONSULTATION, timestamp);

        long waitingTime = item.getWaitingTime();
        assertEquals(5, waitingTime); // Ожидаем, что время ожидания будет 5 минут
    }

    @Test
    void testEquals() {
        LocalDateTime timestamp = LocalDateTime.now();
        QueueItem item1 = new QueueItem("123", QueueItem.RequestType.BOOKING, timestamp);
        QueueItem item2 = new QueueItem("123", QueueItem.RequestType.BOOKING, timestamp); // Используем то же самое время
        QueueItem item3 = new QueueItem("124", QueueItem.RequestType.CONSULTATION, timestamp);
        assertEquals(item1, item2, "Ожидается, что объекты с одинаковыми свойствами будут равны");
        assertNotEquals(item1, item3, "Ожидается, что объекты с разными идентификаторами не будут равны");
    }

    @Test
    void testHashCode() {
        LocalDateTime timestamp = LocalDateTime.now();
        QueueItem item1 = new QueueItem("123", QueueItem.RequestType.BOOKING, timestamp);
        QueueItem item2 = new QueueItem("123", QueueItem.RequestType.BOOKING, timestamp); // Используем то же самое время

        // Сравниваем хеш-коды
        assertEquals(item1.hashCode(), item2.hashCode(), "HashCode должен быть одинаковым для равных объектов");
    }

    @Test
    void testToString() {
        LocalDateTime timestamp = LocalDateTime.now();
        QueueItem item = new QueueItem("123", QueueItem.RequestType.CANCELLATION, timestamp);

        String expected = "QueueItem{clientId='123', requestType=CANCELLATION, timestamp=" + timestamp + "}";
        assertEquals(expected, item.toString());
    }

} // test ended

/*
1. testConstructorValid: Проверяет, что конструктор правильно создает объект с корректными данными.
2. testConstructorInvalidClientId: Проверяет, что конструктор выбрасывает исключение, если clientId некорректный.
3. testGetWaitingTime: Проверяет, что метод getWaitingTime() возвращает правильное время ожидания.
4. testEquals: Проверяет, что метод  equals()  работает корректно для одинаковых объектов и возвращает false
   для разных объектов.
5. testHashCode: Проверяет, что хеш-коды равных объектов совпадают.
6. testToString: Проверяет, что метод  toString()  формирует строку в ожидаемом формате.
 */
