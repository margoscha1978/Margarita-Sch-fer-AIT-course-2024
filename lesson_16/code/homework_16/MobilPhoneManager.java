package homework_16;
/*
Упражнение 3:
Добавьте к классу MobilePhone следующие методы:
1.	turnOn() — выводит сообщение “Телефон включен”.
2.	turnOff() — выводит сообщение “Телефон выключен”.
3.	call(String number) — принимает номер телефона в виде строки и выводит сообщение вида “Звонок на номер [номер]”.
3.1	В методе main создайте объект класса MobilePhone, установите значения полей и вызовите метод displayInfo()
 для вывода информации о телефоне.
 */
public class MobilPhoneManager {

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("Apple", "iPhone14", 999.99);

        // или еще используем конструктор без полей и задаем в него данные
        // MobilePhone mobilePhoneIphone = new MobilePhone;
        // mobilePhoneIphone.brand = "Apple "; // было "по умолчанию "
        // mobilePhoneIphone.model = "iPhone 16 ProMax "; // было "по умолчанию "
        // mobilePhoneIphone.price = "1300 "; // было "по умолчанию "
        // mobilePhonIphone.displayInfo;

        // MobilePhone mobilePhoneIphoneNoName = newMobilePhone
        // mobilePhoneNoName.displayInfo;

        // информация о телефоне
        myPhone.displayInfo();

        // включаем телефон
        myPhone.TurnOn();

        // звоним на номер
        myPhone.call(" 1234567890");

        // проверяем уровень заряда батареи после звонка
        myPhone.displayInfo();

        // выключаем телефон если заряд опустился до определенного минимума 5
        myPhone.turnOff();

    }

} // klass ended

//  можно добавить версию для работы с несколькими моделями телефонов
/*
 Создаем лист для нескольких телефонов и добавляем их:

ArrayListe<MobilePhone> phones = new ArrayList<>();

 phones.add(new MobilePhone("Apple", "iPhone13", 959.99));
 phones.add(new MobilePhone("Samsung", "Galaxy S21", 799.99));
 phones.add(new MobilePhone("Apple", "iPhone 13", 999.99));

// отображаем информацию о каждом телефоне с помощью for
for(MobilePhone phone : phones){
phone.displayInfo();
}
 // первый телефон из списка приходит с индексом 0
 MobilePhone myPhone = phones.get(0);
 */
// примерно так я представляю.