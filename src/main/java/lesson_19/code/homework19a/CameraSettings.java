package homework19a;

//  - info теперь используется для отображения добавленной или обновленной настройки.
//  - warning используется для сообщения об ошибке, когда настройка не найдена.

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
                logger.info("Обновлена настройка: " + key + " = " + newValue);
            } else {
                logger.warning("Ошибка: настройка не найдена: " + key);
            }
        }

        public void displaySettings() {
            logger.info("Настройки камеры: ");
            settings.forEach((key, value) -> System.out.println(key + ": " + value));
        }

    } // klass ended

