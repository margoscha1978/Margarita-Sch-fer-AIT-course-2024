package ClassWork15;
// Подсчет личных рекордов в плавании
// Описание: Напишите программу, которая запрашивает у пользователя количество плавательных соревнований
// и время для каждого заплыва. Программа должна вывести самое быстрое время (личный рекорд)
// и сколько раз оно было побито или повторено.
// Пример ввода:
// Введите количество соревнований: 5
// Введите время заплыва 1: 50.5
// Введите время заплыва 2: 51.0
// Введите время заплыва 3: 50.2
// Введите время заплыва 4: 50.5
// Введите время заплыва 5: 50.2
// Пример вывода:
// Личный рекорд: 50.2 секунд
// Личный рекорд был побит или повторен 2 раза
// написать два разных метода, один на подсчет рекорда, а второй на количество его повторений или его побитий

import java.util.Scanner;

public class SwimmingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество соревнований: ");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.err.println("Неверное значение. введите другое");
            System.out.println("Введите количество соревнований: ");
            number = scanner.nextInt();
        }
        double [] lapTime = new double[number];
        double bestResult = Double.MAX_VALUE;
        int recordBrokenCount = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("Введите время заплыва " + (i+1) + ":");
            lapTime[i] = scanner.nextDouble();
            if(lapTime[i] < bestResult) {
                bestResult = lapTime[i];
            }
        }

        System.out.println("Личный рекорд: " + bestResult + " секунд");
        for (double result : lapTime) {
            if (result == bestResult) {
                recordBrokenCount++;
            }
        }
        System.out.println("Личный рекорд был побит или повторен " + recordBrokenCount + " раза");

    }

} // klass ended
