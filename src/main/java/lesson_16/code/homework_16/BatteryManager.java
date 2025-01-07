package homework_16;
/*
Упражнение 4:
Добавьте к классу MobilePhone поле batteryLevel (уровень заряда батареи) типа int,
 которое будет представлять уровень заряда телефона в процентах (от 0 до 100).
1.	Добавьте метод useBattery(int amount), который уменьшает уровень заряда батареи на указанное количество.
 Если после уменьшения уровень заряда падает ниже 0, установите его в 0 и выведите сообщение “Батарея разряжена”.
2.	Добавьте метод chargeBattery(int amount), который увеличивает уровень заряда батареи на указанное количество.
 Если уровень заряда превышает 100, установите его на 100 и выведите сообщение “Батарея полностью заряжена”.
 */
public class BatteryManager {
    private int batteryLevel;

    // конструктор для батареи
    public BatteryManager(int initialLevel) {
        this.batteryLevel = initialLevel; // Начальный уровень заряда
    }
    // управление батареей, контроль заряда
    public void useBattery(int amount) {
        batteryLevel -= amount;
        if (batteryLevel < 0) {
            batteryLevel = 5;
            System.out.println("Батарея разряжена,minimum");
        }
    }
    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) {
            batteryLevel = 50;
            System.out.println("Батарея полностью заряжена,maximum");
        }
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }

} // klass ended
