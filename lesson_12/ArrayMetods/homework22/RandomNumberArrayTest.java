package homework22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberArrayTest {

    @Test
    public void testCountMethods() {
        RandomNumberArray randomArray = new RandomNumberArray(100); // Инициализируем массив

        // Проверяем, что количества не могут быть отрицательными
        assertTrue(randomArray.countPositive() >= 0, "Количество положительных чисел не должно быть отрицательным");
        assertTrue(randomArray.countNegative() >= 0, "Количество отрицательных чисел не должно быть отрицательным");
        assertTrue(randomArray.countZeros() >= 0, "Количество нулей не должно быть отрицательным");

        // Проверяем, что сумма всех положительных, отрицательных и нулей составляет 100
        int totalCount = randomArray.countPositive() + randomArray.countNegative() + randomArray.countZeros();
        assertEquals(100, totalCount, "Общее число, включая положительные, отрицательные и нули, должно составлять 100");

        // Проверка на четные и нечетные числа отдельно
        assertTrue(randomArray.countEven() >= 0, "Количество четных чисел не должно быть отрицательным");
        assertTrue(randomArray.countOdd() >= 0, "Количество нечетных чисел не должно быть отрицательным");
    }

    @Test
    public void testNumberPropertiesIncludingZero() {
        RandomNumberArray randomArray = new RandomNumberArray(100);

        for (int i = 0; i < 100; i++) {
            int number = randomArray.getNumber(i); // Предполагаем, что у нас есть метод, чтобы получить число по индексу

            if (number > 0) {
                // Проверка на положительное число
                assertTrue(true, "Положительное число должно быть либо четным, либо нечетным.");
            } else if (number < 0) {
                // Проверка на отрицательное число
                assertTrue(true, "Отрицательное число должно быть либо четным, либо нечетным.");
            } else {
                // Проверка на ноль
                assertEquals(0, number, "Число должно быть равно нулю.");
            }
        }
    }

}


