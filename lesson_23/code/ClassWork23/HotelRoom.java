package ClassWork23;

/*
Задание 1: Проверка корректности расчета стоимости номера
Описание:
В классе HotelRoom есть метод calculatePrice(int nights),
который рассчитывает стоимость проживания в номере в зависимости от количества ночей.
Стоимость за одну ночь составляет 100 долларов.
Требуется:
Написать параметризованный тест,
который проверяет корректность расчета стоимости для различных значений nights (1, 2, 5, 10).
Подсказка:
Используйте аннотацию @ValueSource.
 */

import java.util.regex.Pattern;

public class HotelRoom {

    int price = 50;

    public int calculatePrice(int nights){
        if(nights <= 0){
            return -1;
        }
        return price * nights;
    }
    public boolean isValidGuestData(String name, int age){
        if(name == null || name.trim().isEmpty() || name.equals("null")) {
            return false;
        }
        if(age >= 18 && age <= 100) {
            return true;
        }
        return false;
    }

    // "user@example.com",     // валидный
    //"user@",                // невалидный
    //"user@.com",            // невалидный

    public boolean isEmailValid(String email) {
        Pattern EMAIL_PATTERN = Pattern.compile(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

} // klass ended