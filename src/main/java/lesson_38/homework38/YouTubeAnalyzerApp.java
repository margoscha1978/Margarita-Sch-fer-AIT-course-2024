package lesson_38.homework38;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YouTubeAnalyzerApp {
    public static void main(String[] args) {
        // Создаем список видео
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video("Video 1", "Channel 1", 1500000,
                50000, 300, "Музыка", true));
        videoList.add(new Video("Video 2", "Channel 2", 800000,
                30000, 1800, "Образование", false));
        videoList.add(new Video("Video 3", "Channel 3", 12000000,
                200000, 3600, "Игры", true));
        videoList.add(new Video("Video 4", "Channel 1", 6000000,
                160000, 5000, "Музыка", true));
        videoList.add(new Video("Video 5", "Channel 2", 2000000,
                240000, 4000, "Наука", true));

        // Создаем экземпляр YouTubeAnalyzer
        YouTubeAnalyzer analyzer = new YouTubeAnalyzer(videoList);

        // Группируем видео по категориям
        Map<String, List<Video>> videosByCategory = analyzer.groupVideosByCategory();
        System.out.println("Видео по категориям: " + videosByCategory);

        // Получаем среднее количество просмотров
        double averageViews = analyzer.getAverageViews();
        System.out.println("Среднее количество просмотров: " + averageViews);

        // Проверяем, есть ли видео длительностью более 1 часа
        boolean hasLongVideo = analyzer.hasVideoLongerThan1Hour();
        System.out.println("Есть ли видео длительностью более 1 часа: " + hasLongVideo);
    }

} // klass ended

