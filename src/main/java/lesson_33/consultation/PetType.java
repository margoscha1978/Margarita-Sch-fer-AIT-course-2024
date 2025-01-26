package lesson_33.consultation;
/*
Упражнение 1: Перечисление типов домашних животных
 - создайте перечисление PetType, которое содержит следующие типы домашних животных:
	•	DOG (собака)
	•	CAT (кошка)
	•	HAMSTER (хомяк)
	•	PARROT (попугай)
	•	FISH (рыбка)
Задания:
	1.	Добавьте к каждому типу домашнего животного строковое описание (например, “Собака”, “Кошка”).
	2.	Реализуйте метод getDescription(), который возвращает описание типа.
	3.	Создайте основной класс с методом main(), в котором вы:
	•	Переберете все значения из PetType с помощью цикла for.
	•	Для каждого значения выведите название типа и его описание.
 */
public enum PetType {

    DOG("Собака"),
    CAT("Кошка"),
    HAMSTER("Хомяк"),
    PARROT("Попугай"),
    FISH("Рыбка");

    private final  String description;

    PetType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

} // klass ended
