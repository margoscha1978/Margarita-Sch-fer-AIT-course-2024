package lesson_12.ArrayMetods.homework20a;

import homework20a.Utils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    private Utils utils;

    @BeforeEach
    void setUp() {
        utils = new Utils();
    }

    @Test
    void testIsEven() { // четное ли число, проверка
        assertTrue(Utils.isEven(2));
        assertFalse(Utils.isEven(3));
    }

    @Test
    void testCounterIncrement() { // увеличение счетчика
        utils.increment();
        assertEquals(1, utils.getValue());
    }

    @Test
    void testCounterDecrement() { // уменьшение счетчика
        utils.increment();
        utils.decrement();
        assertEquals(0, utils.getValue());
    }

    @Test
    void testStringReverse() { // поворот строки
        assertEquals("cba", Utils.reverse("abc"));
        assertEquals("", Utils.reverse(""));
        assertEquals("a", Utils.reverse("a"));
    }

    @Test
    void testFindMax() { // максимум
        assertEquals(5, Utils.findMax(new int[]{1, 2, 3, 4, 5})); // полный массив
        assertEquals(Integer.MIN_VALUE, Utils.findMax(new int[]{})); // нулевой массив вернет MIN_VALUE
        assertEquals(1, Utils.findMax(new int[]{1})); // массив с одним числом
    }

} // klass ended
