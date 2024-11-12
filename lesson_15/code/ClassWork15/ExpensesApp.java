package ClassWork15;

import java.util.ArrayList;
import java.util.Iterator;

/*
Напишите программу, которая:
1.  Создаст список для хранения ежемесячных расходов на продукты (в евро) за 6 месяцев.
2.  Выведет все расходы по месяцам.
3.  Найдёт и выведет месяц с наибольшим расходом.
4.  Удалит расходы, превышающие 300 евро.
5.  Посчитает, сколько месяцев остались после удаления (размер списка).
 */
public class ExpensesApp {
    public static void main(String[] args) {
        //Создаст список для хранения ежемесячных расходов на продукты (в евро) за 6 месяцев.
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.0);
        expenses.add(130.0);
        expenses.add(210.0);
        expenses.add(220.0);
        expenses.add(390.0);
        expenses.add(400.0);

        // Создаст список для хранения названий месяцев.
        ArrayList<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");

        double maxExpense = 0;
        int indexMaxExpense = 0;

        //Выведет все расходы по месяцам.
        for(int i = 0; i < expenses.size(); i++){
            System.out.println("Month: " + months.get(i) + " expense: " + expenses.get(i));
            //Найдёт месяц с наибольшим расходом.
            if(expenses.get(i) > maxExpense){
                maxExpense = expenses.get(i);
                indexMaxExpense = i;
            }
        }
        //Выведет месяц с наибольшим расходом.
        System.out.println("Max expense: " + maxExpense + " month: " + months.get(indexMaxExpense));

        //Удалит расходы, превышающие 300 евро.
        Iterator<Double> iterator = expenses.iterator();
        while(iterator.hasNext()){
            Double expense = iterator.next();
            if(expense > 300.0){
                iterator.remove();
            }
        }

        System.out.println("Total expenses: " + expenses.size());

    }

} // klass ende
