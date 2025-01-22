package lesson_32.homeworrk32;
/*
2. Класс House (Дом):
    Поля:
        String address (адрес);
        double area (площадь дома в квадратных метрах);
        double landArea (площадь участка в квадратных метрах);
        boolean hasGarage (наличие гаража).
    Реализация метода calculatePrice:
        Базовая цена за 1 квадратный метр дома: 800 евро;
        Цена за 1 квадратный метр участка: 200 евро;
        Если есть гараж, добавляется фиксированная стоимость 5000 евро.
 */
public class House implements Property {
    private String address;
    private double area;
    private double landArea;
    private boolean hasGarage;

    public House(String address, double area, double landArea, boolean hasGarage) {
        this.address = address;
        this.area = area;
        this.landArea = landArea;
        this.hasGarage = hasGarage;
    }

    @Override
    public double calculatePrice() {
        double basePricePerSqMHouse = 800;
        double basePricePerSqMLand = 200;
        double price = (area * basePricePerSqMHouse) + (landArea * basePricePerSqMLand);
        if (hasGarage) {
            price += 5000; // фиксированная стоимость гаража
        }
        return price;
    }

    @Override
    public void printDetails() {
        System.out.println("Дом: " + address + ", Площадь: " + area + " м², Площадь участка: " + landArea + " м²," +
                " Цена: " + calculatePrice() + " евро");
    }
} // klass ended
