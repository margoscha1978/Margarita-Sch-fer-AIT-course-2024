package ClassWork14;

import java.util.ArrayList;
import java.util.Iterator;

public class ListsInJava {
    public static void main(String[] args) {

        // Создаем список автомобилей
        // Create a list of cars
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("Skoda");
        cars.add("Volkswagen");
        cars.add("Opel");
        cars.add("Peugeot");
        cars.add("Audi"); // Добавляем два раза Audi // Add Audi twice

        // Замена автомобиля на 7-й позиции на Volkswagen
        // Replace the car at index 7 with Volkswagen
        cars.set(7, "Volkswagen");

        // Печатаем весь список автомобилей
        // Print the entire list of cars
        System.out.println(cars);

        // Выводим размер списка, проверяем пустой ли он, и содержит ли список Audi
        // Print the size of the list, check if it's empty, and if it contains "Audi"
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());
        System.out.println(cars.contains("Audi"));

        // Находим индекс первого появления Audi
        // Find the index of the first occurrence of "Audi"
        System.out.println("Index Audi --> " + cars.indexOf("Audi"));

        // Проходим по списку и удаляем Audi, если оно есть
        // Iterate over the list and remove "Audi" if it's found
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + " " + cars.get(i));
            if (cars.get(i).equals("Audi")) {
                cars.remove(i); // Удаление элемента по индексу // Remove element by index
            }
        }

        // Используем итератор для удаления всех оставшихся Audi
        // Use an iterator to remove all remaining "Audi"
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String carInList = iterator.next();
            System.out.println(carInList);
            if (carInList.equals("Audi")) {
                iterator.remove(); // Удаление с помощью итератора // Remove using the iterator
            }
        }

        // Очистка всего списка
        // Clear the entire list
        System.out.println("Clear");
        cars.clear();
        System.out.println(cars.isEmpty()); // Проверяем, что список пуст // Check that the list is empty
        System.out.println(cars); // Печатаем пустой список // Print the empty list

        // Добавляем и удаляем элемент на первой позиции
        // Add and remove an element at the first position
        cars.add(0, "Kia");
        cars.remove(0);

        // Удаляем элемент "Ford" из списка
        // Remove the "Ford" element from the list
        cars.remove("Ford");
    }

} // klass ende

// add(e) добавляет новый элемент в конец списка,расширяет список
// add(int index,E element) добавляет на строго определенную индексом позицию
// remove(int index) удаляет из листа по индексу
// remove (Objekt o) полное удаление объекта
// set(int index, E element) замена элемента,без добавления или убавления заменяет один на другой
// size() вернет количество элементов в листе - список
// isEmpty() проверяет вероятность того,что список пуст
// contais ищет элемент по названи,должна соблюдаться точность при наборе элемента.
// что бы не возникало сложностей с поиском
// clear() полная очистка списка,все стирает
// indexOf(Objekt o) выдает индекс конкретного объекта