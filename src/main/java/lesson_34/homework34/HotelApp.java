package lesson_34.homework34;
/*
 Класс Main:
 - тестирует добавление и получение гостей, обрабатывает возможные исключения и выводит сообщения об ошибках.
 */
public class HotelApp {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Тестируем добавление гостей
        try {
            hotel.addGuest(0, "Иван");
            hotel.addGuest(1, "Петр");
            hotel.addGuest(2, null); // Некорректное имя
            hotel.addGuest(5, "Света"); // Некорректный индекс
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем получение гостей
        try {
            System.out.println("Гость в комнате 0: " + hotel.getGuest(0));
            System.out.println("Гость в комнате 1: " + hotel.getGuest(1));
            System.out.println("Гость в комнате 2: " + hotel.getGuest(2));
            // Здесь должен произойти NoGuestException
        } catch (NoGuestException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

} // klass ended
