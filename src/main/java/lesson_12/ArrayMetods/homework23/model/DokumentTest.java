package lesson_12.ArrayMetods.homework23.model;

import homework23.controller.Archive;
import homework23.model.Dokument;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DokumentTest {
    @Nested
    class ArchiveTest {

        @Test
        public void testAddAndDisplayDocuments() {
            Archive archive = new Archive();
            Dokument doc = new Dokument("1234567890", "Тестовый документ", "Автор");

            archive.addDocument(doc);

            // Здесь можно добавить метод для проверки, выводит ли архив нужные данные
            assertFalse(archive.displayDocuments());// нужно ли это изменить в зависимости от вашей реализации
        }

        @Test
        public void testRemoveDocument() {
            Archive archive = new Archive();
            Dokument doc = new Dokument("1234567890", "Документ для удаления", "Автор");

            archive.addDocument(doc); // Добавляем документ в архив
            archive.removeDocument("1234567890"); // Удаляем документ

            // Проверяем, что документ действительно удален
            boolean isDocumentPresent = archive.getDocuments().stream().anyMatch(dokument -> dokument.getUniqueNumber().equals("1234567890"));
            assertFalse(isDocumentPresent); // Проверяем, что документ отсутствует
        }
      }
    }