package businessprojekt;


import java.util.ArrayList;
/*
 Поля:
- String name — название отдела.
- ArrayList<Employee> — список сотрудников отдела.

 Методы:
- Конструктор для инициализации названия отдела.
- void addEmployee(Employee employee) — добавляет сотрудника в отдел.
- void removeEmployee(String employeeId) — удаляет сотрудника по его ID.
- Employee findEmployee(String employeeId) — находит сотрудника по ID.
- double getTotalSalary() — возвращает общую зарплату всех сотрудников отдела.
- ArrayList<Employee> getEmployees() — возвращает список сотрудников отдела.
 */
public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {
        employees.removeIf(e -> e.getId().equals(employeeId));
    }

    public Employee findEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


} // klass ended

