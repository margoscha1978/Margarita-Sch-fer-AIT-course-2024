package businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        // Create an Employee object
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // Check that the employee object is created correctly
        assertNotNull(emp);
        assertEquals("1", emp.getId());
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testGetters() {
        // Create an Employee object
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // Check that getters return correct values
        assertEquals("1", emp.getId());
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testSetters() {
        // Create an Employee object
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // Change employee attributes using setters
        emp.setName("Тим Рикки");
        emp.setPosition("Tester");
        emp.setSalary(50000);

        // Check that setters updated the values correctly
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Tester", emp.getPosition());
        assertEquals(50000, emp.getSalary());
    }

    @Test
    public void testGetInfo() {
        // Create an Employee object
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // Check that getInfo() returns the correct formatted string
        String expectedInfo = "ID: 1, Name: Тим Рикки, Position: Developer, Salary: 60000.0";
        assertEquals(expectedInfo, emp.getInfo());
    }
} // test ended
/*
 Описание тестов

1. testEmployeeCreation():
   - Тестирует создание объекта Employee и проверяет, что все поля инициализируются правильно.
   - Использует assertNotNull для проверки, что объект создан, и assertEquals для проверки значений полей.

2. testGetters():
   - Проверяет, что геттеры возвращают правильные значения для полей объекта Employee.

3. testSetters():
   - Проверяет, что сеттеры корректно обновляют значения полей. Здесь мы изменяем имя,
    должность и зарплату, а затем проверяем, что они изменились.

4. testGetInfo():
   - Проверяет, что метод getInfo() возвращает ожидаемую строку с информацией о сотруднике в заданном формате.
 */