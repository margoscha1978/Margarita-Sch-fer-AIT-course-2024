package homework17;
//**Задача 1.**
//Распечатать 10 строк: "Task1". "Task2". … "Task10".
//Использовать цикл while.

public class PrintTask {
    public static void main(String[] args) {
        int i = 1; // наша переменная
        while ( i <= 10) {
            System.out.println("Task" + i);
            i++;
        }
    }
}
