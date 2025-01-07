package ClassWork18a;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    static HashMap<String, String> rooms = new HashMap<>();

    public static void main(String[] args) {
        // Добавление номеров с различными статусами
        rooms.put("101", "Занят");
        rooms.put("102", "Свободен");
        rooms.put("103", "Убирается");
        rooms.put("104", "Занят");

        // Проверка статуса номера
        String roomToCheck = "102";
        if (isRoomFree(roomToCheck)) {
            System.out.println("Номер " + roomToCheck + " свободен.");
        } else {
            System.out.println("Номер " + roomToCheck + " занят.");
        }

        // Вывод всех свободных номеров
        printFreeRooms();

        // Изменение статуса номера
        changeRoomStatus("102", "Убирается");
        System.out.println("Обновленный список статусов всех номеров: " + rooms);
    }

    // Метод для проверки, свободен ли номер
    public static boolean isRoomFree(String roomNumber) {
        return rooms.getOrDefault(roomNumber, "Неизвестный номер").equals("Свободен");
    }

    // Метод для вывода всех свободных номеров
    public static void printFreeRooms() {
        System.out.println("Свободные номера: ");
        for (Map.Entry<String, String> entry : rooms.entrySet()) {
            if (entry.getValue().equals("Свободен")) {
                System.out.println("Номер: " + entry.getKey() + " / " + entry.getValue());
            }
        }
    }

    // Метод для изменения статуса номера
    public static void changeRoomStatus(String roomNumber, String newStatus) {
        if (rooms.containsKey(roomNumber)) {
            rooms.put(roomNumber, newStatus);
        } else {
            System.out.println("Номер " + roomNumber + " не найден.");
        }

    }

} // klass ended
