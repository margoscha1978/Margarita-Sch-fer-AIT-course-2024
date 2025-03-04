package businessprojekt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        Employee emp = new Employee("1", "Тим Рик", "Developer", 60000);
        assertEquals("Тим Рик", emp.getName());
        assertEquals("Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testSettersAndGetters() {
        Employee emp = new Employee("1", "Тим Рик", "Developer", 60000);

        emp.setName("Ян Ковальский");
        assertEquals("Ян Ковальский", emp.getName());

        emp.setPosition("Tester");
        assertEquals("Tester", emp.getPosition());

        emp.setSalary(65000);
        assertEquals(65000, emp.getSalary());
    }

    @Test
    public void testInvalidEmployeeCreation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(null, null, null, -100); // Неверные данные
        });
        assertEquals("Employee is invalid", exception.getMessage());
    }

    // можно добавить дополнительные тесты для проверки уникальности идентификаторов, равенства и других методов

} // test ended
