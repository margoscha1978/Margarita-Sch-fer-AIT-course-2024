package homework_17book.model;

public class Book {
    // Создайте класс Book с полями:
    // уникальный номер ISBN
    //название title
    // автор author
    // год издания yearOfPublishing
    // жанр genre
    // В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
    //Создайте конструктор, в котором нет поля ISBN. Создайте конструктор, в котором есть только поля title, author и genre.

private int id;
private String title;
private String autor;
private int yearOfPublishing;
private String genre;

//construktor
    public Book(int id, String title, String autor, int yearOfPublishing, String genre) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    //getter,setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void display(){
        System.out.println("Title: " + title + "Autor: " + autor + "Genre: " + genre);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

} //klass ende