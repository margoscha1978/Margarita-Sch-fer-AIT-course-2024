package businessprojekt;

import java.util.HashMap;
import java.util.HashSet;
/*
 Поля:
- String name — название компании.
- HashMap<String, Department> — карта отделов, где ключ — название отдела, значение — объект Department.

 Методы:
- Конструктор для инициализации названия компании.
- void addDepartment(Department department) — добавляет новый отдел.
- void removeDepartment(String departmentName) — удаляет отдел по его названию.
- Department getDepartment(String departmentName) — возвращает отдел по названию.
- HashSet<String> getAllPositions() — возвращает уникальные должности всех сотрудников компании.
- double getTotalCompanySalary() — возвращает общую зарплату всех сотрудников компании.
 */

public class Business {
    private String name;
    private HashMap<String, Department> departments;

    public Business(String name) {
        this.name = name;
        this.departments = new HashMap<>();
    }

    public void addDepartment(Department department) {
        departments.put(department.getName(), department);
    }

    public void removeDepartment(String departmentName) {
        departments.remove(departmentName);
    }

    public Department getDepartment(String departmentName) {
        return departments.get(departmentName);
    }

    public HashSet<String> getAllPositions() {
        HashSet<String> positions = new HashSet<>();
        for (Department department : departments.values()) {
            for (Employee employee : department.getEmployees()) {
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    public double getTotalCompanySalary() {
        double total = 0;
        for (Department department : departments.values()) {
            total += department.getTotalSalary();
        }
        return total;
    }
} // Klass ended

