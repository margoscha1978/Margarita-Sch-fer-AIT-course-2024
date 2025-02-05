package lesson_36.Faker;
/*
Обработка в Exceptions... Вы можете использовать Java Faker для генерации тестовых данных и обрабатывать исключения,
 чтобы интегрировать его в ваши бизнес-логики. Например, если у вас есть система бронирования,
 вы можете сгенерировать недопустимые данные и проверить, как ваша система реагирует на них.

 */
import com.github.javafaker.Faker;

public class BookingExample {
    public static void main(String[] args) {
        Faker faker = new Faker();

        try {
            String email = faker.internet().emailAddress();

            // Логика проверки, например:
            if (email.isEmpty()) {
                throw new IllegalArgumentException("Email cannot be empty!");
            }

            System.out.println("Generated Email: " + email);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

} // klass ended
