package lesson_38.homework38;
/*
Создаем класс, который представляет видео с соответствующими полями и методами доступа.
Представьте, что у вас есть список объектов Video, каждый из которых содержит информацию о видео на YouTube.
 Класс Video имеет следующие поля:
    private String title;// Название видео
    private String channel;// Название канала
    private int views;// Количество просмотров
    private int likes;// Количество лайков
    private int duration;// Длительность видео в секундах
    private String category;// Категория видео (например, "Музыка", "Образование", "Игры")
    private boolean isMonetized;// Монетизировано ли видео
    // Конструкторы, геттеры, сеттеры
 */
import java.util.*;
import java.util.stream.Collectors;

class Video {
    private String title;
    private String channel;
    private int views;
    private int likes;
    private int duration; // в секундах
    private String category;
    private boolean isMonetized;

    // Конструктор, геттеры и сеттеры

    public Video(String title, String channel, int views, int likes, int duration, String category, boolean isMonetized) {
        this.title = title;
        this.channel = channel;
        this.views = views;
        this.likes = likes;
        this.duration = duration;
        this.category = category;
        this.isMonetized = isMonetized;
    }

    public String getTitle() {
        return title;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return category;
    }

    public boolean isMonetized() {
        return isMonetized;
    }

} // klass ended
