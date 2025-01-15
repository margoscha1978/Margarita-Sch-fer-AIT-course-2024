package ClassWork30;

/**
 * Этот интерфейс определяет поведение по умолчанию для ведения логов.
 * Он предоставляет метод для записи сообщений с определенным префиксом ("LoggerA").
 */
public interface LoggerA {

    /**
     * Записывает сообщение с префиксом "LoggerA".
     *
     * @param message The message to log. / Сообщение для записи в лог.
     */
    default void log(String message) {
        System.out.println("LoggerA: " + message);
    }
} // interface ended
