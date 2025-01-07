public class HouseAppl {
    public static void main(String[] args) {
        //Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
        // Создайте HouseAppl, в котором есть метод main.
        // Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.

        Dog dog1 = new Dog(1, "Рекс", 3, "Овчарка", 60, 30);
        Dog dog2 = new Dog(2, "Мухтар", 2, "Бульдог", 50, 25);
        Cat cat1 = new Cat(3, "Мурка", 1, "Перс", 30, 5);
        Cat cat2 = new Cat(4, "Васька", 2, "Сиамская", 25, 4);
        Cat cat3 = new Cat(5, "Барсик", 4, "Мейн-кун", 35, 6);

        // Моделируем жизнь питомцев в течение дня
        System.out.println("Жизнь питомцев в доме:");
        dog1.bark();
        dog1.live();
        dog2.bark();
        dog2.live();
        cat1.meow();
        cat1.live();
        cat2.meow();
        cat2.live();
        cat3.meow();
        cat3.live();
    }
    }//klass ende
