package lesson_35.ClassWork35;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleBooking {

    public void bookRoom(int roomNumber, String guestName){
        if(roomNumber <= 0){
            log.error("Wrong room number: {}", roomNumber);
            throw new IllegalArgumentException("Wrong room number: " + roomNumber);
        }
        if(guestName == null || guestName.isEmpty()){
            log.error("Guest name is empty or null");
            throw new IllegalArgumentException("Guest name is empty or null");
        }
        log.info("Booking was successfull. Room: {} Guest:{}", roomNumber, guestName);
        System.out.println("Booking was successfull. Room: " + roomNumber + " Guest:" + guestName);

    }

} // klass ended
