package lesson_35.ClassWork35;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class HotelReservationSystemTest {

    private final HotelReservationSystem system = new HotelReservationSystem();

    @Test
    public void testSuccessfulReservation() throws Exception {
        system.reserveRoom(202, "John Doe");
        // здесь вы можете проверить состояние номера, если реализуете метод для получения состояния.
    }

   /* @SneakyThrows
    @Test
    public void testRoomAlreadyReserved() {
        system.reserveRoom(202, "Jane Doe");
        Exception exception = assertThrows(RoomUnavailableException.class, () -> {
            system.reserveRoom(103, "Jack Smith");
        });
        assertTrue(exception.getMessage().contains("Room 102 is reserved"));
    }*/

    @Test
    public void testInvalidRoomNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            system.reserveRoom(0, "John Doe");
        });
        assertEquals("Wrong room number: 0", exception.getMessage());
    }

    @Test
    public void testEmptyGuestName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            system.reserveRoom(101, "");
        });
        assertEquals("Guest name is empty or null", exception.getMessage());
    }

    @Test
    public void testNullGuestName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            system.reserveRoom(101, null);
        });
        assertEquals("Guest name is empty or null", exception.getMessage());
    }

    @Test
    public void testRoomNotAvailable() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            system.reserveRoom(999, "John Doe");
        });
        assertEquals("The room number 999 is not available", exception.getMessage());
    }

    /*@Test
    public void testSuccessfulCancellation() throws Exception {
        system.reserveRoom(202, "John Doe");
        system.cancelReservation(202);
        // Свободный номер будет возвращён
        // Здесь вы можете проверить состояние номера.
    }*/

    @Test
    public void testRoomNotReserved() {
        Exception exception = assertThrows(NoActiveReservationException.class, () -> {
            system.cancelReservation(201);
        });
        assertTrue(exception.getMessage().contains("Room number 201 is free"));
    }

    @Test
    public void testInvalidRoomNumberCancellation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            system.cancelReservation(0);
        });
        assertEquals("Wrong room number: 0", exception.getMessage());
    }

    @Test
    public void testRoomCancellationNotExists() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            system.cancelReservation(999);
        });
        assertEquals("The room number 999 is not reserved", exception.getMessage());
    }

} // test ended