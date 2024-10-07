public class Book {
    private String title;
    private String author;
    private int year;
    private int id;

    // Конструктор
    public Book(String title, String author, int year, int id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = id;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    // Сеттеры
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Метод display
    public void display() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", Год издания: " + year + ", ID: " + id);
    }
}