package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Tour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TourManagerTest {

    private TourManager tourManager;

    @BeforeEach
    void setUp() {
        tourManager = new TourManager(); // Инициализация TourManager перед каждым тестом
    }

    @Test
    void testAddTour_ValidTour() {
        Tour tour = new Tour("1",  LocalDate.of(2024, 10, 12),
                10,  4500.0,5);
        tourManager.addTour(tour);
        assertEquals(1, tourManager.getAllTours().size(), "Ожидается, что будет 1 тур.");
    }

    @Test
    void testAddTour_NullTour() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            tourManager.addTour(null);
        });
        assertEquals("Тур не может быть null.", exception.getMessage());
    }

    @Test
    void testAddTour_DuplicateId() {
        Tour tour1 = new Tour("1",  LocalDate.of(2024, 10, 12),
                10, 4500.0, 5);
        Tour tour2 = new Tour("1",  LocalDate.of(2024, 11, 12),
                7, 5000.0, 4);
        tourManager.addTour(tour1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            tourManager.addTour(tour2);
        });
        assertEquals("Тур с таким ID уже существует: 1", exception.getMessage());
    }

    @Test
    void testRemoveTour_ExistingId() {
        Tour tour = new Tour("1",  LocalDate.of(2024, 10, 12), 10, 4500.0, 5);
        tourManager.addTour(tour);
        assertTrue(tourManager.removeTour(1), "Тур с ID 1 должен быть успешно удалён.");
        assertEquals(0, tourManager.getAllTours().size(), "Ожидается," +
                " что не будет туров после удаления.");
    }

    @Test
    void testRemoveTour_NonExistingId() {
        assertFalse(tourManager.removeTour(999), "Не должно быть возможности " +
                "удалить несуществующий тур.");
    }

    @Test
    void testFindTourById_ExistingId() {
        Tour tour = new Tour("2",  LocalDate.of(2024, 11, 12),
                7, 3000.0, 4);
        tourManager.addTour(tour);
        Tour foundTour = tourManager.findTourById(2);
        assertNotNull(foundTour, "Тур с ID 2 должен быть найден.");
        assertEquals("Испания", foundTour.getDestination(), "Должен вернуть правильный тур.");
    }

    @Test
    void testFindTourById_NonExistingId() {
        assertNull(tourManager.findTourById(999), "Не должно быть возможности найти несуществующий тур.");
    }

    @Test
    void testGetAllTours_WhenEmpty() {
        List<Tour> tours = tourManager.getAllTours();
        assertNotNull(tours, "Список туров не должен быть null.");
        assertTrue(tours.isEmpty(), "Список туров должен быть пуст.");
    }

    @Test
    void testGetAllTours_WhenNotEmpty() {
        tourManager.addTour(new Tour("1",  LocalDate.of(2024, 10, 12),
                10, 4500.0, 5));
        tourManager.addTour(new Tour("2",  LocalDate.of(2024, 11, 12),
                7, 3000.0, 4));
        List<Tour> tours = tourManager.getAllTours();

        assertEquals(2, tours.size(), "Ожидается, что будет 2 тура.");
    }

    @Test
    void testGetAllTours_ListShouldNotBeModifiable() {
        tourManager.addTour(new Tour("1",  LocalDate.of(2024, 10, 12),
                10, 4500.0, 5));
        List<Tour> tours = tourManager.getAllTours();

        assertThrows(UnsupportedOperationException.class, () -> {
            tours.add(new Tour("2",  LocalDate.of(2024, 11, 12),
                    7, 3000.0, 4));
        }, "Список не должен поддерживать модификацию.");
    }
}


/*
1. testAddTour_ValidTour: Проверяем успешное добавление корректного тура.
2. testAddTour_NullTour: Ожидаем, что добавление null вызовет исключение.
3. testAddTour_DuplicateId: Проверяет, что добавление тура с дубликатом ID вызывает исключение.
4. testRemoveTour_ExistingId: Проверим, что существующий тур можно удалить.
5. testRemoveTour_NonExistingId: Проверили, что удаление несуществующего тура не может быть выполнено.
6. testFindTourById_ExistingId: Проверяем успешное нахождение тура по ID.
7. testFindTourById_NonExistingId: Проверяет, что несуществующий тур возвращает null.
8. testGetAllTours_WhenEmpty: Проверим, что getAllTours возвращает пустой список,
         если туры не добавлены.
9. testGetAllTours_WhenNotEmpty: Проверить, что getAllTours возвращает корректное количество
        добавленных туров.
10. testGetAllTours_ListShouldNotBeModifiable:Убеждаемся, что возвращенный список не позволяет модификации
 (например, добавление нового тура).
 */