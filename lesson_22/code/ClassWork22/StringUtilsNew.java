package ClassWork22;

public class StringUtilsNew {

    /**
     * Переворачивает строку в обратном порядке.
     * Reverses the input string.
     *
     * @param input строка, которую нужно перевернуть.
     *              The string to reverse.
     * @return перевёрнутая строка, или null, если входная строка равна null.
     *         the reversed string, or null if the input string is null.
     *         Если длина строки меньше 2, возвращается сообщение "this action makes no sense".
     *         If the string length is less than 2, returns "this action makes no sense".
     */
    public String reverse(String input) {
        // Проверяем, не равна ли входная строка null.
        // Check if the input string is null.
        if (input == null) {
            return null; // Возвращаем null, если входная строка равна null.
            // Return null if the input string is null.
        }

        // Инициализируем переменную для хранения перевёрнутой строки.
        // Initialize a variable to store the reversed string.
        String reverseString = "";

        // Проверяем длину строки после удаления пробелов с начала и конца.
        // Check the length of the trimmed string.
        if (input.length() > 1) {
            // Перебираем символы строки и добавляем их в обратном порядке.
            // Iterate through the characters of the string and add them in reverse order.
            for (int i = 0; i < input.trim().length(); i++) {
                reverseString = input.trim().charAt(i) + reverseString;
            }
            return reverseString; // Возвращаем перевёрнутую строку.
            // Return the reversed string.
        } else {
            // Если длина строки меньше 2, возвращаем сообщение о бессмысленности действия.
            // If the string length is less than 2, return a message indicating the action is meaningless.
            return "this action makes no sense";
        }
    }
}
