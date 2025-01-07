package lesson_12.ArrayMetods.ClassWork24.test_archive.dao;

import ClassWork24.test_archive.dao.DokumentManager;
import ClassWork24.test_archive.model.Dokument;

import java.util.ArrayList;
import java.util.List;

class ArchiveManagerImplTest {

    public class ArchiveManager implements DokumentManager {
        private List<Dokument> documents = new ArrayList<>();

        @Override
        public void addDocument(Dokument dokument) {
            // Можно добавить проверку на уникальность номера перед добавлением
            documents.add(dokument);
        }

        @Override
        public Dokument findDocumentByUniqueNumber(String uniqueNumber) {
            for (Dokument dokument : documents) {
                if (dokument.getUniqueNumber().equals(uniqueNumber)) {
                    return dokument;
                }
            }
            return null; // Если документ не найден
        }

        @Override
        public void updateDocument(Dokument dokument) {
            for (int i = 0; i < documents.size(); i++) {
                if (documents.get(i).getUniqueNumber().equals(dokument.getUniqueNumber())) {
                    documents.set(i, dokument);
                    return;
                }
            }
            System.out.println("Документ не найден.");
        }

        @Override
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

        @Override
        public List<Dokument> getAllDocuments() {
            return List.of();
        }

    }
}