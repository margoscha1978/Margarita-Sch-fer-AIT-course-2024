package homework22;

public class ShippingService {

    // методы для работы с грузом разного веса
    public double calculateShippingCost(double weight) { // стоимость доставки исходя из веса
        if (weight <= 5) {
            return 10;
        } else if (weight <= 20) {
            return 20;
        } else {
            return 50;
        }
    }

    public boolean isZoneSupported(String zone) { // проверка активности зон доставки
        return zone.equals("EU") || zone.equals("USA") || zone.equals("ASIA");
    }

    public int calculateDeliveryTime(double distance) { // время доставки
        if (distance < 50) {
            return 1;
        } else if (distance <= 500) {
            return 3;
        } else {
            return 7;
        }
    }

} // klass ended
