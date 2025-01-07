package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Tour;

import java.time.LocalDate;

public class TourManagerApp {
    public static void main(String[] args) {
        TourManager tourManager = new TourManager();

        // Создание туров
        Tour tour1 = new Tour("Китай",  LocalDate.parse("2024-10-12"), 10,4500,
                 5);
        Tour tour2 = new Tour("Италия",  LocalDate.parse("2024-12-25"), 5,
                 2300,5);
        Tour tour3 = new Tour("Испания",  LocalDate.parse("2024-10-12"), 10,3700,
                 10);
        Tour tour4 = new Tour("Сербия",  LocalDate.parse("2024-12-25"), 5,
                 3300,5);
        Tour tour5 = new Tour("Греция",  LocalDate.parse("2024-10-12"), 5,
                 2500,5);

        // Добавление туров
        tourManager.addTour(tour1);
        tourManager.addTour(tour2);
        tourManager.addTour(tour3);
        tourManager.addTour(tour4);
        tourManager.addTour(tour5);

        // Поиск и вывод тура
        Tour foundTour = tourManager.findTourById(1);
        System.out.println("Найденный тур: " + foundTour);

        // Удаление тура
        tourManager.removeTour(1);

        // Получение всех туров
        System.out.println("Все туры: " + tourManager.getAllTours());
    }

} // klass ended