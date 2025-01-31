package lesson_35.homework35;
//  создадим пользовательское исключение.
public class SeatUnavailableException extends RuntimeException {
    public SeatUnavailableException(String message) {
        super(message);
    }
} // klass ended
