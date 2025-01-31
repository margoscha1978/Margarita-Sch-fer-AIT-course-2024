package lesson_35.homework35;
/*
- Тест успешного бронирования:Проверяет, работает ли логика бронирования корректно и что информация об успешной резервации хранится.
- Тест на бронирование занятого места: Проверяет правильность обработки ошибок с помощью SeatUnavailableException.
- Тест успешной отмены: Проверяет, что отмена резервации работает и статус места изменяется на свободное.
 */
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

public class AirlineReservationSystemTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    public void testSuccessfulReservation() {
        AirlineReservationSystem system = new AirlineReservationSystem();
        system.addFlight("SU100", Map.of(1, false, 2, false));

        try {
            system.reserveSeat("SU100", 1, "Иванов");
            Map<Integer, String> seats = system.getFlightSeats("SU100");
            // Метод для получения мест
            assert (seats.get(1) != null && seats.get(1).equals("Иванов"));
            System.out.println("Тест успешного бронирования пройден");
        } catch (Exception e) {
            System.out.println("Ошибка в тесте успешного бронирования: " + e.getMessage());
        }
    }

    @Test
    public void testReservationOfOccupiedSeat() {
        AirlineReservationSystem system = new AirlineReservationSystem();
        system.addFlight("SU100", Map.of(1, false, 2, false));

        try {
            system.reserveSeat("SU100", 1, "Иванов");
            system.reserveSeat("SU100", 1, "Петров");
            // Должно выбросить SeatUnavailableException
            System.out.println("Ошибка: Не выбросилось исключение для занятого места!");
        } catch (SeatUnavailableException e) {
            System.out.println("Тест на бронирование занятого места пройден: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка в тесте бронирования занятого места: " + e.getMessage());
        }
    }

    @Test
    public void testSuccessfulCancellation() {
        AirlineReservationSystem system = new AirlineReservationSystem();
        system.addFlight("SU100", Map.of(1, false, 2, false));

        try {
            system.reserveSeat("SU100", 1, "Иванов");
            system.cancelReservation("SU100", 1);

            Map<Integer, String> seats = system.getFlightSeats("SU100");
            // Метод для получения мест
            assert (seats.get(1) == null); // Должно стать свободным
            System.out.println("Тест успешной отмены пройден");
        } catch (Exception e) {
            System.out.println("Ошибка в тесте успешной отмены: " + e.getMessage());
        }
    }

} // test ended
