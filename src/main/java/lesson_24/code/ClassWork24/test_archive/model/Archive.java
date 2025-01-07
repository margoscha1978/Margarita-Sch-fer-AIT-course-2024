package ClassWork24.test_archive.model;
// Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List<Dokument> documents;

    public Archive() {
        documents = new ArrayList<>();
    }

    public void addDocument(Dokument dokument) {
        for (Dokument doc : documents) {
            if (doc.getUniqueNumber().equals(dokument.getUniqueNumber())) {
                System.out.println("Документ с таким уникальным номером уже существует.");
                return;
            }
        }
        documents.add(dokument);
    }

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
