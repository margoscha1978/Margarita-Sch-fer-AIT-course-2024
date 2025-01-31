package lesson_35.homework35;
/*
Класс AirlineReservationSystem:
В этом классе храните данные о рейсах и доступности мест.
 - Используйте Map<String, Map<Integer, Boolean>>, где:
 - Ключ первого уровня — номер рейса.
 - Значение — Map<Integer, Boolean>, указывающая, какое место занято (true) или свободно (false).
Метод reserveSeat(String flightNumber, int seatNumber, String passengerName):
 - Проверяет корректность входных данных (номер рейса не пустой, место > 0, имя пассажира не пустое).
 - Проверяет, что такой рейс существует. Если нет, выбрасывает IllegalArgumentException.
 - Проверяет, что в Map для этого рейса есть ключ seatNumber. Если нет, кидает IllegalArgumentException.
 - Если seatNumber уже занято, выбрасывает SeatUnavailableException.
 - Иначе помечает место как занятое и выводит сообщение об успешном бронировании.
Метод cancelReservation(String flightNumber, int seatNumber):
 - Проверяет, существует ли рейс.
 - Проверяет, существует ли место.
 - Если место уже свободно, выбрасывает SeatUnavailableException (или создайте NoActiveReservationException).
 - Иначе освобождает место.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


class AirlineReservationSystem {
    private static final Logger logger = Logger.getLogger(AirlineReservationSystem.class.getName());
    private final Map<String, Map<Integer, String>> flights;

    public AirlineReservationSystem() {
        flights = new HashMap<>();
    }

    public void addFlight(String flightNumber, Map<Integer, Boolean> seats) {
        Map<Integer, String> seatMap = new HashMap<>();
        for (Map.Entry<Integer, Boolean> entry : seats.entrySet()) {
            seatMap.put(entry.getKey(), null); // Изначально все места свободны
        }
        flights.put(flightNumber, seatMap);
    }

    public void reserveSeat(String flightNumber, int seatNumber, String passengerName) throws SeatUnavailableException {
        if (flightNumber == null || flightNumber.isEmpty()) {
            logger.log(Level.SEVERE, "Номер рейса не может быть пустым");
            throw new IllegalArgumentException("Номер рейса не может быть пустым");
        }
        if (seatNumber <= 0) {
            logger.log(Level.SEVERE, "Номер места должен быть больше 0");
            throw new IllegalArgumentException("Номер места должен быть больше 0");
        }
        if (passengerName == null || passengerName.isEmpty()) {
            logger.log(Level.SEVERE, "Имя пассажира не может быть пустым");
            throw new IllegalArgumentException("Имя пассажира не может быть пустым");
        }

        Map<Integer, String> seatMap = flights.get(flightNumber);
        if (seatMap == null) {
            logger.log(Level.SEVERE, "Рейс " + flightNumber + " не существует");
            throw new IllegalArgumentException("Рейс " + flightNumber + " не существует");
        }

        if (!seatMap.containsKey(seatNumber)) {
            logger.log(Level.SEVERE, "Место " + seatNumber + " не существует для рейса " + flightNumber);
            throw new IllegalArgumentException("Место " + seatNumber + " не существует для рейса " + flightNumber);
        }

        if (seatMap.get(seatNumber) != null) {
            logger.log(Level.WARNING, "Место " + seatNumber + " уже занято");
            throw new SeatUnavailableException("Место " + seatNumber + " уже занято");
        }

        seatMap.put(seatNumber, passengerName);
        logger.log(Level.INFO, "Место " + seatNumber + " успешно зарезервировано для " + passengerName);
    }

    public void cancelReservation(String flightNumber, int seatNumber) throws SeatUnavailableException {
        Map<Integer, String> seatMap = flights.get(flightNumber);
        if (seatMap == null) {
            logger.log(Level.SEVERE, "Рейс " + flightNumber + " не существует");
            throw new IllegalArgumentException("Рейс " + flightNumber + " не существует");
        }

        if (!seatMap.containsKey(seatNumber)) {
            logger.log(Level.SEVERE, "Место " + seatNumber + " не существует для рейса " + flightNumber);
            throw new IllegalArgumentException("Место " + seatNumber + " не существует для рейса " + flightNumber);
        }

        if (seatMap.get(seatNumber) == null) {
            logger.log(Level.WARNING, "Место " + seatNumber + " уже свободно");
            throw new SeatUnavailableException("Место " + seatNumber + " уже свободно");
        }

        seatMap.put(seatNumber, null);
        logger.log(Level.INFO, "Резервирование для места " + seatNumber + " на рейсе " + flightNumber + " отменено");
    }

    public Map<Integer, String> getFlightSeats(String flightNumber) {
        return flights.get(flightNumber);
    }

} // klass ended
