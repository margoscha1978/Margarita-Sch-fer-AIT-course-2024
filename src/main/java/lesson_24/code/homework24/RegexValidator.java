package homework24;
//Создайте регулярные выражения для следующих проверок:
// a) Credit card number (8-16 digits)
// b) Date (Format: DD.MM.YYYY)
// c) Date (Format: YYYY-MM-DD)
// d) Phone Number (Format: +99(99)9999-9999)
// e) Number less and equals 255 (positive)
//Убедитесь, что они верные, выполнив тесты - см. regex_validator

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

    public static void main(String[] args) {

        testRegex("12345678", "^(\\d{8,16})$"); // Пример карты
        testRegex("31.12.2021", "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})$"); // Пример даты
        testRegex("2021-12-31", "^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"); // Пример даты
        testRegex("+99(99)9999-9999", "^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$"); // Пример телефона
        testRegex("255", "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"); // Пример числа
    }

    // Метод для проверки строки на соответствие регулярному выражению
    public static boolean validate(String input, String regex) {
        return input.matches(regex);
    }

    private static void testRegex(String input, String regex) {
        boolean isValid = validate(input, regex);
        System.out.println("Input: " + input + " matches: " + isValid);
    }
}