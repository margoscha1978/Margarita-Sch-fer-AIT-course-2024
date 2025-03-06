package lesson_44.ClassWork44;

import java.util.ArrayList;
import java.util.List;
/*
Затем создайте класс `Museum`, который использует Generics для хранения коллекции произведений искусства.
Реализуйте методы для добавления экспоната и вывода всех экспонатов на экран.
 */
class Museum<T extends Artwork> {
    private List<T> exhibits = new ArrayList<>();

    public void addExhibit(T exhibit) {
        exhibits.add(exhibit);
    }

    public void displayExhibits() {
        for (T exhibit : exhibits) {
            System.out.println(exhibit.getDescription());
        }
    }

} // klass ended
