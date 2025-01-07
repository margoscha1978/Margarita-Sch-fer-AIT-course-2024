package homework20a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

/*
 создаем класс, который будет управлять списком достопримечательностей,
 используя коллекцию HashSet для обеспечения уникальности и
 будет содержать методы для добавления, удаления и отображения достопримечательностей
 и логирование каждого действия.
 */

public class AttractionManager {
    private static final Logger logger = LoggerFactory.getLogger(AttractionManager.class);
    private HashSet<String> attractions = new HashSet<>();

    // Метод для добавления достопримечательности
    public void addAttraction(String attraction) {
        if (attractions.contains(attraction)) {
            System.out.println("Сообщение: Достопримечательность уже существует.");
            logger.warn("Attempt to add existing attraction: {}", attraction);
        } else {
            attractions.add(attraction);
            System.out.println("Сообщение: Достопримечательность добавлена.");
            logger.info("Added attraction: {}", attraction);// logger info
        }
    }

    // Метод для удаления достопримечательности
    public void removeAttraction(String attraction) {
        if (!attractions.remove(attraction)) {
            System.out.println("Сообщение: Достопримечательность не найдена.");
            logger.error("Failed to remove attraction: {}", attraction);
        } else {
            System.out.println("Сообщение: Достопримечательность удалена.");
            logger.info("Removed attraction: {}", attraction);// logger info
        }
    }

    // Метод для отображения всех достопримечательностей
    public void displayAttractions() {
        System.out.println("Список достопримечательностей:");
        int i = 1;
        for (String attraction : attractions) {
            System.out.println(i + ". " + attraction);
            i++;
        }
        logger.debug("Current attractions list: {}", attractions);// logger debug
    }

} // klass ended
