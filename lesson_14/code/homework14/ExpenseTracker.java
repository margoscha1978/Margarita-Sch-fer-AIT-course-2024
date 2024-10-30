package homework14;
// Упражнение 1: Учёт расходов
//Напишите программу, которая:
//1.Создаст список для хранения ежемесячных расходов на продукты (в евро) за 6 месяцев.
//2.Выведет все расходы по месяцам.
//3.Найдёт и выведет месяц с наибольшим расходом.
//4.Удалит расходы, превышающие 300 евро.
//5.Посчитает, сколько месяцев остались после удаления (размер списка).

import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<String> months = new ArrayList<>();
    private ArrayList<Double> amounts = new ArrayList<>();

    public void addExpense(String month, double amount) {
        months.add(month);
        amounts.add(amount);
    }

    public void printExpenses() {
        for (int i = 0; i < months.size(); i++) {
            System.out.println("Месяц: " + months.get(i) + ", Расходы: " + amounts.get(i));
        }
    }

    public double getHighestExpense() {
        double max = 0;
        String month = "";
        for (int i = 0; i < amounts.size(); i++) {
            if (amounts.get(i) > max) {
                max = amounts.get(i);
                month = months.get(i);
            }
        }
        System.out.println("Самые большие расходы в месяце: " + month + ", Сумма: " + max);
        return max;
    }

    public void removeExpensesAbove(double limit) {
        for (int i = 0; i < amounts.size(); i++) {
            if (amounts.get(i) > limit) {
                months.remove(i);
                amounts.remove(i);
                i--; // Уменьшить индекс, чтобы не пропустить следующий элемент
            }
        }
    }

    public int countExpensesBelow(double limit) {
        int count = 0;
        for (double amount : amounts) {
            if (amount <= limit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();

        // Пример добавления расходов
        tracker.addExpense("Январь", 250);
        tracker.addExpense("Февраль", 320);
        tracker.addExpense("Март", 150);
        tracker.addExpense("Апрель", 280);
        tracker.addExpense("Май", 310);
        tracker.addExpense("Июнь", 200);

        // Печать расходов
        tracker.printExpenses();

        // Получение самых больших расходов
        tracker.getHighestExpense();

        // Удаление расходов больше 300 евро
        tracker.removeExpensesAbove(300);

        // Печать оставшихся расходов
        System.out.println("После удаления:");
        tracker.printExpenses();

        // Подсчет месяцев с расходами ниже 300 евро
        int count = tracker.countExpensesBelow(300);
        System.out.println("Количество месяцев с расходами ниже 300 евро: " + count);
    }
} // klass ende
