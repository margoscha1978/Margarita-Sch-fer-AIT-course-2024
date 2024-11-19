package personal;

import java.util.Objects;

public class Personal {

       // данные персонала для управления
        private int id; // индивидуальный номер в системе
        private String firstName; // имя
        private String lastName; // фамилия
        private int age; // возраст
        private String position; // занимаемая должность
        private double hourlySalary; // оплата за час работы
        private double workedHours; // часы работы за определенный период времени

        // конструктор
        public Personal(int id, String firstName, String lastName, int age, String position,
                        double hourlySalary, double workedHours) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.position = position;
            this.hourlySalary = hourlySalary;
            this.workedHours = workedHours;
        }

        public double calculateSalary() { // расчет зарплаты по часам
            return hourlySalary * workedHours;
        }

        // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personal personal)) return false;
        return id == personal.id && age == personal.age && Double.compare(hourlySalary, personal.hourlySalary) == 0
                && Double.compare(workedHours, personal.workedHours) == 0 && Objects.equals(firstName, personal.firstName)
                && Objects.equals(lastName, personal.lastName) && Objects.equals(position, personal.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, position, hourlySalary, workedHours);
    }

    @Override
    public String toString() {
        String sb = "Personal{" + "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", hourlySalary=" + hourlySalary +
                ", workedHours=" + workedHours +
                '}';
        return sb;
    }

} // klass ended