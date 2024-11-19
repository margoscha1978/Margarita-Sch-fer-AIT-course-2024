package ClassWork18a;
/*
Упражнение 1: Управление номерами и их статусами
 сделать HashMap, где ключами будут номера номеров (например, “101”, “102”)
  и значениями — статус номера (например, "Занят", "Свободен", "Убирается").
	1.	Добавьте несколько номеров с различными статусами.
	2.	Напишите метод, который проверяет, свободен ли определенный номер.
	3.	Напишите код, который находит все свободные номера и выводит их на экран.
	4.	Измените статус определенного номера на "Убирается" и отобразите обновленный список статусов всех номеров.
 */

import java.util.HashMap;

public class RoomService {
    public static void main(String[] args) {
        HashMap<String, String> rooms = new HashMap<>();
        // движение номеров
        rooms.put("101", "Занят");
        rooms.put("102", "Свободен");
        rooms.put("103", "Убирается");
        rooms.put("104", "Свободен");

        // контроль качества номеров
        String roomToCheck = "102";
        if (rooms.get(roomToCheck).equals("Свободен")) {
            System.out.println("Номер " + roomToCheck + " свободен.");
        } else {
            System.out.println("Номер " + roomToCheck + " не свободен.");
        }
        System.out.println("\nСвободные номера:");
        for (String room : rooms.keySet()) {
            if (rooms.get(room).equals("Свободен")) {
                System.out.println("Номер " + room);
            }
        }

        rooms.put("102", "Убирается");
        // статус номеров
        System.out.println("Обновленный список статусов номеров:");
        for (String room : rooms.keySet()) {
            System.out.println("Номер " + room + ": " + rooms.get(room));
        }

    }

 } // klass ended


