package lesson_35.homework35;
/*
В методе main(FlightReservationsApp):
    Вызовите addPassenger с корректными и некорректными параметрами.
    Вызовите getPassenger для разных индексов.
    Перехватывайте все исключения и выводите информативные сообщения.
 */
import static lesson_35.homework35.FlightReservations.addPassenger;
import static lesson_35.homework35.FlightReservations.getPassenger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightReservationsApp {
    public static void main(String[] args) {
        try {
            addPassenger(0, "Иванов");
            addPassenger(1, "Петров");
            addPassenger(5, "Сидоров"); // Исключение: индекс вне границ
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            log.error("Ошибка при добавлении пассажира: {}", e.getMessage());
        }

        try {
            System.out.println("Пассажир на рейсе 0: " + getPassenger(0));
            System.out.println("Пассажир на рейсе 4: " + getPassenger(4)); // Исключение: нет пассажира
        } catch (ArrayIndexOutOfBoundsException | NoPassengerException e) {
            log.error("Ошибка при получении пассажира: {}", e.getMessage());
        }
    }

} // klass ended
