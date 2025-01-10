package homework29;
/*
2. Класс PremiumUser:
   - Наследуется от User.
   - Включает атрибут subscriptionEndDate, который хранит дату окончания подписки.
   - Метод isSubscriptionActive() проверяет, активна ли подписка, сравнивая текущую дату с датой окончания.
   - Переопределение метода displayInfo() для отображения статуса подписки вместе с информацией о пользователе.
 */
import java.time.LocalDate;

class PremiumUser extends User {
    private LocalDate subscriptionEndDate;

    public PremiumUser(int id, String name, String email, LocalDate subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public boolean isSubscriptionActive() {
        return LocalDate.now().isBefore(subscriptionEndDate);
    }

    @Override
    public String displayInfo() {
        String activeStatus = isSubscriptionActive() ? "Active" : "Inactive";
        return super.displayInfo() + ", Subscription End Date: " + subscriptionEndDate + ", Status: " + activeStatus;
    }
} // klass ended
