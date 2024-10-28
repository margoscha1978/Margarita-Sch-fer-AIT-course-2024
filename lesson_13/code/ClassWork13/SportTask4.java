package ClassWork13;
// Подсчет количества медалей:
// Напишите программу, которая запрашивает у пользователя количество
// спортсменов и количество медалей (золотых, серебряных и бронзовых),
// полученных каждым спортсменом.
// Программа должна вывести общее количество каждой категории медалей.
// Пример ввода:
// Введите количество спортсменов: 2
// Медали спортсмена 1: Золотых медалей: 3 Серебряных медалей: 2 Бронзовых медалей: 1
// Медали спортсмена 2: Золотых медалей: 1 Серебряных медалей: 4 Бронзовых медалей: 3

import java.util.Scanner;

public class SportTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of games:");
        int amountOfSportsMann = scanner.nextInt();
        // массив медалей
        int[] goldMedal = new int[amountOfSportsMann];
        int[] silverMedal = new int[amountOfSportsMann];
        int[] bronzeMedal = new int[amountOfSportsMann];
        // подсчитываем
        for (int i = 0; i < amountOfSportsMann ; i++) {
            System.out.println("Enter gold medal for sportsman " + (i + 1) + ":");
            goldMedal[i] = scanner.nextInt();
            System.out.println("Enter silver medal for sportsman " + (i + 1) + ":");
            silverMedal[i] = scanner.nextInt();
            System.out.println("Enter bronze medal for sportsman " + (i + 1) + ":");
            bronzeMedal[i] = scanner.nextInt();

        }
        int goldTotal = calculateTotalMedal(goldMedal);
        int silverTotal = calculateTotalMedal(silverMedal);
        int bronzeTotal = calculateTotalMedal(bronzeMedal);

        System.out.println("Total gold medal: " + goldTotal);
        System.out.println("Total silver medal: " + silverTotal);
        System.out.println("Total bronze medal: " + bronzeTotal);
        scanner.close();
    }

    public static int calculateTotalMedal(int[] medal) {
        int totalSum = 0;
        for (int i = 0; i < medal.length; i++) {
            totalSum = totalSum + medal[i];
        }
        return totalSum;
    }

} // klass ende










