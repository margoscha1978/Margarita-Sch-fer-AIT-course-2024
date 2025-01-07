package ClassWork21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * PhotoFilters - Класс для управления фильтрами для фотографий.
 * PhotoFilters - A class for managing filters for photos.
 */
public class PhotoFilters {

    // Логгер для записи событий в журнал.
    // Logger for logging events.
    static final Logger LOGGER = LoggerFactory.getLogger(PhotoFilters.class);

    // Сканер для чтения ввода пользователя.
    // Scanner for reading user input.
    static Scanner scanner = new Scanner(System.in);

    // Список для хранения доступных фильтров.
    // A list to store available filters.
    static ArrayList<String> filtersList = new ArrayList<>();

    // Переменная для хранения выбора пользователя.
    // A variable to store the user's choice.
    static byte choice;

    /**
     * Главный метод, управляющий циклом программы и действиями пользователя.
     * Main method controlling the program loop and user actions.
     */
    public static void main(String[] args) {
        boolean running = true; // Флаг для управления циклом программы.
        while (running) {
            showMenu(); // Показать меню.
            choice = scanner.nextByte(); // Считать выбор пользователя.
            switch (choice) {
                case 1 -> add(); // Добавить новый фильтр.
                case 2 -> showFiltersList(); // Показать список фильтров.
                case 3 -> {
                    running = false; // Остановить приложение.
                    LOGGER.info("Application stopped"); // Логирование остановки.
                }
                default -> {
                    LOGGER.warn("Invalid choice " + choice); // Логирование неверного ввода.
                    System.out.println("Invalid input " + choice); // Сообщение об ошибке.
                }
            }
        }
    }

    /**
     * Метод для отображения меню.
     * Displays the menu for user actions.
     */
    public static void showMenu() {
        System.out.println("What you want: ");
        System.out.println("1. Add new filter"); // Добавить новый фильтр.
        System.out.println("2. See all filters"); // Просмотреть все фильтры.
        System.out.println("3. Quite"); // Выйти из программы.
        System.out.println("Choose an action: "); // Запрос выбора.
    }

    /**
     * Метод для добавления нового фильтра.
     * Adds a new filter to the list.
     */
    public static void add() {
        scanner.nextLine(); // Очистка буфера после считывания байта.
        System.out.println("Enter new Filter: "); // Запрос ввода названия фильтра.
        String newFilter = scanner.nextLine(); // Чтение строки ввода.
        if (!filtersList.contains(newFilter)) { // Проверка, есть ли фильтр в списке.
            filtersList.add(newFilter); // Добавление фильтра в список.
            LOGGER.info("added new Filter " + newFilter); // Логирование успешного добавления.
            System.out.println("Filter " + newFilter + " added to list"); // Вывод сообщения об успехе.
        } else {
            LOGGER.warn("attempt to add existing filter " + newFilter); // Логирование попытки добавить существующий фильтр.
            System.out.println("This filter " + newFilter + " already exists"); // Сообщение о существовании фильтра.
        }
    }

    /**
     * Метод для отображения списка всех фильтров.
     * Displays the list of all filters.
     */
    public static void showFiltersList() {
        System.out.println("Output content to screen"); // Заголовок вывода.
        for (int i = 0; i < filtersList.size(); i++) { // Перебор всех фильтров.
            System.out.println((i + 1) + ": " + filtersList.get(i)); // Вывод фильтра с индексом.
            LOGGER.info(filtersList.get(i)); // Логирование каждого фильтра.
        }
    }
}
