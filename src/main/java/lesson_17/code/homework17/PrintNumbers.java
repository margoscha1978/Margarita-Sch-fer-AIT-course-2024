package homework17;
//**Задача 2.**
//Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
//Использовать цикл do...while.

public class PrintNumbers {
    public static void main(String[] args) {
        int count = 0;// счетчик чисел
        int number = 1;// число
        do {
            if (number % 5 == 0) {
                System.out.println(number);// число
                count++;// увеличиваем сам счетчик на 1 шаг
            }
            number++;// перенос к следующему числу
        } while (count < 7 && number <= 100);
    }

}