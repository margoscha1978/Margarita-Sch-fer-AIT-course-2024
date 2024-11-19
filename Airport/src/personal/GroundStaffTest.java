package personal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroundStaffTest {

    @Test
    public void testGroundStaffSalaryWithBonus() {
        GroundStaff staff = new GroundStaff(1, "Иван", "Иванов", 30, "Менеджер",
                20, 40, 10); // 10 лет стажа

        double expectedSalary = (20 * 40) + (0.1 * (10 / 5) * (20 * 40)); // базовая зарплата + бонус
        assertEquals(expectedSalary, staff.calculateSalary(), 0.01);
    }

} // klass ended