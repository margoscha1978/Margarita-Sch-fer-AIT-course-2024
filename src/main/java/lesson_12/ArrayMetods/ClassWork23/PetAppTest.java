package lesson_12.ArrayMetods.ClassWork23;

import ClassWork23.PetApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PetAppTest {
    PetApp petApp;

    @BeforeEach
    public void setup() {
        petApp = new PetApp();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 7, 19})
    void testisPetAgeValidShouldReturnTrue(int age) {
        boolean result = petApp.isPetAgeValid(age);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = { -2, -3, -4, -5, -7, -19})
    void testisPetAgeValidShouldReturnFalse(int age) {
        boolean result = petApp.isPetAgeValid(age);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"Mops, true",
            "'', false",
            ", false",
            "Kolly, false",
            "Bulldog, true"})

    void testisSupportedBreedShouldReturnResultForAllValues(String breed, boolean expected) {
        //Act
        boolean result = petApp.isSupportedBreed(breed);
        //Assert
        assertEquals(expected, result);
    }
} // test ended