package lesson_38.homework38;
/*
Класс YouTubeAnalyzer:
   - Хранит список видео и предоставляет методы для анализа.
   - Каждый метод соответствует заданиям, описанным ранее, и использует Stream API для выполнения нужных операций.
3. Методы: Каждый метод в классе YouTubeAnalyzer выполняет определенную задачу (например: фильтрацию,
получение уникальных категорий и т.д.) и инкапсулирует логику анализа.
 */
import java.util.*;
import java.util.stream.Collectors;

public class YouTubeVideo {
    private List<Video> videoList;

    public YouTubeVideo(List<Video> videoList) {
        this.videoList = videoList;
    }

    public List<Video> getPopularVideos() {
        return videoList.stream()
                .filter(video -> video.getViews() > 1_000_000)
                .collect(Collectors.toList());
    }

    public List<String> getLongVideoTitles() {
        return videoList.stream()
                .filter(video -> video.getDuration() > 600) // 10 минут = 600 секунд
                .map(Video::getTitle)
                .collect(Collectors.toList());
    }

    public Set<String> getUniqueCategories() {
        return videoList.stream()
                .map(Video::getCategory)
                .distinct()
                .collect(Collectors.toSet());
    }

    public List<String> getUpperCaseTitles() {
        return videoList.stream()
                .map(video -> video.getTitle().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<Map.Entry<String, Integer>> getTitleLikesList() {
        return videoList.stream()
                .map(video -> new AbstractMap.SimpleEntry<>(video.getTitle(), video.getLikes()))
                .collect(Collectors.toList());
    }

    public List<Video> getTop5VideosByViews() {
        return videoList.stream()
                .sorted(Comparator.comparingInt(Video::getViews).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<Video> getTop3VideosByDuration() {
        return videoList.stream()
                .sorted(Comparator.comparingInt(Video::getDuration))
                .limit(3)
                .collect(Collectors.toList());
    }

    public long getTotalVideosCount() {
        return videoList.stream().count();
    }

    public Optional<Video> getMostLikedVideo() {
        return videoList.stream()
                .max(Comparator.comparingInt(Video::getLikes));
    }

    public Optional<Video> getShortestVideo() {
        return videoList.stream()
                .min(Comparator.comparingInt(Video::getDuration));
    }

    public boolean hasVideoOver10MillionViews() {
        return videoList.stream()
                .anyMatch(video -> video.getViews() > 10_000_000);
    }

    public boolean allMusicVideosMonetized() {
        return videoList.stream()
                .filter(video -> video.getCategory().equals("Музыка"))
                .allMatch(Video::isMonetized);
    }

} // klass ended
