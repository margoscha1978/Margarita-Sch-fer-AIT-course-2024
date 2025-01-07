package ClassWork13;

import java.util.Scanner;

public class SportTask2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("количество игр:");
        int numberOfGames = scanner.nextInt();
        int[] scores = new int[numberOfGames];
        int total = 0;
        for (int i = 0; i < numberOfGames; i++) {
            System.out.println("количество очков" + (i + 1) + ":");
            scores[i] = scanner.nextInt();
            total += scores[i];
        }
        double averagePoints = (double) total/numberOfGames;

        System.out.println("Общее кол-во очков: " + total);
        System.out.println("Общее кол-во очков за игру: " + averagePoints);
        scanner.close();
    }

}//klass ende
