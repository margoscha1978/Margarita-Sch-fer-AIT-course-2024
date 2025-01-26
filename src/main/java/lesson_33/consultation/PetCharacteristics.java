package lesson_33.consultation;
/*
Упражнение 2: Характеристики домашних животных
 - создайте перечисление PetCharacteristics, которое будет описывать характеристики домашних животных.
  Например:
	•	FRIENDLY (дружелюбный)
	•	INDEPENDENT (независимый)
	•	LOUD (шумный)
	•	QUIET (спокойный)
Задания:
	1.	Для каждого типа животных из предыдущего упражнения добавьте список соответствующих характеристик.
	2.	В методе main() напишите программу, которая:
	•	Запрашивает у пользователя тип домашнего животного.
	•	Выводит его характеристики.
	3.	Для этого:
	•	Реализуйте метод в PetType, который возвращает список характеристик для конкретного типа животного.
	•	Используйте Scanner для ввода данных от пользователя.
18:56 Uhr
Введите тип домашнего животного (DOG, CAT, HAMSTER, PARROT, FISH):
CAT
18:56 Uhr
Вы выбрали: Кошка
Характеристики:
- Независимый
- Спокойный
 */
public enum PetCharacteristics {

    FRIENDLY ("дружелюбный"),
    INDEPENDENT ("независимый"),
    LOUD ("шумный"),
    QUIET ("спокойный"),
    CRAZY("активный");


    private final  String description;

    PetCharacteristics(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
} // klass ended
