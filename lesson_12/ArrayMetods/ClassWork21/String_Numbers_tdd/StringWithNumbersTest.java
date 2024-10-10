package ClassWork21.String_Numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; // object

    @BeforeEach
    void setUp() {

        stringWithNumbers = new StringWithNumbers("123 321 10"); // 454
    }

    @Test
    void sumOfNumbersInStringTest(){

        String str = "1 2 1";
        int expected = 4;
        int actual = stringWithNumbers.sumOfNumbersInString(str);
        assertEquals(expected, actual);

    }
}