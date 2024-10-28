package ClassWork13;
// Подсчет очков в баскетболе:
// Напишите программу, которая запрашивает у пользователя количество игр
// и количество очков, набранных в каждой игре.
// Программа должна вывести общее количество очков и среднее количество очков за игру.

import java.util.Scanner;

public class SportTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of games:");
        int amountOfGames = scanner.nextInt();
        double[] points = new double[amountOfGames];
        double sum = 0;
        for (int i = 0; i < amountOfGames; i++) {
            System.out.println("Enter your points for game " + (i + 1) + ":");
            points[i] = scanner.nextDouble();
            sum = sum + points[i];
        }
        System.out.println("Average points: " + sum / points.length);
        scanner.close();

    }

} // klass ende