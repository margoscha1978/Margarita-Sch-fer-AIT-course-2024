package ClassWork23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HotelRoomTest {

    HotelRoom room;

    @BeforeEach
    public void setUp() {
        room = new HotelRoom();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    void testCalculatePriceShouldReturnPricesForAllNights(int nights) {

        //Act
        int priceResult = room.calculatePrice(nights);
        int expectedPrice = nights * 50;

        //Assert
        assertEquals(expectedPrice, priceResult);

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -5, 0})
    void testCalculatePriceShouldReturnErrorCodeForAllNights(int nights) {

        //Act
        int priceResult = room.calculatePrice(nights);


        //Assert
        assertEquals(-1, priceResult);

    }

    @ParameterizedTest
    @CsvSource({
            "Olga, 48, true",
            "Anna, 17, false",
            "Martin, 130, false",
            "'null', 18, false",
            "null, 23, false",
            "'', 20,false"
    })
    void testIsValidGuestsData(String name, int age, boolean expected){

        //Act
        boolean result = room.isValidGuestData(name,age);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testIsValidGuestsDataShouldReturnFalseWhennNameIsNull() {
        boolean result = room.isValidGuestData(null,0);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"dusty.barrows@hotmail.com, true",
            "dustin.reilly@gmail.com, true",
            "delmar.koelpin@yahoo.com, true",
            "della.jacobi@hotmail.com, true",
            "hassan.medhurst@gmail.com, true",
            "cameron.schmidt@@hotmail.com, false",
            "ernesto.bruen@gmail.com, true",
            "kent.runolfsson@hotmail.com, true",
            "hobert.schoen@, false",
            "@gmail.com, false",
            ", false"})
    void testisEmailValidShouldReturnAllResults(String email, boolean expected){

        //Act
        boolean result = room.isEmailValid(email);

        //Assert
        assertEquals(expected, result);
    }

} // klass ended




