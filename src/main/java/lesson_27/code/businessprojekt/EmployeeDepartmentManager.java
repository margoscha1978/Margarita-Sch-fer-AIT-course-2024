package businessprojekt;

public class EmployeeDepartmentManager {
    private Department department;

    public EmployeeDepartmentManager(Department department) {
        this.department = department;
    }

    public void addEmployee(Employee employee) {
        department.addEmployee(employee);
    }

    public void removeEmployee(String employeeId) {
        department.removeEmployee(employeeId);
    }

    public void printDepartmentInfo() {
        System.out.println("Department: " + department.getName());
        System.out.println("Employees: ");
        for(Employee emp : department.getEmployees()) {
            System.out.println(emp.getInfo());
        }
    }

} // klass ended

