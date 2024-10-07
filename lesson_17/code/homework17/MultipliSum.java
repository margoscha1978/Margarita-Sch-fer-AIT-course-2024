package homework17;
//**Задача 4.**
//С помощью цикла while написать программу, выводящую на экран результат умножения данного натурального числа n на все целые числа от 0 до n.
//Пример: для числа 3 результат будет 0, 3, 6, 9.
//А затем подсчитать сумму всех произведений

import java.util.Scanner;

public class MultipliSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter a natural number n");
        int i = 0;
        int sumOfProdukt = 0;//summa proizvedenii

        // umnoschaemn na vse chisla ot 0 do n i schitaem summu
        System.out.println("Multiplication Results:");
        while (i <= n){
            int produkt = n * i;
            System.out.println(n + " * " + i + " = " + produkt);
            sumOfProdukt += produkt;
            i++;
        }
       //summa proizvwdwnii
        System.out.println("Sum of all products = " + sumOfProdukt);
    }
}
