package lesson_35.ClassWork35;

import lesson_35.ClassWork35.RoomUnavailableException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HotelReservationSystem {
    private Map<Integer, Boolean> roomsInfo = new HashMap<>();

    public HotelReservationSystem() {
        roomsInfo.put(101, false);
        roomsInfo.put(102, false);
        roomsInfo.put(103, false);
        roomsInfo.put(201, true);
        roomsInfo.put(202, true);
    }

    public void reserveRoom(int roomNumber, String guestName) throws RoomUnavailableException {
        if (roomNumber <= 0) {
            log.error("Wrong room number: {}", roomNumber);
            throw new IllegalArgumentException("Wrong room number: " + roomNumber);
        }
        if (guestName == null || guestName.isEmpty()) {
            log.error("Guest name is empty or null");
            throw new IllegalArgumentException("Guest name is empty or null");
        }
        Boolean getRoomResult = roomsInfo.get(roomNumber);
        if (getRoomResult == null) {
            log.error("Room number {} is not available", roomNumber);
            throw new IllegalArgumentException("The room number " + roomNumber + " is not available");
        } else if (!getRoomResult) {
            log.error("Room {} is reserved", roomNumber);
            throw new RoomUnavailableException("Room " + roomNumber + " is reserved");
        }
        else {
            roomsInfo.put(roomNumber, true);
            log.info("Room number {} is reserved. Guest {}", roomNumber, guestName);
        }
    }

    public void cancelReservation(int roomNumber) throws NoActiveReservationException{
        if(roomNumber <= 0){
            log.error("Wrong room number: {}", roomNumber);
            throw new IllegalArgumentException("Wrong room number: " + roomNumber);
        }
        else {
            boolean getRoom = roomsInfo.get(roomNumber) == null;
            if (getRoom){
                log.error("Room number {} is not reserved", roomNumber);
                throw new IllegalArgumentException("The room number " + roomNumber + " is not reserved");
            }
            if(!getRoom){
                throw  new NoActiveReservationException("Room number " + roomNumber + " is free");
            }
            else {
                roomsInfo.put(roomNumber, false);
                log.info("Room number {} is free", roomNumber);
            }
        }
    }

} // klass ended
