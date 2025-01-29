package lesson_34.homework34;
/*
 Класс SimpleBooking:
   - Метод bookRoom проверяет номер комнаты и имя гостя.
   - Если номер комнаты меньше или равен 0, выбрасывается IllegalArgumentException с соответствующим сообщением.
   - Если имя гостя пустое или равно null, также выбрасывается IllegalArgumentException с соответствующим сообщением.
   - Если проверки пройдены, выводится сообщение о том, что комната успешно забронирована.
 */
class SimpleBooking {
    public void bookRoom(int roomNumber, String guestName) {
        // Проверяем, что номер комнаты корректен
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Некорректный номер комнаты: номер должен быть больше 0.");
        }

        // Проверяем, что имя гостя корректно
        if (guestName == null || guestName.isEmpty()) {
            throw new IllegalArgumentException("Некорректное имя гостя: имя не может быть пустым или null.");
        }

        // Если все проверки прошли, выводим сообщение о бронировании
        System.out.println("Комната " + roomNumber + " успешно забронирована на имя " + guestName);
    }

} // klass ended

