package lesson_34.homework34;
/*
 Класс Hotel:
   - Содержит массив rooms для хранения номеров комнат и массив guests для имен гостей.
   - Метод addGuest проверяет, находятся ли индекс комнаты и имя гостя в правильных рамках,
     и если все в порядке, то записывает имя в соответствующий индекс массива guests.
   - Метод getGuest проверяет, есть ли гость в комнате, и если нет, выбрасывает исключение NoGuestException.
 */
class Hotel {
    private int[] rooms = {101, 102, 103, 201, 202}; // Массив комнат
    private String[] guests = new String[5]; // Массив гостей

    public void addGuest(int roomIndex, String guestName) {
        if (roomIndex < 0 || roomIndex >= rooms.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс комнаты вне диапазона: " + roomIndex);
        }
        if (guestName == null || guestName.isEmpty()) {
            throw new IllegalArgumentException("Некорректное имя гостя: имя не может быть пустым или null.");
        }
        guests[roomIndex] = guestName; // Записываем имя гостя
        System.out.println("Гость " + guestName + " добавлен в комнату " + rooms[roomIndex]);
    }

    public String getGuest(int roomIndex) throws NoGuestException {
        if (roomIndex < 0 || roomIndex >= rooms.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс комнаты вне диапазона: " + roomIndex);
        }
        if (guests[roomIndex] == null) {
            throw new NoGuestException("В комнате " + rooms[roomIndex] + " нет гостя.");
        }
        return guests[roomIndex]; // Возвращаем имя гостя
    }

} // klass ended
