package ClassWork18a;
/*
Упражнение 1: Управление номерами и их статусами
сделайте HashMap, где ключами будут номера номеров (например, “101”, “102”) и значениями — статус номера
(например, "Занят", "Свободен", "Убирается").
	1.	Добавьте несколько номеров с различными статусами.
	2.	Напишите метод, который проверяет, свободен ли определенный номер.
	3.	Напишите код, который находит все свободные номера и выводит их на экран.
	4.	Измените статус определенного номера на "Убирается" и отобразите обновленный список статусов всех номеров.
 */

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    static HashMap<Integer, String> call = new HashMap<>();

    public static void main(String args[]) {
       // мониторинг номеров
        call.put(101, "Занят");
        call.put(102, "Свободен");
        call.put(103, "Убирается");
        call.put(104, "Занят");

        freeCal();

    }

    public static void freeCal() {
        System.out.println("Список всех номеров: " + call);
        for (Map.Entry<Integer, String > entry : call.entrySet()) {
            if (entry.getValue().equals("Свободен")) {
                System.out.println("Свободные номера: ");
                System.out.println(". Номер: " + entry.getKey() + " / " + entry.getValue());
            }
        }
    }

} // klass ended
