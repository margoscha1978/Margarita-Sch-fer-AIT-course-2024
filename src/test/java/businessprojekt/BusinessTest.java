package businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class BusinessTest {

    @BeforeEach
    void setUp() {
        // Инициализируем бизнес перед каждым тестом
        business = new Business("Tech Corp");
    }

    @Test
    public void testAddDepartment() {
        // Создаем новый отдел
        Department dept = new Department("IT");

        // Добавляем отдел в бизнес
        business.addDepartment(dept);

        // Проверяем, что отдел был добавлен
        assertNotNull(business.getDepartment("IT"));
    }

    @Test
    public void testRemoveDepartment() {
        // Создаем и добавляем отдел
        Department dept = new Department("IT");
        business.addDepartment(dept);

        // Удаляем отдел
        business.removeDepartment("IT");

        // Проверяем, что отдел был удалён
        assertNull(business.getDepartment("IT"));
    }

    @Test
    public void testGetDepartment() {
        // Создаем и добавляем отдел
        Department dept = new Department("IT");
        business.addDepartment(dept);

        // Проверяем, что можно получить отдел по названию
        assertEquals(dept, business.getDepartment("IT"));
        assertNull(business.getDepartment("HR")); // Не существующий отдел
    }

    @Test
    public void testGetUniquePositions() {
        // Создаем отдел и добавляем сотрудников
        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("1", "John Doe", "Developer", 60000));
        itDept.addEmployee(new Employee("2", "Jane Smith", "Tester", 55000));

        Department hrDept = new Department("HR");
        hrDept.addEmployee(new Employee("3", "Alice", "Manager", 70000));

        // Добавляем отделы в бизнес
        business.addDepartment(itDept);
        business.addDepartment(hrDept);

        // Получаем уникальные должности компании
        HashSet<String> uniquePositions = business.getAllPositions();

        // Проверяем наличие уникальных должностей
        assertTrue(uniquePositions.contains("Developer"));
        assertTrue(uniquePositions.contains("Tester"));
        assertTrue(uniquePositions.contains("Manager"));
        assertEquals(3, uniquePositions.size()); // Проверяем общее количество уникальных должностей
    }

    @Test
    public void testGetTotalCompanySalary() {
        // Создаем и добавляем отделы с сотрудниками
        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("1", "John Doe", "Developer", 60000));

        Department hrDept = new Department("HR");
        hrDept.addEmployee(new Employee("2", "Jane Smith", "Manager", 80000));

        // Добавляем отделы в бизнес
        business.addDepartment(itDept);
        business.addDepartment(hrDept);

        // Проверяем общую зарплату компании
        double expectedTotalSalary = 60000 + 80000;
        assertEquals(expectedTotalSalary, business.getTotalCompanySalary());
    }
}