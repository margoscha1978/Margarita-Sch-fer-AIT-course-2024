package ClassWork16;

import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        // Создание объекта Book с использованием конструктора, который принимает все параметры
        Book bookProgramming = new Book("Java First", "Schild", 550);
        //System.out.println(bookProgramming); // Можно использовать для вывода информации о книге

        // Создание объекта Book с использованием конструктора по умолчанию
        Book book = new Book();
        //System.out.println(book); // Можно использовать для вывода информации о книге

        // Создание объекта Book с использованием конструктора, принимающего название и автора
        Book bookHarryPotter = new Book("Harry Potter", "J.K. Rowling");
        //System.out.println(bookHarryPotter); // Можно использовать для вывода информации о книге

        // Создание ArrayList для хранения объектов Book
        ArrayList<Book> books = new ArrayList<>();

        // Добавление книг в список
        books.add(book); // Книга, созданная конструктором по умолчанию

        books.add(bookHarryPotter); // Книга, созданная конструктором с двумя параметрами

        books.add(bookProgramming); // Книга, созданная конструктором с тремя параметрами

        // Цикл для вывода количества страниц у каждой книги в списке
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).pages); // Получение и вывод значения поля pages
        }
    }

} // klass ended
