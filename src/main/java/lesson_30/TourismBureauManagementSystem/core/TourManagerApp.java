package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Tour;
/*
 Проверка работы выбранных для класса TourManager методов.
 Простейший интерфейс для менеджера для ввода данных клиента.
 */
import java.util.List;
import java.util.Scanner;

public class TourManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TourManager tourManager = new TourManager();

        // Пример добавления туров
        tourManager.addTour(new Tour(1, "Париж", "2023-12-01", 7, 2000.0,
                10));
        tourManager.addTour(new Tour(2, "Рим", "2023-12-01", 5, 1500.0,
                0));

        // Простой интерфейс для поиска туров
        System.out.println("Введите направление:");
        String destination = scanner.nextLine();

        System.out.println("Введите дату (формат YYYY-MM-DD):");
        String date = scanner.nextLine();

        System.out.println("Введите максимальную цену:");
        double maxPrice = scanner.nextDouble(); // Double

        // Поиск доступных туров
        List<Tour> availableTours = tourManager.findAvailableTours(destination, date, maxPrice);
        if (availableTours.isEmpty()) {
            System.out.println("Нет доступных туров по заданным критериям.");
        } else {
            System.out.println("Доступные туры:");
            for (Tour tour : availableTours) {
                System.out.println(tour);
            }

            // Пример бронирования
            System.out.println("Введите ID тура для бронирования:");
            int tourId = scanner.nextInt();
            if (tourManager.bookTour(tourId)) {
                System.out.println("Тур забронирован!");
            } else {
                System.out.println("Не удалось забронировать тур. Возможно, нет доступных мест.");
            }
        }

        scanner.close();
    }
} // klass ended
