package Lesson27.businessprojekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

     class DepartmentTest {
        private Department department;

        @BeforeEach
        public void setUp() {
            // Инициализируем отдел перед каждым тестом
            department = new Department("IT");
        }

        @Test
        public void testAddEmployee() {
            // Создаем сотрудника
            Employee emp = new Employee("1", "Тим Ран", "Developer", 60000);

            // Добавляем сотрудника в отдел
            department.addEmployee(emp);

            // Проверяем, что сотрудник добавлен
            assertEquals(1, department.getEmployees().size());
            assertEquals(emp, department.findEmployee("1"));
        }

        @Test
        public void testRemoveEmployee() {
            // Добавляем сотрудника
            Employee emp = new Employee("1", "Тим Ран", "Developer", 60000);
            department.addEmployee(emp);

            // Удаляем сотрудника
            department.removeEmployee("1");

            // Проверяем, что сотрудник был удален
            assertNull(department.findEmployee("1"));
            assertEquals(0, department.getEmployees().size());
        }

        @Test
        public void testFindEmployee() {
            // Создаем и добавляем сотрудников
            Employee emp1 = new Employee("1", "Тим Ран", "Developer", 60000);
            Employee emp2 = new Employee("2", "Ян Талсон", "Manager", 75000);
            department.addEmployee(emp1);
            department.addEmployee(emp2);

            // Проверяем, что можно найти сотрудника по ID
            assertEquals(emp1, department.findEmployee("1"));
            assertEquals(emp2, department.findEmployee("2"));
            assertNull(department.findEmployee("3")); // Не существующий ID
        }

        @Test
        public void testGetTotalSalary() {
            // Добавляем сотрудников с разными зарплатами
            department.addEmployee(new Employee("1", "Тим", "Developer", 60000));
            department.addEmployee(new Employee("2", "Ян", "Manager", 80000));

            // Проверяем, что расчёт общей зарплаты корректен
            double expectedTotal = 60000 + 80000;
            assertEquals(expectedTotal, department.getTotalSalary());
        }

        @Test
        public void testGetEmployees() {
            // Добавляем сотрудников
            Employee emp1 = new Employee("1", "Тим Ран", "Developer", 60000);
            Employee emp2 = new Employee("2", "Ян Талсон", "Manager", 75000);
            department.addEmployee(emp1);
            department.addEmployee(emp2);

            // Проверяем, что метод возвращает правильный список сотрудников
            ArrayList<Employee> employees = department.getEmployees();
            assertEquals(2, employees.size());
            assertTrue(employees.contains(emp1));
            assertTrue(employees.contains(emp2));
        }
    } // test ended

/*
 Объяснение тестов

1. setUp():
   - Этот метод помечен аннотацией @BeforeEach, что означает, что он будет запускаться перед каждым тестом.
    Он инициализирует новый объект Department с названием "IT", чтобы тесты были независимы друг от друга.

2. testAddEmployee():
   - Создаем объект businessprojekt.Business.Employee и добавляем его в отдел.
   - Проверяем, что сотрудник был добавлен, с помощью assertEquals для проверки размера списка сотрудников
    и assertEquals для проверки, что найденный сотрудник соответствует добавленному.

3. testRemoveEmployee():
   - Сначала добавляем сотрудника, затем удаляем его.
   - Проверяем, что после удаления сотрудник больше не найден и размер списка сотрудников равен 0.

4. testFindEmployee():
   - Создаем и добавляем нескольких сотрудников.
   - Проверяем, что метод findEmployee() корректно находит существующих сотрудников
    и возвращает null для несуществующего ID.

5. testGetTotalSalary():
   - Добавляем сотрудников с известными зарплатами и проверяем,
    что метод getTotalSalary() правильно вычисляет общую зарплату.

6. testGetEmployees():
   - После добавления сотрудников проверяем,
    что метод getEmployees() возвращает корректный список и его размер соответствует ожидаемому.
 */