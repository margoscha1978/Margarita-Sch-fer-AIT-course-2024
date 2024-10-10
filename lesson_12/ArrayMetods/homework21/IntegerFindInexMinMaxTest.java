package homework21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerFindInexMinMaxTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findMinIndex() {
            assertEquals(1, FindMinMax.findMin(new int[]{3, 1, 4, 1, 5, 9}) );
            assertNull(MinMaxIndex.findMinIndex(new int[]{}));
            assertEquals(1, MinMaxIndex.findMinIndex(new int[]{-1, -5, -3}));
    }

    @Test
    void findMaxIndex() {
        assertEquals(5, MinMaxIndex.findMaxIndex(new int[]{3, 1, 4, 1, 5, 9}));
        assertNull(MinMaxIndex.findMaxIndex(new int[]{}));
        assertEquals(0, MinMaxIndex.findMaxIndex(new int[]{-1, -5, -3}));

    }
}