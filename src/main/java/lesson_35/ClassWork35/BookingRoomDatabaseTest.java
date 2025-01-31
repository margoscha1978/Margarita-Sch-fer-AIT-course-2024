package lesson_35.ClassWork35;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookingRoomDatabaseTest {

    private BookingRoomDatabase bookingRoomDatabase = null;

    private static Faker faker = null;

    @BeforeEach
    public void setUp() {
        faker = new Faker();
        bookingRoomDatabase = new BookingRoomDatabase();
    }

    @Test
    void testAddGuestSuccess(){
        assertDoesNotThrow(() -> bookingRoomDatabase.addGuest(0, faker.name().firstName()));
    }

    @Test
    void testAddGuestFailInvalidRoomIndex() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> bookingRoomDatabase.addGuest(-1,
                faker.name().firstName()));
    }

    @Test
    void testAddGuestFailGuestNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> bookingRoomDatabase.addGuest(0, null));
    }

} //test ended
