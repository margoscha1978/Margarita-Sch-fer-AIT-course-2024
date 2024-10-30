package homework14;

import java.util.Scanner;

public class Theatre1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите количество спектаклей: ");
        int theaterProductionAmount = scanner.nextInt();

        int[] placeAmount = new int[theaterProductionAmount];
        int[] ticketsCount = new int[theaterProductionAmount];

        for (int i = 0; i < theaterProductionAmount; i++) {
            System.out.print("Введите количество мест в зале для спектакля " + (i + 1) + ":");
            placeAmount[i] = scanner.nextInt();
            System.out.print("Введите количество проданных билетов на спектакль " + (i + 1) + ":");
            ticketsCount[i] = scanner.nextInt();

        }
        calculateArrays(placeAmount, ticketsCount);
        scanner.close();

    }

    public static void calculateArrays(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            System.err.println("Данные не верны !!!");
        } else {
            int freePlaces = 0;
            for (int i = 0; i < arrayOne.length; i++) {
                freePlaces = freePlaces + (arrayOne[i] - arrayTwo[i]);
                System.out.println("Свободных мест на спектакле " + (i + 1) + " : " + (arrayOne[i] - arrayTwo[i]));

            }
            System.out.println("Общее количество свободных мест: " + freePlaces);
        }
    }

} // klass ende
