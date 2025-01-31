package lesson_35.homework35;
/*
 Простая проверка данных о бронировании рейса
   Задача
	1.	Создайте класс FlightBooking с методом bookFlight(String flightNumber, String passengerName, int seatNumber).
	2.	Требования к параметрам:
	•	flightNumber не должен быть null или пустым;
	•	passengerName не должен быть null или пустым;
	•	seatNumber должен быть > 0.
	3.	При несоблюдении условий выбрасывайте IllegalArgumentException с понятным сообщением.
	4.	В методе main протестируйте работу bookFlight для нескольких сценариев
	   (корректные данные, некорректный номер рейса, пустое имя пассажира, неправильный номер места).
	5.	Оберните вызовы в try-catch, выводя сообщения об ошибках на экран.
   Подсказки
	• следуем аналогичной структуре, что и в пример с SimpleBooking.
	• проверяем входные данные и выбрасывайте IllegalArgumentException с разными сообщениями
	  (например, «Некорректный номер рейса», «Некорректное имя пассажира», «Некорректный номер места»).
 */
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class FlightBooking {

        // Метод для бронирования рейса
        public void bookFlight(String flightNumber, String passengerName, int seatNumber) {
            // Проверка номера рейса
            if (flightNumber == null || flightNumber.isEmpty()) {
                log.error("Некорректный номер рейса: Номер рейса не может быть пустым или равным нулю");
                throw new IllegalArgumentException("Некорректный номер рейса");
            }

            // Проверка имени пассажира
            if (passengerName == null || passengerName.isEmpty()) {
                log.error("Некорректное имя пассажира: Имя пассажира не может быть пустым или равным нулю");
                throw new IllegalArgumentException("Некорректное имя пассажира");
            }

            // Проверка номера места
            if (seatNumber <= 0) {
                log.error("Некорректный номер места: Номер места не может быть отрицательным или равным нулю");
                throw new IllegalArgumentException("Некорректный номер места");
            }

            log.info("Забронирован рейс: {} для пассажира: {} с местом: {}", flightNumber, passengerName, seatNumber);
            System.out.println("Бронирование успешно: Рейс " + flightNumber + ", Пассажир " + passengerName +
                    ", Место " + seatNumber);
        }

        public static void main(String[] args) {
            FlightBooking booking = new FlightBooking();

            // Тестирование с правильными данными
            try {
                booking.bookFlight("ABC123", "Елена Петрова", 10);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Тестирование с некорректным номером рейса
            try {
                booking.bookFlight("", "Елена Петрова", 10);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Тестирование с пустым именем пассажира
            try {
                booking.bookFlight("ABC123", "", 10);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Тестирование с неправильным номером места
            try {
                booking.bookFlight("ABC123", "Иван Иванов", 0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

} // klass ended
