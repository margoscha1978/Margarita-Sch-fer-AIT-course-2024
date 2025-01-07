package homework271.model;

import java.util.List;

public class Room extends Hotel  {
    public String roomNumber; // Номер комнаты
    public String roomType; // Тип комнаты
    public List<String> amenities; // Удобства
    public boolean isAvailable; // Доступна ли комната

    public Room(String name, double price, String roomNumber, String roomType, List<String> amenities, boolean isAvailable) {
        super(name, price);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.amenities = amenities;
        this.isAvailable = isAvailable;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkIn() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " checked in.");
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    public void checkOut() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Room " + roomNumber + " checked out.");
        } else {
            System.out.println("Room " + roomNumber + " is already available.");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getDetails() {
        return "Room Number: " + roomNumber + ", Type: " + roomType + ", Available: " + isAvailable;
    }
}

