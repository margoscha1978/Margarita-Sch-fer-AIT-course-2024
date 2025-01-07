package ClassWork18a;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    /*
    Создайте HashMap, где ключами будут номера номеров
    (например, "101", "102") и значениями — статус номера
    (например, "Занят", "Свободен", "Убирается").
    1. Добавьте несколько номеров с различными статусами.
    2. Напишите метод, который проверяет, свободен ли определенный номер.
    3. Напишите код, который находит все свободные номера и выводит их на экран.
    4. Измените статус определенного номера на "Убирается"
    и отобразите обновленный список статусов всех номеров.
     */

    static HashMap<String, String> rooms = new HashMap<>();
    public static void main(String[] args) {

        rooms.put("101", "Занят");
        rooms.put("102", "Свободен");
        rooms.put("103", "Убирается");
        rooms.put("104", "Свободен");

        String roomToCheck = "102";
        checkRoomFree(roomToCheck);
        freeCal();
        rooms.put("104", "Убирается");
        freeCal();
        showRoomsInfo();

    }

    public static void freeCal() {
        for (Map.Entry<String, String > entry : rooms.entrySet()) {
            String keyRoomNumber = entry.getKey();
            if (checkRoomFree(keyRoomNumber)) {
                System.out.println("Номер можно заселять: " + keyRoomNumber);
            }
        }
    }

    public static boolean checkRoomFree(String roomNumber) {
        String status = rooms.get(roomNumber);
        if (status.equals("Свободен")) {
            //System.out.println("Номер " + roomNumber + " свободен.");
            return true;
        }
        else {
            //System.out.println("Номер " + roomNumber + " не свободен.");
            return false;
        }
    }

    public static void showRoomsInfo() {
        for (Map.Entry<String, String> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

} // klass ended
