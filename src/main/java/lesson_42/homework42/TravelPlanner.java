package lesson_42.homework42;
/*
 Задание 1: Чтение маршрута путешествия из файла

1. Создание текстового файла:
   - Создай файл с именем `travel_route.txt` в корневой папке проекта.
   - Вставь в него следующий текст (каждый город на новой строке):
     Paris, Rome, Barcelona, Amsterdam, Berlin
2. Импорт необходимых классов
3. Для чтения файла:
   - Используем класс Files, прочитай все строки из travel_route.txt:
   Path path = Paths.get("travel_route.txt");
   List<String> route = Files.readAllLines(path);
4. Выводим маршрута на экран:
   - с помощью цикла for, чтобы вывести маршруты в нужном формате:
   System.out.println("Travel Route:");
   for (int i = 0; i < route.size(); i++) {
       System.out.println((i + 1) + ". " + route.get(i));
   }
 */
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class TravelPlanner {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("travel_route.txt");
            List<String> route = Files.readAllLines(path);

            System.out.println("Travel Route:");
            for (int i = 0; i < route.size(); i++) {
                System.out.println((i + 1) + ". " + route.get(i));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

} // klass ended
