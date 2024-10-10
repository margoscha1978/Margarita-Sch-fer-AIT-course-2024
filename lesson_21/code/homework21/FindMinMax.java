package homework21;
//Разработайте тесты для методов обрабатывающих массивы:
//    поиск минимального (максимального) элемента

public class FindMinMax {
    // Метод для поиска минимального элемента в массиве
    public static Integer findMin(int[] arr) {
        if (arr.length == 0) {
            return null; // Обработка пустого массива
        }
        int minElement = arr[0];
        for (int number : arr) {
            if (number < minElement) {
                minElement = number;
            }
        }
        return minElement;
    }

    // Метод для поиска максимального элемента в массиве
    public static Integer findMax(int[] arr) {
        if (arr.length == 0) {
            return null; // Обработка пустого массива
        }
        int maxElement = arr[0];
        for (int number : arr) {
            if (number > maxElement) {
                maxElement = number;
            }
        }
        return maxElement;
    }

}
