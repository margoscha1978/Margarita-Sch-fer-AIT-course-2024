package homework23.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the HospitalApp application.
 * This class contains parameterized tests for verifying the functionality of methods
 * in the HospitalApp class.
 * <p>
 * Тестовый класс для приложения HospitalApp.
 * Класс содержит параметризованные тесты для проверки функциональности методов
 * класса HospitalApp.
 */
public class HospitalAppTest {

    private HospitalApp hospitalApp;

    /**
     * Sets up the test environment by initializing the HospitalApp instance.
     * <p>
     * Настройка тестовой среды и инициализация экземпляра HospitalApp.
     */
    @BeforeEach
    public void setup() {
        hospitalApp = new HospitalApp();
    }

    /**
     * Tests the calculateHospitalStayCost method with various inputs to ensure it returns the correct costs.
     * <p>
     * Тестирует метод calculateHospitalStayCost с различными входными данными, чтобы убедиться,
     * что он возвращает корректную стоимость.
     *
     * @param days         Number of days (количество дней)
     * @param expectedCost Expected cost for the given number of days (ожидаемая стоимость)
     */
    @ParameterizedTest
    @CsvSource({
            "1, 100",  // 1 день - 100 евро
            "2, 180",  // 1 день 100 евро + 80 евро
            "5, 420",  // 1 день 100 евро + 4*80 евро
            "0, -1",   // Некорректное количество дней
            "-1, -1"   // Некорректное количество дней
    })
    void testCalculateHospitalStayCostShouldReturnCostsForAllDays(int days, int expectedCost) {
        // Act: Call the method to calculate hospital stay cost
        // Выполняем: Вызов метода для расчёта стоимости
        int resultTestCosts = hospitalApp.calculateHospitalStayCost(days);

        // Assert: Verify the result matches the expected cost
        // Проверяем: Убедиться, что результат соответствует ожидаемой стоимости
        assertEquals(expectedCost, resultTestCosts);
    }

    /**
     * Tests the isValidPatientData method to validate different combinations of patient data.
     * <p>
     * Тестирует метод isValidPatientData для проверки различных комбинаций данных пациента.
     *
     * @param name           Name of the patient (имя пациента)
     * @param age            Age of the patient (возраст пациента)
     * @param diagnosis      Diagnosis of the patient (диагноз пациента)
     * @param expectedResult Expected validation result (ожидаемый результат проверки)
     */
    @ParameterizedTest
    @CsvSource({
            "John, 30, Flu, true",       // Валидные данные
            "'', 30, Flu, false",        // Пустое имя
            "John, -1, Flu, false",      // Некорректный возраст
            "John, 30, '', false",       // Пустой диагноз
            "null, 50, Flu, false",      // null в имени
            "Alice, 130, Covid, false", // Возраст вне диапазона
            ", 45, Covid, false ",      // null в имени
            "John, 30, , false",        // null в диагнозе
    })
    void testIsValidPatientDataShouldReturnResultForAllDates(String name, int age, String diagnosis, boolean expectedResult) {
        // Act: Validate patient data
        // Выполняем: Проверка данных пациента
        boolean result = hospitalApp.isValidPatientData(name, age, diagnosis);

        // Assert: Verify the result matches the expected validation outcome
        // Проверяем: Убедиться, что результат соответствует ожидаемому исходу
        assertEquals(expectedResult, result);
    }

    /**
     * Tests the assignRoom method with different patient names and conditions to verify correct room assignments.
     * <p>
     * Тестирует метод assignRoom с различными именами пациентов и состояниями для проверки
     * правильного назначения палат.
     *
     * @param patientName Name of the patient (имя пациента)
     * @param condition   Condition of the patient (состояние пациента)
     * @param diagnosis   Expected room assignment (ожидаемое назначение палаты)
     */
    @ParameterizedTest
    @CsvSource({
            "John, Critical, ICU",          // Критическое состояние
            "Alice, Infectious, Isolation", // Инфекционное заболевание
            "Bob, General, General",        // Некритическое состояние
            "Emma, null, General",          // Отсутствие диагноза — General
            "Emma, '', General",          // Отсутствие диагноза — General
            "'', General, General",         // Отсутствие имени игнорируется, палата General
            "Alex, , General",               // Отсутствие диагноза — General
            ", Critical, General"               // Отсутствие имени — General
    })
    void testAssignRoomShouldReturnResultForAllDates(String patientName, String condition, String diagnosis) {
        // Act: Assign room based on patient data
        // Выполняем: Назначение палаты на основе данных пациента
        String result = hospitalApp.assignRoom(patientName, condition);

        // Assert: Verify the assigned room matches the expected room
        // Проверяем: Убедиться, что назначенная палата соответствует ожидаемой
        assertEquals(diagnosis, result);
    }
} // klass ended
