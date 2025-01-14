package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Tour;

import java.util.ArrayList;
import java.util.List;

public class TourManager {
    private List<Tour> tours;

    public TourManager() {
        tours = new ArrayList<>();
    }

    // Метод для добавления тура
    public void addTour(Tour tour) {
        tours.add(tour);
    }

    // Метод для поиска доступных туров
    public List<Tour> findAvailableTours(String destination, String date, double maxPrice) {
        List<Tour> availableTours = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getDestination().equals(destination) &&
                    tour.getDate().equals(date) &&
                    tour.getPrice() <= maxPrice &&
                    tour.getAvailableSeats() > 0) {
                availableTours.add(tour);
            }
        }
        return availableTours;
    }

    // Метод для бронирования тура
    public boolean bookTour(int tourId) {
        for (Tour tour : tours) {
            if (tour.getId() == tourId && tour.getAvailableSeats() > 0) {
                tour.updateAvailableSeats(-1); // Уменьшаем количество доступных мест
                return true; // Успешное бронирование
            }
        }
        return false; // Не удалось забронировать
    }

    // Метод для отмены бронирования
    public boolean cancelBooking(int tourId) {
        for (Tour tour : tours) {
            if (tour.getId() == tourId) {
                tour.updateAvailableSeats(1); // Увеличиваем количество доступных мест
                return true; // Успешная отмена
            }
        }
        return false; // Не удалось отменить
    }
} // klass ended

/*
  - добавления тура, addTour;
  - поиска доступных туров, findAvailableTours;
  - бронирования тура, bookTour;
  - отмены бронирования, cancelBooking;
 */
