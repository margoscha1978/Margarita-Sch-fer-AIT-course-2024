package lesson_30.TourismBureauManagementSystem.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateExample {
    public static void main(String[] args) {
        String dateString = "2023-10-15"; // Дата в формате YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("Преобразованная дата: " + date);
        } catch (DateTimeParseException e) {
            System.err.println("Ошибка преобразования даты: " + e.getMessage());
        }
    }

} // klass ended
