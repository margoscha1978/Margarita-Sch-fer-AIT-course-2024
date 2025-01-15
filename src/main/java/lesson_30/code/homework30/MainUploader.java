package homework30;
/*
В методе main():
    Продемонстрируйте загрузку различных файлов и выведите, как они обрабатываются.
 */
public class MainUploader {
    public static void main(String[] args) {
        PhotoUploader photoUploader = new PhotoUploader();
        VideoUploader videoUploader = new VideoUploader();

        // Попытка загрузки разных файлов
        photoUploader.uploadMedia("image.jpg");
        photoUploader.uploadMedia("image.gif");

        videoUploader.uploadMedia("video.mp4");
        videoUploader.uploadMedia("video.avi");
    }
} // klass ended
