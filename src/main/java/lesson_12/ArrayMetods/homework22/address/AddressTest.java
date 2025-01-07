package lesson_12.ArrayMetods.homework22.address;

import homework22.address.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    public void testCityValidation() {
        // Позитивные случаи
        Address address1 = new Address("Москва", "12345");
        assertTrue(address1.isCityValid(), "Город должен быть с заглавной буквы");

        // Негативные случаи
        Address address2 = new Address("москва", "12345");
        assertFalse(address2.isCityValid(), "Город должен начинаться с заглавной буквы");

        Address address3 = new Address("", "12345");
        assertFalse(address3.isCityValid(), "Город не может быть пустым");

        Address address4 = new Address(null, "12345");
        assertFalse(address4.isCityValid(), "Город не может быть null");
    }

    @Test
    public void testPostalCodeValidation() {
        // Позитивные случаи
        Address address1 = new Address("München", "12345");
        assertTrue(address1.isPostalCodeValid(), "Индекс должен состоять из 5 цифр");

        // Негативные случаи
        Address address2 = new Address("München", "1234a");
        assertFalse(address2.isPostalCodeValid(), "Индекс должен содержать 5 цифр");

        Address address3 = new Address("München", "123*56");
        assertFalse(address3.isPostalCodeValid(), "Индекс должен содержать 5 цифр");

        Address address4 = new Address("München", "a3c7?");
        assertFalse(address4.isPostalCodeValid(), "Индекс должен состоять только из цифр");

        Address address5 = new Address("München", null);
        assertFalse(address5.isPostalCodeValid(), "Индекс не может быть null");
    }
}


