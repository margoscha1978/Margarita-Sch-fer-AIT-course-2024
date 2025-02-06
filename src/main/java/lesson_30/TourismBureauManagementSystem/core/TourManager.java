package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Tour;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TourManager {
    private static final Logger logger = Logger.getLogger(TourManager.class.getName());
    private List<Tour> tours; // Список туров

    public TourManager() {
        tours = new ArrayList<>();
    }

    // Метод для добавления тура
    public void addTour(Tour tour) {
        if (tour == null) {
            logger.severe("Попытка добавить null-тур.");
            throw new IllegalArgumentException("Тур не может быть null.");
        }
        tours.add(tour);
        logger.info("Тур добавлен: " + tour);
    }

    // Метод для поиска доступных туров
    public List<Tour> findAvailableTours(String destination, String date, double maxPrice) {
        if (destination == null || date == null || maxPrice < 0) {
            logger.severe("Некорректные параметры поиска доступных туров.");
            throw new IllegalArgumentException("Некорректные параметры поиска.");
        }

        List<Tour> availableTours = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getDestination().equals(destination) &&
                    tour.getDate().equals(date) &&
                    tour.getPrice() <= maxPrice &&
                    tour.getAvailableSeats() > 0) {
                availableTours.add(tour);
            }
        }

        logger.info("Найдено доступных туров: " + availableTours.size());
        return availableTours;
    }

    // Метод для бронирования тура
    public boolean bookTour(int tourId) { // Параметр с именем tourId
        for (Tour tour : tours) {
            if (tour.getId() == tourId) {
                if (tour.getAvailableSeats() > 0) {
                    tour.updateAvailableSeats(-1); // Уменьшаем количество доступных мест
                    logger.info("Бронирование успешно: " + tour);
                    return true; // Успешное бронирование
                } else {
                    logger.warning("Не удалось забронировать тур " + tourId + ": нет доступных мест.");
                    return false; // Нет доступных мест
                }
            }
        }
        logger.warning("Не удалось забронировать: тур с ID " + tourId + " не найден.");
        return false; // Не найден тур
    }

        // Метод для отмены бронирования
        public boolean cancelBooking(int id){
            for (Tour tour : tours) {
                if (tour.getId() == id) {
                    tour.updateAvailableSeats(1); // Увеличиваем количество доступных мест
                    logger.info("Бронирование отменено для тура: " + tour);
                    return true; // Успешная отмена
                }
            }
            logger.warning("Не удалось отменить бронирование: тур с ID " + id + " не найден.");
            return false; // Не найден тур
        }

    } // klass ended
/*
  - добавления тура, addTour;
  - поиска доступных туров, findAvailableTours;
  - бронирования тура, bookTour;
  - отмены бронирования, cancelBooking;
 */
