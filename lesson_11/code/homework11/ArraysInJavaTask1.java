package homework11;
/*
Напишите метод,
который принимает на вход массив целых чисел
и возвращает сумму всех элементов массива.
*/
/*
Write a method that takes an array of integers as input
and returns the sum of all elements in the array.
*/

public class ArraysInJavaTask1 {
    public static void main(String[] args) {
        // Создаем массив целых чисел и инициализируем его тремя значениями
        // Create an array of integers and initialize it with three values
        int [] numbers = {3400,3000,1200};
       // numbers [0] = 3400;
       // numbers [1] = 3000;
       // numbers [2] = 1200;

       // Инициализируем переменную result для хранения суммы элементов массива
       // Initialize a variable 'result' to store the sum of array elements
        int result =0;

        // Цикл для суммирования всех элементов массива
        // Loop to sum all the elements of the array
        // int result = numbers[0] + numbers[1] + numbers[2];
        for (int i = 0; i < numbers.length; i++){
            // Добавляем каждый элемент массива к результату
            // Add each element of the array to the result
            result = result + numbers[i];
        }
        //Выводим итоговую сумму элементов массива на экран
        // Print the final sum of array elements to the console
        System.out.println(result);
        System.out.println("--------------------");

    }
}
