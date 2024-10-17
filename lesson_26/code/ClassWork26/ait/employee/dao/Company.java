package ClassWork26.ait.employee.dao;
//- добавление сотрудника +
//- нахождение сотрудника по id +
//- обновление cотрудника +
//- удаление сотрудника +
//- печать списка сотрудников +
//- кол-во сотрудников +
//- объем ФОТ - summ
//- объем продаж

import ClassWork26.ait.employee.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);// udaliti rabotnika

    Employee findEmployee(int id);// naiti cheloveka

    Employee updateEmployee(Employee employee);// vnesti izmenenija v dannie sotrudnikov,
                                               // ili sozdati dannie novogo rabotnika

    int quatity(); //kolichestvo rabotnikov

    void printEmployee();// spisok personala

    double totalSalary();// obschaja zarplata rabotnikov

    double totalSales();

    Employee[] findEmployeeHoursGreateThan(int hours);//pererabotka sotrudnikov,massiv

    Employee[] findEmployeeSalaryRange(double min,double max);// sotrudniki c minimalnoi ili maxmalinoi zarplatoi







}//klass ende