package homework19a;
/*
 Упражнение 1: Логирование списка фотографий
 создаем поле типа ArrayList<Photo> для хранения фотографий.
 - Используем библиотеку логирования, например,java.util.logging.Logger.
 - Определяем методы для добавления, удаления и отображения фотографий.
 - В каждом методе добавляем соответствующие сообщения лога:
        - INFO при добавлении.
        - WARN при удалении по индексу.
        - ERROR при попытке удалить несуществующую фотографию.
        - DEBUG для отображения фотографий.
*/

import java.util.ArrayList;
import java.util.logging.Logger;

public class PhotoAlbum {
    private ArrayList<String> photos;
    private static final Logger logger = Logger.getLogger(PhotoAlbum.class.getName());

    public PhotoAlbum() {
        photos = new ArrayList<>();
    }

    public void addPhoto(String photo) {
        photos.add(photo);
        logger.info("Фото добавлено: " + photo);
    }

    public void removePhoto(int index) {
        if (index < 0 || index >= photos.size()) {
            logger.severe("Ошибка: нет фотографии с таким индексом");
            return;
        }
        String removedPhoto = photos.remove(index);
        logger.warning("Фотография удалена: " + removedPhoto);
    }

    public void displayPhotos() {
        logger.fine("Список фотографий: " + photos);
        for (String photo : photos) {
            System.out.println(photo);
        }

    }

} // klass ended
