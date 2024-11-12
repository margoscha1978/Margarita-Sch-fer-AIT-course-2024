package ClassWork15;
//  Упражнение 2: Учёт инвестиций
//  напишите программу для отслеживания инвестиционного портфеля:
//  Создайте список, в который добавьте пять значений стоимости акций.
//  Добавьте стоимость новых акций на 6-й месяц.
//  Найдите общую сумму инвестиций.
//  Удалите акции, стоимость которых меньше 1000 евро.
//  Отсортируйте список акций по возрастанию.
//  Выведите итоговый список и размер оставшихся инвестиций.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class InvestmentApp {
    public static void main(String[] args) {

        // Создайте список, в который добавьте пять значений стоимости акций.
        // Create a list and add five stock values.
        ArrayList<Double> investments = new ArrayList<>();
        investments.add(13000.0);
        investments.add(1000.0);
        investments.add(1100.0);
        investments.add(100.0);
        investments.add(1500.0);

        // Добавьте стоимость новых акций на 6-й месяц.
        // Add a new stock value for the 6th month.
        investments.add(2000.0);

        double investmentsSum = 0;

        // Найдите общую сумму инвестиций.
        // Calculate the total amount of investments.
        for (Double investment : investments) {
            investmentsSum = investmentsSum + investment;
        }
        System.out.println("Investments total for 6 months: " + investmentsSum);

        // Удалите акции, стоимость которых меньше 1000 евро.
        // Remove stocks with a value less than 1000 euros.
        Iterator<Double> iterator = investments.iterator();
        while (iterator.hasNext()) {
            Double investment = iterator.next();
            if (investment < 1000.0) {
                iterator.remove();
            }
        }

        // Вывести список инвестиций после удаления.
        // Display the investment list after deletion.
        System.out.println("Investments total after removal: " + investments);

        // Отсортируйте список акций по возрастанию.
        // Sort the list of stocks in ascending order.
        Collections.sort(investments);

        // Выведите итоговый список и размер оставшихся инвестиций.
        // Print the final sorted list and the remaining investment size.
        System.out.println("Sorted investments: " + investments);
        System.out.println("Number of remaining investments: " + investments.size());
    }

} // klass ended
