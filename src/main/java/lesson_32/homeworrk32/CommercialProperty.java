package lesson_32.homeworrk32;
/*
3. Класс CommercialProperty (Коммерческая недвижимость):
    Поля:
        String address (адрес);
        double area (площадь в квадратных метрах);
        String businessType (тип бизнеса: офис, склад и т.д.).
    Реализация метода calculatePrice:
        Базовая цена за 1 квадратный метр зависит от типа бизнеса:
            Офис: 1500 евро/м²;
            Склад: 800 евро/м²;
            Для остальных типов — 1000 евро/м².
 */
public class CommercialProperty implements Property {
    private String address;
    private double area;
    private String businessType;

    public CommercialProperty(String address, double area, String businessType) {
        this.address = address;
        this.area = area;
        this.businessType = businessType;
    }

    @Override
    public double calculatePrice() {
        double basePricePerSqM;
        switch (businessType.toLowerCase()) {
            case "офис":
                basePricePerSqM = 1500;
                break;
            case "склад":
                basePricePerSqM = 800;
                break;
            default:
                basePricePerSqM = 1000;
                break;
        }
        return area * basePricePerSqM;
    }

    @Override
    public void printDetails() {
        System.out.println("Коммерческая недвижимость: " + address + ", Площадь: " + area + " м², " +
                "Тип бизнеса: " + businessType + ", Цена: " + calculatePrice() + " евро");
    }
} // klass ended
