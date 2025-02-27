package businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDepartmentManager {

    public static class BusinessAppTest {

        @Test
        public void testEmployeeCreation() {
            Employee emp = new Employee("1", "Тим Рик", "Developer", 60000);
            assertEquals("Тим Рик", emp.getName());
            assertEquals("Developer", emp.getPosition());
            assertEquals(60000, emp.getSalary());
        }

        @Test
        public void testDepartmentEmployeeManagement() {
            Department dept = new Department("IT");
            Employee emp1 = new Employee("1", "Тим Рик", "Developer", 60000);
            Employee emp2 = new Employee("2", "Ян Ковальский", "Manager", 75000);

            dept.addEmployee(emp1);
            dept.addEmployee(emp2);

            assertEquals(2, dept.getEmployees().size());
            assertNotNull(dept.findEmployee("1"));
            assertEquals(135000, dept.getTotalSalary());

            dept.removeEmployee("1");
            assertEquals(1, dept.getEmployees().size());
            assertNull(dept.findEmployee("1"));
        }

        @Test
        public void testBusinessDepartmentManagement() {
            Business business = new Business("Tech Corp");
            Department dept = new Department("IT");

            business.addDepartment(dept);
            assertNotNull(business.getDepartment("IT"));

            business.removeDepartment("IT");
            assertNull(business.getDepartment("IT"));
        }

        @Test
        public void testUniquePositionsInBusiness() {
            Business business = new Business("Tech Corp");
            Department itDept = new Department("IT");
            Department hrDept = new Department("HR");

            itDept.addEmployee(new Employee("1", "Тим Рик", "Developer", 60000));
            itDept.addEmployee(new Employee("2", "Ян Ковальский", "Tester", 50000));
            hrDept.addEmployee(new Employee("3", "Алекса Тен", "Manager", 70000));

            business.addDepartment(itDept);
            business.addDepartment(hrDept);

            HashSet<String> positions = business.getAllPositions();
            assertTrue(positions.contains("Developer"));
            assertTrue(positions.contains("Tester"));
            assertTrue(positions.contains("Manager"));
            assertEquals(3, positions.size());
        }

        @Test
        public void testTotalCompanySalary() {
            Business business = new Business("Tech Corp");
            Department itDept = new Department("IT");
            Department hrDept = new Department("HR");

            itDept.addEmployee(new Employee("1", "Тим Рик", "Developer", 60000));
            hrDept.addEmployee(new Employee("3", "Алекса Тен", "Manager", 70000));

            business.addDepartment(itDept);
            business.addDepartment(hrDept);

            assertEquals(130000, business.getTotalCompanySalary());
        }
    } // test ended

    static class BusinessTest {

        private Business business;

        @BeforeEach
        public void setUp() {
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
            itDept.addEmployee(new Employee("1", "Тим Рик", "Developer", 60000));
            itDept.addEmployee(new Employee("2", "Ян Ковальский", "Tester", 55000));

            Department hrDept = new Department("HR");
            hrDept.addEmployee(new Employee("3", "Алекса Тен", "Manager", 70000));

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
            itDept.addEmployee(new Employee("1", "Тим Рик", "Developer", 60000));

            Department hrDept = new Department("HR");
            hrDept.addEmployee(new Employee("2", "Ян Ковальский", "Manager", 80000));

            // Добавляем отделы в бизнес
            business.addDepartment(itDept);
            business.addDepartment(hrDept);

            // Проверяем общую зарплату компании
            double expectedTotalSalary = 60000 + 80000;
            assertEquals(expectedTotalSalary, business.getTotalCompanySalary());
        }
    } // test ended
}
