package ClassWork23;

import java.util.ArrayList;

/*
Упражнение 1: Проверка возраста животных
создайте параметризированный тест, который проверяет, является ли возраст животного допустимым.
Предположим, что возраст считается допустимым, если он находится в пределах от 0 до 20 лет.
Упражнение 2: Проверка пород животных
Проверьте, входят ли названия пород животных в список поддерживаемых пород: ["Mops", "Shepherd", "Bulldog"].
 */
public class PetApp {

    //  создать хранилище пород собак лист Array
    ArrayList<String> supportedBreeds = new ArrayList<>();

    public PetApp() { // заполняем список породами собак
        supportedBreeds.add("Mops");
        supportedBreeds.add("Bulldog");
        supportedBreeds.add("Shepperd");
    }

    public boolean isPetAgeValid(int age) {
        // проверяем возраст животного, ноль не возможен ошибка
        if (age <= 0 || age > 20) {
            return false;
        }
        return true;
    }

    public boolean isSupportedBreed(String breed) {
        if (breed == null) {
            return false;
        }
        if (breed.isEmpty()) {
            return false;
        } else if (supportedBreeds.contains(breed)) {
           return true;
        }
        return false;
    }

} // klass ended