package lesson_35.consultation;
/*
1. Создайте класс `ArtworkNotFoundException`, который наследуется от `Exception`.
   - Выбрасывается, если запрашиваемое произведение искусства отсутствует в каталоге.
 */

// Выбрасывается, если запрашиваемое произведение искусства отсутствует в каталоге.
public class ArtworkNotFoundException extends Exception {
  public ArtworkNotFoundException(String message) {
    super(message);
  }

} // klass ended
