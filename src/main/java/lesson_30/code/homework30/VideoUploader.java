package homework30;
/*
VideoUploader проверяет, что файл имеет расширение mp4 или mov.
 */
class VideoUploader implements Uploadable {
    @Override
    public void uploadMedia(String filePath) {
        if (checkFileType(filePath).equals("mp4") || checkFileType(filePath).equals("mov")) {
            System.out.println("Загрузка видео: " + filePath);
        } else {
            System.out.println("Неверный тип файла для видео: " + filePath);
        }
    }
} // klass ended
