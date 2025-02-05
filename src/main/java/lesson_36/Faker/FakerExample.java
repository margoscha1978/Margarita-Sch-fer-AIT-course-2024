package lesson_36.Faker;
/*
Создание объекта Faker
 */
import com.github.javafaker.Faker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // Генерация данных
        String name = faker.name().fullName();
        String address = faker.address().fullAddress();
        String email = faker.internet().emailAddress();

        // Вывод данных
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }
} // klass ended

