package homework24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexValidationTest {

    // Метод для проверки соответствия строки регулярному выражению
    private boolean validate(String input, String regex) {
        return input.matches(regex);
    }

    @Test
    public void testCreditCardNumber() {
        String regex = "^\\d{8,16}$";
        assertTrue(validate("12345678", regex));
        assertTrue(validate("1234567890123456", regex));
        assertFalse(validate("123", regex)); // Меньше 8 цифр
        assertFalse(validate("12345678901234567", regex)); // Больше 16 цифр
    }

    @Test
    public void testDateDDMMYYYY() {
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})$";
        assertTrue(validate("31.12.2021", regex));
        assertFalse(validate("32.01.2021", regex)); // Неверный день
        assertFalse(validate("31.13.2021", regex)); // Неверный месяц
    }

    @Test
    public void testDateYYYYMMDD() {
        String regex = "^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        assertTrue(validate("2021-12-31", regex));
        assertFalse(validate("2021-13-31", regex)); // Неверный месяц
    }

    @Test
    public void testPhoneNumber() {
        String regex = "^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$";
        assertTrue(validate("+99(99)9999-9999", regex));
        assertFalse(validate("+99(99)9999", regex)); // Пропущен дефис
    }

    @Test
    public void testNumberLessThan255() {
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        assertTrue(validate("255", regex));
        assertTrue(validate("0", regex));
        assertFalse(validate("256", regex)); // Больше 255
    }
}
