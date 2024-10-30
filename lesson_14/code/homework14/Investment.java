package homework14;
// Упражнение 2: Учёт инвестиций
// Напишите программу для отслеживания инвестиционного портфеля:
//1.Создайте список, в который добавьте пять значений стоимости акций.
//2.Добавьте стоимость новых акций на 6-й месяц.
//3.Найдите общую сумму инвестиций.
//4.Удалите акции, стоимость которых меньше 1000 евро.
//5.Отсортируйте список акций по возрастанию.
//6.Выведите итоговый список и размер оставшихся инвестиций.

import java.util.ArrayList;
import java.util.Collections;

public class Investment {
    public static void main(String[] args) {
        // Создание списка для акций
        ArrayList<Double> stockPrices = new ArrayList<>();

        // Добавление пяти значений стоимости акций
        stockPrices.add(1200.50);
        stockPrices.add(800.75);
        stockPrices.add(1500.00);
        stockPrices.add(400.25);
        stockPrices.add(950.00);

        // Добавление стоимости новых акций на 6-й месяц
        stockPrices.add(1100.00); // Добавляем новую акцию

        // Нахождение общей суммы инвестиций
        double totalInvestment = 0;
        for (double price : stockPrices) {
            totalInvestment += price; // Суммируем стоимости всех акций
        }
        System.out.println("Общая сумма инвестиций: " + totalInvestment);

        // Удаление акций, стоимость которых меньше 1000 евро
        stockPrices.removeIf(price -> price < 1000);

        // Сортировка списка акций по возрастанию
        Collections.sort(stockPrices);

        // Вывод итогового списка
        System.out.println("Итоговый список акций: " + stockPrices);

        // Вычисляем оставшуюся сумму инвестиций
        double remainingInvestment = 0;
        for (double price : stockPrices) {
            remainingInvestment += price;
        }
        System.out.println("Размер оставшихся инвестиций: " + remainingInvestment);
    }

} //klass ende
