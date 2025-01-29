package lesson_34.homework34;
/*
 Класс NoGuestException:
   - это специально созданное исключение, которое необходимо для обработки случаев,
     когда в заданной комнате нет гостя.
 */
public class NoGuestException extends Exception {
    public NoGuestException(String message) {
        super(message);
    }

} // klass ended
