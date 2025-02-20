package lesson_40.homework40;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ToDoListAdder {
    public static void main(String[] args) {
        String filePath = "tasks.txt"; // Путь к файлу
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите новую задачу: ");
        String newTask = scanner.nextLine();

        // Добавление новой задачи в файл
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(newTask); // Записываем новую задачу
            bw.newLine(); // Добавляем новую строку
            System.out.println("Задача добавлена!");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        scanner.close();
    }

} // klass ended

/*
2. Добавление задач с помощью BufferedWriter:
   - Мы используем BufferedWriter вместе с FileWriter, чтобы добавить новую задачу в конец файла.
   - Параметр true в FileWriter позволяет нам добавить содержимое в существующий файл, а не перезаписывать его.
   - Добавляем новую строку при помощи newLine() для хорошей структуры текста.
 */

