package ClassWork23;

public class GuestData {
    /*
Задание 2: Валидация данных гостей
Описание:
Метод isValidGuestData(String name, int age) проверяет, что имя гостя не пустое,
а возраст находится в диапазоне от 18 до 100 лет.
Требуется:
Написать параметризованный тест, который проверяет метод на различных наборах данных:
	•	“Alice”, 25 (валидные данные)
	•	“”, 30 (невалидное имя)
	•	“Bob”, 17 (возраст меньше 18)
	•	“Charlie”, 101 (возраст больше 100)
Подсказка:
Используйте аннотацию @CsvSource.
     */
    public boolean isValidGuestData(String name, int age){ // имя и возраст клиента
        if(name == null || name.isEmpty()) { // нет имени или ноль вместо него
            return false;
        }
        if(age >= 18 && age <= 100) { // границы возраста
            return true;
        }
        return false;
    }

} // klass ended
