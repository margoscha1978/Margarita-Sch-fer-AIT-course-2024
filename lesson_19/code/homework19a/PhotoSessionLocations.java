package homework19a;

import java.util.HashSet;
import java.util.logging.Logger;

// Создаем поле HashSet<String> для хранения уникальных мест.
// Определяем методы для добавления и удаления мест.
// Логирование можно повторить в действиях предыдущего упражнения.
//  1. Добавление нового места (уровень INFO).
//  2. Попытку добавить уже существующее место (уровень WARN).
//  3. Удаление места из списка (уровень INFO).
//  4. Попытку удалить несуществующее место (уровень ERROR).

public class PhotoSessionLocations {
    private HashSet<String> locations;
    private static final Logger logger = Logger.getLogger(PhotoSessionLocations.class.getName());

    public PhotoSessionLocations() {
        locations = new HashSet<>();
    }

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

} // klass ended



