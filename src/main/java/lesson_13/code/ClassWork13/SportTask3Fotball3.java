package ClassWork13;

import java.util.Scanner;

public class SportTask3Fotball3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Amount of games:");
            int amountOfGames = scanner.nextInt();
            int[] yellowCard = new int[amountOfGames];
            int[] redCard = new int[amountOfGames];
            for(int i = 0; i < amountOfGames; i++) {
                System.out.println("Enter yellow cards for game " + (i + 1) + ":");
                yellowCard[i] = scanner.nextInt();
                System.out.println("Enter redcards for game " + (i + 1) + ":");
                redCard[i] = scanner.nextInt();
            }
            int yellowTotal = calculateTotalCards(yellowCard);
            int redTotal = calculateTotalCards(redCard);

            System.out.println("Total yellow cards: " + yellowTotal);
            System.out.println("Total red cards: " + redTotal);
        }

        public  static int calculateTotalCards(int [] cards) {
            int totalSum = 0;
            for(int i = 0; i < cards.length; i++) {
                totalSum = totalSum + cards[i];
            }
            return totalSum;
    }
}
