package TourismBureauManagementSystem.model;

import java.time.LocalDate;
import java.util.Objects;

public class Booking {
    private static int idCounter = 0;
    private int bookingId;
    private int clientId;
    private int tourId;
    private LocalDate bookingDate;

    public Booking(int clientId, int tourId) {
        this.bookingId = ++idCounter;
        this.clientId = clientId;
        this.tourId = tourId;
        this.bookingDate = LocalDate.now();
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getClientId() {
        return clientId;
    }

    public int getTourId() {
        return tourId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId && clientId == booking.clientId && tourId == booking.tourId && Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, clientId, tourId, bookingDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Booking{");
        sb.append("bookingId=").append(bookingId);
        sb.append(", clientId=").append(clientId);
        sb.append(", tourId=").append(tourId);
        sb.append(", bookingDate=").append(bookingDate);
        sb.append('}');
        return sb.toString();
    }
} // klass ended
