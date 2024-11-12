package homework15;
/*
  Напишите программу для управления простыми бухгалтерскими расходами и доходами. Программа должна:
 	1.	Предоставить пользователю возможность добавлять новые транзакции (расходы и доходы) с указанием суммы и типа (доход или расход).
 	2.	Вывести текущий список всех транзакций.
 	3.	Рассчитать и вывести итоговый баланс (разница между суммой всех доходов и всех расходов).
 	4.	Вывести только расходы, превышающие заданный порог, например, 1000 евро.
 	5.	Дать пользователю возможность удалить транзакцию по индексу.

   Пример работы программы
 	1.	Добавление новых транзакций.
 	2.	Отображение текущего списка всех транзакций.
 	3.	Расчет итогового баланса.
 	4.	Отображение крупных расходов.
 	5.	Удаление транзакции по запросу.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Accounting {

     // Используя Scanner, пользователь может добавлять транзакции с указанием типа и суммы.
    public static Scanner scanner = new Scanner(System.in);
     //	Программа хранит суммы и типы транзакций в двух ArrayList.
    static ArrayList<Double> transactionIncome = new ArrayList<>();
    static ArrayList<Double> transactionExpense = new ArrayList<>();

    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            showMenu();
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1 -> addTransaction();
                case 2 -> showAllTransactions();
                case 3 -> showTotalBalance();
                case 4 -> showBigExpense();
                case 5 -> deleteTransaction();
                case 6 -> {

                    System.out.println("Программа закончила работу ");
                    running = false;}
                default -> {
                    System.err.println("Неверный ввод. Повторите. ");
                }
            }

        }

        scanner.close();

    }

    // Программа предлагает пользователю меню с действиями.
    private static void showMenu(){
        System.out.println("\nМеню:");
        System.out.println("1. Добавить транзакцию ");
        System.out.println("2. Показать все транзакции ");
        System.out.println("3. Посчитать итоговый баланс ");
        System.out.println("4. Показать расходы более 1000 евро ");
        System.out.println("5. Удалить транзакцию по индексу ");
        System.out.println("6. Выйти ");
        System.out.println("Введите ваш выбор ");
    }

    // Пользователь может удалить транзакцию по индексу.
    private static void deleteTransaction(){ // с учетом желания клиента удалить приход или расход по индексу
        scanner.nextLine();
        System.out.println("Выберите тип трансакции : 1. Приход 2. Расход");
        int transactionChoice = scanner.nextInt();
        System.out.println("Введите индекс трансакции ");
        scanner.nextLine();
        int transactionIndex = scanner.nextInt();

        if(transactionChoice == 1){
            if(transactionIndex < 0 || transactionIndex >= transactionIncome.size()){
                System.err.println("Неверный индекс " + transactionIndex);
            }
            else {
                transactionIncome.remove(transactionIndex);
                System.out.println("Трансакция успешно удалена " );
            }
        }
        else if(transactionChoice == 2){
            if(transactionIndex < 0 || transactionIndex >= transactionExpense.size()){
                System.err.println("Неверный индекс " + transactionIndex);
            }
            else {
                transactionExpense.remove(transactionIndex);
                System.out.println("Трансакция успешно удалена " );
            }
        }
        else {
            System.err.println("Неверный выбор ");
        }

    }

    // Фильтруются расходы, превышающие 1000 евро, и выводятся.
    private static void showBigExpense(){
        System.out.println("Расходы больше 1000 ");
        double expense = 1000;
        for (Double transaction : transactionExpense) {
            if(transaction >= expense){
                System.out.println(transaction);
            }
        }

    }
    // Рассчитывается баланс: доходы суммируются, расходы вычитаются.
    private static void showTotalBalance(){
        int totalIncome = 0;
        int totalExpense = 0;
        for (Double transaction : transactionIncome) {
            totalIncome += transaction;
        }
        for (Double transaction : transactionExpense) {
            totalExpense += transaction;
        }
        double totalBalance = totalIncome - totalExpense;
        System.out.println("Доходы " + totalIncome);
        System.out.println("Расходы " + totalExpense);
        System.out.println("Баланс " + totalBalance);
    }

    // Вывести текущий список всех транзакций.
    private static void showAllTransactions(){
        if(transactionIncome.isEmpty()){
            System.out.println("Список трансакций доходов пуст ");
        }
        if(transactionExpense.isEmpty()){
            System.out.println("Список трансакций расходов пуст ");
        }
        else {
            System.out.println("Расходы: ");
            for (Double transaction : transactionExpense) {
                System.out.println(transaction);
            }
            System.out.println("Доходы: ");
            for (Double transaction : transactionIncome) {
                System.out.println(transaction);
            }
        }
    }
    // Добавление новых транзакций.
    private static void addTransaction(){
        System.out.println("Выберите тип трансакции : 1. Приход 2. Расход ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Введите сумму прихода ");
                double amount = scanner.nextDouble();
                transactionIncome.add(amount);
                System.out.println("Трансакция завершена ");
            }
            case 2 -> {
                System.out.println("Введите сумму расхода ");
                double amount = scanner.nextDouble();
                transactionExpense.add(amount);
                System.out.println("Трансакция завершена ");
            }
            default -> {
                System.err.println("Неверный тип трансакции. ");
            }
        }
    }

} // klass ended







