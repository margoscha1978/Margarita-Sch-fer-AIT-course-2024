package businessprojekt;
import java.util.Objects;

/*
Поля:
- String id — уникальный идентификатор сотрудника.
- String name — имя сотрудника.
- String position — должность.
- double salary — зарплата.

Методы:
- Конструктор для инициализации всех полей.
- Геттеры и сеттеры для всех полей.
- String getInfo() — возвращает строку с информацией о сотруднике.
 */
public class Employee {
    private String id;
    private String name;
    private String position;
    private double salary;

    public Employee(String id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Геттеры и сеттеры
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public void setName(String name) { this.name = name; }
    public void setPosition(String position) { this.position = position; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
} // klass ended
