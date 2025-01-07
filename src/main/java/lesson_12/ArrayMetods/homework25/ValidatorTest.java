package lesson_12.ArrayMetods.homework25;

import homework25.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    final String cardNumber = "";

    @Test
    void checkCreditCardNumber() {
        Assertions.assertTrue(Validator.checkCreditCardNumber("12345678")); //8 digits
        assertTrue(Validator.checkCreditCardNumber("1234567887654321")); // 16 digits
        assertTrue(Validator.checkCreditCardNumber("1234567890")); // 10 digits
        assertFalse(Validator.checkCreditCardNumber("1234567")); //7 digits
        assertFalse(Validator.checkCreditCardNumber("12345678876543210")); //17 digits
        assertFalse(Validator.checkCreditCardNumber("12345678A")); //symbol A
    }

    @Test
    void checkDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("26.10.2023"));
        assertTrue(Validator.checkDateFormatEU("05.10.2023"));
        assertTrue(Validator.checkDateFormatEU("31.02.2023"));
        assertFalse(Validator.checkDateFormatEU("32.02.2023"));
        assertFalse(Validator.checkDateFormatEU("15.13.2023"));
        assertFalse(Validator.checkDateFormatEU("26/02/2023"));
        assertFalse(Validator.checkDateFormatEU("5.10.2023"));
    }

    @Test
    void checkDateFormatUS() {
        assertTrue(Validator.checkDateFormatUS("10.26.2023"));
        assertTrue(Validator.checkDateFormatUS("10.05.2023"));
        assertTrue(Validator.checkDateFormatUS("03.31.2023"));
        assertFalse(Validator.checkDateFormatUS("02.32.2023"));
        assertFalse(Validator.checkDateFormatUS("13.15.2023"));
        assertFalse(Validator.checkDateFormatUS("02/23/2023"));
        assertFalse(Validator.checkDateFormatUS("10.5.2023"));
    }

    @Test
    void checkPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+108(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+8(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(1)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)123-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)1234-56789"));
    }

    @Test
    void checkLessEquals255() {
        assertTrue(Validator.checkLessEquals255("0"));
        assertTrue(Validator.checkLessEquals255("5"));
        assertTrue(Validator.checkLessEquals255("58"));
        assertTrue(Validator.checkLessEquals255("199"));
        assertTrue(Validator.checkLessEquals255("255"));
        assertFalse(Validator.checkLessEquals255("256"));
        assertFalse(Validator.checkLessEquals255("-5"));
        assertFalse(Validator.checkLessEquals255("b5"));
    }

}//klass ende