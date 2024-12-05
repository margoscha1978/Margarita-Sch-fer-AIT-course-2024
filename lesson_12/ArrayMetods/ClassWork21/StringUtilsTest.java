package ClassWork21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Юнит-тесты для класса StringUtils.
 * Проверяют корректность работы метода concatenate с различными строками.
 *
 * Unit tests for the StringUtils class.
 * Verify the correctness of the concatenate method with different strings.
 */
public class StringUtilsTest {

    /**
     * Проверка, что метод concatenate правильно объединяет две непустые строки.
     *
     * Verifies that the concatenate method correctly concatenates two non-empty strings.
     */
    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenBothStringsNotNullAndNotEmpty() {
        // Arrange: создаем экземпляр класса StringUtils
        // Arrange: create an instance of StringUtils
        StringUtils stringUtils = new StringUtils();

        // Act: вызываем метод concatenate с двумя непустыми строками
        // Act: call the concatenate method with two non-empty strings
        String result = stringUtils.concatenate("Hello", "Java");

        // Assert: проверяем, что результат равен "HelloJava"
        // Assert: verify that the result equals "HelloJava"
        assertEquals("HelloJava", result);

        // Дополнительно проверяем длину результирующей строки
        // Additionally verify the length of the resulting string
        assertEquals(9, result.length());
    }

    /**
     * Проверка, что метод concatenate корректно работает, если вторая строка равна null.
     *
     * Verifies that the concatenate method handles a null second string correctly.
     */
    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenSecondStringsIsNull() {
        // Arrange: создаем экземпляр класса StringUtils
        // Arrange: create an instance of StringUtils
        StringUtils stringUtils = new StringUtils();

        // Act: вызываем метод concatenate с первой строкой и null
        // Act: call the concatenate method with the first string and null
        String result = stringUtils.concatenate("Hello", null);

        // Assert: проверяем, что результат равен "Hello"
        // Assert: verify that the result equals "Hello"
        assertEquals("Hello", result);
    }

    /**
     * Проверка, что метод concatenate корректно работает, если первая строка равна null.
     *
     * Verifies that the concatenate method handles a null first string correctly.
     */
    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenFirstStringsIsNull() {
        // Arrange: создаем экземпляр класса StringUtils
        // Arrange: create an instance of StringUtils
        StringUtils stringUtils = new StringUtils();

        // Act: вызываем метод concatenate с null и второй строкой
        // Act: call the concatenate method with null and the second string
        String result = stringUtils.concatenate(null, "Java");

        // Assert: проверяем, что результат равен "Java"
        // Assert: verify that the result equals "Java"
        assertEquals("Java", result);
    }

    /**
     * Проверка, что метод concatenate корректно работает, если обе строки равны null.
     *
     * Verifies that the concatenate method handles both strings being null correctly.
     */
    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenBothStringsAreNull() {
        // Arrange: создаем экземпляр класса StringUtils
        // Arrange: create an instance of StringUtils
        StringUtils stringUtils = new StringUtils();

        // Act: вызываем метод concatenate с null для обеих строк
        // Act: call the concatenate method with null for both strings
        String result = stringUtils.concatenate(null, null);

        // Assert: проверяем, что результат равен пустой строке
        // Assert: verify that the result equals an empty string
        assertEquals("", result);
    }
}