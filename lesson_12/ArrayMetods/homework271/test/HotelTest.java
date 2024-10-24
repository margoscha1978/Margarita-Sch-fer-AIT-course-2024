package homework271.test;

import homework271.model.Hotel;
import homework271.model.HumanGuest;
import homework271.model.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelTest {
    private Hotel hotel;
    private Room room101;
    private HumanGuest guest1;

    @BeforeEach
    void setUp() {
        hotel = new Hotel("Luxury Hotel", 150.0);
        List<String> amenities = new ArrayList<String>();
        amenities.add("Televisor");
        room101 = new Room("Иван Иванов", 150.0,"101", "Luxe",amenities,true );
        hotel.getAvailableRooms().add(room101);
        guest1 = new HumanGuest("Иван Иванов", 30, "Мужской");
    }

    @Test
    void testCheckInAndCheckOut() {
        hotel.getGuests().add(guest1);

        guest1.checkIn();
        room101.checkIn();

        assertFalse(room101.isAvailable(), "Room should not be available after check-in.");
        assertEquals("Guest Name: Иван Иванов, Age: 30, Gender: Мужской", guest1.getDetails());

        guest1.checkOut();
        room101.checkOut();

        assertTrue(room101.isAvailable(), "Room should be available after check-out.");
    }

}