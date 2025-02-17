package lesson_38.homework38;
/*
Дополнительные предложения по улучшению анализа:
   - Создайте Map, где ключом будет категория видео, а значением — список видео в этой категории.
    Подсказка: Используйте Collectors.groupingBy.
    -Найдите среднее количество просмотров для всех видео.
    Подсказка: Используйте Collectors.averagingInt.
    -Проверьте, есть ли видео, которое длится более 1 часа.
    Подсказка: Используйте anyMatch с условием на длительность (1 час = 3600 секунд).
 */
import java.util.*;
import java.util.stream.Collectors;

public class YouTubeAnalyzer {
    private List<Video> videoList; // Список видео

    // Конструктор принимает список видео
    public YouTubeAnalyzer(List<Video> videoList) {
        this.videoList = videoList;
    }

    // Метод для группировки видео по категориям
    public Map<String, List<Video>> groupVideosByCategory() {
        return videoList.stream()
                .collect(Collectors.groupingBy(Video::getCategory)); // Группируем по категории
    }

    // Метод для получения среднего количества просмотров
    public double getAverageViews() {
        return videoList.stream()
                .collect(Collectors.averagingInt(Video::getViews)); // Находим среднее количество просмотров
    }

    // Метод для проверки, есть ли видео длительностью более 1 часа
    public boolean hasVideoLongerThan1Hour() {
        return videoList.stream()
                .anyMatch(video -> video.getDuration() > 3600); // Проверка на длительность
    }

} // klass ended
