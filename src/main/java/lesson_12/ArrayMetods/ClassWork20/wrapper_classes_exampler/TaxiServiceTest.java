package lesson_12.ArrayMetods.ClassWork20.wrapper_classes_exampler;
import ClassWork20.wrapper_classes_exampler.TaxiService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaxiServiceTest {

    @Test
    void testIsTaxiAvailableShouldReturnTrueWhenAddressIsAvailable() {

        //Arrange
        TaxiService service = new TaxiService();
        String address = "Центр";

        //Act
        boolean result = service.isTaxiAvailable(address);

        //Assert
        assertTrue(result, "Такси должно быть доступно в районе Центр");

    }

    @Test
    void testIsTaxiAvailableShouldReturnTrueWhenAddressIsNotAvailable() {

        //Arrange
        TaxiService service = new TaxiService();
        String address = "Запад";

        //Act
        boolean result = service.isTaxiAvailable(address);

        //Assert
        assertFalse(result, "Такси не должно быть доступно в районе Запад");

    }

    @Test
    void testIsTaxiAvailableShouldReturnFalseWhenAddressIsNull() {

        //Arrange
        TaxiService service = new TaxiService();
        String address = null;

        //Act
        boolean result = service.isTaxiAvailable(address);

        //Assert
        assertFalse(result, "Такси не должно быть доступно в районе Запад");

    }

    @Test
    void testIsTaxiAvailableShouldReturnFalseWhenAddressIsEmpty() {

        //Arrange
        TaxiService service = new TaxiService();
        String address = "";

        //Act
        boolean result = service.isTaxiAvailable(address);

        //Assert
        assertFalse(result, "Такси не должно быть доступно в районе Запад");

    }

}