package lesson_35.ClassWork35;
/**
 * Исключение RoomUnavailableException
 * Это исключение выбрасывается, когда запрашиваемая комната недоступна для бронирования.
 *
 * RoomUnavailableException Exception
 * This exception is thrown when the requested room is unavailable for booking.
 */
public class RoomUnavailableException extends Exception {
    /**
     * Конструктор с сообщением ошибки.
     * Constructor with an error message.
     * @param message сообщение об ошибке / error message
     */
    public RoomUnavailableException(String message) {
        super(message);
    }
} // klass ended