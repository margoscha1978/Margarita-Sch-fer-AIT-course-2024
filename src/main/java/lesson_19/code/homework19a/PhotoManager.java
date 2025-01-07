package homework19a;
//  Создаем один общий класс, который будет содержать все необходимые нам данные.
//  Объединяем все методы из маленьких классов, учитывая то, что они работать с разными типами данных
//  которые мы собираем в листы (фотографии, места, настройки и фильтры).
//  Можно добавить еще дополнительные методы, если нужно,
//  чтобы показать функции для каждого задания, и соединить все вместе,
//  что бы сделать их частями одного класса.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;

public class PhotoManager {
    private ArrayList<String> photos;
    private HashSet<String> locations;
    private HashMap<String, String> cameraSettings;
    private ArrayList<String> filters;
    private static final Logger logger = Logger.getLogger(PhotoManager.class.getName());

    public PhotoManager() {
        photos = new ArrayList<>();
        locations = new HashSet<>();
        cameraSettings = new HashMap<>();
        filters = new ArrayList<>();
    }

    // Методы для работы с фотографиями
    public void addPhoto(String photo) {
        photos.add(photo);
        logger.info("Фото добавлено: " + photo);
    }

    public void removePhoto(int index) {
        if (index < 0 || index >= photos.size()) {
            logger.severe("Ошибка: нет фотографии с таким индексом");
            return;
        }
        String removedPhoto = photos.remove(index);
        logger.warning("Фотография удалена: " + removedPhoto);
    }

    public void displayPhotos() {
        logger.fine("Список фотографий: " + photos);
        for (String photo : photos) {
            System.out.println(photo);
        }
    }

    // Методы для работы с местами фотосессий
    public void addLocation(String location) {
        if (locations.add(location)) {
            logger.info("Новое место добавлено: " + location);
        } else {
            logger.warning("Место уже существует: " + location);
        }
    }

    public void removeLocation(String location) {
        if (locations.remove(location)) {
            logger.info("Место удалено: " + location);
        } else {
            logger.severe("Ошибка: место не найдено: " + location);
        }
    }

    // Методы для работы с настройками камеры
    public void addSetting(String key, String value) {
        cameraSettings.put(key, value);
        logger.info("Добавлена новая настройка: " + key + " = " + value);
    }

    public void updateSetting(String key, String newValue) {
        if (cameraSettings.containsKey(key)) {
            cameraSettings.put(key, newValue);
            logger.fine("Обновлена настройка: " + key + " = " + newValue);
        } else {
            logger.severe("Ошибка: настройка не найдена: " + key);
        }
    }

    public void displaySettings() {
        logger.info("Настройки камеры: " + cameraSettings);
        cameraSettings.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    // Методы для работы с фильтрами
    public void addFilter(String filter) {
        if (!filters.contains(filter)) {
            filters.add(filter);
            logger.info("Добавлен новый фильтр: " + filter);
        } else {
            logger.warning("Фильтр уже существует: " + filter);
        }
    }

    public void displayFilters() {
        logger.info("Список фильтров: " + filters);
        for (String filter : filters) {
            System.out.println(filter);
        }
    }

    public void getFiltersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фильтра (или 'exit' для выхода): ");
        String filter;

        while (!(filter = scanner.nextLine()).equalsIgnoreCase("exit")) {
            addFilter(filter);
            System.out.println("Введите название фильтра (или 'exit' для выхода): ");
        }
    }
} // klass ended
