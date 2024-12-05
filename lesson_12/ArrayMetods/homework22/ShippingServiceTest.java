package homework22;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingServiceTest {

    ShippingService shippingService = new ShippingService(); // Создание объекта класса ShippingService

    @ParameterizedTest // внимательно следить за весом, потому, что при повышении веса переходит в другую цену
    @CsvSource({
            "3, 10",   // до 5 кг
            "10, 20",  // от 5 до 20 кг
            "25, 50"   // более 20 кг
    })
    void testCalculateShippingCost(double weight, double expectedCost) { // expectedCost можно заменить price
        assertEquals(expectedCost, shippingService.calculateShippingCost(weight)); // стоимость доставки по весу
    }

    @ParameterizedTest
    @CsvSource({
            "EU, true",
            "USA, true",
            "ASIA, true",
            "AFRICA, false",
            "ANTARCTICA, false"
    })
    void testIsZoneSupported(String zone, boolean expected) { // Добавлен параметр expected, африка и антарктика
        assertEquals(expected, shippingService.isZoneSupported(zone)); // проверка активности зон доставки
    }

    @ParameterizedTest
    @CsvSource({
            "30, 1",  // менее 50 км, от 1 до 50 км, верно 49 км
            "100, 3", // от 50 до 500 км, от 50 до 500 км, верно 499 км
            "600, 7"  // более 500 км, от 500 и выше
    })
    void testCalculateDeliveryTime(double distance, int expectedTime) {
        assertEquals(expectedTime, shippingService.calculateDeliveryTime(distance)); // время доставки
    }

} // klass ended

/*
public class ShippingZoneTest { // версия проверки активных зон доставки
    private ShippingZone shippingZone;

    @BeforeEach
    public void setUp() {
        shippingZone = new ShippingZone();
    }

    @ParameterizedTest
    @ValueSource(strings = {"EU", "ASIA", "USA"})
    void testIsZoneSupportedShouldReturnTrueWhenZoneIsSupported(String zone) {
        boolean result = shippingZone.isZoneSupported(zone);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Africa", "Australia"})
    void testIsZoneSupportedShouldReturnTrueWhenZoneIsNotSupported(String zone) {
        boolean result = shippingZone.isZoneSupported(zone);
        assertFalse(result);
    }
 }

public class DeliveryTimeTest { // время доставки
    private DeliveryTime deliveryTime;

    @BeforeEach
    public void setUp() {
        deliveryTime = new DeliveryTime();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data/DeliveryTime.csv")
    void testShouldReturnTimeForNKm(double initial, int expected) {
        int result = deliveryTime.calculateDeliveryTime(initial);
        assertEquals(expected, result);
    }
}
 */