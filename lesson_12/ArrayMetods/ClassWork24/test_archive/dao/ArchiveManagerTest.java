package ClassWork24.test_archive.dao;

import ClassWork24.test_archive.model.Dokument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArchiveManagerTest {

    private ArchiveManager archiveManager;

    @BeforeEach
    public void setUp() {
        archiveManager = new ArchiveManager();
    }

    @Test
    public void testAddDocument() {
        Dokument dokument = new Dokument("1234567890", "Заголовок", "Автор");
        archiveManager.addDocument(dokument);
        assertEquals(1, archiveManager.getAllDocuments().size());
    }

    @Test
    public void testFindDocumentByUniqueNumber() {
        Dokument dokument = new Dokument("1234567890", "Заголовок", "Автор");
        archiveManager.addDocument(dokument);
        Dokument foundDokument = archiveManager.findDocumentByUniqueNumber("1234567890");
        assertNotNull(foundDokument);
        assertEquals("Заголовок", foundDokument.getTitle());
    }

    @Test
    public void testRemoveDocument() {
        Dokument dokument = new Dokument("1234567890", "Заголовок", "Автор");
        archiveManager.addDocument(dokument);
        archiveManager.removeDocument("1234567890");
        assertEquals(0, archiveManager.getAllDocuments().size());
    }

    @Test
    public void testUpdateDocument() {
        Dokument dokument = new Dokument("1234567890", "Заголовок", "Автор");
        archiveManager.addDocument(dokument);
        dokument.setTitle("Новый Заголовок");
        archiveManager.updateDocument(dokument);
        assertEquals("Новый Заголовок", archiveManager.findDocumentByUniqueNumber("1234567890").getTitle());
    }

}