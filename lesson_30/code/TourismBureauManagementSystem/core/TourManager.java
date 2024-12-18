package TourismBureauManagementSystem.core;

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

import TourismBureauManagementSystem.model.Tour;
import java.util.ArrayList;
import java.util.List;

public class  TourManager {
    private List<Tour> tours;

    public TourManager() {
        tours = new ArrayList<>(); // Инициализация списка туров
    }

    public void addTour(Tour tour) {
        // Проверка на null значение даты
        if (tour.getDate() == null) {
            System.out.println("Ошибка: Дата тура не может быть null.");
            return; // Или возможно, бросить исключение
        }

        // Проверка на дубликат ID
        for (Tour existingTour : tours) {
            if (existingTour.getId().equals(tour.getId())) {
                System.out.println("Ошибка: Тур с таким ID уже существует.");
                return; // Или бросить исключение
            }
        }

        tours.add(tour); // Добавление тура
        System.out.println("Тур добавлен: " + tour);
    }

    public boolean removeTour(String tourId) { // удаление тура по идентификатору
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

    public Tour findTourById(String id) { // получение тура по идентификатору
        for (Tour tour : tours) {
            if (tour.getId().equals(id)) {
                return tour;
            }
        }
        return null; // Если тур не найден
    }

    public List<Tour> getAllTours() {
        return new ArrayList<>(tours); // Возвращаем копию списка туров
    }

} // klass ended