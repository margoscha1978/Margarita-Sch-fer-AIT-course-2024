package homework21;

public class NumberUtilsNew {
    /**
     * Проверяет, является ли число чётным.
     * Checks if a number is even.
     *
     * @param number число для проверки.
     *               The number to check.
     * @return true, если число чётное; false, если нечётное.
     *         true if the number is even; false if it is odd.
     */
    public boolean isEven(int number) {
        // Проверяем, делится ли число на 2 без остатка.
        // Check if the number is divisible by 2 without a remainder.
        return number % 2 == 0;
    }
}
