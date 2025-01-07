package homework17;
//**Игра "Угадай число" (*)**
//
//Цель: Разработать консольную игру,
// в которой пользователь должен угадать случайно сгенерированное число в пределах от 1 до 100.
// Программа должна давать подсказки после каждой попытки, сообщая, больше или меньше введенное число, чем загаданное.
// Игра продолжается до тех пор, пока число не будет угадано.
// После угадывания, программа должна вывести количество попыток, потраченных на угадывание,
// и предложить пользователю сыграть еще раз.
//Шаги реализации:
//Генерация случайного числа.
//Использовать Math.random() для генерации случайного числа в заданном диапазоне (1-100).
//Основной игровой цикл:
//Использовать цикл (do-while или while), чтобы запросить у пользователя ввод числа до тех пор,
// пока не будет угадано загаданное число.
//Использовать условные операторы для сравнения введенного числа с загаданным и вывода подсказок
// ("слишком большое", "слишком маленькое").
//Подсчет попыток:
//Вести подсчет числа попыток, которые пользователь сделал для угадывания числа.
//Окончание игры и предложение повторить:
//После угадывания числа вывести количество попыток и спросить пользователя, хочет ли он сыграть еще раз.
//Если да, игра начинается заново с генерации нового случайного числа; если нет — программа завершается.
//Дополнительные условия:
//Обеспечить обработку ввода, чтобы программа принимала только числа
// и корректно реагировала на некорректный ввод (например, буквы или символы).
//Можно добавить функционал для ограничения максимального количества попыток.

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            // генератор чисел рандом
            int randomNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            int guess;
            boolean correctGuess = false;
            int maxAttempts = 10;

            System.out.println(" I guessed number from 1 to 100,try to guess ...");

            while (!correctGuess && attempts < maxAttempts) {
                System.out.println(" Please,enter a number from 1 to 100 : ");
                while (true) {
                    try {
                        guess = Integer.parseInt(scanner.nextLine());
                        if (guess < 1 || guess > 100) {
                            System.out.println(" Number from 1 to 100,try again ...");
                        } else {
                            break; // если ввели верное число выходим из цикла
                        }
                    } catch ( NumberFormatException e) {
                        System.out.println(" Pleas enter a number from 1 to 100 ...");
                    }
                }
                // считаем попытки
                attempts++ ;
                // сравниваем введенные числа
                if (guess < randomNumber){
                if (randomNumber - guess > 20) {

                    System.out.println(" Number too small,try again and more ...");
                } else {
                    System.out.println(" Small number,but closer ...Try a little more ...");
                }
                } else if (guess > randomNumber) {
                    if (randomNumber - guess < 20){

                    System.out.println(" This number is too high,choose a number less ...");

                } else {

                    System.out.println(" This is a close number,try reducing it a little ...");
                }
            } else {

                correctGuess = true;// угадал число
            }
                if (attempts >= maxAttempts){
                    System.out.println("Sorry,you've exhausted all attempts.The given number was: " + randomNumber  + ".");
                }
        }
        if (correctGuess) {
            System.out.println("Congratulations,you guessed the number!" + randomNumber + " in " + attempts + " attempts...");
        }
        // спрашиваем пользователя и его цели игры, продолжает или нет
        System.out.println(" Do you want to play more? (yes/no): ");
        String response = scanner.nextLine();
        playAgain = response.equalsIgnoreCase("yes");

    } while (playAgain);

    System.out.println(" You play great,come again!");

    }
}
