package lesson_35.ClassWork35;

import com.github.javafaker.Faker;
import lesson_35.ClassWork35.NoGuestException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookingRoomDatabaseApp {
    public static void main(String[] args) {
        BookingRoomDatabase bookingRoomDatabase = new BookingRoomDatabase();

        Faker faker = new Faker();

        try {
            bookingRoomDatabase.addGuest(0, faker.name().lastName());

            bookingRoomDatabase.addGuest(1, faker.name().lastName());
            bookingRoomDatabase.addGuest(2, faker.name().lastName());

            bookingRoomDatabase.addGuest(8, faker.name().lastName());

            bookingRoomDatabase.addGuest(3, null);
            bookingRoomDatabase.addGuest(4, "");
        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException exception){
            log.error(exception.getMessage());
            System.out.println(exception.getMessage());
        }

        try {
            bookingRoomDatabase.getGuest(0);
            bookingRoomDatabase.getGuest(3);
            bookingRoomDatabase.getGuest(9);
        }
        catch (NoGuestException exception){
            log.error(exception.getMessage());
            System.out.println(exception.getMessage());
        }
    }

} // klass ended
