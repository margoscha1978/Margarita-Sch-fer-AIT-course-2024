package ClassWork27.ait.employee.test;

import ClassWork27.ait.employee.dao.Company;
import ClassWork27.ait.employee.dao.CompanyImpl;
import ClassWork27.ait.employee.model.Employee;
import ClassWork27.ait.employee.model.Manager;
import ClassWork27.ait.employee.model.SalesManager;
import ClassWork27.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] emp;

    @BeforeEach
    void setUp() {
        // create object
        company = new CompanyImpl(5);
        // fill array to fill object company
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 160, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 160, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 160, 20);

        // TODO поместить объекты emp[] в объект company с помощью метода addEmployee
        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }
        // Добавляем сотрудников в компанию
        for (Employee employee : emp) {
            company.addEmployee(employee);
        }
    }

    @Test
    void addEmployee() {
        // check size
        assertEquals( 4, company.quantity());
        // can't add null
        assertFalse(company.addEmployee(null));
        // can't add duplicate
        assertFalse(company.addEmployee(emp[1]));
        // can add new one employee
        Employee newEmp = new Worker(5, "N5", "L5", 160, 20);
        assertTrue(company.addEmployee(newEmp));
        // check size
        assertEquals(5, company.quantity());
        // can't add one more employee
        Employee oneMoreEmp = new Worker(6, "N6", "L6", 160, 20);
        assertFalse(company.addEmployee(oneMoreEmp));

    }

    @Test
    void removeEmployee() {
        // can remove existed
        assertEquals( emp[1], company.removeEmployee(2));
        // check size
        assertEquals( 3, company.quantity() );
        // can't remove absent
        assertNull(company.removeEmployee(7));

    }

    @Test
    void findEmployee() {
        // find existed
        assertEquals( emp[2], company.findEmployee(3));
        // find absent
        assertNull(company.findEmployee(7));

    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printEmployee() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalary() {
        double totalSalary = 29200;
        assertEquals(totalSalary, company.totalSalary());

    }

    @Test
    void totalSales() {
        assertEquals(130000, company.totalSales());
    }

    @Test
    void findEmployeeHoursGreaterThan() {
    }

    @Test
    void findEmployeeSalaryRange() {
        Employee[] result = company.findEmployeeSalaryRange(5000,80000);
        assertEquals(4,result.length);// пробегаем список сотрудников
        assertEquals("N1",result[0].getName()); // от первого
        assertEquals("N4",result[3].getName()); // до последнего

    }

}// klass ende