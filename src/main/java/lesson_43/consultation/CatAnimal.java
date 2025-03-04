package lesson_43.consultation;

/*
3.	Создайте класс Cat, который тоже наследуется от Animal. Метод makeSound() должен выводить «Meow!».
 */
// Класс CatAnimal, представляющий кошек, наследующий класс Animal
// CatAnimal class representing cats, inheriting from the Animal class
public class CatAnimal  extends Animal {
    // Конструктор для инициализации имени и возраста кошки
    // Constructor to initialize the name and age of the cat
    public CatAnimal(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound для издания звука, характерного для кошек
    // Overriding the makeSound method to make a sound specific to cats
    @Override
    public void makeSound() {
        System.out.println("Meow. My name is" + getName() + " age is " + getAge());
    }

} // klass ended
