package ClassWork24.test_archive.dao;

import ClassWork24.test_archive.model.Dokument;

import java.util.List;

public interface DokumentManager {

    void addDocument(Dokument dokument);

    Dokument findDocumentByUniqueNumber(String uniqueNumber);

    void updateDocument(Dokument dokument);

    void removeDocument(String uniqueNumber);

    List<Dokument> getAllDocuments();

}//klass ende
