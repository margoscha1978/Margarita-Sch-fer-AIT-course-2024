package ClassWork30;

/**
 * Это основной класс для управления уведомлениями и демонстрации их функциональности.
 * Он использует интерфейс Notifiable и его реализации для отправки уведомлений и проверки их статуса.
 */
public class NotificationManager {
    public static void main(String[] args) {

        // Создание экземпляра EmailNotifier для отправки уведомлений
        Notifiable notifiable = new EmailNotifier();
        notifiable.sendNotification("user_221", "Вам новое сообщение в соцсети");

        // Проверка статуса уведомления
        notifiable.checkNotificationStatus();

        // Вывод текущих настроек уведомлений с использованием статического метода
        Notifiable.printNotificationSettings();
    }
} // klass ended
