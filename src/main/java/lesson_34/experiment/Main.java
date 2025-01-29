package lesson_34.experiment;

import lesson_34.homework34.*;

public class Main {
    public static void main(String[] args) {
        // Тестирование первой части
        System.out.println("=== Тестирование бронирования ===");
        SimpleBooking booking = new SimpleBooking();
        int[] roomNumbers = {101, -1, 102, 0};
        String[] guestNames = {"Иван", null, "", "Петр"};
        for (int i = 0; i < roomNumbers.length; i++) {
            try {
                booking.bookRoom(roomNumbers[i], guestNames[i]);
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректные данные бронирования: " + e.getMessage());
            }
        }

        // Тестирование второй части
        System.out.println("\n=== Тестирование работы с массивом гостей ===");
        Hotel hotel = new Hotel();
        try {
            hotel.addGuest(0, "Иван");
            hotel.addGuest(1, "Петр");
            hotel.addGuest(2, null); // Некорректное имя
            hotel.addGuest(5, "Света"); // Некорректный индекс
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            System.out.println("Гость в комнате 0: " + hotel.getGuest(0));
            System.out.println("Гость в комнате 2: " + hotel.getGuest(2)); // Здесь должен произойти NoGuestException
        } catch (NoGuestException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестирование третьей части
        System.out.println("\n=== Тестирование системы бронирования ===");
        HotelReservationSystem reservationSystem = new HotelReservationSystem(new int[]{101, 102, 103, 201});
        try {
            reservationSystem.reserveRoom(101, "Иван");
            reservationSystem.reserveRoom(101, "Петр"); // Повторная попытка
        } catch (RoomUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка бронирования: " + e.getMessage());
        }
        try {
            reservationSystem.cancelReservation(101); // Отмена
            reservationSystem.cancelReservation(101); // Повторная отмена
        } catch (RoomUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} // klass ended
