package lesson_12.ArrayMetods.homework21;

import homework21.FindMinMax;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinMaxTest {

    @Test
    void findMin() {
        assertEquals(1, FindMinMax.findMin(new int[]{3, 1, 4, 1, 5, 9}));
        assertNull(FindMinMax .findMin(new int[]{}));
        assertEquals(-5, FindMinMax.findMin(new int[]{-1, -5, -3}));
    }

    @Test
    void findMax() {
        assertEquals(9, FindMinMax .findMax(new int[]{3, 1, 4, 1, 5, 9}));
        assertNull(FindMinMax .findMax(new int[]{}));
        assertEquals(-1, FindMinMax.findMax(new int[]{-1, -5, -3}));
    }
}