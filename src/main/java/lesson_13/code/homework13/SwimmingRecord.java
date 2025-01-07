package homework13;
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

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Шаг 1: Запрос количества соревнований
        System.out.print("Введите количество соревнований: ");
        int numberOfCompetitions = scanner.nextInt();

        if (numberOfCompetitions <= 0) {
            System.out.println("Количество соревнований должно быть положительным!");
            return; // Завершаем программу, если количество соревнований - 0 или отрицательное
        }

        double[] times = new double[numberOfCompetitions];

        // Шаг 2: Запрос времени заплыва
        for (int i = 0; i < numberOfCompetitions; i++) {
            System.out.print("Введите время заплыва " + (i + 1) + ": ");
            times[i] = scanner.nextDouble();
        }

        // Шаг 3: Подсчет личного рекорда
        double personalRecord = findPersonalRecord(times);

        // Шаг 4: Подсчет побитий или повторений
        int count = countRecordBreaks(times, personalRecord);

        // Шаг 5: Вывод результатов
        System.out.println("Личный рекорд: " + personalRecord + " секунд");
        System.out.println("Личный рекорд был побит или повторен " + count + " раз");

        scanner.close(); // Закрываем сканер
    }

    public static double findPersonalRecord(double[] times) {
        double bestTime = times[0]; // Начинаем с первого времени
        for (double time : times) {
            if (time < bestTime) {
                bestTime = time; // Если нашли лучшее время, обновляем
            }
        }
        return bestTime;
    }

    public static int countRecordBreaks(double[] times, double record) {
        int count = 0;
        for (double time : times) {
            if (time < record) { // Учитываем только те времена, которые меньше рекорда
                count++;
            } else if (time == record) {
                count++; // Увеличиваем, если равно рекорду
            }
        }
        return count; // Возвращаем общее количество
    }

} // klass ended