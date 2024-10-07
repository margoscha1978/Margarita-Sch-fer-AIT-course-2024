package homework17;
//**Задача 3.**
//С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
//
//Пример:для числа n = 3
//1 в кубе 1
//2 в кубе 8
//3 в кубе 27

import java.util.Scanner;
public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scanner.nextInt();//chitaem chislo vvoda
        int i = 1;//peremennaja

        while (i <= n){//rabotaet poka i <0 n
        int cube = i * i * i;//formula cuba
            System.out.println("Number cubed " + i + " = " + cube);
            i++;
        }
    }
}
