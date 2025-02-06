package lesson_35.ClassWork35;

import lesson_35.ClassWork35.NoGuestException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookingRoomDatabase {

    private int[] rooms = {101, 102, 103, 201, 202};

    private String[] guests = new String[5];

    public void addGuest(int roomIndex, String guestName){
        if(roomIndex < 0 || roomIndex >= rooms.length){
            log.error("Wrong room index: {}", roomIndex);
            throw new ArrayIndexOutOfBoundsException("Wrong room index: " + roomIndex);
        }
        if(guestName == null || guestName.isEmpty()){
            log.error("Guest name is empty or null");
            throw new IllegalArgumentException("Guest name is empty or null");
        }

        guests[roomIndex] = guestName;
        log.info("Guest {} was added  to room {}", guestName, rooms[roomIndex]);
        System.out.println("Guest " + guestName + "was added to room " + rooms[roomIndex]);
    }

    public String getGuest(int roomIndex) throws NoGuestException {
        if(roomIndex < 0 || roomIndex >= rooms.length){
            log.error("Wrong room index: {}", roomIndex);
            throw new ArrayIndexOutOfBoundsException("Wrong room index: " + roomIndex);
        }

        if(guests[roomIndex] == null){
            log.error("In room {} is not guest");
            throw new NoGuestException("In room " + guests[roomIndex] + " is not guest ");
        }

        return guests[roomIndex];
    }

} // klass ended
