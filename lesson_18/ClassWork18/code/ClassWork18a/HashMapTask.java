package ClassWork18a;
/*
 Создайте HashMap, в которой хранятся имена гостей (ключи) и их возраст (значения).
 Напишите метод, который добавляет гостя в список, только если его возраст 18 лет и старше.
 Если гость моложе, выводите сообщение, что ему нельзя войти.
 */

import java.util.HashMap;

public class HashMapTask {
    // HashMap для хранения гостей и их возраста
    static HashMap<String, Integer> guests = new HashMap<>();

    // HashMap для хранения билетов гостей
    static HashMap<String, String> ticketList = new HashMap<>();

    public static void main(String[] args) {
        // Добавляем гостей с разными возрастами
        addGuest("Musterman", 25);
        addGuest("Musterfrau", 15);

        // Добавляем билет для гостя по имени "Alex"
        ticketList.put("Alex", "12345");

        // Проверяем наличие билета для гостя "Alexis"
        String checkTicketResult = checkTicket("Alexis");
        System.out.println(checkTicketResult);

        // Обновляем возраст для существующего и несуществующего гостя
        updateAge("Musterman", 20);
        updateAge("Millis", 40);
    }

    /*
      Упражнение 1: Список гостей
      Exercise 1: Guest list
      Создайте HashMap, в которой хранятся имена гостей (ключи)
      и их возраст (значения). Напишите метод, который добавляет
      гостя в список, только если его возраст 18 лет и старше.
      Если гость моложе, выводите сообщение, что ему нельзя войти.

    */
    public static void addGuest(String name, int age) {
        if (age >= 18) {
            guests.put(name, age); // Добавляем гостя в список, если возраст >= 18
            System.out.println("Guest " + name + " with age " + age + " was added.");
        } else {
            System.out.println("Guest " + name + " is too young to enter.");
        }
    }

    /*
      Упражнение 2: Проверка регистрации
      Exercise 2: Registration check
      Создайте HashMap с именами гостей и их номерами билетов.
      Напишите метод, который проверяет, есть ли у гостя билет, по его имени,
      и возвращает номер билета. Если гостя нет в списке,
      выводите сообщение “Гость не зарегистрирован”.
    */
    public static String checkTicket(String name) {
        boolean isTicketFound = ticketList.containsKey(name); // Проверяем наличие билета
        if (isTicketFound) {
            return "Ticket found. Ticket number: " + ticketList.get(name); // Возвращаем номер билета
        } else {
            return "Guest not registered."; // Сообщение, если билет не найден
        }
    }

    /*
      Упражнение 3: Обновление возраста
      Exercise 3: Update age
      Создайте HashMap, в которой хранятся имена гостей и их возраст.
      Напишите метод, который обновляет возраст гостя в списке по его имени.
      Если гость не найден, выводите сообщение “Гость не найден"
    */
    public static void updateAge(String name, int newAge) {
        if (guests.containsKey(name)) {
            guests.put(name, newAge); // Обновляем возраст гостя, если он существует
            System.out.println("Guest " + name + " with age " + newAge + " was updated.");
        } else {
            System.out.println("Guest " + name + " was not found."); // Сообщение, если гость не найден
        }
    }

} // klass ended
