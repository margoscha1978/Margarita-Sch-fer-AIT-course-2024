package ClassWork12;

public class ArraysInJavaTask {
    /*
Создайте массив строк,
состоящий из 5 имен.
Выведите на экран все имена в обратном порядке.
*/
/*
Create an array of strings consisting of 5 names.
Display all the names in reverse order.
*/
    public static void main(String[] args) {
        // Создаем массив строк для хранения 5 имен
        // Create an array of strings to store 5 names
        String [] names = new String[5];
        // Инициализируем каждый элемент массива именами
        // Initialize each element of the array with names
        names [0] = "Joni";
        names [1] = "Jony";
        names [2] = "Jona";
        names [3] = "Jonn";
        names [4] = "Jone";

        // Получаем длину массива
        // Get the length of the array
         int lenghtNamesArray = names.length;

        // Цикл для вывода имен в обратном порядке
        // Loop to display the names in reverse order
        for (int i = lenghtNamesArray -1; i <= names.length; i--) {
            // Выводим текущее имя из массива
            // Print the current name from the array
            System.out.println(names [i]);
        }
    }
}
