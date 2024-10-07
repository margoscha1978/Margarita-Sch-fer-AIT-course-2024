package homework17;
//**Задача 2.**
//Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
//Использовать цикл do...while.

public class PrintNumbers {
    public static void main(String[] args) {
        int count = 0;//schetchik
        int number = 1;//chislo
        do {
            if (number % 5 == 0) {
                System.out.println(number);// chislo
                count++;// ubelichili schetchik
            }
            number++;//pereschli k sledujuschemu chislu
        } while (count < 7 && number <= 100);
    }

}