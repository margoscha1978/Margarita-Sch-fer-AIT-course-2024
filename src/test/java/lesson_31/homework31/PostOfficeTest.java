package lesson_31.homework31;
/*
   - Используем для проверки правильности работы методов классов.
   - Проверяем различные сценарии, включая некоторые граничные значения.
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostOfficeTest {
    private PostOffice postOffice;

    @BeforeEach
    void setUp() {
        postOffice = new PostOffice();
    }

    @Test
    void testAddMailItem() {
        MailItem letter = new Letter("Alice", "Bob", 0.1, false);
        postOffice.addMailItem(letter);
        assertEquals(1, postOffice.mailItems.size());
    }

    @Test
    void testCalculateShippingCostForLetter() {
        Letter letter = new Letter("Alice", "Bob", 0.1, true);
        assertEquals(10, letter.calculateShippingCost());

        Letter regularLetter = new Letter("Alice", "Bob", 0.1, false);
        assertEquals(5, regularLetter.calculateShippingCost());
    }

    @Test
    void testCalculateShippingCostForPackage() {
        Package pkg = new Package("Alice", "Bob", 5, 10, 20, 30);
        assertEquals(10, pkg.calculateShippingCost()); // 5 kg * 2 euros
    }

    @Test
    void testCalculateShippingCostForAdvertisement() {
        Advertisement ad = new Advertisement("Alice", "Bob", 0.2, 101);
        assertEquals(3, ad.calculateShippingCost()); // 1 euro for 100, 1 euro for 1 more leaflet
    }

    @Test
    void testCalculateTotalShippingCost() {
        postOffice.addMailItem(new Letter("Alice", "Bob", 0.1, false));
        postOffice.addMailItem(new Package("Alice", "Bob", 5, 10, 20, 30));
        postOffice.addMailItem(new Advertisement("Alice", "Bob", 0.2, 101));

        assertEquals(18, postOffice.calculateTotalShippingCost());
    }

    @Test
    void testEdgeCaseQuantityForAdvertisement() {
        Advertisement ad = new Advertisement("Alice", "Bob", 0.2, 1);
        assertEquals(1, ad.calculateShippingCost()); // 1 euro for 1 leaflet
    }

    @Test
    void testEdgeCaseWeightForPackage() {
        Package pkg = new Package("Alice", "Bob", 0, 10, 20, 30);
        assertEquals(0, pkg.calculateShippingCost()); // 0 kg = 0 euro
    }
} // test ended
