package homework17;
//**Задача 4.**
//С помощью цикла while написать программу, выводящую на экран результат умножения данного натурального числа n
// на все целые числа от 0 до n.
//Пример: для числа 3 результат будет 0, 3, 6, 9.
//А затем подсчитать сумму всех натуральных чисел от 0 до n.

import java.util.Scanner;
public class MultipliAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number n: ");
        int n = scanner.nextInt();
        int i = 0;
        // умножаем
        System.out.println("Result of multiplication");
        while (i <= n) {
            int produkt = n * i;// наше произведение
            System.out.println(n + " * " + i + " = " + produkt);
            i++;
        }
            // сброс i, теперь мы находим сумму
            i = 0;
            int sum = 0;
            // сумма чисел oт 0 do n
            while (i <= n){
                sum += i;// прибавляем i к сумме
                i++;//увеличиваем i на 1
            }
            System.out.println("Sum of all natural numbers from 0 to " + n + " = " + sum);
        }
    }

