package homework22;

import java.util.Random;

public class RandomNumberArray {
    private int[] numbers; // массив случайных чисел

    // Конструктор, создающий массив случайных чисел
    public RandomNumberArray(int size) {
        numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Заполнение массива случайными числами в диапазоне от -10 до 10
            numbers[i] = random.nextInt(21) - 10; // (0-20) - 10 = (-10, 10)
        }
    }

    // Метод для подсчета положительных чисел
    public int countPositive() {
        int count = 0;
        for (int number : numbers) {
            if (number > 0) count++; // Увеличиваем счетчик при нахождении положительного числа
        }
        return count;
    }

    // Метод для подсчета отрицательных чисел
    public int countNegative() {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) count++; // Увеличиваем счетчик при нахождении отрицательного числа
        }
        return count;
    }

    // Метод для подсчета нулей
    public int countZeros() {
        int count = 0;
        for (int number : numbers) {
            if (number == 0) count++; // Увеличиваем счетчик при нахождении нуля
        }
        return count;
    }

    // Метод для подсчета четных чисел
    public int countEven() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count++; // Увеличиваем счетчик при нахождении четного числа
        }
        return count;
    }

    // Метод для подсчета нечетных чисел
    public int countOdd() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) count++; // Увеличиваем счетчик при нахождении нечетного числа
        }
        return count;
    }

    public int getNumber(int index) {
        if(index < 0 || index >= numbers.length ){
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return numbers[index];
    }
}
