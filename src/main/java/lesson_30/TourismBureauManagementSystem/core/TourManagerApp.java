package lesson_30.TourismBureauManagementSystem.core;

import lesson_30.TourismBureauManagementSystem.model.Tour;
/*
 Проверка работы выбранных для класса TourManager методов.
 Простейший интерфейс для менеджера для ввода данных клиента.
 */
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class TourManagerApp {
    private static TourManager tourManager = new TourManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n----- Меню -----");
            System.out.println("1. Добавить тур");
            System.out.println("2. Найти доступные туры");
            System.out.println("3. Забронировать тур");
            System.out.println("4. Отменить бронирование");
            System.out.println("5. Выход");
            System.out.print("Выберите опцию: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Считывание переноса строки после числа

            switch (option) {
                case 1:
                    addTour();
                    break;
                case 2:
                    findAvailableTours();
                    break;
                case 3:
                    bookTour();
                    break;
                case 4:
                    cancelBooking();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    // Метод для добавления тура
    private static void addTour() {
        System.out.print("Введите ID тура: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Считывание переноса строки

        System.out.print("Введите направление: ");
        String destination = scanner.nextLine();

        System.out.print("Введите дату (например, YYYY-MM-DD): ");
        String dateString = scanner.nextLine();

        LocalDate date;
        try {
            date = LocalDate.parse(dateString); // Преобразование строки в LocalDate
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка формата даты: " + e.getMessage());
            return; // Завершение метода, если дата некорректна
        }

        System.out.print("Введите цену: ");
        double price = scanner.nextDouble();

        System.out.print("Введите продолжительность тура (в днях): "); // Запрос продолжительности
        int duration = scanner.nextInt(); // Получаем продолжительность как int

        System.out.print("Введите количество доступных мест: ");
        int availableSeats = scanner.nextInt();

        // Создаем объект Tour, включая новое поле duration
        Tour tour = new Tour(id, destination, date, availableSeats, price, duration);
        try {
            tourManager.addTour(tour);
            System.out.println("Тур добавлен: " + tour);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void findAvailableTours() {
        System.out.print("Введите направление для поиска: ");
        String destination = scanner.nextLine();

        System.out.print("Введите дату (например, YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Введите максимальную цену: ");
        double maxPrice = scanner.nextDouble();

        try {
            List<Tour> availableTours = tourManager.findAvailableTours(destination, date, maxPrice);
            if (availableTours.isEmpty()) {
                System.out.println("Нет доступных туров по заданным критериям.");
            } else {
                System.out.println("Доступные туры:");
                for (Tour tour : availableTours) {
                    System.out.println(tour);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void bookTour() {
        System.out.print("Введите ID тура для бронирования: ");
        int tourId = scanner.nextInt();

        if (tourManager.bookTour(tourId)) {
            System.out.println("Бронирование успешно для тура с ID " + tourId);
        } else {
            System.out.println("Не удалось забронировать тур с ID " + tourId + ": нет доступных мест или тур не найден.");
        }
    }

    private static void cancelBooking() {
        System.out.print("Введите ID тура для отмены бронирования: ");
        int tourId = scanner.nextInt();

        if (tourManager.cancelBooking(tourId)) {
            System.out.println("Бронирование успешно отменено для тура с ID " + tourId);
        } else {
            System.out.println("Не удалось отменить бронирование для тура с ID " + tourId + ": тур не найден.");
        }
    }

} // klass ended
 /*
 Методы для выполнения операций:
   - addTour(): Считывает данные о туре и добавляет его, обрабатывая возможные исключения.
   - findAvailableTours(): Позволяет пользователю искать доступные туры по заданным критериям и выводит результат.
   - bookTour(): Позволяет бронировать тур по ID и сообщает о результате операции.
   - cancelBooking(): Позволяет отменять бронирование тура по его ID и отображает результат.

  */