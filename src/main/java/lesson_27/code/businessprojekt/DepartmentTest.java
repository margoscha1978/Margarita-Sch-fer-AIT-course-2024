package businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {

    private Department department;

    @BeforeEach
    public void setUp() {
        department = new Department("IT");
    }

    @Test
    public void testAddEmployee() {
        Employee emp = new Employee("1", "Тим Рик", "Developer", 60000);
        department.addEmployee(emp);
        assertEquals(1, department.getEmployees().size());
    }

    @Test
    public void testRemoveEmployee() {
        Employee emp = new Employee("1", "Тим Рик", "Developer", 60000);
        department.addEmployee(emp);
        department.removeEmployee("1");
        assertEquals(0, department.getEmployees().size());
        assertNull(department.findEmployee("1")); // Сотрудник не должен существовать после удаления
    }

    @Test
    public void testGetTotalSalary() {
        Employee emp1 = new Employee("1", "Тим Рик", "Developer", 60000);
        Employee emp2 = new Employee("2", "Ян Ковальский", "Tester", 50000);
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        assertEquals(110000, department.getTotalSalary());
    }

// можно еще добавить и другие тесты, проверяющие поведение отдела

} // test ended