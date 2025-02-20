package lesson_40.homework40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ToDoListReader {
    public static void main(String[] args) {
        String filePath = "tasks.txt"; // Путь к файлу

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String task;
            while ((task = br.readLine()) != null) {
                System.out.println(task); // Выводим задачу на консоль
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

} // klass ended

/*
1. Чтение файла с помощью BufferedReader:
   - Мы открываем файл с помощью FileReader и оборачиваем его в BufferedReader,
     что позволяет нам считывать строки по одной.
   - Используем цикл while, который продолжает считывать строки, пока не встретит конец файла...
   - Каждая строка выводится в консоль.
 */