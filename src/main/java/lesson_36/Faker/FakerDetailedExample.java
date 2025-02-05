package lesson_36.Faker;

import com.github.javafaker.Faker;

/*
Генерация различных типов данных
 */
public class FakerDetailedExample {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // Генерация имени и возраста
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        int age = faker.number().numberBetween(18, 100);

        // Генерация корпоративных данных
        String companyName = faker.company().name();
        String jobTitle = faker.job().title();

        // Вывод
        System.out.println("User: " + firstName + " " + lastName + ", Age: " + age);
        System.out.println("Company: " + companyName + ", Job Title: " + jobTitle);
    }

} // klass ended
