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
        this.id = id; // если id не должно изменяться после создания, не использовать сеттер
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }

    public String getInfo() {
        return String.format("ID: %s, Name: %s, Position: %s, Salary: %.2f", id, name, position, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

} // klass ended