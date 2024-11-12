public class Pet {
//Задача 1. В классе Pet имеются поля:
// id
// вид
// возраст
// кличка
// Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
// порода, рост, вес
// Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl, в котором есть метод main.
// Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.

    protected int id;
    protected String type;
    protected int age;
    protected String nickname;

    public Pet(int id, String type, int age, String nickname) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.nickname = nickname;
    }

}//klass ende