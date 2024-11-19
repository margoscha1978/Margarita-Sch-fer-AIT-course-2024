package personal;

public class FlightCrew extends Personal{
    // собственное поле уровень сертификации, 5% надбавка за повышение уровня квалификации
    private double certifications; // изменяющийся параметр по этому double


    public FlightCrew(int id, String firstName, String lastName, int age, String position,
                      double hourlySalary, double workedHours) {
        super(id, firstName, lastName, age, position, hourlySalary, workedHours);
    }

    public FlightCrew(int id, String firstName, String lastName, int age, String position, double hourlySalary,
                      double workedHours, double certifications) {
        super(id, firstName, lastName, age, position, hourlySalary, workedHours);
        this.certifications = certifications;
    }

    public double getCertifications() {
        return certifications;
    }

    public void setCertifications(double certifications) {
        this.certifications = certifications;
    }

    // дополнительные методы расчета зарплаты
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        // 5% за каждую сертификацию
        double bonus = 0.05 * certifications * baseSalary;
        return baseSalary + bonus;
    }

} // klass ended

/*
   @Test
    public void testFlightCrewSalaryWithCertifications() {
        FlightCrew crew = new FlightCrew(2, "Сергей", "Литоренко", 28, "Пилот", 30, 35, 3); // 3 сертификации

        double expectedSalary = (30 * 35) + (0.05 * 3 * (30 * 35)); // базовая зарплата + бонус
        assertEquals(expectedSalary, crew.calculateSalary(), 0.01);
         }
 */
