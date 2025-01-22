package lesson_32.homeworrk32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {

    @Test
    public void testApartmentPrice() {
        Apartment apartment = new Apartment("Test Address", 1, 50, true);
        assertEquals(52500, apartment.calculatePrice());
    }

    @Test
    public void testHousePrice() {
        House house = new House("Test Address", 100, 300, true);
        assertEquals(145000, house.calculatePrice());
    }

    @Test
    public void testCommercialPropertyPrice() {
        CommercialProperty commercial = new CommercialProperty("Test Address", 150, "склад");
        assertEquals(120000, commercial.calculatePrice());
    }
} // test ended