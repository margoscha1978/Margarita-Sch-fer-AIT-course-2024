package lesson_36.Faker;
/*
 Возможно комбинирование с другими библиотеками, такими как JPA/Hibernate для работы с базами данных,
  Spring для создания служб и RESTful API, и т.д. Например, сгенерированные данные можно сохранять в базе данных
  для дальнейшего анализа, используя JPA:
 */
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

public class DatabaseExample {
    // Пример кода для сохранения в базу данных
    public void saveBooking() {
        Faker faker = new Faker();

        String customerName = faker.name().fullName();
        String destination = faker.address().city();
        LocalDate departureDate = faker.date().future(10, TimeUnit.DAYS).toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();

        // Здесь будет ваша логика сохранения данных в базу данных
        System.out.println("Saving booking for " + customerName + " to " + destination + " on " + departureDate);
        // repository.save(new Booking(customerName, destination, departureDate));
    }

} // klass ended
