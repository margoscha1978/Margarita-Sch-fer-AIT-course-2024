package ClassWork26.ait.employee.dao;

import ClassWork26.ait.employee.model.Employee;

public class ConpanyImpl implements Company{

private Employee[] employees;
private int size;

    // capaciti - vozmoschnoe kolichestvo rabotnikov
    public ConpanyImpl(int capacity) {
        this.employees = new Employee[capacity ] ;
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quatity() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreateThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return new Employee[0];
    }
}
