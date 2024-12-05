package homework23.Checker;

/*
Тестовое задание 3: Проверка распределения пациентов по палатам
Задание:
Создайте параметризованный тест для метода assignRoom(String patientName, String condition),
 который распределяет пациента в палату в зависимости от диагноза:
 • "ICU" (Intensive Care Unit) — для критических диагнозов.
 • "General" — для некритических.
 • "Isolation" — для инфекционных болезней.
Пример тестовых данных:
@CsvSource({
"John, Critical, ICU",          // Критическое состояние
"Alice, Infectious, Isolation", // Инфекционное заболевание
"Bob, General, General",        // Некритическое состояние
"Emma, null, General",          // Отсутствие диагноза — General
"'', General, General"          // Отсутствие имени игнорируется, палата General
})
Ожидаемое поведение: Метод возвращает название палаты в зависимости от диагноза пациента.
 */

public class RoomAssigner {

    public String assignRoom(String patientName, String condition) {
        if ("Critical".equals(condition)) {
            return "ICU";
        } else if ("Infectious".equals(condition)) {
            return "Isolation";
        } else {
            return "General"; // Некритические состояния или отсутствие диагноза
        }
    }

} // klass ended
