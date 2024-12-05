package homework23.Checker;
/*
Тестовое задание 2: Проверка валидации данных пациента
Задание:
Напишите параметризованный тест для метода isValidPatientData(String name, int age, String diagnosis),
который проверяет валидность данных пациента. Валидные данные: • Имя не может быть пустым, null или строкой "null".
• Возраст должен быть от 0 до 120 лет. • Диагноз не может быть пустым или null.
Пример тестовых данных:
@CsvSource({
"John, 30, Flu, true",       // Валидные данные
"'', 30, Flu, false",        // Пустое имя
"John, -1, Flu, false",      // Некорректный возраст
"John, 30, '', false",       // Пустой диагноз
"null, 50, Flu, false",      // null в имени
"Alice, 130, Covid, false"   // Возраст вне диапазона
})
Ожидаемое поведение: Метод возвращает true для валидных данных и false для некорректных.
 */

public class PatientValidator {

    public boolean isValidPatientData(String name, int age, String diagnosis) {
        if (name == null || name.isEmpty() || name.equals("null")) {
            return false; // Имя некорректно
        }
        if (age < 0 || age > 120) {
            return false; // Возраст некорректен
        }
        if (diagnosis == null || diagnosis.isEmpty()) {
            return false; // Диагноз некорректен
        }
        return true; // Все данные корректны
    }
} // klass ended
