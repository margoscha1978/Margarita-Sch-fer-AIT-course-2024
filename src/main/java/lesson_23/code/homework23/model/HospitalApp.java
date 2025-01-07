package homework23.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class represents the main application logic for managing a hospital system.
 * It includes methods for calculating the cost of a hospital stay, validating patient data,
 * and assigning a room to a patient based on their condition.
 *
 * Данный класс представляет основную логику работы системы управления больницей.
 * Он включает методы для расчёта стоимости пребывания в больнице, проверки данных пациента
 * и назначения палаты в зависимости от состояния пациента.
 */
public class HospitalApp {

    // Logger instance for logging messages during the execution of the application
    // Логгер для вывода сообщений во время выполнения программы
    static final Logger LOGGER = LoggerFactory.getLogger(HospitalApp.class);

    /**
     * Calculates the total cost of a hospital stay based on the number of days.
     * The first day has a different cost than the subsequent days.
     *
     * Рассчитывает общую стоимость пребывания в больнице на основе количества дней.
     * Первый день имеет одну стоимость, последующие дни — другую.
     *
     * @param days Number of days the patient stays in the hospital (количество дней пребывания в больнице)
     * @return Total cost of the stay or -1 if input is invalid (общая стоимость или -1, если ввод некорректен)
     */
    public int calculateHospitalStayCost(int days) {
        if (days <= 0) { // Check if the number of days is valid (Проверка на корректность количества дней)
            LOGGER.error("Hospital stays less than 1 day"); // Log an error if invalid (Запись ошибки в лог)
            return -1; // Return -1 for invalid input (Возвращаем -1, если данные некорректны)
        }
        int firstDayCost = 100; // Cost of the first day (Стоимость первого дня)
        int secondDayCost = 80; // Cost of each subsequent day (Стоимость каждого последующего дня)

        int finalCost = firstDayCost + (days - 1) * secondDayCost; // Calculate the total cost (Рассчёт общей стоимости)
        LOGGER.info("Final cost: {}", finalCost); // Log the calculated cost (Запись стоимости в лог)
        return finalCost; // Return the total cost (Возвращаем общую стоимость)
    }

    /**
     * Validates the patient's data to ensure it meets required criteria.
     *
     * Проверяет данные пациента, чтобы убедиться, что они соответствуют требованиям.
     *
     * @param name Name of the patient (имя пациента)
     * @param age Age of the patient (возраст пациента)
     * @param diagnosis Diagnosis of the patient (диагноз пациента)
     * @return true if the data is valid, false otherwise (true, если данные корректны; false — в противном случае)
     */
    public boolean isValidPatientData(String name, int age, String diagnosis) {
        if (name == null || name.isEmpty() || name.equals("null")) { // Check if name is valid (Проверка имени)
            LOGGER.error("Invalid hospital data. Name is null or empty"); // Log an error if invalid (Лог ошибки)
            return false; // Return false if invalid (Возвращаем false при ошибке)
        }
        if (age <= 0 || age > 120) { // Check if age is within a realistic range (Проверка возраста на корректность)
            LOGGER.error("Invalid hospital data. Age is out of range"); // Log an error if invalid (Лог ошибки)
            return false; // Return false if invalid (Возвращаем false при ошибке)
        }
        if (diagnosis == null || diagnosis.trim().isEmpty()) { // Check if diagnosis is valid (Проверка диагноза)
            LOGGER.error("Invalid hospital data. Diagnosis is null or empty"); // Log an error if invalid (Лог ошибки)
            return false; // Return false if invalid (Возвращаем false при ошибке)
        }
        return true; // Return true if all validations pass (Возвращаем true, если все проверки пройдены)
    }

    /**
     * Assigns a room to a patient based on their condition.
     *
     * Назначает палату пациенту на основе его состояния.
     *
     * @param patientName Name of the patient (имя пациента)
     * @param condition Medical condition of the patient (состояние пациента)
     * @return Name of the assigned room ("ICU", "Isolation", "General")
     *         Название назначенной палаты ("ICU", "Isolation", "General")
     */
    public String assignRoom(String patientName, String condition) {
        if (patientName == null || patientName.isEmpty()) { // Check if patient name is valid (Проверка имени пациента)
            LOGGER.error("Invalid hospital data. PatientName is null or empty"); // Log an error if invalid (Лог ошибки)
            return "General"; // Assign "General" if name is invalid (Назначаем "General", если имя некорректно)
        }
        if (condition == null || condition.isEmpty()) { // Check if condition is valid (Проверка состояния)
            LOGGER.error("Invalid hospital data. Condition is null or empty"); // Log an error if invalid (Лог ошибки)
            return "General"; // Assign "General" if condition is invalid (Назначаем "General", если состояние некорректно)
        }
        switch (condition.trim()) { // Assign room based on condition (Назначение палаты на основе состояния)
            case "Critical" -> {
                return "ICU"; // Assign ICU for critical condition (Назначаем ICU для критических состояний)
            }
            case "Infectious" -> {
                return "Isolation"; // Assign Isolation for infectious condition (Назначаем Isolation для инфекционных случаев)
            }
            default -> {
                return "General"; // Default to General for all other conditions (По умолчанию — General для остальных случаев)
            }
        }
    }
} // klass ended


