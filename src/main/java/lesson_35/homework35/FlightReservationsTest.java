package lesson_35.homework35;
/*
1. Инициализация: Используем метод setUp с аннотацией @BeforeEach,
   который выполняется перед каждым тестом. Это позволяет создавать новый экземпляр FlightReservations
   перед каждым тестом.
2. Тестирование метода addPassenger:
   - тест с корректными данными:проверяем, что правильно добавляется пассажир, и подтверждаем,
     что его можно получить обратно.
   - тест с некорректным индексом: проверим выбрасывание исключения, когда индекс выходит за границы.
   - тест с null в имени: проверит выбрасывание IllegalArgumentException, когда имя пассажира равно null.

3. Тестирование метода getPassenger:
   - тест с корректным индексом: Проверяем, что можно получить пассажира, если он был добавлен.
   - тест для случая, когда пассажира нет: проверим выбрасывание NoPassengerException,
     если для рейса не добавлено ни одного пассажира.
   - тест с некорректным индексом: проверит, что правильное исключение выбрасывается при запросе
     по неправильному индексу.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightReservationsTest {

    private FlightReservations flightReservations;

    @BeforeEach
    public void setUp() {
        flightReservations = new FlightReservations();
    }

    @Test
    public void testAddPassenger_ValidInput() {
        flightReservations.addPassenger(0, "Иванов");
        assertEquals("Иванов", flightReservations.getPassenger(0));
    }

    @Test
    public void testAddPassenger_InvalidIndex() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            flightReservations.addPassenger(5, "Сидоров");
        });
        assertEquals("Индекс рейса вне границ массива", exception.getMessage());
    }

    @Test
    public void testAddPassenger_NullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            flightReservations.addPassenger(0, null);
        });
        assertEquals("Имя пассажира не может быть пустым или null", exception.getMessage());
    }

    @Test
    public void testGetPassenger_ValidIndex() throws NoPassengerException {
        flightReservations.addPassenger(1, "Петров");
        assertEquals("Петров", flightReservations.getPassenger(1));
    }

    @Test
    public void testGetPassenger_NoPassenger() {
        Exception exception = assertThrows(NoPassengerException.class, () -> {
            flightReservations.getPassenger(2);
        });
        assertEquals("Для рейса LH300 нет пассажира", exception.getMessage());
    }

    @Test
    public void testGetPassenger_InvalidIndex() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            flightReservations.getPassenger(5);
        });
        assertEquals("Индекс рейса вне границ массива", exception.getMessage());
    }

} // test ended

