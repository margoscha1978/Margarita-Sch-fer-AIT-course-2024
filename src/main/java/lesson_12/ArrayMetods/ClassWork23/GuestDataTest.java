package lesson_12.ArrayMetods.ClassWork23;

import ClassWork23.GuestData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GuestDataTest {

    @ParameterizedTest
    @CsvSource({
        "Karl,104,false",
        "Alex,30,true",
        "Tim,17,false",
        "Anna,23,true",
        "'',47,false",
        "Iren,0,false"
    })
    void testIsValidGuestData(String name,int age,boolean expected) { // дополняем expected
        GuestData guestData = new GuestData();
        assertEquals(expected, guestData.isValidGuestData(name, age));
    }

} // klass ended