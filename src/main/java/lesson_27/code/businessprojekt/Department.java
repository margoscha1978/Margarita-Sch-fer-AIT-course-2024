package businessprojekt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/*
 Поля:
- String name — название отдела.
- ArrayList<businessprojekt.Business.Employee> — список сотрудников отдела.

 Методы:
- Конструктор для инициализации названия отдела.
- void addEmployee(businessprojekt.Business.Employee employee) — добавляет сотрудника в отдел.
- void removeEmployee(String employeeId) — удаляет сотрудника по его ID.
- businessprojekt.Business.Employee findEmployee(String employeeId) — находит сотрудника по ID.
- double getTotalSalary() — возвращает общую зарплату всех сотрудников отдела.
- ArrayList<businessprojekt.Business.Employee> getEmployees() — возвращает список сотрудников отдела.
 */
public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee is null");
        } else if (employee.getId() == null || employee.getName() == null
                || employee.getPosition() == null || employee.getSalary() <= 0) {
            throw new IllegalArgumentException("Employee is invalid");
        } else {
            employees.add(employee);
            System.out.println("Employee ID " + employee.getId() + " added");
        }
    }

    public void removeEmployee(String employeeId) {
        if (employeeId == null || employeeId.isEmpty()) {
            System.out.println("Employee ID is null or empty");
            return;
        }

        Iterator<Employee> iterator = employees.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId().equals(employeeId)) {
                iterator.remove();
                System.out.println("Employee ID " + employeeId + " removed");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee ID " + employeeId + " not found");
        }
    }

    public Employee findEmployee(String employeeId) {
        if (employeeId == null || employeeId.isEmpty()) {
            System.out.println("Employee ID is null or empty");
            return null;
        }

        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                return employee;
            }
        }
        System.out.println("Employee ID " + employeeId + " not found");
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees); // Вернуть копию списка сотрудников
    }

} // klass ended

