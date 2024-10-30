package homework14;
//  Упражнение 4:
// Оценки спектаклей зрителями: Описание: Напишите программу,
// которая запрашивает количество зрителей и оценки, которые они поставили
// спектаклю (по шкале от 1 до 10). Программа должна вывести количество каждой
//оценки и определить, сколько человек оценили спектакль на 9 или 10 баллов. Пример:
// Пример ввода:
// Введите количество зрителей: 5
// Введите оценку зрителя 1: 8
// Введите оценку зрителя 2: 9
// Введите оценку зрителя 3: 7
// Введите оценку зрителя 4: 10
// Введите оценку зрителя 5: 6
// Оценки:
// 1 баллов: 0
// 2 баллов: 0
// 3 баллов: 0
// 4 баллов: 0
// 5 баллов: 0
// 6 баллов: 1
// 7 баллов: 1
// 8 баллов: 1
// 9 баллов: 1
// 10 баллов: 1
// Число зрителей, оценивших спектакль на 9 или 10 баллов: 2

import java.util.Scanner;

public class HingRatings1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество зрителей: ");
        int countViewers = scanner.nextInt();
        int[] votes = new int[countViewers];
        int[] votesStatistics = new int[10];
        int maxRatingViewers = 0;

        for (int i = 0; i < votes.length; i++) {
            System.out.println("Введите оценку зрителя " + (i + 1) + ": ");
            votes[i] = scanner.nextInt();
            switch (votes[i]) {
                case 1:
                    votesStatistics[0]++;
                    continue;
                case 2:
                    votesStatistics[1]++;
                    continue;
                case 3:
                    votesStatistics[2]++;
                    continue;

                case 4:
                    votesStatistics[3]++;
                    continue;

                case 5:
                    votesStatistics[4]++;
                    continue;

                case 6:
                    votesStatistics[5]++;
                    continue;

                case 7:
                    votesStatistics[6]++;
                    continue;

                case 8:
                    votesStatistics[7]++;
                    continue;

                case 9:
                    votesStatistics[8]++;
                    if (votes[i] == 9) {
                        maxRatingViewers++;
                    }
                    continue;

                case 10:
                    votesStatistics[9]++;
                    if (votes[i] == 10) {
                        maxRatingViewers++;
                    }

            }

        }
        System.out.println("Оценки");
        for (int i = 0; i < votesStatistics.length; i++) {
            System.out.println(i + 1 + " баллов: " + votesStatistics[i]);
        }

        System.out.println("Число зрителей, оценивших спектакль на 9 или 10 баллов: "
                + maxRatingViewers);
        scanner.close();

    }

} // klass ende
