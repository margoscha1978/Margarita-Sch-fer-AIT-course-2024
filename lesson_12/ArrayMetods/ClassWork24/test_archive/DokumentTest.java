package ClassWork24.test_archive;

import ClassWork24.book_library.controller.Library;
import ClassWork24.book_library.model.Book;
import ClassWork24.test_archive.model.Dokument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DokumentTest {


    @Test
    void testValidDocumentCreation() {
        Dokument dokument = new Dokument("1234567890", "Title", "Author");
        assertEquals("1234567890", dokument.getUniqueNumber());
        assertEquals("Title", dokument.getTitle());
        assertEquals("Author", dokument.getAuthor());
    }

    @Test
    void testInvalidUniqueNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Dokument("12345", "Title", "Author");
        });
        assertEquals("Уникальный номер документа должен содержать ровно 10 цифр.", exception.getMessage());
    }

    @Test
    void testInvalidTitle_shouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Dokument("1234567890", "", "Author");
        });
        assertEquals("Заголовок не может быть пустым.", exception.getMessage());
    }

    @Test
    void testInvalidAuthor_shouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Dokument("1234567890", "Title", "");
        });
        assertEquals("Автор не может быть пустым.", exception.getMessage());
    }

    @Test
    void testSetTitle() {
        Dokument dokument = new Dokument("1234567890", "Initial Title", "Author");
        dokument.setTitle("New Title");
        assertEquals("New Title", dokument.getTitle());
    }

    @Test
    void testSetEmptyTitle_shouldThrowException() {
        Dokument dokument = new Dokument("1234567890", "Title", "Author");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dokument.setTitle("");
        });
        assertEquals("Заголовок не может быть пустым.", exception.getMessage());
    }

    @Test
    void testSetAuthor() {
        Dokument dokument = new Dokument("1234567890", "Title", "Initial Author");
        dokument.setAuthor("New Author");
        assertEquals("New Author", dokument.getAuthor());
    }

    @Test
    void testSetEmptyAuthor_shouldThrowException() {
        Dokument dokument = new Dokument("1234567890", "Title", "Author");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dokument.setAuthor("");
        });
        assertEquals("Автор не может быть пустым.", exception.getMessage());
    }

    static class LibraryTest {

       Library library;

        Book[] books;
        int size = 0;

        @BeforeEach
        void setUp() {

            library = new Library(5);

            books = new Book[5];

            books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
            books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
            books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
            books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

            // TODO
            //положить объекты в массив, который "внутри" объекта library
            for (int i = 0; i < books.length - 1; i++) { // пока только 4 книги (size = 4) "кладем" в library
                library.addBook(books[i]);
            }

        }

        // method addBook : boolean (true, false)

        @Test
        void addBookTest(){
            // - не добавлять null
            assertFalse(library.addBook(null));
            //  - не добавлять дубликат
            assertFalse(library.addBook(books[2]));
            // добавляем еще одну новую
            Book newBook = new Book("T4", "A4", 1_111_111_111_114L, 2024);
            assertTrue(library.addBook(newBook));
            assertEquals(5, library.size());
            // добавляем еще одну сверх capacity
            Book oneMoreBook = new Book("T5", "A5", 1_111_111_111_115L, 2024);
            assertFalse(library.addBook(oneMoreBook));

        }

        @Test
        void findBookTest(){
            Book foundBook = library.findBook(1_111_111_111_110L);
            assertEquals( books[0], library.findBook(1_111_111_111_110L)); // find existed book
            assertNull(library.findBook(1_111_111_111_119L)); // find absent book
            //
        }

        @Test
        void removeBookTest(){
            // remove existed book
            assertEquals(books[0], library.removeBook(1_111_111_111_110L));
            assertEquals( 3, library.size());
            // remove absent book
            assertNull(library.removeBook(1_111_111_111_119L));
        }


        @Test
        void sizeTest(){
            assertEquals(4, library.size());
        }

        @Test
        void printBooksTest(){
            System.out.println("=========================");
            library.printBooks();
        }

    }
}