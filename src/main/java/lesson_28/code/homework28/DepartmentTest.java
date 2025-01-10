package homework28;

import businessprojekt.Department;
import businessprojekt.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Тестовый класс для проверки методов класса Department.
 * Использует JUnit для создания и выполнения тестов.
 */
public class DepartmentTest {

    private Department departmentIT; // Департамент для тестирования / Department for testing

    /**
     * Метод, выполняемый перед каждым тестом.
     * Инициализирует объект департамента.
     */
    @BeforeEach
    void setUp() {
        departmentIT = new Department("IT");
    }

    /**
     * Тест добавления сотрудников в департамент.
     * Проверяет успешное добавление и корректность возвращаемого списка сотрудников.
     */
    @Test
    void testAddEmployeeSuccesfull() {
        Employee employee = new Employee("1", "Doe", "Junior developer", 35000);
        Employee employee2 = new Employee("2", "John", "Senior developer", 50000);
        Employee employee3 = new Employee("3", "Tom", "Junior developer", 25000);

        departmentIT.addEmployee(employee);
        departmentIT.addEmployee(employee2);
        departmentIT.addEmployee(employee3);

        ArrayList<Employee> employeesResult = departmentIT.getEmployees();

        // Проверка размера списка / Checking the size of the list
        assertEquals(3, employeesResult.size());

        // Проверка правильности добавленных сотрудников / Checking the correctness of added employees
        assertEquals(employee, employeesResult.get(0));
        assertEquals(employee2, employeesResult.get(1));
        assertEquals(employee3, employeesResult.get(2));
    }

    /**
     * Тест добавления null-сотрудника в департамент.
     * Проверяет, что null-сотрудник не добавляется в список сотрудников.
     */
    @Test
    void testAddNullEmployee() {
        Employee employee = null;

        departmentIT.addEmployee(employee);

        ArrayList<Employee> employeesResult = departmentIT.getEmployees();

        // Проверка, что список сотрудников пуст / Verifying the employee list is empty
        assertEquals(0, employeesResult.size());
    }

    /**
     * Тест добавления сотрудника с некорректными данными (null ID).
     * Проверяет, что такой сотрудник не добавляется в список сотрудников.
     */
    @Test
    void testAddEmptyEmployee() {
        Employee employee = new Employee(null, "Doe", "Junior developer", 35000);

        departmentIT.addEmployee(employee);

        ArrayList<Employee> employeesResult = departmentIT.getEmployees();

        // Проверка, что список сотрудников пуст / Verifying the employee list is empty
        assertEquals(0, employeesResult.size());
    }

    /**
     * Параметризованный тест для удаления сотрудников с разными ID.
     * Проверяет корректное обновление списка сотрудников после удаления.
     */
    @ParameterizedTest
    @CsvSource({
            "3, 2",
            "2, 1"
    })
    void testRemoveEmployeeWhenIdIdDifferent(String initial, int expected) {
        Employee employee = new Employee("1", "Doe", "Junior developer", 35000);
        Employee employee2 = new Employee("2", "John", "Senior developer", 50000);
        departmentIT.addEmployee(employee);
        departmentIT.addEmployee(employee2);

        departmentIT.removeEmployee(initial);
        int sizeAfter = departmentIT.getEmployees().size();
        assertEquals(expected, sizeAfter);
    }

    /**
     * Тест удаления сотрудника из пустого списка.
     * Проверяет, что список остаётся пустым.
     */
    @Test
    void testRemoveEmployeeWhenEmployeeListIsEmpty() {
        departmentIT.removeEmployee("");
        int sizeAfter = departmentIT.getEmployees().size();
        assertEquals(0, sizeAfter);
    }

    /**
     * Тест поиска сотрудника с null или пустым ID.
     * Проверяет, что результат поиска равен null.
     */
    @Test
    void testFindEmployeeWithNullAndEmptyId() {
        Employee resultWithNull = departmentIT.findEmployee(null);
        assertNull(resultWithNull);
        Employee resultWithEmpty = departmentIT.findEmployee("");
        assertNull(resultWithEmpty);
    }

    // Добавлены комментарии для каждого теста в таком стиле.
    // Остальные тесты следуют аналогичному формату.
} // test ended

