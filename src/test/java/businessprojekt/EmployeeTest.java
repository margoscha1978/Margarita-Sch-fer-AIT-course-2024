package businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @Test
    public void testEmployeeCreation() { // проверяет, что все поля инициализируются правильно
        // создали объект
        Employee emp = new Employee("1", "Тим Рикки", "Developer", 60000);

        // значение полей
        // проверка на ноль
        assertNotNull(emp);
        assertEquals("1", emp.getId());
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testGetters() { // геттеры возвращают правильные значения
        // создали объект
        Employee emp = new Employee("1", "Тим Рикки", " Junior Developer", 60000);

        // проверяем правильные ли поля для возвращения
        assertEquals("1", emp.getId());
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Junior Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testSetters() { // сеттеры корректно обновляют значения полей
        // создали объект
        Employee emp = new Employee("1", "Тим Рикки", "Junior Developer", 60000);

        // меняем значения для объекта
        emp.setName("Тим Рикки");
        emp.setPosition("Tester");
        emp.setSalary(50000);

        // правильные значения полей
        assertEquals("Тим Рикки", emp.getName());
        assertEquals("Tester", emp.getPosition());
        assertEquals(50000, emp.getSalary());
    }

    @Test
    public void testGetInfo() { //  возвращает ожидаемую строку
        // создали объект
        Employee emp = new Employee("1", "Тим Рикки", "Junior Developer", 60000);

        // проверка заданного формата
        String expectedInfo = "ID: 1, Name: Тим Рикки, Position: Junior Developer, Salary: 60000.0";
        assertEquals(expectedInfo, emp.getInfo());
    }
    @Test
    void testEmployeeCreateAndGetterSettersWereSuccesfull() { // проверяет работу сеттеров и геттеров
        Employee employee = new Employee("1","Doe","Junior developer", 35000);
        assertNotNull(employee);
        String resultId = employee.getId();
        assertEquals("1", resultId);
        String resultName = employee.getName();
        assertEquals("Doe", resultName);
        String resultPosition = employee.getPosition();
        assertEquals("Junior developer", resultPosition);
        double resultSalary = employee.getSalary();
        assertEquals(35000, resultSalary);
        employee.setSalary(45000);
        double newSalary = employee.getSalary();
        assertEquals(45000, newSalary);
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

5. testEmployeeCreateAndGetterSettersWereSuccesfull():
   - проверяет работу геттеров и сеттеров.
 */