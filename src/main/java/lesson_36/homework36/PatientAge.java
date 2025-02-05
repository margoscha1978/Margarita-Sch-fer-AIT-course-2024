package lesson_36.homework36;
/*
 Задание 4: Подсчёт возраста пациента
 Описание:
Создайте программу, которая принимает дату рождения пациента и вычисляет его возраст в годах, месяцах и днях.
Требования:
    Ввести дату рождения в формате dd.MM.yyyy.
    Определить возраст пациента на сегодняшний день.
    Вывести результат в формате:
Пример вывода:
Возраст пациента: 35 лет, 4 месяца, 12 дней.
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PatientAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Введите дату рождения (dd.MM.yyyy): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.printf("Возраст пациента: %d лет, %d месяцев, %d дней.%n", age.getYears(), age.getMonths(), age.getDays());
    }

} // klass ended
