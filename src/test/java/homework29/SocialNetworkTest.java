package homework29;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SocialNetworkTest {

    @Test
    public void testUserCreation() {
        User user = new User(1, "John Klansert", "john@example.com");
        assertNotNull(user);
        assertEquals("User ID: 1, Name: John Klansert, Email: john@example.com", user.displayInfo());
    }

    @Test
    public void testPremiumUserSubscriptionActive() {
        // Тестируем активную подписку
        PremiumUser premiumUserActive = new PremiumUser(2, "Jane Smith", "jane@example.com",
                LocalDate.now().plusDays(5));
        assertTrue(premiumUserActive.isSubscriptionActive(), "Subscription should be active.");

        // Тестируем неактивную подписку
        PremiumUser premiumUserExpired = new PremiumUser(3, "Old User", "old@example.com",
                LocalDate.now().minusDays(1));
        assertFalse(premiumUserExpired.isSubscriptionActive(), "Subscription should be inactive.");
    }

    @Test
    public void testAdminUserBan() {
        User user = new User(1, "John Doe", "john@example.com");
        AdminUser adminUser = new AdminUser(3, "Admin User", "admin@example.com");

        // Блокировка пользователя
        String banMessage = adminUser.banUser(user);
        assertEquals("User John Doe has been banned.", banMessage);

        // Проверка статуса заблокированного пользователя
        assertEquals(1, adminUser.displayBannedUsers().size());
        assertTrue(adminUser.displayBannedUsers().contains("John Doe"));
    }

    @Test
    public void testDisplayInfoForUsers() {
        User user = new User(1, "John Doe", "john@example.com");

        // Проверяем информацию об обычном пользователе
        assertEquals("User ID: 1, Name: John Doe, Email: john@example.com", user.displayInfo());

        // Создаем активного премиум-пользователя
        PremiumUser premiumUserActive = new PremiumUser(2, "Jane Smith", "jane@example.com",
                LocalDate.now().plusDays(5));
        String expectedActive = "User ID: 2, Name: Jane Smith, Email: jane@example.com, Subscription End Date: "
                + LocalDate.now().plusDays(5) + ", Status: Active";
        assertEquals(expectedActive, premiumUserActive.displayInfo());

        // Создаем неактивного премиум-пользователя
        PremiumUser premiumUserExpired = new PremiumUser(3, "Old User", "old@example.com",
                LocalDate.now().minusDays(1));
        String expectedInactive = "User ID: 3, Name: Old User, Email: old@example.com, Subscription End Date: "
                + LocalDate.now().minusDays(1) + ", Status: Inactive";
        assertEquals(expectedInactive, premiumUserExpired.displayInfo());

        // Проверяем информацию об администраторе
        AdminUser adminUser = new AdminUser(4, "Admin User", "admin@example.com");
        assertEquals("User ID: 4, Name: Admin User, Email: admin@example.com, Role: Admin",
                adminUser.displayInfo());
    }

} // test ended