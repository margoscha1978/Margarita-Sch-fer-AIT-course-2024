package homework271.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String name; // Название отеля
    public  double price; // Цена
    public  List<Guest> guests; // Список гостей
    public  List<String> services; // Список услуг гостиницы
    public  List<Room> availableRooms; // Список доступных комнат

    // Конструктор
    public Hotel(String name, double price) {
        this.name = name;
        this.price = price;
        this.guests = new ArrayList<>();
        this.services = new ArrayList<>();
        this.availableRooms = new ArrayList<>();
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public List<String> getServices() {
        return services;
    }

    public List<Room> getAvailableRooms() {
        return availableRooms;
    }

}


