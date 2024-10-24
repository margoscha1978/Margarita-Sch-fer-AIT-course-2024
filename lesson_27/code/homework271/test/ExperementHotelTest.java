package homework271.test;

import homework271.model.Hotel;
import homework271.model.HumanGuest;
import homework271.model.Room;

import java.util.ArrayList;
import java.util.List;

public class ExperementHotelTest {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Luxury Hotel", 150.0);
        System.out.println("Hotel Name: " + hotel.getName());

        HumanGuest guest = new HumanGuest("Иван Иванов", 30, "Мужской");
        hotel.getGuests().add(guest);
        System.out.println("Guest Name: " + guest.getName() + ", Gender: " + guest.gender);

        List<String> amenities = new ArrayList<>();
        amenities.add("Televisor");
        Room room101 = new Room("Иван Иванов", 150.0, "101", "Luxe",
                amenities, true);
        hotel.getAvailableRooms().add(room101);
        System.out.println("Room Number: " + room101);

    }

}// klass ende
