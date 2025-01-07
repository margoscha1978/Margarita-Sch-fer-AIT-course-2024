package TourismBureauManagementSystem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void testBookingCreation() {
        Booking booking = new Booking(1, 1);
        assertNotNull(booking.getBookingId());
        assertEquals(1, booking.getClientId());
    }
} // test ended