package lesson_12.ArrayMetods.ClassWork22;

import ClassWork22.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsNewTest {
    /**
     * Проверяет метод reverse для обычной строки.
     * Tests the reverse method for a normal string.
     */
    @Test
    void testReverseShouldReturnReversedStringWhenInputIsNormalString() {
        // Arrange: создаём объект StringUtils и задаём входную строку.
        // Arrange: create a StringUtils object and define the input string.
        StringUtils stringUtils = new StringUtils();
        String testString = "Hello"; // Входная строка.
        // Input string.
        String resultString = "olleH"; // Ожидаемая строка.
        // Expected string.

        // Act: вызываем метод reverse.
        // Act: call the reverse method.
        String result = stringUtils.reverse(testString);

        // Assert: проверяем, что результат соответствует ожидаемой строке.
        // Assert: verify that the result matches the expected string.
        assertEquals(resultString, result);
    }

    /**
     * Проверяет метод reverse для пустой строки.
     * Tests the reverse method for an empty string.
     */
    @Test
    void testReverseShouldReturnReversedStringWhenInputIsEmptyString() {
        // Arrange: создаём объект StringUtils и задаём пустую строку.
        // Arrange: create a StringUtils object and define an empty string.
        StringUtils stringUtils = new StringUtils();
        String testString = ""; // Входная строка.
        // Input string.
        String resultString = "this action makes no sense"; // Ожидаемая строка.
        // Expected string.

        // Act: вызываем метод reverse.
        // Act: call the reverse method.
        String result = stringUtils.reverse(testString);

        // Assert: проверяем, что результат соответствует ожидаемой строке.
        // Assert: verify that the result matches the expected string.
        assertEquals(resultString, result);
    }

    /**
     * Проверяет метод reverse для строки из одного символа.
     * Tests the reverse method for a one-character string.
     */
    @Test
    void testReverseShouldReturnReversedStringWhenInputIsOneCharacterString() {
        // Arrange: создаём объект StringUtils и задаём строку из одного символа.
        // Arrange: create a StringUtils object and define a one-character string.
        StringUtils stringUtils = new StringUtils();
        String testString = "a"; // Входная строка.
        // Input string.
        String resultString = "this action makes no sense"; // Ожидаемая строка.
        // Expected string.

        // Act: вызываем метод reverse.
        // Act: call the reverse method.
        String result = stringUtils.reverse(testString);

        // Assert: проверяем, что результат соответствует ожидаемой строке.
        // Assert: verify that the result matches the expected string.
        assertEquals(resultString, result);
    }

    /**
     * Проверяет метод reverse для null.
     * Tests the reverse method for null input.
     */
    @Test
    void testReverseShouldReturnReversedStringWhenInputIsNull() {
        // Arrange: создаём объект StringUtils и задаём null.
        // Arrange: create a StringUtils object and define null as input.
        StringUtils stringUtils = new StringUtils();
        String testString = null; // Входная строка.
        // Input string.
        String resultString = null; // Ожидаемая строка.
        // Expected string.

        // Act: вызываем метод reverse.
        // Act: call the reverse method.
        String result = stringUtils.reverse(testString);

        // Assert: проверяем, что результат соответствует ожидаемой строке.
        // Assert: verify that the result matches the expected string.
        assertEquals(resultString, result);
    }

    /**
     * Проверяет метод reverse для палиндрома.
     * Tests the reverse method for a palindrome string.
     */
    @Test
    void testReverseShouldReturnReversedStringWhenInputIsPalindrome() {
        // Arrange: создаём объект StringUtils и задаём строку-палиндром.
        // Arrange: create a StringUtils object and define a palindrome string.
        StringUtils stringUtils = new StringUtils();
        String testString = "ABBcBBA"; // Входная строка.
        // Input string.
        String resultString = "ABBcBBA"; // Ожидаемая строка.
        // Expected string.

        // Act: вызываем метод reverse.
        // Act: call the reverse method.
        String result = stringUtils.reverse(testString);

        // Assert: проверяем, что результат соответствует ожидаемой строке.
        // Assert: verify that the result matches the expected string.
        assertEquals(resultString, result);
    }


}