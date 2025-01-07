package lesson_12.ArrayMetods.ClassWork24.test_archive;

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

}