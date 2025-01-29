package lesson_34.homework34;
/*
Метод main:
   - Проверяет работу методов, включая сценарии, когда происходит ошибка при повторном бронировании,
    отмене несуществующего бронирования и т.д. Все исключения обрабатываются в try-catch,
     выводя понятные сообщения об ошибках.
 */
public class HotelReservationSystemApp {
    public static void main(String[] args) {
        int[] roomNumbers = {101, 102, 103, 201}; // Список номеров
        HotelReservationSystem reservationSystem = new HotelReservationSystem(roomNumbers);

        // Тестируем резервирование
        try {
            reservationSystem.reserveRoom(101, "Иван");
            reservationSystem.reserveRoom(101, "Петр"); // Повторная попытка
        } catch (RoomUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем отмену бронирования
        try {
            reservationSystem.cancelReservation(101); // Отменяю
            reservationSystem.cancelReservation(101); // Повторная попытка отмены
        } catch (RoomUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем попытку отменить несуществующую комнату
        try {
            reservationSystem.cancelReservation(105); // Ошибка, комнаты нет
        } catch (RoomUnavailableException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

} // klass ended
