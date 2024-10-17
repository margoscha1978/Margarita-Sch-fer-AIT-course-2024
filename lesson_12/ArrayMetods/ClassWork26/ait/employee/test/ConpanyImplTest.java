package ClassWork26.ait.employee.test;

import ClassWork26.ait.employee.dao.Company;
import ClassWork26.ait.employee.dao.ConpanyImpl;
import ClassWork26.ait.employee.model.Employee;
import ClassWork26.ait.employee.model.Manager;
import ClassWork26.ait.employee.model.SalesManager;
import ClassWork26.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConpanyImplTest {

    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
     company = new ConpanyImpl(5);// testiruem kapazitet companii
     //sozdaem rabotnikov
        employees = new Employee[4];
        employees [0] = new Manager(1,"n1","l1",160,5000,25);
        employees [1] = new SalesManager(2,"n2","l2",160,5000,0.1);
        employees [2] = new Worker(3,"n3","l3",160,3000);
        employees [3] = new SalesManager(4,"n4","l4",160,6000,0.15);

    }

    @Test
    void addEmployee() {




    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quatity() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void findEmployeeHoursGreateThan() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}