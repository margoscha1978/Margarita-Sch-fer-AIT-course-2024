package homework23.Checker;

public class PrimeChecker {
    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Числа <= 1 не простые
        if (number <= 3) return true;  // 2 и 3 - простые

        // Исключаем четные числа
        if (number % 2 == 0 || number % 3 == 0) return false;

        // Проверяем делители от 5 до number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
