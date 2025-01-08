package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Tour;
/*
Создаем класс TourManager:
- основная задача класса - управлять информацией о турах (добавление, удаление, получение данных).
- структура класса:
  - поле для хранения списка туров (как List<Tour>).
  - методы для работы с турами:
    - void addTour(Tour tour): добавление нового тура.
    - void removeTour(String tourId): удаление тура по идентификатору.
    - Tour findTourById (String tourId): получение тура по идентификатору.
    - List<Tour> getAllTours(): получение всех туров.
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TourManager {
    private List<Tour> tours;

    public TourManager() {
        tours = new ArrayList<>(); // Инициализация списка туров
    }

    public void addTour(Tour tour) {
        // Проверка на null значение
        if (tour == null) {
            throw new IllegalArgumentException("Тур не может быть null.");
        }

        // Проверка на дубликат ID
        for (Tour existingTour : tours) {
            if (existingTour.getId() == tour.getId()) { // Исправлено на корректное сравнение int
                throw new IllegalArgumentException("Тур с таким ID уже существует: " + tour.getId());
            }
        }

        tours.add(tour); // Добавление тура
        System.out.println("Тур добавлен: " + tour);
    }

    public boolean removeTour(int tourId) { // Изменено на int
        Tour tour = findTourById(tourId);
        if (tour != null) {
            tours.remove(tour);
            System.out.println("Тур с ID " + tourId + " был удалён.");
            return true;
        } else {
            System.out.println("Тур с ID " + tourId + " не найден.");
            return false;
        }
    }

    public Tour findTourById(int id) { // Изменено на int
        for (Tour tour : tours) {
            if (tour.getId() == id) { // Сравнение int
                return tour;
            }
        }
        return null; // Если тур не найден
    }

    public void getAllTours() {
        return Collections.unmodifiableList(new ArrayList<>(tours)); // Возвращаем копию списка туров
    }

    // Метод для обновления тура
    public boolean updateTour(int tourId, String destination, LocalDate date, int duration, double price, int availableSeats) {
        Tour tour = findTourById(tourId);
        if (tour != null) {
            // Можно обновить только те поля, которые нужно обновить
            tour.setDestination(destination);
            tour.setDate(date);
            tour.setDuration(duration);
            tour.setPrice(price);
            tour.updateAvailableSeats(availableSeats - tour.getAvailableSeats()); // Обновляем доступные места
            System.out.println("Тур с ID " + tourId + " был обновлён.");
            return true;
        } else {
            System.out.println("Тур с ID " + tourId + " не найден.");
            return false;
        }
    }
} // klass ended