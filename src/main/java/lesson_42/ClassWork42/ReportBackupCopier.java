package lesson_42.ClassWork42;
/*
Упражнение 2: «Копирование отчёта о преступлениях»
	1.	Пусть есть файл crimes_report.txt, где описаны сводки по преступлениям.
        Требуется его скопировать в backup_crimes_report.txt с помощью NIO.
	2.	Реализуйте метод copyFile(Path source, Path target), который:
	•	Открывает оба файла (source — для чтения, target — для записи).
	•	Использует ByteBuffer (например, 4 KB) и цикл:
	•	read() из source в буфер,
	•	flip() буфера,
	•	write() в target,
	•	clear() буфера,
	•	пока не достигнем конца файла (read == -1).
	3.	В main вызовите copyFile(...), передав пути к crimes_report.txt и backup_crimes_report.txt.
 */

import lombok.extern.slf4j.Slf4j;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Slf4j
public class ReportBackupCopier {
    public static void main(String[] args) {
        Path source = Path.of("crimes_report.txt");
        Path destination = Path.of("backup_crimes_report.txt");
        copyReport(source, destination);
    }

    public static void copyReport(Path source, Path destination) {
        try {
            if (!Files.exists(destination)) {
                Files.createFile(destination);

                try (FileChannel inFileChannel = FileChannel.open(source, StandardOpenOption.READ);
                     FileChannel outFileChannel = FileChannel.open(destination, StandardOpenOption.WRITE)) {
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int bytesRead;
                    while ((bytesRead = inFileChannel.read(buffer)) != -1) {
                        buffer.flip();
                        outFileChannel.write(buffer);
                        buffer.clear();
                    }
                }

            }
        } catch (IOException exception) {
            log.error("Error creating file: {}", exception.getMessage());
        }
    }

} // klass ended
