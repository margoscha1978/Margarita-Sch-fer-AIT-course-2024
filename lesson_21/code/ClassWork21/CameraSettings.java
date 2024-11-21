package ClassWork21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * CameraSettings - Класс для управления настройками камеры с использованием HashMap.
 * CameraSettings - A class for managing camera settings using HashMap.
 */
public class CameraSettings {

    // Логгер для записи событий в журнал.
    // Logger for logging events.
    static final Logger LOGGER = LoggerFactory.getLogger(CameraSettings.class);

    // Хранилище настроек камеры в виде ключ-значение.
    // A storage for camera settings in the form of key-value pairs.
    static HashMap<String, String> settings = new HashMap<>();

    /**
     * Точка входа в программу. Демонстрирует добавление, обновление и вывод настроек.
     * Entry point of the program. Demonstrates adding, updating, and displaying settings.
     */
    public static void main(String[] args) {
        addSetting("flash", "false"); // Добавляем настройку "вспышка".
        addSetting("autofocus", "true"); // Добавляем настройку "автофокус".
        addSetting("mark", "sony"); // Добавляем настройку "марка".
        updateSetting("color", "black"); // Пытаемся обновить настройку "цвет" (ключ отсутствует).
        updateSetting("flash", "false"); // Обновляем настройку "вспышка".

        showSettings(); // Выводим текущие настройки.
    }

    /**
     * Метод для добавления новой настройки.
     * Adds a new setting to the HashMap.
     *
     * @param key   ключ настройки / the key of the setting
     * @param value значение настройки / the value of the setting
     */
    public static void addSetting(String key, String value) {
        // Добавляем пару ключ-значение в HashMap.
        // Add a key-value pair to the HashMap.
        settings.put(key, value);
        // Логируем добавление настройки.
        // Log the addition of the setting.
        LOGGER.info(key + "=" + value + " added to settings");
        // Выводим сообщение в консоль.
        // Print the message to the console.
        System.out.println(key + "=" + value + " added to settings");
    }

    /**
     * Метод для обновления существующей настройки.
     * Updates an existing setting in the HashMap.
     *
     * @param key      ключ настройки / the key of the setting
     * @param newValue новое значение настройки / the new value of the setting
     */
    public static void updateSetting(String key, String newValue) {
        // Проверяем, существует ли ключ в HashMap.
        // Check if the key exists in the HashMap.
        if (settings.containsKey(key)) {
            // Обновляем значение ключа.
            // Update the value of the key.
            settings.put(key, newValue);
            // Логируем успешное обновление.
            // Log the successful update.
            LOGGER.info(key + "=" + newValue + " updated to settings");
            // Выводим сообщение в консоль.
            // Print the message to the console.
            System.out.println(key + "=" + newValue + " updated to settings");
        } else {
            // Логируем ошибку при попытке обновления несуществующего ключа.
            // Log an error when trying to update a nonexistent key.
            LOGGER.error(key + "=" + newValue + " not added to settings");
            // Выводим сообщение в консоль.
            // Print the message to the console.
            System.out.println(key + "=" + newValue + " not added to settings");
        }
    }

    /*
     * Метод для отображения всех настроек.
     * Displays all settings in the HashMap.
     */
    public static void showSettings() {
        // Выводим заголовок.
        // Print the header.
        System.out.println("Settings");
        // Перебираем все ключи в HashMap.
        // Iterate through all keys in the HashMap.
        for (String key : settings.keySet()) {
            // Выводим ключ и значение в консоль.
            // Print the key and value to the console.
            System.out.println(key + "=" + settings.get(key));
            // Логируем ключ и значение.
            // Log the key and value.
            LOGGER.info(key + "=" + settings.get(key));
        }
    }
}

