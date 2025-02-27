package businessprojekt;


import java.util.ArrayList;
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
       // employees.add(employee);
        if(employee == null){
            System.out.println("businessprojekt.Business.Employee is null");
        }
        else if(employee.getId() == null || employee.getName() == null
                || employee.getPosition() == null || employee.getSalary() <= 0){
            System.out.println("businessprojekt.Business.Employee is invalid");
        }
        else {
            employees.add(employee);
            System.out.println("businessprojekt.Business.Employee ID" + employee.getId() + " added");
        }
    }

    public void removeEmployee(String employeeId) {
       // employees.removeIf(e -> e.getId().equals(employeeId));
        boolean found = false;
        if(employeeId == null || employeeId.isEmpty()){
            System.out.println("businessprojekt.Business.Employee ID is null or empty");
        }
        else {
            for (Employee employee : employees) {
                if(employee.getId().equals(employeeId)){
                    employees.remove(employee);
                    System.out.println("businessprojekt.Business.Employee ID" + employeeId + " removed");
                    found = true;
                    break;
                }

            }
            if(!found) {
                System.out.println("businessprojekt.Business.Employee ID" + employeeId + " not found");
            }

        }
    }

    public Employee findEmployee(String employeeId) {
        if(employeeId == null || employeeId.isEmpty()){
            System.out.println("businessprojekt.Business.Employee ID is null or empty");
        }
        else {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                return employee;
            }
        }
            System.out.println("businessprojekt.Business.Employee ID" + employeeId + " not found");
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        if(employees.isEmpty()){
            System.out.println("No employees found");
            return totalSalary;
        }

        for(Employee employee : employees){
            totalSalary = totalSalary + employee.getSalary();
              //double total = 0;
              //for (businessprojekt.Business.Employee employee : employees) {
              //total += employee.getSalary();
        }
        return totalSalary;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

} // klass ended

