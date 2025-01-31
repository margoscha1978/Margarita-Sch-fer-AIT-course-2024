package lesson_35.ClassWork35;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleBookingApp {
    public static void main(String[] args) {
        SimpleBooking simpleBooking = new SimpleBooking();

        Faker faker = new Faker();

        try {
            simpleBooking.bookRoom(1, faker.name().lastName());
            simpleBooking.bookRoom(0, faker.name().lastName());
            simpleBooking.bookRoom(2, null);
            simpleBooking.bookRoom(2, "");
        }
        catch (IllegalArgumentException exception){
            log.error("Gast name is empty or null or wrong room number");
            System.out.println("Gast name is empty or null or wrong room number");
        }

    }

} // klass ended
