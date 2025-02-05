package lesson_35.consultation;
/*
3. Создайте класс `ArtGallery`, который управляет коллекцией произведений искусства.
     - Используйте `Map<String, String> artworks` для хранения пар "Название произведения – Имя художника".
     - Метод `addArtwork(String title, String artist)`:
     - Проверяет входные данные.
     - В случае некорректных данных выбрасывает `InvalidArtworkDataException`.
     - Метод `findArtwork(String title)`:
     - Ищет произведение по названию.
     - Если не найдено, выбрасывает `ArtworkNotFoundException`.
 */
import java.util.Map;

public class ArtGallery {
    Map<String,String> artworks = new java.util.HashMap<>();

    public void addArtwork(String title, String artist){
        if(title == null || title.isEmpty()){
            throw new InvalidArtworkDataException("Title cannot be empty or null");
        }
        else if(artist == null || artist.isEmpty()){
            throw new InvalidArtworkDataException("Artist cannot be empty or null");
        }
        else {
            artworks.put(title, artist);
            System.out.println("Art was added. " + title + " by " + artist);
        }

    }

    public String findArtwork(String title) throws ArtworkNotFoundException{
        if(title == null || title.isEmpty()){
            throw new InvalidArtworkDataException("Title cannot be empty or null");
        }
        else if(artworks.containsKey(title)){
            return artworks.get(title);
        }
        else {
            throw new ArtworkNotFoundException("Art was not fond: " + title);
        }
    }

    public Map<String, String> getArtworks() {
        return new java.util.HashMap<>(artworks);
    }

} // klass ended
