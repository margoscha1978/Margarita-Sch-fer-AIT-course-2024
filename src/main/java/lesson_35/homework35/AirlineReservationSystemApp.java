package lesson_35.homework35;
/*
В методе main(AirlineReservationSystemApp):
    Инициализируйте систему несколькими рейсами (например: "SU100" → {1→false, 2→false, 3→false},
     "BA202" → {10→false, 11→false} и т.д.).
    Проверьте работу reserveSeat и cancelReservation в различных сценариях.
    Перехватывайте все исключения в try-catch.
 */
import java.util.Map;
public class AirlineReservationSystemApp {
    public static void main(String[] args) {
        AirlineReservationSystem system = new AirlineReservationSystem();

        // Инициализация системы с рейсами и местами
        system.addFlight("SU100", Map.of(1, false, 2, false, 3, false));
        system.addFlight("BA202", Map.of(10, false, 11, false));

        // Тестирование резервирования
        try {
            system.reserveSeat("SU100", 1, "Иванов");
            system.reserveSeat("SU100", 1, "Петров");
            // Это вызовет SeatUnavailableException
        } catch (SeatUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестирование отмены резервации
        try {
            system.cancelReservation("SU100", 1);
            system.cancelReservation("SU100", 1);
            // Это вызовет SeatUnavailableException
        } catch (SeatUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

} // klass ended
