package lesson_34.homework34;
/*
HotelReservationSystem:
   - Использует Map<Integer, Boolean>для хранения доступных комнат и их статуса (занята/свободна).
   - Метод reserveRoom проверяет корректность входных данных и доступность комнаты.
     Если комната уже занята, выбрасывает RoomUnavailableException.
   - Метод cancelReservation проверяет, существует ли комната, и можно ли её освободить.
 */
import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    private Map<Integer, Boolean> rooms; // true - занята, false - свободна

    public HotelReservationSystem(int[] roomNumbers) {
        rooms = new HashMap<>();
        for (int roomNumber : roomNumbers) {
            rooms.put(roomNumber, false); // Изначально все комнаты свободны
        }
    }

    public void reserveRoom(int roomNumber, String guestName) throws RoomUnavailableException,
            IllegalArgumentException {
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Некорректный номер комнаты.");
        }
        if (guestName == null || guestName.isEmpty()) {
            throw new IllegalArgumentException("Некорректное имя гостя.");
        }

        if (rooms.containsKey(roomNumber)) {
            if (rooms.get(roomNumber)) {
                throw new RoomUnavailableException("Комната " + roomNumber + " уже занята.");
            } else {
                rooms.put(roomNumber, true); // Помечаем как занятую
                System.out.println("Комната " + roomNumber + " успешно забронирована на имя " + guestName);
            }
        } else {
            throw new IllegalArgumentException("Комната с номером " + roomNumber + " не существует.");
        }
    }

    public void cancelReservation(int roomNumber) throws RoomUnavailableException, IllegalArgumentException {
        if (!rooms.containsKey(roomNumber)) {
            throw new IllegalArgumentException("Комната с номером " + roomNumber + " не существует.");
        }

        if (!rooms.get(roomNumber)) {
            throw new RoomUnavailableException("Нельзя отменить несуществующее бронирование для комнаты "
                    + roomNumber + ".");
        }

        rooms.put(roomNumber, false); // Помечаем как свободную
        System.out.println("Бронирование комнаты " + roomNumber + " отменено.");
    }

} // klass ended
