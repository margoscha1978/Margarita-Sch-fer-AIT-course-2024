package homework21;
// Разработайте тесты для методов обрабатывающих массивы:
//    поиск индекса минимального (максимального) элемента

public class MinMaxIndex {
    // Метод для поиска индекса минимального элемента в массиве
    public static Integer findMinIndex(int[] arr) {
        if (arr.length == 0) {
            return null; // Обработка пустого массива
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод для поиска индекса максимального элемента в массиве
    public static Integer findMaxIndex(int[] arr) {
        if (arr.length == 0) {
            return null; // Обработка пустого массива
        }
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
