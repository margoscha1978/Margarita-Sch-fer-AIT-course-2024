package ClassWork27.ait.employee.dao;

import ClassWork27.ait.employee.model.Employee;
import ClassWork27.ait.employee.model.SalesManager;

public class CompanyImpl implements Company {

    private Employee[] employees; // element массива employees[0], employees[1]
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;// переменная size
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if(employee == null){
            return false;
    }
        if(size == employees.length){
            return false;
        }
        if(findEmployee(employee.getId()) != null) {
            return false;
        }
        // good case
        employees[size] = employee; // put in array
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size - 1]; // на место жертвы ставим (копируем) последний элемент массива
                employees[size - 1] = null; // последний элемент затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }

        }
        return null;

    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        int quantity;
        return size;
    }

    @Override
        public void printEmployee() {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }

    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;

    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){ // проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;

    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        // Считаем сколько сотрудников подходят к нашему условию
        int count = 0;
        for(Employee employee : employees){
            if (employee.getHours() > hours){
                count++;
            }
        }
        // создаем массив для хранения данных найденных сотрудников
        Employee[] result =  new Employee[count];
        int index = 0;
        for (Employee employee : employees){
            if (employee.getHours() > hours){
                result [index++] = employee;
            }
        }
        return result;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        Employee[] temp = new Employee[size]; // Используем на size

        int count = 0;
        for (Employee employee : employees) { // Итерируемся только по активным сотрудника
                if (employee != null)
                    if (employee.calcSalary() <= max && employee.calcSalary() >= min) {
                        temp[count] = employee;
                        count++;

                    }

        }
        // Создаём массив с точным размером
        Employee[] result = new Employee[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

}// klass ende
