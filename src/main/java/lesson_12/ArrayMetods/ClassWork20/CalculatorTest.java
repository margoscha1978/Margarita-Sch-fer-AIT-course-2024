package lesson_12.ArrayMetods.ClassWork20;

import ClassWork20.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest { // цель теста проверить работу метода add в 3 возможных версиях

    @Test
    public void addTest() { // версия первая оба числа положительные
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int result = a + b;
        assertEquals(8, result);

    }

    @Test
    public void addTest1() { // версия первая оба числа отрицательные
        Calculator calculator = new Calculator();
        int a = -5;
        int b = -3;
        int result = a + b;
        assertEquals(-8, result);

    }
    @Test
    public void addTest2() { // версия первая оба равны нулю
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;
        int result = a + b;
        assertEquals(0, result);

    }

} // klass ended


