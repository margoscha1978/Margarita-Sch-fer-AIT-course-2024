package lesson_36.homework36;
/*
Эксперимент с Duration пример программы,
которая использует его для подсчёта разницы между текущим временем и временем операции:
 */
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class TimeUntilOperation {
    public static void main(String[] args) {
        // Время операции
        LocalDateTime operationTime = LocalDateTime.of(2024, 6, 25, 8, 30);
        LocalDateTime currentTime = LocalDateTime.now();

        // Рассчитываем разницу
        Duration duration = Duration.between(currentTime, operationTime);

        // Разбиваем на дни, часы и минуты
        long days = duration.toDays();
        long hours = duration.toHours() % 24; // Остаток часов после полной разности по дням
        long minutes = duration.toMinutes() % 60; // Остаток минут после полной разности по часам

        // Выводим результат
        System.out.printf("До операции осталось: %d дней, %d часов и %d минут.%n", days, hours, minutes);
    }

} // klass endet
