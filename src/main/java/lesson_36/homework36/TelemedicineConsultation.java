package lesson_36.homework36;
/*
Задание 3: Запись пациента на обследование с учётом часовых поясов
Описание:
Клиника проводит телемедицинские консультации с пациентами из разных стран. Напишите программу,
которая принимает местное время врача (например, Europe/Berlin) и переводит его в пояс пациента (например, America/New_York).
Требования:
    Ввести дату и время консультации в формате dd.MM.yyyy HH:mm в часовом поясе врача.
    Перевести в другой часовой пояс (ZoneId.of(...)).
    Вывести результат в формате:
Пример вывода:
Время консультации для врача: 12.06.2024, 15:00 (Berlin)
Время консультации для пациента: 12.06.2024, 09:00 (New York)
 */
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TelemedicineConsultation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.print("Введите дату и время консультации (dd.MM.yyyy HH:mm): ");
        String input = scanner.nextLine();

        ZonedDateTime doctorTime = LocalDateTime.parse(input, formatter).atZone(ZoneId.of("Europe/Berlin"));
        ZonedDateTime patientTime = doctorTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Время консультации для врача: " + doctorTime.format(formatter) + " (Berlin)");
        System.out.println("Время консультации для пациента: " + patientTime.format(formatter) + " (New York)");
    }

} // klass ended
