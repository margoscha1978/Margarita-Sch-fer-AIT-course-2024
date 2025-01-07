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
    private HashMap<String,  Department> departments = new HashMap<>();

    public Business(String name) {
        this.name = name;
    }

    public  void addDepartment(Department department)
    {
        if(department == null){
            System.out.println("Department is null");
        }
        else {
            departments.put(department.getName(),department);
            System.out.println("Department " + department.getName() + " added");
        }
    }

    public void removeDepartment(String departmentName){
        if(departmentName == null || departmentName.isEmpty()){
            System.out.println("Department name is null or empty");
        }
        else {
            if(departments.containsKey(departmentName)) {
                departments.remove(departmentName);
                System.out.println("Department " + departmentName + " removed");
            }
            else {
                System.out.println("Department " + departmentName + " not found");
            }
        }
    }

    public Department getDepartment(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            System.out.println("Department name is null or empty");
        }
        else {
            if(departments.containsKey(departmentName)) {
                return departments.get(departmentName);
            }
            else {
                System.out.println("Department " + departmentName + " not found");
            }
        }
        return null;
    }

    public HashSet<String> getAllPositions(){
        HashSet<String> positions = new HashSet<>();
        for(Department department : departments.values()){
            for(Employee employee : department.getEmployees()){
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    public double getTotalCompanySalary(){
        double totalSalaryBusiness = 0;
        for(Department department : departments.values()){
            totalSalaryBusiness = totalSalaryBusiness + department.getTotalSalary();
        }
        return totalSalaryBusiness;
    }
} // Klass ended

