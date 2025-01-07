package homework20;

/*
   - Создаем поле типа HashMap<String, String> для хранения параметров камеры.
   - Определяем методы для добавления, обновления и отображения настроек.
     1. Добавление новой настройки (уровень INFO).
     2. Обновление существующей настройки (уровень DEBUG).
     3. Попытку обновить несуществующую настройку (уровень ERROR).
     4. Отображение всех настроек камеры (уровень INFO).

 */

import java.util.HashMap;
import java.util.logging.Logger;

public class CameraSettings {
    private HashMap<String, String> settings;
    private static final Logger logger = Logger.getLogger(CameraSettings.class.getName());

    public CameraSettings() {
        settings = new HashMap<>();
    }

    public void addSetting(String key, String value) {
        settings.put(key, value);
        logger.info("Добавлена новая настройка: " + key + " = " + value);
    }

    public void updateSetting(String key, String newValue) {
        if (settings.containsKey(key)) {
            settings.put(key, newValue);
            logger.fine("Обновлена настройка: " + key + " = " + newValue);
        } else {
            logger.severe("Ошибка: настройка не найдена: " + key);
        }
    }

    public void displaySettings() {
        logger.info("Настройки камеры: " + settings);
        settings.forEach((key, value) -> System.out.println(key + ": " + value));
    }

} // klass ended
