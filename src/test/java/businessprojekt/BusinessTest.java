package businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class BusinessTest {

    private Business business;
    private Department salesDepartment;
    private Department hrDepartment;

    @BeforeEach
    void setUp() {
        business = new Business("MyCompany");
        salesDepartment = new Department("Sales");
        hrDepartment = new Department("HR");
    }

    @Test
    void testAddDepartment() {
        business.addDepartment(salesDepartment);
        assertNotNull(business.getDepartment("Sales"));
    }

    @Test
    void testAddNullDepartment() {
        business.addDepartment(null);
        assertNull(business.getDepartment("Sales")); // департамент добавлен
    }

    @Test
    void testRemoveDepartment() {
        business.addDepartment(salesDepartment);
        business.removeDepartment("Sales");
        assertNull(business.getDepartment("Sales")); // департамент удален
    }

    @Test
    void testRemoveNonExistentDepartment() {
        business.removeDepartment("NonExistent"); // ошибка в названии департамента
        assertNull(business.getDepartment("NonExistent")); // нет такого департамента
    }

    @Test
    void testGetDepartment() { // проверяем корректную работу геттеров
        business.addDepartment(salesDepartment);
        Department retrieved = business.getDepartment("Sales");
        assertEquals(salesDepartment, retrieved);
    }

    @Test
    void testGetDepartmentNullOrEmpty() { // проверяем на ноль
        assertNull(business.getDepartment(null));
        assertNull(business.getDepartment("")); // возвращаем ноль
    }

    @Test
    void testGetAllPositions() { // проверяем разные должности в департаменте
        Employee emp1 = new Employee("John", "Sales", "Sales Manager", 50000);
        Employee emp2 = new Employee("Jane", "Sales", "Sales Associate", 40000);
        salesDepartment.addEmployee(emp1);
        salesDepartment.addEmployee(emp2);
        business.addDepartment(salesDepartment);

        assertTrue(business.getAllPositions().contains("Sales Manager"));
        assertTrue(business.getAllPositions().contains("Sales Associate"));
    }

    @Test
    void testGetTotalCompanySalary() { // суммарный доход департамента
        Employee emp1 = new Employee("John", "Sales", "Sales Manager", 50000);
        Employee emp2 = new Employee("Jane", "HR", "HR Manager", 60000);
        salesDepartment.addEmployee(emp1);
        hrDepartment.addEmployee(emp2);
        business.addDepartment(salesDepartment);
        business.addDepartment(hrDepartment);

        double totalSalary = business.getTotalCompanySalary();
        assertEquals(110000, totalSalary);
    }

    @Test
    void testGetTotalCompanySalaryNoEmployees() { // ошибка ноль вызванная отсутствием сотрудников
        double totalSalary = business.getTotalCompanySalary();
        assertEquals(0, totalSalary);
    }
}  // test ended

/*
 Описание тестов

1. testAddDepartment: Проверяет, что добавленный отдел действительно возвращается методом getDepartment.

2. testAddNullDepartment: Проверяет, что попытка добавить null отдел не приводит к его добавлению.

3. testRemoveDepartment: Проверяет, что отдел может быть успешно удален.

4. testRemoveNonExistentDepartment: Проверяет удаление несуществующего отдела — метод не должен выдавать ошибки.

5. testGetDepartment: Проверяет, что метод getDepartment возвращает правильный объект отдела.

6. testGetDepartmentNullOrEmpty: Проверяет, что метод возвращает null, если передан null или пустая строка.

7. testGetAllPositions: Проверяет, что все должности, добавленные к сотрудникам, возвращаются уникальными.

8. testGetTotalCompanySalary: Проверяет, что общая зарплата сотрудников компании вычисляется правильно.

9. testGetTotalCompanySalaryNoEmployees: Проверяет, что общая зарплата бизнесу с нулевым количеством сотрудников равна 0.



 */