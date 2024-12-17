package TourismBureauManagementSystem.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TourTest {
    private Tour tour;

    @BeforeEach
    public void setUp() {
        // Инициализация объекта Tour с 5 доступными местами
        tour = new Tour("1", "Экскурсия", LocalDate.now().plusDays(10), 5, 1000.0, 5);
    }

    @Test
    public void testTourCreation() {
        assertNotNull(tour);
        assertEquals("1", tour.getId());
        assertEquals("Экскурсия", tour.getDestination());
        assertEquals(LocalDate.now().plusDays(10), tour.getDate());
        assertEquals(5, tour.getDuration());
        assertEquals(1000.0, tour.getPrice());
        assertEquals(5, tour.getAvailableSeats());
    }

    @Test
    public void testUpdateAvailableSeats_Success() {
        tour.updateAvailableSeats(-1); // Уменьшаем на 1
        assertEquals(4, tour.getAvailableSeats());

        tour.updateAvailableSeats(2); // Увеличиваем на 2
        assertEquals(6, tour.getAvailableSeats());
    }

    @Test
    public void testUpdateAvailableSeats_Negative() {
        tour.updateAvailableSeats(-6); // Пытаемся уменьшить до отрицательного значения
        assertEquals(5, tour.getAvailableSeats()); // Доступные места не должны уменьшаться
    }

    @Test
    public void testBookTour_Success() {
        boolean result = tour.bookTour(3); // Пытаемся забронировать 3 места
        assertTrue(result);
        assertEquals(2, tour.getAvailableSeats());
    }

    @Test
    public void testBookTour_NotEnoughSeats() {
        boolean result = tour.bookTour(6); // Пытаемся забронировать 6 мест
        assertFalse(result);
        assertEquals(5, tour.getAvailableSeats()); // Доступные места должны оставаться прежними
    }

    @Test
    public void testCancelBooking_Success() {
        tour.bookTour(2); // Бронируем 2 места
        assertEquals(3, tour.getAvailableSeats()); // Проверяем, что осталось 3 места

        tour.cancelBooking(2); // Отменяем 2 места
        assertEquals(5, tour.getAvailableSeats()); // Должно вернуться к 5 местам
    }

    @Test
    public void testEqualsAndHashCode() {
        Tour anotherTour = new Tour("1", "Экскурсия", LocalDate.now().plusDays(10), 5, 1000.0, 5);
        assertEquals(tour, anotherTour);
        assertEquals(tour.hashCode(), anotherTour.hashCode());

        Tour differentTour = new Tour("2", "Другой тур", LocalDate.now().plusDays(10), 5, 1000.0, 5);
        assertNotEquals(tour, differentTour);
    }

    @Test
    public void testToString() {
        String expectedString = "Tour{id='1', destination='Экскурсия', date=" + LocalDate.now().plusDays(10) +
                ", duration=5, price=1000.0, availableSeats=5}";
        assertEquals(expectedString, tour.toString());
    }

} // test ended
