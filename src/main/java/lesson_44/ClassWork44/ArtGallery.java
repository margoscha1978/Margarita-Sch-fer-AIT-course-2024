package lesson_44.ClassWork44;

import java.util.ArrayList;
import java.util.List;
/*
Затем создайте класс ArtGallery, который использует Generics для хранения коллекции картин.
Реализуйте методы для добавления картины в коллекцию и вывода всех картин на экран.
 */
// Класс ArtGallery представляет галерею произведений искусства.
// T - это обобщенный тип, который может быть любым типом (например, ArtPiece, ArtStyle и т.д.).
public class ArtGallery<T> {
    // Список для хранения произведений искусства
    private List<T> paintings = new ArrayList<>();

    // Приватный метод для добавления произведения искусства в галерею
    private void addPainting(T painting){
        paintings.add(painting);
    }

    // Метод для вывода всех произведений искусства в галерее
    public void printAllPaintings(){
        // Перебираем все произведения искусства в списке
        for(T painting: paintings){
            System.out.println(painting); // Выводим каждое произведение искусства
        }
    }

} // klass ended
