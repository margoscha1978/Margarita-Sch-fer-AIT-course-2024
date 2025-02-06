package lesson_35.ClassWork35;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Класс HotelReservationSystemApp
 * Это приложение демонстрирует работу с системой бронирования номеров.
 * Здесь выполняются операции бронирования и отмены номеров.
 *
 * HotelReservationSystemApp Class
 * This application demonstrates working with the hotel reservation system.
 * It performs booking and cancellation operations.
 */
@Slf4j
public class HotelReservationSystemApp {
    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Faker faker = new Faker();

        try {
            hotelReservationSystem.reserveRoom(101, faker.name().lastName());
            hotelReservationSystem.reserveRoom(102, faker.name().lastName());
        } catch (lesson_35.ClassWork35.RoomUnavailableException e) {
            throw new RuntimeException(e);
        }

        try {
            hotelReservationSystem.cancelReservation(103);
            hotelReservationSystem.cancelReservation(101);
        } catch (NoActiveReservationException exception) {
            log.error(Arrays.toString(exception.getStackTrace()));
            System.out.println(exception.getMessage());
        }
    }
} // klass ended
