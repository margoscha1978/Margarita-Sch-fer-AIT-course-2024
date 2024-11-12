package ClassWork16;

public class Car1Manager {
    public static void main(String[] args) {
        // Создаем объект класса Car
        Car1 carAudi = new Car1();

        // Устанавливаем значения для полей объекта carAudi
        carAudi.brand = "Audi";         // Марка автомобиля
        carAudi.color = "Red";          // Цвет автомобиля
        carAudi.year = 2016;            // Год выпуска
        carAudi.price = 35000;          // Цена автомобиля
        carAudi.miles = 2500;           // Пробег автомобиля
        carAudi.horsepower = 250;       // Лошадиные силы

        // Вызов метода showCarInfo для отображения информации об автомобиле Audi
        carAudi.showCarInfo();

        // Обновляем значение поля miles и снова выводим информацию
        carAudi.miles = 5000;
        carAudi.showCarInfo();

        // Обновляем значение поля price и снова выводим информацию
        carAudi.price = 30000;
        carAudi.showCarInfo();

        // Создаем объект класса Car с параметрами и устанавливаем значения всех полей
        Car1 carBMW = new Car1(50000, "BMW", 2020, "Black", 18000, 300);

        // Вызов метода showCarInfo для отображения информации об автомобиле BMW
        carBMW.showCarInfo();

        // Обновляем значение поля miles и снова выводим информацию
        carBMW.miles = 25000;
        carBMW.showCarInfo();
    }

} // klass ended
