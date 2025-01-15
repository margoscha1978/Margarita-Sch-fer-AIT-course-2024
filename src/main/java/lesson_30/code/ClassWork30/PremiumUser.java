package ClassWork30;

/**
 * Этот класс представляет премиум-пользователя, который имеет подписку.
 * Премиум-пользователи обладают дополнительными атрибутами, такими как дата окончания подписки.
 */
public class PremiumUser extends User {

    // Год, в котором истекает подписка пользователя
    private int subscriptionEndDate;

    /**
     * Конструктор для инициализации премиум-пользователя с ID, именем, адресом электронной почты и датой окончания подписки.
     */
    public PremiumUser(String id, String name, String email, int subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    /**
     * Проверяет, истекла ли подписка пользователя, исходя из текущего года.
     */
    public boolean isSubscriptionExpired() {
        return subscriptionEndDate < 2026;
    }

    /**
     * Переопределяет метод для вывода дополнительной информации о премиум-пользователях,
     * включая дату окончания подписки.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Subscription End Date: " + subscriptionEndDate);
    }
} // klass ended
