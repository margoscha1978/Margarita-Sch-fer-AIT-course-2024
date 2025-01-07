package ClassWork26.ait.employee.model;
// - создать дочерние классы Manager,
// - SalesManager и Worker.
// - реализовать в них методы начисления зарплаты.

import java.util.Objects;

public abstract class Employee {

  protected static double minWage = 12.48; // or MIN_WAGE
  protected final int id;
  protected String name;
  protected String sekondName;
  protected double hours;// otrabotannie chasi

    public static double getMinWage (){
        return minWage;
    }

  public static void setMinWage (double minWage ){
      if (minWage > Employee.minWage) {
          Employee.minWage = minWage;
      }
  }

    public Employee(int id, String name, String sekondName, double hours) {
        this.id = id;
        this.name = name;
        this.sekondName = sekondName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSekondName() {
        return sekondName;
    }

    public void setSekondName(String sekondName) {
        this.sekondName = sekondName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", sekondName='").append(sekondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    }

    // metod for salary,rasschet zarplati,rabotaet vo vsex nasledijax
    public abstract double calcSalary();

    // zacshita ot oschibok pri nachislenii,ne dostigaet minimalnoi zarplati po zakonu
    protected double ensureSalary(double salary){
        if(salary < hours  * minWage){
          System.out.println("Set min salary..."); // signal o minimalnoi zarplate
          salary = hours * minWage;
        }
        return salary;
    }

}//klass ende