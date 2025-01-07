package lesson_12.ArrayMetods.homework23;

import homework23.Checker.PatientValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientValidatorTest {

    PatientValidator validator = new PatientValidator();

    @ParameterizedTest
    @CsvSource({
            "John, 30, Flu, true",
            "'', 30, Flu, false",
            "John, -1, Flu, false",
            "John, 30, '', false",
            "null, 50, Flu, false",
            "Alice, 130, Covid, false"
    })
    void testIsValidPatientData(String name, int age, String diagnosis, boolean expected) {
        assertEquals(expected, validator.isValidPatientData(name, age, diagnosis));
    }

} // test ended