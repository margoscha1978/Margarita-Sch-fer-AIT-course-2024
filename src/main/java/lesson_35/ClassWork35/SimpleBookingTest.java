package lesson_35.ClassWork35;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleBookingTest {

    private static  Faker faker = null;
    private SimpleBooking simpleBooking = null;

    @BeforeEach
    public void setUp() {
        faker = new Faker();
        simpleBooking = new SimpleBooking();
    }

    @Test
    void testBookRoomAddGuestSucess(){
        assertDoesNotThrow( () ->  simpleBooking.bookRoom(101, faker.name().firstName()));
    }

    @Test
    void testBookRoomAddGuestFailInvalidRoomNumber(){
        assertThrows(IllegalArgumentException.class, () ->  simpleBooking.bookRoom(-1,
                faker.name().firstName()));
    }

    @Test
    void testBookRoomAddGuestFailEmptyGuestName(){
        assertThrows(IllegalArgumentException.class, () ->  simpleBooking.bookRoom(101, ""));
    }

    @Test
    void testBookRoomAddGuestFailGuestNameIsNull(){
        assertThrows(IllegalArgumentException.class, () ->  simpleBooking.bookRoom(101, null));
    }

} // test ended
