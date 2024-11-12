package interesse;

public class CheckПростогоЧисла {
    // Почему-то с этой задачей по Java у многих начинающих разработчиков на собеседованиях возникают проблемы.
    // На самом деле, решение этой Java-задачи максимально простое:
    // Напишите проверку, является ли заданное число простым.

    public class PrimeNumberCheck {
        public static void main(String[] args) {
            int number = 17;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(number + " является простым числом: " + isPrime);
        }
    }
}
