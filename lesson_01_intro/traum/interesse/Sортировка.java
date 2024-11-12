package interesse;

import java.util.Arrays;
import java.util.Comparator;

public class Sортировка {
    // Отсортируйте массив по значению в порядке возрастания и убывания.
    // Для сортировки массива по значению в порядке возрастания и убывания в Java можно использовать методы сортировки,
    // доступные в Java Arrays классе. Для сортировки по возрастанию используется метод Arrays.sort(),
    // а для сортировки по убыванию можно воспользоваться классом Comparator и методом Arrays.sort():

    public class ArraySorting {
        public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 3};

            // Сортировка массива по возрастанию
            Arrays.sort(array);

            System.out.println("Массив, отсортированный по возрастанию:");
            for (int num : array) {
                System.out.print(num + " ");
            }

            // Сортировка массива по убыванию
            Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
            Arrays.sort(boxedArray, Comparator.reverseOrder());

            System.out.println("\nМассив, отсортированный по убыванию:");
            for (int num : boxedArray) {
                System.out.print(num + " ");
            }
        }
    }
}
