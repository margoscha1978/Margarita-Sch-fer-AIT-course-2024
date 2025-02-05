package lesson_36.Faker;
/*
 Использование c LocalDate возможно... Используется для генерации дат,
  связанных с бронированиями или поездками. Например, вы можете генерировать случайные даты для вылета и возвращения.
 */
import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class TravelExample {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // Генерация дат
        LocalDate departureDate = faker.date().future(10, TimeUnit.DAYS).toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate returnDate = departureDate.plusDays(faker.number().numberBetween(5, 15));

        System.out.println("Departure Date: " + departureDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Return Date: " + returnDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

} // klass ended
