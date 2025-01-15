package homework30;
/*
Создайте интерфейс Uploadable с методами:
    void uploadMedia(String filePath).
    Метод по умолчанию checkFileType(String filePath).
 */
public interface Uploadable {
    void uploadMedia(String filePath);
    default String checkFileType(String filePath) {
        return filePath.substring(filePath.lastIndexOf('.') + 1).toLowerCase();
    }
} // interface ended
