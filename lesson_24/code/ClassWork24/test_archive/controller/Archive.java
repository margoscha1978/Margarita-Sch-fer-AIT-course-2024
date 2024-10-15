package ClassWork24.test_archive.controller;
// Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр

import ClassWork24.test_archive.model.Dokument;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    public class Archve {
        private List<Dokument> documents; // Объявление списка документов

        // Конструктор
        public Archve() {
            documents = new ArrayList<>(); // Инициализация списка
        }

        // Метод для добавления документа
        public void addDocument(Dokument dokument) {
            // Проверка на наличие документа с тем же уникальным номером
            for (Dokument doc : documents) {
                if (doc.getUniqueNumber().equals(dokument.getUniqueNumber())) {
                    System.out.println("Документ с таким уникальным номером уже существует.");
                    return;
                }
            }
            documents.add(dokument);
        }

        // Метод для удаления документа
        public void removeDocument(String uniqueNumber) {
            Dokument documentToRemove = null;
            for (Dokument dokument : documents) {
                if (dokument.getUniqueNumber().equals(uniqueNumber)) {
                    documentToRemove = dokument;
                    break;
                }
            }
            if (documentToRemove != null) {
                documents.remove(documentToRemove);
            } else {
                System.out.println("Документ не найден.");
            }
        }

        // Метод для отображения документов
        public void displayDocuments() {
            if (documents.isEmpty()) {
                System.out.println("Архив пуст.");
                return;
            }

            for (Dokument dokument : documents) {
                System.out.println(dokument);
            }
        }
    }
}