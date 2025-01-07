package TourismBureauManagementSystem.core;

import java.util.List;

interface Manager<T> {
    void add(T item); // Метод добавления элемента

    List<T> getAll(); // Метод для получения всех элементов

}
