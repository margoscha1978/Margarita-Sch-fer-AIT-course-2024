package lesson_35.homework35;
/*
Задача:
 - Допустим, у вас есть массив доступных рейсов String[] flights = {"SU100", "BA202", "LH300", "AF101", "AA777"}.
 - И есть массив для хранения имён пассажиров: String[] passengers = new String[5].
 - Индексы в этих массивах соответствуют друг другу.
Напишите метод addPassenger(int flightIndex, String passengerName), который:
 - Проверяет, что flightIndex находится в границах массива flights
   (иначе выбрасывает ArrayIndexOutOfBoundsException).
 - Проверяет, что passengerName не пустое и не null (иначе выбрасывает IllegalArgumentException).
 - Если все проверки пройдены, записывает имя пассажира в passengers[flightIndex].
Напишите метод getPassenger(int flightIndex), который:
 - Проверяет, что flightIndex находится в границах массива.
 - Если passengers[flightIndex] == null,
   выбрасывает собственное исключение NoPassengerException (унаследованное от Exception),
   сообщая, что для данного рейса нет пассажира.
 - Возвращает имя пассажира, если он есть.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlightReservations {
    private static final String[] flights = {"SU100", "BA202", "LH300", "AF101", "AA777"};
    private static final String[] passengers = new String[5];
    private static final Logger logger = LoggerFactory.getLogger(FlightReservations.class);

    public static void addPassenger(int flightIndex, String passengerName) {
        if (flightIndex < 0 || flightIndex >= flights.length) {
            logger.error("Индекс рейса вне границ: {}", flightIndex);
            throw new ArrayIndexOutOfBoundsException("Индекс рейса вне границ массива");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            logger.error("Имя пассажира не может быть пустым или null");
            throw new IllegalArgumentException("Имя пассажира не может быть пустым или null");
        }
        passengers[flightIndex] = passengerName;
        logger.info("Пассажир {} добавлен на рейс {}", passengerName, flights[flightIndex]);
    }

    public static String getPassenger(int flightIndex) throws NoPassengerException {
        if (flightIndex < 0 || flightIndex >= passengers.length) {
            logger.error("Индекс рейса вне границ: {}", flightIndex);
            throw new ArrayIndexOutOfBoundsException("Индекс рейса вне границ массива");
        }
        if (passengers[flightIndex] == null) {
            logger.warn("Нет пассажира на рейсе {}", flights[flightIndex]);
            throw new NoPassengerException("Для рейса " + flights[flightIndex] + " нет пассажира");
        }
        return passengers[flightIndex];
    }

} // klass ended
