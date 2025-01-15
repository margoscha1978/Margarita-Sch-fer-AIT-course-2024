package ClassWork30;

/**
 * Этот интерфейс определяет контракт для функциональности уведомлений.
 * Он предоставляет методы для отправки уведомлений, проверки их статуса и вывода настроек.
 */
public interface Notifiable {

    /**
     * Отправляет уведомление пользователю с определенным сообщением.
     *
     * @param userId The ID of the user to notify. / Идентификатор пользователя, которому отправляется уведомление.
     * @param message The message to send. / Сообщение для отправки.
     */
    void sendNotification(String userId, String message);

    /**
     * Проверяет статус уведомлений, чтобы определить, были ли они все доставлены.
     */
    default void checkNotificationStatus() {
        System.out.println("Проверяем, были ли все уведомления доставлены...");
    }

    /**
     * Выводит текущие настройки уведомлений.
     */
    static void printNotificationSettings() {
        System.out.println("Показать текущие настройки уведомления");
    }
} // interface ended
