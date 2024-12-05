package ClassWork21;

import homework21.NumberUtilsNew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsNewTest {

    private NumberUtilsNew numberUtils;

    /**
     * Инициализация объекта NumberUtilsNew перед каждым тестом.
     * Initializes the NumberUtilsNew object before each test.
     */
    @BeforeEach
    public void setup() {
        numberUtils = new NumberUtilsNew(); // Создаём новый экземпляр NumberUtilsNew.
        // Create a new instance of NumberUtilsNew.
    }

    /**
     * Тестирует метод isEven для чётных чисел.
     * Tests the isEven method for even numbers.
     *
     * @param number число, которое должно быть чётным.
     *               The number that must be even.
     */
    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 10, 12, 14, 154}) // Чётные числа для тестирования.
    // Even numbers to test.
    void testIsEvenShouldReturnTrueForEventsNumbers(int number) {

        // Act: Проверяем, является ли число чётным.
        // Act: Check if the number is even.
        boolean evenResult = numberUtils.isEven(number);

        // Assert: Проверяем, что метод возвращает true для чётных чисел.
        // Assert: Verify that the method returns true for even numbers.
        assertTrue(evenResult, number + " must be even");
    }

    /**
     * Тестирует метод isEven для нечётных чисел.
     * Tests the isEven method for odd numbers.
     *
     * @param number число, которое должно быть нечётным.
     *               The number that must be odd.
     */
    @ParameterizedTest
    @ValueSource(ints = {5, 7, 9, 11, 13, 15, 2025}) // Нечётные числа для тестирования.
    // Odd numbers to test.
    void testIsEvenShouldReturnFalseForEventsNumbers(int number) {

        // Act: Проверяем, является ли число чётным.
        // Act: Check if the number is even.
        boolean evenResult = numberUtils.isEven(number);

        // Assert: Проверяем, что метод возвращает false для нечётных чисел.
        // Assert: Verify that the method returns false for odd numbers.
        assertFalse(evenResult, number + " must be not even");
    }
}
