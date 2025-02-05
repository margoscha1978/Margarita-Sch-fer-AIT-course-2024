package lesson_36.homework36;
/*
Задание 2: Подсчёт оставшегося времени до операции
Описание:
Пациент записан на операцию в определённую дату и время. Напишите программу,
которая определяет сколько времени осталось до операции (в днях, часах и минутах).
Требования:
    Ввести дату и время операции в формате dd.MM.yyyy HH:mm.
    Определить, сколько дней, часов и минут осталось до операции.
    Вывести результат в понятном формате.
Пример вывода:
Дата и время операции (dd.MM.yyyy HH:mm): 25.06.2024 08:30
До операции осталось: 150 дней, 12 часов и 45 минут.
 */
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class OperationCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.print("Дата и время операции (dd.MM.yyyy HH:mm): ");
        String input = scanner.nextLine();

        LocalDateTime operationTime = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, operationTime);

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;

        System.out.printf("До операции осталось: %d дней, %d часов и %d минут.%n", days, hours, minutes);
    }

} // klass ended
