package lesson_36.ClassWork36;

import lesson_35.homework35.SeatUnavailableException;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {

    private AirlineReservationSystem system;

    @BeforeEach
    void setUp() {
        system = new AirlineReservationSystem();
    }

    // Тест 1: Успешное резервирование места
    @Test
    void testReserveSeat_Success() throws SeatUnavailableException {
        system.reserveSeat("QA234", 3, "John Doe");
        // Здесь можно проверить внутреннее состояние bookedSeats
    }

    // Тест 2: Резервирование занятого места
    @Test
    void testReserveSeat_SeatUnavailable() {
        assertThrows(SeatUnavailableException.class, () -> system.reserveSeat("QA234",
                1, "Jane Doe"));
    }

    // Тест 3: Отмена резервации для свободного места
    @Test
    void testCancelReservation_Success() throws SeatUnavailableException {
        system.reserveSeat("QA234", 3, "John Doe");
        system.cancelReservation("QA234", 3);
        // Здесь можно проверить внутреннее состояние bookedSeats
    }

    // Тест 4: Отмена резервации, если место уже свободное
    @Test
    void testCancelReservation_SeatAlreadyFree() {
        assertThrows(SeatUnavailableException.class, () -> system.cancelReservation("QA234", 1));
    }

    // Тест 5: Проверка на пустой номер рейса в методе reserveSeat
    @Test
    void testReserveSeat_EmptyFlightNumber() {
        assertThrows(IllegalArgumentException.class, () -> system.reserveSeat("", 1,
                "John Doe"));
    }

    // Тест 6: Проверка на пустое имя пассажира в методе reserveSeat
    @Test
    void testReserveSeat_EmptyPassengerName() {
        assertThrows(IllegalArgumentException.class, () -> system.reserveSeat("QA234", 1,
                ""));
    }

    // Тест 7: Проверка на неправильный номер места в методе reserveSeat
    @Test
    void testReserveSeat_NegativeSeatNumber() {
        assertThrows(IllegalArgumentException.class, () -> system.reserveSeat("QA234", -1,
                "John Doe"));
    }

    // Тест 8: Проверка на неправильный номер рейса в методе reserveSeat
    @Test
    void testReserveSeat_InvalidFlightNumber() {
        assertThrows(IllegalArgumentException.class, () -> system.reserveSeat("INVALID_FLIGHT",
                1, "John Doe"));
    }

    // Тест 9: Проверка на пустой номер рейса в методе cancelReservation
    @Test
    void testCancelReservation_EmptyFlightNumber() {
        assertThrows(IllegalArgumentException.class, () -> system.cancelReservation("", 1));
    }

    // Тест 10: Проверка на неправильный номер места в методе cancelReservation
    @Test
    void testCancelReservation_NegativeSeatNumber() {
        assertThrows(IllegalArgumentException.class, () -> system.cancelReservation("QA234", -1));
    }

} // test ended

/*
1. Основные функциональные тесты:
   - Тест 1: Проверяет успешное резервирование места.
   - Тест 2: Проверяет, что нельзя зарезервировать уже занятое место.
   - Тест 3: Проверяет успешную отмену бронирования свободного места.
   - Тест 4: Проверяет, что нельзя отменить бронирование, если место уже свободно.
2. Проверка на некорректные входные данные:
   - Тест 5: Проверяет, что нельзя передать пустой номер рейса в метод резервирования.
   - Тест 6: Проверяет, что нельзя передать пустое имя пассажира.
   - Тест 7: Проверяет, что нельзя передать отрицательный номер места.
   - Тест 8: Проверяет, что нельзя передать неверный номер рейса.
3. Проверка на некорректные входные данные для отмены:
   - Тест 9: Проверяет, что нельзя передать пустой номер рейса в метод отмены резервирования.
   - Тест 10: Проверяет, что нельзя передать отрицательный номер места в метод отмены резервирования.
 */