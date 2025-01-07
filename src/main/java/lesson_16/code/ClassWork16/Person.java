package ClassWork16;
/* Упражнение 1: Создание простого класса «Person»
	1.	Создайте класс Person, который будет представлять человека.
	2.	Добавьте следующие поля:
	•	String name — имя человека.
	•	int age — возраст человека.
	3.	Создайте конструктор, который принимает имя и возраст и инициализирует соответствующие поля.
	4.	Создайте метод displayInfo(), который выводит информацию о человеке в формате: “Имя: <имя>, Возраст: <возраст>”.
	5.	В методе main создайте объект класса Person и вызовите метод displayInfo() для вывода информации.
*/
public class Person {
    String name;
    int age;

    //konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metod
    public void displayInfo(){
        System.out.println("Имя: " + name + " возраст: " + age);
        System.out.println("-----------------");
    }

} // klass ended
