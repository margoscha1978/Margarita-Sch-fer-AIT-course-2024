package ClassWork29a;

/**
 * Класс RockTrack представляет рок-трек с информацией об уровне "роковости".
 * Наследует базовые свойства и методы класса MusicTrack и добавляет функциональность, связанную с уровнем роковости.
 */
public class RockTrack extends MusicTrack {

    private int rockLevel; // Уровень "роковости" трека / Rock level of the track

    /**
     * Конструктор для создания рок-трека с заданным названием, исполнителем и уровнем роковости.
     * @param title Название трека / Title of the track
     * @param artist Исполнитель трека / Artist of the track
     * @param rockLevel Уровень роковости трека / Rock level of the track
     */
    public RockTrack(String title, String artist, int rockLevel) {
        super(title, artist); // Вызов конструктора базового класса / Call the superclass constructor
        this.rockLevel = Math.max(0, rockLevel); // Уровень роковости не может быть отрицательным / Rock level cannot be negative
    }

    /**
     * Переопределённый метод для воспроизведения рок-трека.
     * Выводит сообщение с уровнем роковости.
     */
    @Override
    public void play() {
        System.out.println("Playing rock track \"" + getTitle() + "\" by " + getArtist() +
                " with rock level: " + rockLevel);
    }

    /**
     * Возвращает уровень роковости трека.
     * @return Уровень роковости / Rock level
     */
    public int getRockLevel() {
        return rockLevel;
    }

    /**
     * Устанавливает уровень роковости трека.
     * Уровень роковости не может быть отрицательным.
     * @param rockLevel Новый уровень роковости / New rock level
     */
    public void setRockLevel(int rockLevel) {
        if (rockLevel >= 0) {
            this.rockLevel = rockLevel;
        } else {
            System.out.println("Rock level cannot be negative.");
        }
    }
} // klass ended
