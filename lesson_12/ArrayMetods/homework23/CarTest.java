package homework23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    homework23.Car car;

    @BeforeEach
    void setUp() {

        car = new Car("Audi", false, 2, 10, 70);
    }

    // Стоимость топлива: 100 (дистанция) / 100 (км в день) * 10 (расход топлива) * 2 (цена топлива) = 20
    // Стоимость аренды: 70 (недельная аренда) / 7 дней * 1 количество дней поездки = 10
    // Общие затраты: 20 (на топливо) + 10 (на аренду) = 30

    @Test
    public void testCalculateTotalOperatingCost() {
        int distance = 100; // расстояние в км
        int numberOfTravelDays = 1; // количество дней поездки

        double expectedTotalCost = 30.0;

        double actualTotalCost = car.calculateTotalOperatingCost(distance, numberOfTravelDays);

        assertEquals(expectedTotalCost, actualTotalCost);
    }
}