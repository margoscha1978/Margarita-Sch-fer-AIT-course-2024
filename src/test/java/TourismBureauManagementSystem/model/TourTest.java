package TourismBureauManagementSystem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TourTest {

    @Test
    void testTourCreation() {
        Tour tour = new Tour("Paris", LocalDate.of(2023, 12, 1), 7,
                1200.0, 15);
        assertEquals("Paris", tour.getDestination());
        assertEquals(15, tour.getAvailableSeats());
    }

    @Test
    void testUpdateAvailableSeats() {
        Tour tour = new Tour("Rome", LocalDate.of(2023, 5, 1), 5,
                800.0, 10);
        tour.updateAvailableSeats(-2);
        assertEquals(8, tour.getAvailableSeats());
    }
} // test ended