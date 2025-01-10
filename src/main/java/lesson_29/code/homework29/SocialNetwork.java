package homework29;
/*
4. Класс SocialNetwork:
   - Основной класс с методом main(), в котором создаются экземпляры User, PremiumUser и AdminUser.
   - Демонстрируется отображение информации о пользователях, блокировка пользователя и проверка статуса подписки.
   - Пример использования всех трех классов в одном.
 */
import java.time.LocalDate;

public class SocialNetwork {
    public static void main(String[] args) {
        User user1 = new User(1, "John Klansert", "john@example.com");
        User user2 = new User(2, "Jane Smith", "jane@example.com");
        User user3 = new User(3, "Mike Johnson", "mike@example.com");
        PremiumUser premiumUser = new PremiumUser(2, "Jane Smitherson", "jane@example.com",
                LocalDate.of(2023, 12, 31));
        AdminUser adminUser = new AdminUser(3, "Admin User", "admin@example.com");

        // Устанавливаем дружеские связи
        user1.addFriend(user2);
        user1.addFriend(user3);

        // Создаем посты
        Post post1 = user2.createPost("Ich bin im Urlaub!");
        Post post2 = user3.createPost("Leben ist schon,wenn du glüklich bist!");

        // Увеличиваем лайки
        post1.like();
        post1.like(); // Подписал два лайка
        post2.like();

        // Отображаем посты друзей
        user1.viewFriendsPosts();

        // Отображение информации о пользователях
        System.out.println(user1.displayInfo());
        System.out.println(premiumUser.displayInfo());
        System.out.println(adminUser.displayInfo());

        // Блокировка пользователя
        System.out.println(adminUser.banUser(user1));
        System.out.println("Banned users: " + adminUser.displayBannedUsers());

        // Проверка статуса подписки
        System.out.println("Is premium user subscription active? " + premiumUser.isSubscriptionActive());
    }
} // klass ended
