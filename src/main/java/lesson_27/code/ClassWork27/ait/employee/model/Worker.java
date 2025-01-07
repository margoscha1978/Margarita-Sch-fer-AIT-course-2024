package ClassWork27.ait.employee.model;

public class Worker extends Employee {

    private int grade;

    public Worker(int id, String name, String secondName, double hours, int grade) {
        super(id, name, secondName, hours);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = grade * hours;
        return ensureSalary(salary);
    }
} // klass ende
