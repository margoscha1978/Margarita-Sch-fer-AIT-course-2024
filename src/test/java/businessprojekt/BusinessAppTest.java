package businessprojekt;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessAppTest {

    @Test
    public void testEmployeeCreation() {
        Employee emp = new Employee("1", "Том Дик", "Developer", 60000);
        assertEquals("Том Дик", emp.getName());
        assertEquals("Developer", emp.getPosition());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testDepartmentEmployeeManagement() {
        Department dept = new Department("IT");
        Employee emp1 = new Employee("1", "Том Дик", "Developer", 60000);
        Employee emp2 = new Employee("2", "Ян Кланц", "Manager", 75000);

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

        itDept.addEmployee(new Employee("1", "Том Дик", "Developer", 60000));
        itDept.addEmployee(new Employee("2", "Ян Кланц", "Tester", 50000));
        hrDept.addEmployee(new Employee("3", "Alice", "Manager", 70000));

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

        itDept.addEmployee(new Employee("1", "Том Дик", "Developer", 60000));
        hrDept.addEmployee(new Employee("3", "Alice", "Manager", 70000));

        business.addDepartment(itDept);
        business.addDepartment(hrDept);

        assertEquals(130000, business.getTotalCompanySalary());
    }
} // test ended
