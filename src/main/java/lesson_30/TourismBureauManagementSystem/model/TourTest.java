package lesson_30.TourismBureauManagementSystem.model;
/*
Используем генератор фейковых данных:
- Faker: Используется для генерации случайных значений для каждого из полей класса Tour.
- LocalDate: Для генерации даты за пределами сегодняшнего дня (например, через 30 дней, чтобы симулировать будущую дату).
- Экземпляр Tour: Создается с использованием сгенерированных данных, что позволяет легко тестировать функциональность класса.
 */

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

public class TourTest {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // Генерация фейковых данных
        int id = faker.number().randomDigitNotZero();
        String destination = faker.country().name();
        LocalDate date = faker.date().future(30, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int duration = faker.number().numberBetween(1, 14); // продолжительность от 1 до 14 дней
        double price = faker.number().randomDouble(2, 100, 5000); // генерация цены от 100 до 5000
        int availableSeats = faker.number().numberBetween(0, 50); // доступные места от 0 до 50

        // Создание экземпляра Tour с фейковыми данными
        Tour tour = new Tour(id, destination, date, duration, price, availableSeats);
        System.out.println(tour);
    }

} // klass ended
