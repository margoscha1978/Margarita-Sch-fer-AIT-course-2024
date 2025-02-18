package ClassWork28.car_garage.AIT;
// Задание:
// Напишите программу, которая симулирует ежемесячные выплаты по кредиту. Программа должна запрашивать сумму кредита, процентную ставку и количество месяцев. Для каждого месяца программа должна выводить текущую сумму кредита и сколько было выплачено.
// Подсказки:
// Используйте цикл для расчета ежемесячных выплат с учетом процентов.
// Выплаты должны уменьшать основной долг, а проценты начисляться на оставшуюся сумму.
// Пример:
// Введите сумму кредита: 1200
// Введите процентную ставку: 2
// Введите количество месяцев: 3
// Месяц 1: Выплачено: 400, Остаток долга: 816
// Месяц 2: Выплачено: 400, Остаток долга: 432.32
// Месяц 3: Выплачено: 400, Остаток долга: 48.96

import java.util.Scanner;

public class CreditRechner {
    /*

    Ежемесячные выплаты по кредиту
    Задание:
    Напишите программу, которая симулирует ежемесячные выплаты по кредиту.
    Программа должна запрашивать сумму кредита, процентную ставку и количество месяцев.
    Для каждого месяца программа должна выводить текущую сумму кредита
    и сколько было выплачено.

    Подсказки:

    •	Используйте цикл для расчета ежемесячных выплат с учетом процентов.
    •	Выплаты должны уменьшать основной долг, а проценты начисляться на оставшуюся сумму.

    Пример:
    Введите сумму кредита: 1200
    Введите процентную ставку: 2
    Введите количество месяцев: 3

    Месяц 1: Выплачено: 400, Остаток долга: 816...1200 - 400 + (1200*2%) = 816 --> A
    Месяц 2: Выплачено: 400, Остаток долга: 432.32...816 - 400 + (816*2%) -->
    Месяц 3: Выплачено: 400, Остаток долга: 48.96

         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Ввод данных от пользователя
            System.out.print("Введите сумму кредита: ");
            double loanAmount = scanner.nextDouble();

            System.out.print("Введите процентную ставку (например, 2 для 2%): ");
            double interestRate = scanner.nextDouble();

            System.out.print("Введите количество месяцев: ");
            int months = scanner.nextInt();

            calculateCredit(loanAmount, months, interestRate);

            scanner.close();

        }

        private static void calculateCredit(double loanAmount, int months, double interestRate) {
            // Рассчитаем ежемесячный платеж (без учета процентов)
            double monthlyPayment = loanAmount / months;

            // Конвертируем процентную ставку в доли (например, 2% -> 0.02)
            double monthlyInterestRate = interestRate / 100;

            // Процесс выплат по кредиту
            double remainingLoan = loanAmount;

            for (int month = 1; month <= months; month++) {
                // Начислим процент на оставшуюся сумму кредита
                double interest = remainingLoan * monthlyInterestRate;
                remainingLoan += interest;

                // Выплата за месяц
                remainingLoan -= monthlyPayment;

                // Убедимся, что долг не станет отрицательным
                if (remainingLoan < 0) {
                    remainingLoan = 0;
                }

                // Выводим информацию за каждый месяц
                System.out.printf("Месяц" + month + ": Выплачено:" + monthlyPayment +  ", Остаток долга: " + monthlyPayment);
            }
        }
    }

