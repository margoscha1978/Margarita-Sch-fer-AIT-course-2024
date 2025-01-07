package ClassWork22;

public class ArrayUtils {
    /**
     * Finds the maximum value in an array of integers.
     *
     * @param numbers массив целых чисел, из которого нужно найти максимальное значение.
     *                Может быть null или пустым.
     *                <p>
     *                The array of integers from which to find the maximum value.
     *                It can be null or empty.
     * @return максимальное значение в массиве. Если массив null или пустой, возвращает Integer.MIN_VALUE.
     * <p>
     * The maximum value in the array. If the array is null or empty, returns Integer.MIN_VALUE.
     */
    public int findMax(int[] numbers) {
        // Проверяем, является ли массив null или пустым.
        // Check if the array is null or empty.
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty or null"); // Сообщаем пользователю, что массив пуст или равен null.
            // Inform the user that the array is empty or null.
            return Integer.MIN_VALUE; // Возвращаем минимальное значение Integer, чтобы обозначить ошибку.
            // Return Integer.MIN_VALUE to indicate an error.
        }

        // Инициализируем максимальное значение первым элементом массива.
        // Initialize the maximum value with the first element of the array.
        int max = numbers[0];

        // Перебираем элементы массива.
        // Iterate through the elements of the array.
        for (int number : numbers) {
            // Если текущий элемент больше текущего максимума, обновляем максимальное значение.
            // If the current element is greater than the current maximum, update the maximum value.
            if (number > max) {
                max = number;
            }
        }

        // Возвращаем максимальное значение.
        // Return the maximum value.
        return max;
    }
}
