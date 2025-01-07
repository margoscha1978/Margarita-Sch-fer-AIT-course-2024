package homework17;
//**Задача 1.**
//По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений:
// "n коров", "n корова", "n коровы", правильно склоняя слово "корова".
//Входные данные: Дано целое положительное число n (n <= 10),
//Выходные данные: Программа должна вывести введенное число n и одно из слов:
// коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.

import java.util.Scanner;
public class kuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number n (from 1 to 10): ");
        int n = scanner.nextInt();

        // проверка числа
        if (n<1 || n>10){
            System.out.println("The number must be from 1 to 10");
            return;
        }
        String wordForm;
        // форма слов
        if(n == 1){
            wordForm = "Cow";
        }else if (n >= 2 && n <= 4){
           wordForm = "Cows";
        } else {
            wordForm = "Lots of cows";
        }
        // результат поиска
            System.out.println("Grasing in the meadow... " + n + " " + wordForm + ".");

    }
}//klass ended
