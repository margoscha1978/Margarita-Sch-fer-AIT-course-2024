package lesson_42.ClassWork42;
/*
Упражнение 1: «Чтение списка разыскиваемых лиц»
	1.	В файле wanted.txt содержится список разыскиваемых лиц (по одному имени/фамилии в строке). Например:
 - John Doe
 - Jane Smith
 - Bob Robber
	2.	Создайте метод readWantedList(Path path), который:
	•	Открывает файл через FileChannel.open(path, StandardOpenOption.READ).
	•	Считывает содержимое файла поблочно (например, буфер 256 байт) и собирает в StringBuilder.
	•	Разделяет текст на строки ('\n') и возвращает List<String> со списком имён.
	3.	В main продемонстрируйте, как:
	•	Вызываете readWantedList(...) для wanted.txt.
	•	Выводите полученные имена на экран.
 */

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WantedListReader {
    public static void main(String[] args) {
        Path path = Path.of("wanted.txt");
        List<String> result = readWantedList(path);
        for (String line : result) {
            log.info(line);
        }
    }

    public static List<String> readWantedList(Path path) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> wantedList = new ArrayList<>();
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)){
            ByteBuffer buffer = ByteBuffer.allocate(256);
            int bytesRead;
            while ((bytesRead = fileChannel.read(buffer)) != -1){
                buffer.flip();

                while (buffer.hasRemaining()){
                    stringBuilder.append((char)buffer.get());
                }
                buffer.clear();
            }
        }
        catch (IOException exception){
            log.error("Error creating file: {}", exception.getMessage());
        }

        String[] lines = stringBuilder.toString().split("\n");
        for (String line : lines) {
            wantedList.add(line);
        }


        return wantedList;
    }

} // klass ended