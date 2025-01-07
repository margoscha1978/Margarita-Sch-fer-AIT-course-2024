package ClassWork16;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {
    public static void main(String[] args) {
      // Создаем HashSet с начальной емкостью 100 и коэффициентом загрузки, 0.5f сигнал для увеличения хранилища на 50%
        java.util.HashSet<String> animals = new HashSet<>(100, 0.5f);


        // Объявление строковых переменных
        String fox = "Fox";
        String dog = "Dog";

        // Добавляем элементы в HashSet
        animals.add(dog);
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");
        animals.add("Mouse");
        animals.add(fox);

        // Вывод всех элементов в HashSet
        System.out.println(animals);

        // Удаляем элемент "Cow" из HashSet
        animals.remove("Cow");
        System.out.println(animals);

        // Проверяем, содержится ли "Cow" в HashSet
        boolean cowExists = animals.contains("Cow");
        System.out.println("cowExists: " + cowExists);

        // Определяем количество элементов в HashSet
        int size = animals.size();
        System.out.println("Size: " + size);

        // Проверяем, пустой ли HashSet
        boolean isEmptyAnimals = animals.isEmpty();
        System.out.println("isEmptyAnimals: " + isEmptyAnimals);

        // Перебор элементов HashSet с использованием цикла for-each
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Использование итератора для перебора и удаления элементов
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.equals("Fox")) {
                iterator.remove(); // Удаление элемента "Fox" с помощью итератора
            }
        }

        // Вывод всех элементов после удаления "Fox"
        System.out.println(animals);

        // Очистка HashSet, удаление всех элементов
        animals.clear();
        System.out.println("animals: " + animals); // Пустой HashSet
    }

} // klass ended
// не хранит элементы в порядке их набора, выводит произвольно