package homework30;
/*
PhotoUploader проверяет, что файл имеет расширение jpg или png.
 */
class PhotoUploader implements Uploadable {
    @Override
    public void uploadMedia(String filePath) {
        if (checkFileType(filePath).equals("jpg") || checkFileType(filePath).equals("png")) {
            System.out.println("Загрузка фото: " + filePath);
        } else {
            System.out.println("Неверный тип файла для изображения: " + filePath);
        }
    }
} // klass ended
