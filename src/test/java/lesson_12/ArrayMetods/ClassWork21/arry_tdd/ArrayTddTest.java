package lesson_12.ArrayMetods.ClassWork21.arry_tdd;

import ClassWork21.arry_tdd.ArrayTdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {

    ArrayTdd arrayTdd;
    int[] array = {10, -10, 20,-15, 45, 23,47};//zadali massiv

    @BeforeEach
    void setUp() {
        arrayTdd = new ArrayTdd(array);
    }

    @Test
    void countPositive() {
     //expected
    int expected = 5;
     //actual
    int actual = arrayTdd.countPositive(array);

    assertEquals(actual, expected, "ok");

    }

}