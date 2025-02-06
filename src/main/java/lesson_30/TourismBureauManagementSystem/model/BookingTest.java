package lesson_30.TourismBureauManagementSystem.model;

import com.github.javafaker.Faker;

import java.util.Locale;

public class BookingTest {
    public static void main(String[] args) {
        // Создание экземпляра Faker
        Faker faker = new Faker(new Locale("ru")); // Используем локализацию

        // Генерация фейковых данных для клиента
        Client fakeClient = new Client(
                faker.number().randomDigitNotZero(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress()
        );

        // Генерация фейковых данных для бронирования
        int bookingId = faker.number().randomDigitNotZero();
        String service = faker.lorem().words(2).toString();
        String dateTime = faker.date().future(30, java.util.concurrent.TimeUnit.DAYS).toString(); // Генерация даты в будущем

        // Создание экземпляра Booking с фейковыми данными
        Booking booking = new Booking(bookingId, fakeClient, service, dateTime);

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
