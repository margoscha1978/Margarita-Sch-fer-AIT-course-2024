package lesson_30.TourismBureauManagementSystem.model;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class BookingTest {
    public static void main(String[] args) {
        // Создание экземпляра Faker
        Faker faker = new Faker(new Locale("de")); // Используем локализацию

        // Генерация фейковых данных для клиента
        LocalDateTime createdAt = LocalDateTime.now();
        Client fakeClient = new Client(
                faker.number().randomDigitNotZero(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                createdAt
        );

        // Генерация фейковых данных для бронирования
        int bookingId = faker.number().randomDigitNotZero();
        String service = String.join(" ", faker.lorem().words(2)); // Объединяем слова в строку
        Date futureDate = faker.date().future(30, java.util.concurrent.TimeUnit.DAYS); // Генерация даты в будущем

        // Конвертируем Date в LocalDate
        LocalDate localDate = futureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Создание экземпляра Booking с фейковыми данными
        Booking booking = new Booking(bookingId, fakeClient, service, localDate.atStartOfDay()); // Теперь передаем LocalDate

        // Вывод созданного бронирования
        System.out.println(booking);
    }

} // klass ended

/*
1. Создание экземпляра Faker: Мы создаем экземпляр Faker, который позволяет генерировать случайные данные.
   На пример я использую локальные данные России.
2. Генерация данных для клиента: Создаем фейкового клиента с использованием методов Faker.
   Здесь используются случайные имя, фамилия и электронная почта.
3. Генерация данных для бронирования: Генерируем идентификатор бронирования,
   название услуги, а также дату и время бронирования, которые находятся в будущем (например, на 30 дней вперед).
4. Создание и вывод: Создаем объект Booking с фейковыми данными и выводим его на консоль.
   Удобно для:
- Тестирование: Faker позволяет создавать разнообразные тестовые данные.
- Демонстрация: Можно использовать для демонстрации функциональности приложения с фейковыми, но реалистичными данными.
- Заполнение базы данных: Если нужно быстро заполнить базу данных тестовыми данными.
 */
