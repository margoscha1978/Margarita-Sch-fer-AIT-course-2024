package ClassWork29a;

/**
 * Класс PopTrack представляет поп-трек с информацией о популярности.
 * Наследует базовые свойства и методы класса MusicTrack и добавляет функциональность, связанную с популярностью.
 */
public class PopTrack extends MusicTrack {

    private int popularity; // Уровень популярности трека / Popularity level of the track

    /**
     * Конструктор для создания поп-трека с заданными названием, исполнителем и уровнем популярности.
     * <p>
     * @param title      Название трека / Title of the track
     * @param artist     Исполнитель трека / Artist of the track
     * @param popularity Уровень популярности трека / Popularity level of the track
     */
    public PopTrack(String title, String artist, int popularity) {
        super(title, artist); // Вызов конструктора базового класса / Call the superclass constructor
        this.popularity = Math.max(0, popularity); // Уровень популярности не может быть отрицательным / Popularity level cannot be negative
    }

    /**
     * Переопределённый метод для воспроизведения трека.
     * Выводит сообщение о воспроизведении поп-трека с указанием уровня популярности.
     * <p>
     */
    @Override
    public void play() {
        System.out.println("Playing pop track \"" + getTitle() + "\" by " + getArtist() +
                " with popularity: " + popularity);
    }

    /**
     * Возвращает уровень популярности трека.
     * <p>
     * @return Уровень популярности / Popularity level
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * Устанавливает уровень популярности трека.
     * Уровень популярности не может быть отрицательным.
     * <p>
     * @param popularity Новый уровень популярности / New popularity level
     */
    public void setPopularity(int popularity) {
        if (popularity >= 0) {
            this.popularity = popularity;
        } else {
            System.out.println("Popularity level cannot be negative.");
        }
    }
} // klass ended
