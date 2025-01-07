package ClassWork23.book_library.controller;

import ClassWork23.book_library.model.Book;

public class Library {

    // fields
    private Book[] books;
    private int size; // текущее кол-во книг


    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods

    // boolean addBook(Book book)
    // size++

    // void printBooks()


    public Book findBook(long isbn){

        Book foundBook = null;

        return foundBook;
    }



    // Book removeBook(long isbn)
    // size--

    // boolean updateBook()


    public int size(){
        return size;
    }

}

