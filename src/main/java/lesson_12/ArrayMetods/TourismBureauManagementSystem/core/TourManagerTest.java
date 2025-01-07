package lesson_12.ArrayMetods.TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.core.TourManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
/*
1. Тест на добавление тура с датой:
   - Проверить, что при добавлении тура с корректной датой он правильно сохраняется и доступен в менеджере.
2. Тест на удаление существующего тура:
   - Проверить, что удаление указанного тура происходит успешно и что он больше не доступен через findTourById.
3. Тест на удаление несуществующего тура:
   - Проверить, что попытка удалить несуществующий тур вызывает правильное поведение (возвращает false).
4. Тест на получение тура по идентификатору:
   - Проверить, что метод findTourById возвращает корректный объект Tour с правильной датой.
5. Тест на получение несуществующего тура по идентификатору:
   - Проверить, что метод findTourById возвращает null, когда передан несуществующий идентификатор.
6. Тест на получение всех туров:
   - Проверить, что getAllTours() возвращает полный список добавленных туров, включая их даты.
7. Тест на добавление нескольких туров:
   - Проверить, что можно добавить несколько туров и они все корректно сохраняются в менеджере.
8. Тест на удаление всех туров:
   - Добавить несколько туров и проверить, что удаление всех из них работает корректно.
9. Тест на добавление тура с пустой датой:
   - Проверить, что добавление тура с недействительной или пустой датой вызывает ожидаемое поведение
    (например, исключение или игнорирование).
10. Тест на проверку уникальности идентификаторов:
    - Проверить, что менеджер не позволяет добавлять туры с одинаковыми идентификаторами.
     (Добавление двух туров с одинаковым ID и проверка, что кто-то из них не добавлен.)
 */
public class TourManagerTest {

    private TourManager tourManager;

    @BeforeEach
    public void setUp() {
        tourManager = new TourManager();
    }

    @Test
    public void testAddTourWithDate() { // проверяем добавился ли тур
        Tour tour = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        tourManager.addTour(tour);

        Tour foundTour = tourManager.findTourById("1");
        assertNotNull(foundTour);
        assertEquals(tour, foundTour);
    }

    @Test
    public void testRemoveExistingTour() { // проверяем удалили ли мы тур
        Tour tour = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        tourManager.addTour(tour);
        assertTrue(tourManager.removeTour("1"));
        assertNull(tourManager.findTourById("1"));
    }

    @Test
    public void testRemoveNonExistingTour() { // проверяем удаление ошибочного тура с неверным номером
        assertFalse(tourManager.removeTour("999")); // Тур с ID 999 не существует
    }

    @Test
    public void testFindTourById() { // получаем тур по id
        Tour tour = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        tourManager.addTour(tour);
        Tour foundTour = tourManager.findTourById("1");
        assertNotNull(foundTour);
        assertEquals(tour.getDate(), foundTour.getDate());
    }

    @Test
    public void testFindNonExistingTourById() { // проверяем ошибку ввода id
        assertNull(tourManager.findTourById("999")); // Ожидаем null
    }

    @Test
    public void testGetAllTours() { // хотим получить все туры в листе
        Tour tour1 = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        Tour tour2 = new Tour("2", "Рим", LocalDate.of(2023, 7, 10),
                7, 2500.0, 15);
        tourManager.addTour(tour1);
        tourManager.addTour(tour2);

        List<Tour> tours = tourManager.getAllTours();
        assertEquals(2, tours.size());
        assertTrue(tours.contains(tour1));
        assertTrue(tours.contains(tour2));
    }

    @Test
    public void testAddMultipleTours() { // проверяем добавление туров
        Tour tour1 = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        Tour tour2 = new Tour("2", "Рим", LocalDate.of(2023, 7, 10),
                7, 2500.0, 15);
        tourManager.addTour(tour1);
        tourManager.addTour(tour2);

        assertEquals(2, tourManager.getAllTours().size());
    }

    @Test
    public void testRemoveAllTours() { // проверяем все ли туры удалили
        Tour tour1 = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        Tour tour2 = new Tour("2", "Рим", LocalDate.of(2023, 7, 10),
                7, 2500.0, 15);
        tourManager.addTour(tour1);
        tourManager.addTour(tour2);

        assertTrue(tourManager.removeTour("1"));
        assertTrue(tourManager.removeTour("2"));
        assertEquals(0, tourManager.getAllTours().size());
    }

    @Test
    public void testAddTourWithEmptyDate() { // ввод неверной даты ошибка, тур не добавляется
        // Поведение можно тестировать, если вы добавите проверку в метод addTour
        Tour tour = new Tour("3", "Лондон", null, 5, 3000.0, 10);
        tourManager.addTour(tour);
        assertNull(tourManager.findTourById("3")); // Ожидаем, что этот тур не будет добавлен
    }

    @Test
    public void testAddDuplicateTourId() { // проверяем не создали ли мы случайно тур дубликат с одинаковым id
        Tour tour1 = new Tour("1", "Париж", LocalDate.of(2023, 6, 15),
                5, 2000.0, 10);
        Tour tour2 = new Tour("1", "Рим", LocalDate.of(2023, 7, 10),
                7, 2500.0, 15);
        tourManager.addTour(tour1);
        tourManager.addTour(tour2); // Добавляем тур с дублирующимся ID

        assertEquals(1, tourManager.getAllTours().size()); // Ожидаем, что второй тур не добавится
    }
} // test ended
  
