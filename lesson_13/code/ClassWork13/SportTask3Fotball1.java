package ClassWork13;

import java.util.Scanner;

public class SportTask3Fotball1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of matches: ");
        int matches = scanner.nextInt();
        int[] yellowCard = new int[matches];
        int[] redCard = new int[matches];
        int sumYellowCard = 0;
        int sumRedCard = 0;

        int i;
        for (i = 0; i < matches; i++) {
            System.out.println("Enter the number of yellow cards in match number: " + (i+1));
            yellowCard[i] = scanner.nextInt();
            sumYellowCard += yellowCard[i];
            System.out.println("Enter the number of red cards in match number: " + (i+1));
            redCard[i] = scanner.nextInt();
            sumRedCard += redCard[i];
        }

        System.out.println("The number of the yellow cards in all matches are: " + sumYellowCard);
        System.out.println("The number of the yellow cards in all matches are: " + sumRedCard);

        scanner.close();

    }

} // klass ende
