package ClassWork21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

/*
 * PhotoSessionLocations - Класс для управления местами проведения фотосессий.
 * PhotoSessionLocations - A class for managing photo session locations.
 */
public class PhotoSessionLocations {

    // Логгер для записи событий в журнал.
    // Logger for logging events.
    static final Logger LOGGER = LoggerFactory.getLogger(PhotoSessionLocations.class);

    // Хранилище уникальных мест для фотосессий.
    // A storage for unique photo session locations.
    static HashSet<String> locations = new HashSet<>();

    /*
     * Главный метод для демонстрации добавления, удаления и проверки мест фотосессий.
     * Main method for demonstrating adding, removing, and checking photo session locations.
     */
    public static void main(String[] args) {
        addLocation("Location 1"); // Добавление места "Location 1".
        addLocation("Location 2"); // Добавление места "Location 2".
        addLocation("Location 3"); // Добавление места "Location 3".

        removeLocation("Location 5"); // Попытка удалить место, которого нет в списке.
        removeLocation("Location 2"); // Удаление существующего места "Location 2".
    }

    /*
     * Метод для добавления нового места фотосессии.
     * Adds a new photo session location.
     *
     * @param location название места / the name of the location
     */
    public static void addLocation(String location) {
        // Проверка, существует ли уже место в списке.
        // Check if the location already exists in the set.
        if (locations.contains(location)) {
            LOGGER.warn(location + " already exists"); // Логирование предупреждения.
            System.out.println("Location " + location + " already exists"); // Вывод сообщения об ошибке.
        } else {
            locations.add(location); // Добавление нового места в HashSet.
            LOGGER.info("Added location: " + location); // Логирование успешного добавления.
            System.out.println("Added location: " + location); // Вывод сообщения об успехе.
        }
    }

    /*
     * Метод для удаления места фотосессии.
     * Removes a photo session location.
     *
     * @param location название места / the name of the location
     */
    public static void removeLocation(String location) {
        // Попытка удалить место. Метод remove возвращает true, если место существовало.
        // Attempt to remove the location. The remove method returns true if the location existed.
        if (locations.remove(location)) {
            LOGGER.info("Removed location: " + location); // Логирование успешного удаления.
            System.out.println("Removed location: " + location); // Вывод сообщения об удалении.
        } else {
            LOGGER.error("Failed to remove location: " + location); // Логирование ошибки.
            System.out.println("Failed to remove location: " + location); // Вывод сообщения об ошибке.
        }
    }
}
