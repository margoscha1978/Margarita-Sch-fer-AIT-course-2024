package homework17;
//**Задача 5.**
//Программа просит пользователя ввести строку
//"/|\'Hello' 'World'\|/ @*#&$%^_+-{[xx]} !"
//Если пользователь вводит строку правильно,
// то программа распечатывает на экран благодарность и завершает работу.
//Если вводится неверная строка, то программа просит ввести строку снова, до тех пор,
// пока у пользователя это не получится.
//Дополнительно: считать кол-во попыток, которые потребовались пользователю для введения правильной строки.
// По окончанию - вывести число попыток на экран.

import java.util.Scanner;

public class StringChek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctString = " /|\'Hello' 'World'\\|/ @*#&$%^_+-{[xx]} ! ";
        String userInput;
        int attempts = 0;
        do{
            System.out.println(" Enter string " + correctString);
            userInput = scanner.nextLine();//schitaem vvod
            attempts++;
            System.out.println(" Error! piease try again ");
        }
        while (!userInput.equals(correctString ) );//povtorjaem popitku
        System.out.println(" Right! Well done,did a great job ! ");
        System.out.println(" Number of attempts : " + attempts );

    }
}

//мне удалось с 4 попытки...