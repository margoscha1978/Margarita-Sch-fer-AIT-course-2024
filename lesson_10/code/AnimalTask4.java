import java.util.Scanner;
// Напишите программу, которая запрашивает у пользователя несколько названий животных и выводит самое длинное и самое короткое название среди введенных.
//Подсказки:
//Используйте цикл для ввода названий животных.
//Примените метод length() для проверки длины каждого названия.
//Пример:
//Введите название животного (или пустую строку для завершения): Кошка
//Введите название животного (или пустую строку для завершения): Лев
//Введите название животного (или пустую строку для завершения): Крокодил
//Вывод:
//Самое длинное название: Крокодил
//Самое короткое название: Лев

public class AnimalTask4 {
        /*

        Напишите программу, которая запрашивает у пользователя несколько названий животных и выводит самое длинное и самое короткое название среди введенных.
    Подсказки:
    Используйте цикл для ввода названий животных.
    Примените метод length() для проверки длины каждого названия.
    Пример:
    Введите название животного (или пустую строку для завершения): Кошка
    Введите название животного (или пустую строку для завершения): Лев
    Введите название животного (или пустую строку для завершения): Крокодил

    Вывод:
    Самое длинное название: Крокодил
    Самое короткое название: Лев

         */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String animalMaxname = "";
            String animalMinname = "";
            do {
                System.out.println("Enter the name of an animal (or an empty string to stop):");
                String animalname = scanner.nextLine().trim();

                if (animalname.isEmpty()) {
                    break;
                }

                int animalnameLength = animalname.length();
                if (animalnameLength > animalMaxname.length()) {
                    animalMaxname = animalname;
                }

                if(animalMinname.isEmpty()){
                    animalMinname = animalname;
                }

                else if (animalnameLength < animalMinname.length()){
                    animalMinname = animalname;
                }

            }
            while (true);
            System.out.println("The longest name: " + animalMaxname);
            System.out.println("The shortest name: " + animalMinname);

            scanner.close();
        }
    }

