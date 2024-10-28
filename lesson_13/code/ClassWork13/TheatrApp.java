package ClassWork13;

import java.util.Scanner;

public class TheatrApp {

    /*
    Оценка загрузки театра по дням недели

Напишите программу, которая запрашивает количество спектаклей,
проведенных в разные дни недели, и количество зрителей,
посетивших каждый спектакль. Программа должна вывести среднее количество зрителей
на спектаклях в будние дни (понедельник-пятница) и в выходные дни (суббота и воскресенье).

Оценка загрузки театра по дням недели

Пример ввода:
Введите количество спектаклей: 7
Введите количество зрителей на спектакле 1 (день недели - понедельник): 100
Введите количество зрителей на спектакле 2 (день недели - вторник): 120
Введите количество зрителей на спектакле 3 (день недели - среда): 130
Введите количество зрителей на спектакле 4 (день недели - четверг): 150
Введите количество зрителей на спектакле 5 (день недели - пятница): 140
Введите количество зрителей на спектакле 6 (день недели - суббота): 200
Введите количество зрителей на спектакле 7 (день недели - воскресенье): 180

Пример вывода:
Среднее количество зрителей в будние дни: 128.0
Среднее количество зрителей в выходные дни: 190.0

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dayOfweek = {"понедельник", "вторник", "среда","четверг", "пятница", "суббота", "воскресенье" };
        System.out.print("Введите количество спектаклей: ");
        int amountOfSpectacles = scanner.nextInt();
        while (amountOfSpectacles < 0 || amountOfSpectacles > 7) {
            System.err.println("Неверное значение. Введите 0-7: ");
            amountOfSpectacles = scanner.nextInt();
        }
        int[] spectacles = new int[amountOfSpectacles];
        double spactacesWorkingDay = 0;
        double spactacesWeekend = 0;
        for (int i = 0; i < spectacles.length; i++) {
            System.out.print("Введите количество зрителей на спектакле " + (i + 1) + ": " +" (день недели - " + dayOfweek[i] + "):");
            spectacles[i] = scanner.nextInt();
            if(i < 5) {
                spactacesWorkingDay = spactacesWorkingDay + spectacles[i];
            }
            else {
                spactacesWeekend = spactacesWeekend + spectacles[i];
            }
        }
        double averagespactacesWorkingDay = spactacesWorkingDay/5;
        double averagespactacesWeekend = spactacesWeekend/2;

        System.out.println("Среднее количество зрителей в будние дни: " + averagespactacesWorkingDay);
        System.out.println("Среднее количество зрителей в выходные дни: " + averagespactacesWeekend);

        scanner.close();

    }
} // klass ende


