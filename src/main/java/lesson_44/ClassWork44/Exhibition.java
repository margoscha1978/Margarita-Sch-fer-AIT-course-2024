package lesson_44.ClassWork44;

import java.util.ArrayList;
import java.util.List;

/*
Реализуйте класс Exhibition, который использует Generics с ограничением,
чтобы хранить только произведения искусства определенного стиля. Добавьте методы
для добавления произведения и вывода всех произведений на экран.
 */

// Класс Exhibition представляет выставку произведений искусства.
// T - это обобщенный тип, который должен быть подклассом Artworks.
public class Exhibition<T extends Artworks> {
    // Список для хранения произведений искусства
    private List<T> artworks = new ArrayList<>();

    // Метод для добавления произведения искусства в выставку.
    // Проверяет, соответствует ли стиль произведения "Impressionism" или "Cubism".
    public void addArtwork(T artwork) {
        if (artwork.getStyle().equals("Impressionism") || artwork.getStyle().equals("Cubism")) {
            artworks.add(artwork); // Добавляем произведение, если стиль подходит
        } else {
            System.out.println("Wrong style"); // Выводим сообщение, если стиль не подходит
        }
    }

    // Метод для вывода всех произведений искусства в выставке.
    public void printAllArtworks() {
        for (T artwork : artworks) {
            System.out.println(artwork); // Выводим информацию о каждом произведении
        }
    }

} // klass ended
