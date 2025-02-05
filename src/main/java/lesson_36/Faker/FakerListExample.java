package lesson_36.Faker;

import com.github.javafaker.Faker;

/*
Генерация множества данных
 */
public class FakerListExample {
    public static void main(String[] args) {
        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
            System.out.println("Customer " + (i + 1) + ": " + faker.name().fullName() + ", Email: "
                     + faker.internet().emailAddress());
        }
    }

} // klass ended
