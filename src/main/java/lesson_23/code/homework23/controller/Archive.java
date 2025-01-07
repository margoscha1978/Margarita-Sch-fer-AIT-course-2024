package homework23.controller;

import homework23.model.Dokument;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List<Dokument> documents; // Оголошение списка документов

    // Конструктор
    public Archive() {
        documents = new ArrayList<>(); // Инициализация списка
    }

    public void addDocument(Dokument dokument) {
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

    public boolean displayDocuments() {
        if (documents.isEmpty()) {
            System.out.println("Архив пуст.");
            return false;
        }
        for (Dokument dokument : documents) {
            System.out.println(dokument);
        }

        return false;
    }

    public List<Dokument> getDocuments() {
        return documents; // Возвращаем список документов
    }
}
