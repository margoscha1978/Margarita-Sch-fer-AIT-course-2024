package ClassWork24.book_library;

import ClassWork24.book_library.controller.Library;
import ClassWork24.book_library.model.Book;

public class LibraryAppl {

    public static void main(String[] args) {

     Book[]  books = new Book[6]; //knigi vnutri biblioteki

     books[0] = new Book("1984","Orwell",1_111_111_111_110L,2010);
     books[1] = new Book("1983","Orweli",1_111_111_111_111L,2011);
     books[2] = new Book("1982","Orwela",1_111_111_111_112L,2012);
     books[3] = new Book("1981","Orwels",1_111_111_111_113L,2013);

        Library library = new Library(6); // novaja biblioteka

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }
        library.printBooks();
        System.out.println(library.size());

        Book newBook = new Book("War and Peace","L.N.Tolstoi",1_111_111_111_114L,1876);
        library.addBook(newBook);
        System.out.println("---------------------------");
        library.printBooks();
        System.out.println(library.size());

        library.removeBook(1_111_111_111_111L); //udaljaem knigu [1]
        System.out.println("----------------------------");

        library.printBooks();
        System.out.println(library.size());

    }

}
