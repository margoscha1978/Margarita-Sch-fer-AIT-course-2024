package lesson_37.homework37;
/*
поиск четных чисел в предоставленном List, подробнее...
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Создаем поток, фильтруем четные числа, умножаем их на 2 и собираем в новый список
        List<Integer> doubledEvens = numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтрация четных чисел
                .map(n -> n * 2) // Умножаем на 2
                .collect(Collectors.toList()); // Сбор результата

        System.out.println(doubledEvens); // Выводит: [4, 8, 12]
    }

} // klass ended
