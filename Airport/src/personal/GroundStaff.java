package personal;

public class GroundStaff extends Personal  {
    // собственное поле, добавка за стаж, процентная надбавка на каждые 5 лет работы
    private double seniorityBonus;

    public GroundStaff(int id, String firstName, String lastName, int age, String position, double hourlySalary,
                       double workedHours) {
        super(id, firstName, lastName, age, position, hourlySalary, workedHours);
    }

    public GroundStaff(int id, String firstName, String lastName, int age, String position, double hourlySalary,
                       double workedHours, double seniorityBonus) {
        super(id, firstName, lastName, age, position, hourlySalary, workedHours);
        this.seniorityBonus = seniorityBonus;
    }

    public double getSeniorityBonus() {
        return seniorityBonus;
    }

    public void setSeniorityBonus(double seniorityBonus) {
        this.seniorityBonus = seniorityBonus;
    }

    // дополнительные методы расчета зарплаты
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double bonus = 0.1 * (int)(seniorityBonus / 5) * baseSalary; // 10% за каждые 5 лет
        return baseSalary + bonus;
    }

} // klass ended

/*
    @Test
    public void testGroundStaffSalaryWithBonus() {
        GroundStaff staff = new GroundStaff(1, "Николай", "Стоянов", 30, "Менеджер", 20, 40, 10); // 10 лет стажа

        double expectedSalary = (20 * 40) + (0.1 * (10 / 5) * (20 * 40)); // базовая зарплата + бонус
        assertEquals(expectedSalary, staff.calculateSalary(), 0.01);
         }
 */
