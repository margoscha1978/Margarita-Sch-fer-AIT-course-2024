package lesson_34.homework34;
/*
 Класс NoGuestException:
   - это специально созданное исключение, которое необходимо для обработки случаев,
     когда в заданной комнате нет гостя.
 */
class NoGuestException extends Exception {
    public NoGuestException(String message) {
        super(message);
    }

} // klass ended
