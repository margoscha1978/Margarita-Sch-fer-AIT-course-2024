package personal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlightCrewTest {

    @Test
        public void testFlightCrewSalaryWithCertifications () {
            FlightCrew crew = new FlightCrew(2, "Сергей", "Литоренко", 28, "Пилот",
                    30, 35, 3); // 3 сертификации

            double expectedSalary = (30 * 35) + (0.05 * 3 * (30 * 35)); // базовая зарплата + бонус
            assertEquals(expectedSalary, crew.calculateSalary(), 0.01);
        }

    } // klass ended

