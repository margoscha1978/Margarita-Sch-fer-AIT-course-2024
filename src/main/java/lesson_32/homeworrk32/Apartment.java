package lesson_32.homeworrk32;
/*
.1. Класс Apartment (Квартира):
    Поля:
        String address (адрес);
        int floor (этаж);
        double area (площадь в квадратных метрах);
        boolean hasElevator (наличие лифта).
    Реализация метода calculatePrice:
        Базовая цена за 1 квадратный метр: 1000 евро;
        Если есть лифт, цена увеличивается на 5%.
 */
public class Apartment implements Property {
    private String address;
    private int floor;
    private double area;
    private boolean hasElevator;

    public Apartment(String address, int floor, double area, boolean hasElevator) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.hasElevator = hasElevator;
    }

    @Override
    public double calculatePrice() {
        double basePricePerSqM = 1000; // Базовая цена
        double price = area * basePricePerSqM;
        if (hasElevator) {
            price *= 1.05; // если есть лифт, цена увеличивается на 5%.
        }
        return price;
    }

    @Override
    public void printDetails() {
        System.out.println("Квартира: " + address + ", Этаж: " + floor + ", Площадь: " + area + " м²," +
                " Цена: " + calculatePrice() + " евро");
    }
} // klass ended
