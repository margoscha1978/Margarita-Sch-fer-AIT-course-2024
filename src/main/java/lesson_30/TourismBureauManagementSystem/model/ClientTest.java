package lesson_30.TourismBureauManagementSystem.model;
/*
  - Генерация фейковых данных: использование библиотеки Faker позволяет легко наполнять тестовые данные.
 */
import com.github.javafaker.Faker;

import java.time.LocalDateTime;

public class ClientTest {
    public static void main(String[] args) {
        Faker faker = new Faker();
        LocalDateTime createdAt = LocalDateTime.now();
        Client client = new Client(
                faker.number().randomDigitNotZero(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                createdAt
        );

        System.out.println(client);
    }

} // klass ended
