package lesson_41.ClassWork41;
/*
Создадим личный дневник с отметкой времени
Задача по шагам
	1.	Создать файл diary.txt, в который вы будете сохранять записи.
	2.	Написать программу с меню:
	•	1 – прочитать все записи из файла и вывести в консоль.
	•	2 – добавить новую запись (с текущей датой/временем).
	•	3 – выйти.
	3.	При добавлении записи нужно:
	•	Запросить текст заметки у пользователя (можно одну строку или несколько).
	•	Сформировать строку вида:
        2025-02-18 14:35:47: Ваш текст заметки.
	•	Добавить её в конец файла diary.txt (режим append).
 */

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBook {
    private static final String FILE_NAME = "diary.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1 - Прочитать все записи");
            System.out.println("2 - Добавить новую запись");
            System.out.println("3 - Выйти");

            System.out.print("Выберите действие (1-3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    readDiary();
                    break;
                case "2":
                    addEntry(scanner);
                    break;
                case "3":
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }
    }

    // Функция для чтения всех записей
    private static void readDiary() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
            }
        } else {
            System.out.println("Дневник пуст или не существует.");
        }
    }

    // Функция для добавления новой записи
    private static void addEntry(Scanner scanner) {
        System.out.print("Введите текст заметки: ");
        String text = scanner.nextLine();
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String entry = timestamp + ": " + text;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(entry);
            writer.newLine();
            System.out.println("Запись добавлена.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

} // klass ended
 /*
- Константа FILE_NAME: Указывает имя файла, в который будут сохраняться записи дневника.
- Главный метод main(): Содержит основной цикл, который выводит меню и обрабатывает ввод пользователя
  для выполнения соответствующих действий.
- Метод readDiary():
  Читает все записи из файла diary.txt и выводит их в консоль. Если файл не существует,
  выводится соответствующее сообщение.
- Метод addEntry(Scanner scanner):
  Запрашивает у пользователя текст заметки, получает текущую дату и время, формирует строку и записывает ее в diary.txt.
  */