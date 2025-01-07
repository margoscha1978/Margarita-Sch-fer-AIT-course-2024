package homework23.model;
// Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр.

public class Dokument {
    private String uniqueNumber;
    private String title;
    private String author;

    // Конструктор
    public Dokument(String uniqueNumber, String title, String author) {
        if (uniqueNumber.length() != 10 || !uniqueNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Уникальный номер документа должен содержать ровно 10 цифр.");
        }
        this.uniqueNumber = uniqueNumber;
        this.title = title;
        this.author = author;
    }

    // Геттеры
    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Сеттеры
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Документ: " + title + ", Автор: " + author + ", Номер: " + uniqueNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dokument dokument = (Dokument) obj;
        return uniqueNumber.equals(dokument.uniqueNumber);
    }

    @Override
    public int hashCode() {
        return uniqueNumber.hashCode();
    }
}

