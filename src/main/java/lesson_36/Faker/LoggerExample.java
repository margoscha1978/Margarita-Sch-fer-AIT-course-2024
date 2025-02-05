package lesson_36.Faker;
/*
 Использование c Logger возможно... Интеграция Java Faker с Logger служит для логирования
  сгенерированных данных или ошибок в вашей системе.
  Это полезно для отслеживания информации о тестах и для ведения журналов в приложениях.

 */
import com.github.javafaker.Faker;
import java.util.logging.Logger;

public class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        Faker faker = new Faker();

        for (int i = 0; i < 5; i++) {
            String bookingID = faker.idNumber().valid();
            logger.info("Generated Booking ID: " + bookingID);
        }
    }

} // klass ended
