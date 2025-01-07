package ClassWork26.ait.employee.model;
// - Worker: grade*hours

public class Worker extends Employee {

   private int grade;

    public Worker(int id, String name, String sekondName, double hours, int grade) {
        super(id, name, sekondName, hours);
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

} //klass ende
