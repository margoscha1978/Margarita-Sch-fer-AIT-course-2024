package homework_16;

public class MobilePhone {
    /*
Упражнение 1:
Создайте класс MobilePhone, который будет представлять сотовый телефон.
1.	Добавьте следующие поля:
•	brand (марка телефона) типа String
•	model (модель телефона) типа String
•	price (цена телефона) типа double
2.	Добавьте метод displayInfo(),
 который будет выводить информацию о телефоне на экран (например, марка, модель, цена).

Упражнение 2:
Добавьте к классу MobilePhone два конструктора:
1.	Конструктор по умолчанию, который присваивает значения полям brand, model,
price как Unknown, Unknown Model и 0.0 соответственно.
2.	Параметризованный конструктор, который принимает brand,
model и price в качестве аргументов и инициализирует ими поля класса.

Упражнение 3:
Добавьте к классу MobilePhone следующие методы:
1.	turnOn() — выводит сообщение “Телефон включен”.
2.	turnOff() — выводит сообщение “Телефон выключен”.
3.	call(String number) — принимает номер телефона в виде строки и выводит сообщение вида “Звонок на номер [номер]”.
     */
String brand;
String model;
double price;
BatteryManager batteryManager ; // управляем батареей
boolean isOn; // включен или выключен

    // конструктор по умолчанию, без заданных параметров телефона
    public MobilePhone() {
       this.brand = "Unknown Brand"; // название по умолчанию
       this.model = "Unknown Model"; // модель по умолчанию
       this.price = 0.0; // цена по умолчанию
        this.batteryManager = new BatteryManager(100); // Начальный заряд батареи 100%
    }

    // конструктор, принимающий модель, цену и марку в качестве аргументов с заданными полями
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryManager = new BatteryManager(100);// Начальный заряд батареи 100%
        this.isOn = false; // телефон отключен
    }

    // методы для работы с батареей
    public void useBattery(int amount) {
        batteryManager.useBattery(amount);
    }

    public void chargeBattery(int amount) {
        batteryManager.chargeBattery(amount);
    }

    // методы для работы с телефоном
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price + ", Battery Level: "
                + batteryManager.getBatteryLevel() + "%");
    }
    public void TurnOn(){
        if (!isOn){
            isOn = true;
            System.out.println("Ваш телефон включен");
        } else {
            System.out.println("Вы включили ваш телефон");
        }
    }
    public void turnOff(){
        if (isOn){
            isOn = false;
            System.out.println("Ваш телефон выключен");
        } else {
            System.out.println("Вы выключили ваш телефон");
        }
    }
    public void call(String number){
        if (isOn){
            System.out.println("Звонок на номер" + number + " ");

            batteryManager.useBattery(95); // предупреждение при низком заряде батареи,
                                                      // когда звонок становится не возможен
        } else {
            System.out.println("Заряд телефона очень низкий.Звонок не возможно осуществить");
        }

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MobilePhone{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

} // klass ended