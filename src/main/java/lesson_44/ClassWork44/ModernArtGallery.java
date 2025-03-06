package lesson_44.ClassWork44;

import java.util.ArrayList;
import java.util.List;

/*
Создаем класс ModernArtGallery, который использует Generics с ограничением, чтобы хранить только произведения искусства,
созданные после 1900 года. Реализуйте методы для добавления произведения и вывода всех произведений на экран.
 */
// Класс ModernArtGallery представляет галерею современного искусства.
// T - это обобщенный тип, который должен быть подклассом ArtPiece.
public class ModernArtGallery<T extends ArtPiece> {
    // Список для хранения произведений искусства
    private List<T> artPieces = new ArrayList<>();

    // Приватный метод для добавления произведения искусства в галерею.
    // Проверяет, что произведение создано не раньше 1900 года.
    public void addArtPiece(T artPiece) {
        if (artPiece.getYear() >= 1900) {
            artPieces.add(artPiece); // Добавляем произведение, если оно современное
        } else {
            System.out.println("Is too old"); // Выводим сообщение, если произведение слишком старое
        }
    }

    // Метод для вывода всех произведений искусства в галерее.
    public void printAllArtPieces() {
        for (T artPiece : artPieces) {
            System.out.println(artPiece); // Выводим информацию о каждом произведении
        }
    }

} // klass ended

