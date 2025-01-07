package ClassWork16;

import java.util.Scanner;

public class Car1 {
   //  поля класса переменные описывают свойства объекта
   double price;       // Цена автомобиля
    String brand;       // Марка автомобиля
    int year;           // Год выпуска
    String color;       // Цвет автомобиля
    int miles;          // Пробег в милях
    int horsepower;     // Лошадиные силы

    // Конструктор по умолчанию без параметров
    public Car1() {
    }

    // Конструктор с параметрами для инициализации всех полей
    public Car1(double price, String brand, int year, String color, int miles, int horsepower) {
        this.price = price;         // Устанавливаем цену
        // Setting the price
        this.brand = brand;         // Устанавливаем марку
        // Setting the brand
        this.year = year;           // Устанавливаем год выпуска
        // Setting the year of manufacture
        this.color = color;         // Устанавливаем цвет
        // Setting the color
        this.miles = miles;         // Устанавливаем пробег
        // Setting the mileage
        this.horsepower = horsepower; // Устанавливаем лошадиные силы
        // Setting the horsepower
    }

    // Метод для отображения информации об автомобиле
    public void showCarInfo() {
        System.out.println("Brand: " + brand);          // Вывод марки автомобиля
        // Printing the brand of the car
        System.out.println("Price: " + price);          // Вывод цены автомобиля
        // Printing the price of the car
        System.out.println("Year: " + year);            // Вывод года выпуска
        // Printing the year of manufacture
        System.out.println("Color: " + color);          // Вывод цвета автомобиля
        // Printing the color of the car
        System.out.println("Horsepower: " + horsepower); // Вывод мощности автомобиля
        // Printing the horsepower of the car
        System.out.println("Miles: " + miles);          // Вывод пробега автомобиля
        // Printing the mileage of the car
        System.out.println("--------------------------");
    }

}// klass ended
