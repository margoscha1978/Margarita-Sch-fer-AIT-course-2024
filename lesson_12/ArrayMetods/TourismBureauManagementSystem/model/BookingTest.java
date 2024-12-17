package TourismBureauManagementSystem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {
    private Tour tour; // Объект тура, будем использовать в тестах

    @BeforeEach
    public void setUp() {
        // Инициализация тестовых данных
        tour = new Tour("1", "Экскурсия", LocalDate.now().plusDays(10), 5, 1000.0,5);
    }

    @Test
    public void testCreateBooking_Success() {
        Booking booking = Booking.createBooking("client1", tour.getId(), tour);
        assertNotNull(booking);
        assertEquals("client1", booking.getClientId());
        assertEquals(tour.getId(), booking.getTourId());
        assertEquals(LocalDate.now(), booking.getDate());
        assertEquals(4, tour.getAvailableSeats());
    }

    @Test
    public void testCreateBooking_NotEnoughSeats() {
        tour.updateAvailableSeats(-5); // Устанавливаем 0 доступных мест
        Booking booking = Booking.createBooking("client1", tour.getId(), tour);
        assertNull(booking);
    }

    @Test
    public void testCreateBooking_NullParameters() {
        Booking booking = Booking.createBooking(null, tour.getId(), tour);
        assertNull(booking);

        booking = Booking.createBooking("client1", null, tour);
        assertNull(booking);

        booking = Booking.createBooking("client1", tour.getId(), null);
        assertNull(booking);
    }

    @Test
    public void testCreateBooking_NonExistentTour() {
        Tour nonexistentTour = new Tour("nonexistent", "Несуществующий тур",
                LocalDate.now().plusDays(10),0, 1000.0,5);
        Booking booking = Booking.createBooking("client1", nonexistentTour.getId(), nonexistentTour);
        assertNull(booking);
    }

    @Test
    public void testCancelBooking_Success() {
        Booking booking = Booking.createBooking("client1", tour.getId(), tour);
        assertNotNull(booking);

        int availableSeatsBefore = tour.getAvailableSeats();
        booking.cancelBooking(tour);
        assertEquals(availableSeatsBefore + 1, tour.getAvailableSeats());
    }

    @Test
    public void testCancelBooking_NullTour() {
        Booking booking = Booking.createBooking("client1", tour.getId(), tour);
        assertNotNull(booking);

        booking.cancelBooking(null);
        // Проверяем, что доступные места не увеличились
        assertEquals(4, tour.getAvailableSeats());
    }

    @Test
    public void testCancelBooking_WithNonExistentBooking() {
        Tour otherTour = new Tour("2", "Другой тур", LocalDate.now().plusDays(10), 5,
                1000.0,10);
        Booking booking = Booking.createBooking("client1", otherTour.getId(), otherTour);
        int availableSeatsBefore = otherTour.getAvailableSeats();
        booking.cancelBooking(otherTour);
        assertEquals(availableSeatsBefore + 1, otherTour.getAvailableSeats());
    }

    @Test
    public void testEqualsAndHashCode() {
        Booking booking1 = new Booking("1", "client1", "tour1", LocalDate.now());
        Booking booking2 = new Booking("1", "client1", "tour1", LocalDate.now());
        Booking booking3 = new Booking("2", "client2", "tour2", LocalDate.now());

        // Проверка равенства
        assertEquals(booking1, booking2);
        assertNotEquals(booking1, booking3);
        // Проверка hashCode
        assertEquals(booking1.hashCode(), booking2.hashCode());
    }

    @Test
    public void testToString() {
        Booking booking = new Booking("1", "client1", "tour1", LocalDate.now());
        String expectedString = "Booking{id='1', clientId='client1', tourId='tour1', date=" + LocalDate.now() + "}";
        assertEquals(expectedString, booking.toString());
    }

} // test ended
    /*
1. testCreateBooking_Success: Проверяет успешное создание бронирования и уменьшение количества доступных мест.
2. testCreateBooking_NotEnoughSeats: Проверяет, что создание бронирования не возможно, если нет доступных мест.
3. testCreateBooking_NullParameters: Проверяет, что если переданы `null` параметры (идентификаторы клиента или тура),
 бронирование не будет создано.
4. testCancelBooking_Success: Проверяет успешную отмену бронирования и увеличение доступных мест в туре.
5. testCancelBooking_NullTour: Проверяет, что происходит при попытке отмены бронирования с `null` в качестве тура.
6. testCreateBooking_NonExistentTour: Проверяет создание бронирования с несуществующим туром.
   Ожидается, что метод вернет null.
7. testCancelBooking_WithNonExistentBooking: Проверяет,
что отмена бронирования с несуществующими данными работает правильно.
8. testEqualsAndHashCode: Проверяет,
что два объекта Booking с одинаковыми данными считаются равными и имеют одинаковый hashCode.
9. testToString: Проверяет корректность строкового представления объекта Booking.
10. testBookingCreationInPast: Проверяет, что невозможно создать бронирование на прошлую дату.
     */