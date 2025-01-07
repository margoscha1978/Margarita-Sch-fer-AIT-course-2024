package ClassWork13;
// Подсчет количества желтых и красных карточек:
// Напишите программу, которая запрашивает у пользователя количество матчей и
// количество желтых и красных карточек, полученных командой в каждом матче.
// Программа должна вывести общее количество желтых и красных карточек.
// Пример ввода:
// Введите количество матчей: 2
// Введите количество желтых карточек в матче 1: 3
// Введите количество красных карточек в матче 1: 1
// Введите количество желтых карточек в матче 2: 2
// Введите количество красных карточек в матче 2: 0

import java.util.Scanner;

public class SportTask3Fotball { // неизменное решениебс другими ситуациями не работает
    public static void main(String[] args) {
        // создаем 2 отдельных массива для карт
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество матчей: ");
        int numberOfMatches = scanner.nextInt();

        int totalYellowCards = 0;
        int totalRedCards = 0;

        for (int i = 0; i < numberOfMatches; i++) {
            System.out.print("Введите количество желтых карточек в матче " + (i + 1) + ": ");
            int yellowCards = scanner.nextInt();
            totalYellowCards += yellowCards;

            System.out.print("Введите количество красных карточек в матче " + (i + 1) + ": ");
            int redCards = scanner.nextInt();
            totalRedCards += redCards;
        }

        System.out.println("Общее количество желтых карточек: " + totalYellowCards);
        System.out.println("Общее количество красных карточек: " + totalRedCards);

    }

} // klass ende