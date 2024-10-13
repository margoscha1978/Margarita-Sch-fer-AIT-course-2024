package homework22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMetodsTest {

    private ArrayMetods arrayMethods; // Объявляем переменную для тестируемого класса
    private int[] sampleArray; // Массив для тестирования

    @BeforeEach
    public void setUp() {
        arrayMethods = new ArrayMetods(); // Инициализируем ArrayMethods перед каждым тестом
        sampleArray = new int[]{1, 2, 3, 4, 5, 6, 7}; // Создаем тестовый массив
    }

    @Test
    public void testSumOddIndexElements() {
        // Тестируем метод суммы элементов с нечетными индексами
        int expectedSum = 12; // Ожидаемая сумма (2 + 4 + 6)
        int actualSum = arrayMethods.sumOddIndexElements(sampleArray);
        assertEquals(expectedSum, actualSum, "Сумма элементов с нечетными индексами должна быть 12");
        // Проверяем результат
    }

    @Test
    public void testFindFifthElement() {
        // Тестируем метод нахождения 5-го элемента
        int expectedElement = 5; // Ожидаемый 5-й элемент
        int actualElement = arrayMethods.findFifthElement(sampleArray);
        assertEquals(expectedElement, actualElement, "5-й элемент должен быть 5");
        // Проверяем результат
    }

    @Test
    public void testFindFifthElementWithInsufficientLength() {
        // Тестируем метод нахождения 5-го элемента с недостаточно длинным массивом
        int[] shortArray = new int[]{1, 2, 3}; // Массив с недостатком элементов
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayMethods.findFifthElement(shortArray); // Проверяем, что метод выбрасывает исключение
        });
        assertTrue(exception.getMessage().contains("Массив должен содержать минимум 5 элементов."));
        // Проверяем сообщение исключения

    }

}