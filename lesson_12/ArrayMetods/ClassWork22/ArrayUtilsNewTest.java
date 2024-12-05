package ClassWork22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsNewTest {

    /**
     * Проверяет метод findMax, когда массив не пустой.
     * Tests the findMax method when the array is not empty.
     */
    @Test
    void testFindMaxShouldReturnMaxElementWhenArrayIsNotEmpty() {

        // Arrange: создаём объект ArrayUtils и массив с числами.
        // Arrange: create an ArrayUtils object and an array of numbers.
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = new int[] { 1, 2, 3, 4, 10, 5, 6, 7, 8, 9 };
        int maxValueResult = 10; // Ожидаемое максимальное значение.
        // Expected maximum value.

        // Act: вызываем метод findMax для получения максимального значения.
        // Act: call the findMax method to get the maximum value.
        int maxValue = arrayUtils.findMax(array);

        // Assert: проверяем, что возвращённое значение равно ожидаемому.
        // Assert: verify that the returned value matches the expected value.
        assertEquals(maxValueResult, maxValue);
    }

    /**
     * Проверяет метод findMax, когда массив содержит только один элемент.
     * Tests the findMax method when the array has only one element.
     */
    @Test
    void testFindMaxShouldReturnMaxElementWhenArrayHasOneElement() {

        // Arrange: создаём объект ArrayUtils и массив с одним числом.
        // Arrange: create an ArrayUtils object and an array with one number.
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = new int[] { 3 };
        int maxValueResult = 3; // Ожидаемое значение равно единственному элементу массива.
        // Expected value is the only element in the array.

        // Act: вызываем метод findMax.
        // Act: call the findMax method.
        int maxValue = arrayUtils.findMax(array);

        // Assert: проверяем, что возвращённое значение равно ожидаемому.
        // Assert: verify that the returned value matches the expected value.
        assertEquals(maxValueResult, maxValue);
    }

    /**
     * Проверяет метод findMax, когда массив содержит отрицательные числа.
     * Tests the findMax method when the array has negative numbers.
     */
    @Test
    void testFindMaxShouldReturnMaxElementWhenArrayIsNotEmptyHasNegativeElements() {

        // Arrange: создаём объект ArrayUtils и массив с отрицательными числами.
        // Arrange: create an ArrayUtils object and an array with negative numbers.
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = new int[] { -1, -2, -3, -4, -10, -5, -6, -7, -8, -9 };
        int maxValueResult = -1; // Ожидаемое максимальное значение.
        // Expected maximum value.

        // Act: вызываем метод findMax.
        // Act: call the findMax method.
        int maxValue = arrayUtils.findMax(array);

        // Assert: проверяем, что возвращённое значение равно ожидаемому.
        // Assert: verify that the returned value matches the expected value.
        assertEquals(maxValueResult, maxValue);
    }

    /**
     * Проверяет метод findMax, когда массив пустой.
     * Tests the findMax method when the array is empty.
     */
    @Test
    void testFindMaxShouldReturnMaxElementWhenArrayIsEmpty() {

        // Arrange: создаём объект ArrayUtils и пустой массив.
        // Arrange: create an ArrayUtils object and an empty array.
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = new int[] {}; // Пустой массив.
        // Empty array.
        int maxValueResult = Integer.MIN_VALUE; // Ожидаемое значение для пустого массива.
        // Expected value for an empty array.

        // Act: вызываем метод findMax.
        // Act: call the findMax method.
        int maxValue = arrayUtils.findMax(array);

        // Assert: проверяем, что возвращённое значение равно ожидаемому.
        // Assert: verify that the returned value matches the expected value.
        assertEquals(maxValueResult, maxValue);
    }

    /**
     * Проверяет метод findMax, когда массив равен null.
     * Tests the findMax method when the array is null.
     */
    @Test
    void testFindMaxShouldReturnMaxElementWhenArrayIsNull() {

        // Arrange: создаём объект ArrayUtils.
        // Arrange: create an ArrayUtils object.
        ArrayUtils arrayUtils = new ArrayUtils();

        int maxValueResult = Integer.MIN_VALUE; // Ожидаемое значение для null массива.
        // Expected value for a null array.

        // Act: вызываем метод findMax с null.
        // Act: call the findMax method with null.
        int maxValue = arrayUtils.findMax(null);

        // Assert: проверяем, что возвращённое значение равно ожидаемому.
        // Assert: verify that the returned value matches the expected value.
        assertEquals(maxValueResult, maxValue);
    }

}