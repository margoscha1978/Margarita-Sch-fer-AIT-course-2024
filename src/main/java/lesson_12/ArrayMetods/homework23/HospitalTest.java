package lesson_12.ArrayMetods.homework23;

import homework23.Checker.Hospital;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    Hospital hospital = new Hospital();

    @ParameterizedTest
    @CsvSource({
            "1, 100",
            "2, 180",
            "5, 420",
            "0, -1",
            "-1, -1"
    })
    void testCalculateHospitalStayCost(int days, int expectedCost) {
        assertEquals(expectedCost, hospital.calculateHospitalStayCost(days));
    }

} // test ended