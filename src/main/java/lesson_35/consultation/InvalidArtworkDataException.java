package lesson_35.consultation;
/*
2. Создайте класс `InvalidArtworkDataException`, который наследуется от `IllegalArgumentException`.
   - Выбрасывается, если предоставлены некорректные данные для произведения искусства
   (пустое название или имя художника).
 */

// Выбрасывается, если предоставлены некорректные данные
// для произведения искусства (пустое название или имя художника).
public class InvalidArtworkDataException  extends IllegalArgumentException
{
    public InvalidArtworkDataException(String message)
    {
        super(message);
    }

} // klass ended
