package ArraysInJava;

public class ArrayInJava {
    public static void main(String[] args) {

        // Вариант 1: Создаем массив целых чисел длиной 5 элементов
        // Option 1: Creating an array of integers with a length of 5 elements
        int[] banknumbers = new int[5];
        // Присваиваем значения каждому элементу массива по индексу
        // Assign values to each element of the array by its index
        banknumbers[0] = 111111;
        banknumbers[1] = 222222;
        banknumbers[2] = 333333;
        banknumbers[3] = 444444;
        banknumbers[4] = 555555;

        // Вариант 2: Создаем массив целых чисел и сразу инициализируем его значениями
        // Option 2: Creating and initializing an array of integers immediately
        int[] banknumbersNew = {111111, 222222, 333333, 444444, 555555};

        // Получаем длину массива и выводим ее на экран
        // Get the length of the array and print it to the console
        int length = banknumbers.length;
        System.out.println("Length: " + length); // Вывод длины массива

        // Цикл для итерации по массиву и вывода каждого элемента
        // Loop to iterate through the array and print each element
        for (int i = 0; i < length; i++) {
            System.out.println(banknumbers[i]); // Вывод текущего элемента
        }

        // Создаем массив строк с названиями автомобилей
        // Create an array of strings with car names
        String[] cars = {"Volvo", "Audi", "Ford", "Mazda", "Opel"};

        // Выводим элемент массива по индексу 4 (Opel)
        // Print the array element at index 4 (Opel)
        System.out.println(cars[4]);

        // Изменяем элемент массива на позиции 4 с "Opel" на "Tesla"
        // Change the element at index 4 from "Opel" to "Tesla"
        cars[4] = "Tesla";
        System.out.println(cars[4]); // Вывод измененного элемента

        // Изменяем элемент массива на позиции 3 с "Mazda" на "no car"
        // Change the element at index 3 from "Mazda" to "no car"
        cars[3] = "no car";
        System.out.println(cars[3]); // Вывод измененного элемента
    }

}// klass ende
