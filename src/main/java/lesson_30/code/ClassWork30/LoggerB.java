package ClassWork30;

/**
 * Этот интерфейс определяет поведение по умолчанию для ведения логов.
 * Он предоставляет метод для записи сообщений с определенным префиксом ("LoggerB").
 */
public interface LoggerB {

    /**
     * Записывает сообщение с префиксом "LoggerB".
     *
     * @param message The message to log. / Сообщение для записи в лог.
     */
    default void log(String message) {
        System.out.println("LoggerB: " + message);
    }
} // interface ended
