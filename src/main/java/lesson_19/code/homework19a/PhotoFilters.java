package homework19a;

//   - Создаем поле ArrayList<String> для хранения фильтров.
//   - Реализуем методы для добавления и вывода фильтров
//   1. Добавление нового фильтра (уровень INFO).
//   2. Попытку добавить уже существующий фильтр (уровень WARN).
//   3. Вывод всех фильтров в порядке их добавления (уровень INFO).

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class PhotoFilters {
    private ArrayList<String> filters;
    private static final Logger logger = Logger.getLogger(PhotoFilters.class.getName());

    public PhotoFilters() {
        filters = new ArrayList<>();
    }

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
        System.out.println("Введите название фильтра (или exit для выхода): ");
        String filter;

        while (!(filter = scanner.nextLine()).equalsIgnoreCase("exit")) {
            addFilter(filter);
            System.out.println("Введите название фильтра (или     exit для выхода): ");
        }

    }

} // klass ended