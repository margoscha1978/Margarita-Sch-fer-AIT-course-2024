package ClassWork16;
/*Упражнение 2: Класс с несколькими конструкторами
	1.	Создайте класс Book, который будет представлять книгу.
        2.	Добавьте следующие поля:
        •	String title — название книги.
        •	String author — автор книги.
        •	int pages — количество страниц в книге.
        3.	Создайте три конструктора:
        •	Конструктор по умолчанию, который устанавливает значения полей по умолчанию:
title = "Неизвестно", author = "Неизвестен", pages = 0.
        •	Конструктор, который принимает только title и author, и устанавливает pages равным 100.
        •	Конструктор, который принимает все три параметра: title, author, pages.
	4.	В методе main создайте объекты Book с использованием каждого из трех конструкторов
и выведите информацию о каждой книге.
*/
public class Book {
    String title;
    String author;
    int pages;

    // Конструктор по умолчанию, который устанавливает значения по умолчанию
    public Book() {
        this.author = "неизвестно"; // название по умолчанию
        this.title = "неизвестно"; // автор по умолчанию
        this.pages = 0; // количество страниц по умолчанию
    }

    // Конструктор, принимающий название и автора, устанавливающий количество страниц равным 100
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.pages = 100;
    }

    // Конструктор, принимающий все три параметра: название, автора и количество страниц
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Переопределенный метод toString для удобного отображения информации о книге
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }

    public void display() {
        System.out.println("Название " + title + "Автор " + author + "объем книги " + pages);

    }

} // klass ended
