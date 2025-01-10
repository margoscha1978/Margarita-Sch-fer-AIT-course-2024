package ClassWork29;

/**
 * Класс AudioBook представляет аудиокнигу.
 * Наследуется от класса Book и добавляет специфические свойства и методы для аудиокниг.
 */
public class AudioBook extends Book {

    private double durationMinutes; // Длительность аудиокниги в минутах / Duration of the audiobook in minutes

    /**
     * Конструктор для создания аудиокниги с заданным названием, автором и длительностью.
     * @param title Название книги / Title of the book
     * @param author Автор книги / Author of the book
     * @param durationMinutes Длительность аудиокниги в минутах / Duration of the audiobook in minutes
     */
    public AudioBook(String title, String author, double durationMinutes) {
        super(title, author); // Вызов конструктора базового класса / Call the superclass constructor
        this.durationMinutes = durationMinutes;
    }

    /**
     * Переопределённый метод read из базового класса.
     * Выводит сообщение, что книга читается в аудиоформате.
     */
    @Override
    public void read() {
        System.out.println("Reading " + getTitle() + " by " + getAuthor() + " in audio format");
    }

    /**
     * Метод для прослушивания аудиокниги.
     * Выводит сообщение с названием книги и её длительностью.
     */
    public void listen() {
        System.out.println("Listening to " + getTitle() + ", duration: " + durationMinutes + " minutes");
    }

    /**
     * Возвращает длительность аудиокниги.
     * @return Длительность аудиокниги / Duration of the audiobook
     */
    public double getDurationMinutes() {
        return durationMinutes;
    }

    /**
     * Устанавливает длительность аудиокниги.
     * @param durationMinutes Новая длительность аудиокниги / New duration of the audiobook
     */
    public void setDurationMinutes(double durationMinutes) {
        if (durationMinutes > 0) {
            this.durationMinutes = durationMinutes;
        } else {
            System.out.println("Duration must be positive.");
        }
    }
} // klass ended
