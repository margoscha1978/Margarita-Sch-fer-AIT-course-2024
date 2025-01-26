package lesson_33.ClassWork33;


/* Интерфейс для всех типов недвижимости. */
/* Interface for all property types. */
public interface Property {

    double calculatePrice(); // метод для расчета цены недвижимости

    void printDetails();// метод для вывода информации о недвижимости

    String getAddress();

} // interface ended
