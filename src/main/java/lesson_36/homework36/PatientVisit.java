package lesson_36.homework36;
/*
Задание 1: Расчёт времени следующего приёма пациента
Описание:
В медицинской клинике пациенты приходят на приём с определённым интервалом, например, раз в 6 месяцев.
Напишите программу, которая принимает дату последнего визита пациента (LocalDate) и рассчитывает дату следующего визита.
Требования:
    Запросить у пользователя дату последнего визита в формате dd.MM.yyyy.
    Рассчитать дату следующего визита через 6 месяцев.
    Если следующий визит выпадает на выходной (субботу или воскресенье), перенести его на ближайший понедельник.
    Вывести результат в формате dd MMMM yyyy.
Пример вывода:
Введите дату последнего визита (dd.MM.yyyy): 10.02.2023
Дата следующего визита: 12 августа 2023 (перенесено с выходного)
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientVisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Введите дату последнего визита (dd.MM.yyyy): ");
        String input = scanner.nextLine();

        LocalDate lastVisit = LocalDate.parse(input, formatter);
        LocalDate nextVisit = lastVisit.plusMonths(6);

        // Если следующий визит выпадает на выходной, перенести на понедельник
        if (nextVisit.getDayOfWeek().getValue() == 6) { // Суббота
            nextVisit = nextVisit.plusDays(2);
        } else if (nextVisit.getDayOfWeek().getValue() == 7) { // Воскресенье
            nextVisit = nextVisit.plusDays(1);
        }

        System.out.println("Дата следующего визита: " + nextVisit.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    }

} // klass ended
