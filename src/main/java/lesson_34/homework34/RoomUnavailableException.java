package lesson_34.homework34;
/*
Создание класса RoomUnavailableException:
- это пользовательское исключение, которое наследует класс Exception и используется для обработки случаев,
  когда комната недоступна для бронирования.
 */
public class RoomUnavailableException extends Exception {
    public RoomUnavailableException(String message) {
        super(message);
    }
} // klass ended
