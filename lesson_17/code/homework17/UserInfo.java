package homework17;
//Задача 1.
//Реализовать приложение, которое запрашивает информацию о вас, и выводит итоговую строку.
//Пример:
//Введите ваше имя:
//Введите вашу фамилию:
//Введите ваш город:
//Введите ваш возраст:
//Введите ваш рост (в метрах):
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // dannie peremennich
        String name, surname, citi;
         int age = 0;
        double height = 0;

//chitaem dannie
        System.out.println("Your name: ");
        name = scanner.nextLine();

        System.out.println("Your surname: ");
        surname = scanner.nextLine();

        System.out.println("Your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your citi: ");
        citi = scanner.nextLine();

        System.out.println("Yuor height of sm: ");
        height = scanner.nextDouble();
        scanner.nextLine();

        //resultat
        System.out.println("Yuor informacion: ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Citi: " + citi);
        System.out.println("Height: " + height);
    }
}