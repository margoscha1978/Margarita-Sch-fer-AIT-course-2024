package ClassWork21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * PhotoAlbum - Класс для управления фотоальбомом с использованием ArrayList.
 * PhotoAlbum - A class for managing a photo album using ArrayList.
 */
public class PhotoAlbum {

    // Логгер для записи событий в журнал.
    // Logger for logging events.
    static final Logger LOGGER = LoggerFactory.getLogger(PhotoAlbum.class);

    // Хранилище фотографий в виде списка строк.
    // A storage for photos as a list of strings.
    static ArrayList<String> photos = new ArrayList<>();

    /**
     * Точка входа в программу. Демонстрирует добавление, удаление и вывод фотографий.
     * Entry point of the program. Demonstrates adding, removing, and displaying photos.
     */
    public static void main(String[] args) {
        addPhoto("123.jpg"); // Добавляем первую фотографию.
        removePhoto(10); // Пытаемся удалить фотографию по некорректному индексу.
        removePhoto(0); // Удаляем фотографию по индексу 0 (если она существует).
        addPhoto("456.jpg"); // Добавляем вторую фотографию.
        addPhoto("789.jpg"); // Добавляем третью фотографию.
        addPhoto("4567.jpg"); // Добавляем четвёртую фотографию.
        showPhotos(); // Выводим текущий список фотографий.
    }

    /**
     * Метод для добавления новой фотографии.
     * Adds a new photo to the album.
     *
     * @param photo имя файла фотографии / the name of the photo file
     */
    public static void addPhoto(String photo) {
        // Добавляем фотографию в список.
        // Add the photo to the list.
        photos.add(photo);
        // Логируем успешное добавление.
        // Log the successful addition.
        LOGGER.info("Added photo " + photo);
        // Выводим сообщение в консоль.
        // Print the message to the console.
        System.out.println("Added photo " + photo);
    }

    /**
     * Метод для удаления фотографии по индексу.
     * Removes a photo by its index in the album.
     *
     * @param photoIndex индекс фотографии / the index of the photo
     */
    public static void removePhoto(int photoIndex) {
        // Проверяем корректность индекса.
        // Check if the index is valid.
        if (photoIndex < 0 || photoIndex >= photos.size()) {
            // Логируем ошибку при некорректном индексе.
            // Log an error for an invalid index.
            LOGGER.error("Invalid photo index " + photoIndex);
            // Выводим сообщение об ошибке в консоль.
            // Print the error message to the console.
            System.out.println("Invalid photo index " + photoIndex);
        } else {
            // Удаляем фотографию по индексу.
            // Remove the photo by its index.
            photos.remove(photoIndex);
            // Логируем предупреждение об удалении.
            // Log a warning about the removal.
            LOGGER.warn("Removed photo " + photoIndex);
            // Выводим сообщение об удалении в консоль.
            // Print the removal message to the console.
            System.out.println("Removed photo. Index: " + photoIndex);
        }
    }

    /**
     * Метод для отображения всех фотографий.
     * Displays all photos in the album.
     */
    public static void showPhotos() {
        // Перебираем и выводим все фотографии из списка.
        // Iterate and print all photos in the list.
        for (String photo : photos) {
            // Печатаем имя файла фотографии в консоль.
            // Print the photo file name to the console.
            System.out.println(photo);
            // Логируем имя файла с уровнем DEBUG.
            // Log the file name with DEBUG level.
            LOGGER.debug(photo);
        }
    }
}

