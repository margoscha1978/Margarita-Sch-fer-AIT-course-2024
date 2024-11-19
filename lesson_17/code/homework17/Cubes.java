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
        int n = scanner.nextInt();// считываем число с ввода
        int i = 1;// вводим переменную

        while (i <= n){ // работает и верно пока i < 0
        int cube = i * i * i;// формула куба
            System.out.println("Number cubed " + i + " = " + cube);
            i++;
        }
    }
}
