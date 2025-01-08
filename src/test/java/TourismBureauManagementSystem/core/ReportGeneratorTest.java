package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class ReportGeneratorTest {
    private ClientManager clientManager;
    private QueueManager<QueueItem> clientQueue;
    private TourManager tourManager;
    private ReportGenerator reportGenerator;

    // Перенаправление вывода для проверки результатов
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        // Перенаправляем стандартный вывод
        System.setOut(new PrintStream(outputStream));

        // Инициализация нужных объектов с реальными данными
        clientManager = new ClientManager() {
            @Override
            public List<Client> getAllClients() {
                return Arrays.asList(
                        new Client("Jon", "Doe", "john@example.com"),
                        new Client("Jane", "Smith", "jane@example.com")
                );
            }
        };

        clientQueue = new QueueManager<QueueItem>() {
            @Override
            public boolean isQueueEmpty() {
                return false;
            }

            @Override
            public List<QueueItem> getCurrentQueue() {
                return Arrays.asList(
                        new QueueItem(1, "Request A", System.currentTimeMillis()),
                        new QueueItem(2, "Request B", System.currentTimeMillis())
                );
            }
        };

        tourManager = new TourManager() {
            @Override
            public void getAllTours() {
                List<Tour> list = Arrays.asList(
                        new Tour("Tour 1", LocalDate.of(2023, 1, 1),
                                7, 300.0, 20),
                        new Tour("Tour 2", LocalDate.of(2023, 2, 1),
                                10, 500.0, 15)
                );
            }

        };
        reportGenerator = new ReportGenerator(clientManager, clientQueue, tourManager);
    }

    @Test
    void testGenerateClientReport() {
        reportGenerator.generateClientReport();
        String output = outputStream.toString().trim();
        String expectedOutput = "Отчет по всем клиентам:\n" +
                "ID: 1, Имя: John, Фамилия: Doe, Контакт: john@example.com\n" +
                "ID: 2, Имя: Jane, Фамилия: Smith, Контакт: jane@example.com";
        assertEquals(expectedOutput, output);
    }

    @Test
    void testGenerateQueueReport() {
        reportGenerator.generateQueueReport();
        String output = outputStream.toString().trim();
        String expectedOutput = "Отчет о текущей очереди клиентов:\n" +
                "Клиент ID: 1, Запрос: Request A, Время запроса: " +
                "Клиент ID: 2, Запрос: Request B, Время запроса: ";
        assertTrue(output.contains("Клиент ID: 1, Запрос: Request A, Время запроса:"));
        assertTrue(output.contains("Клиент ID: 2, Запрос: Request B, Время запроса:"));
    }

    @Test
    void testGenerateTourReport() {
        reportGenerator.generateTourReport();
        String output = outputStream.toString().trim();
        String expectedOutput = "Отчет по всем турам:\n" +
                "Tour{name='Tour 1', description='Description of Tour 1'}\n" +
                "Tour{name='Tour 2', description='Description of Tour 2'}";
        assertTrue(output.contains("Tour{name='Tour 1', description='Description of Tour 1'}"));
        assertTrue(output.contains("Tour{name='Tour 2', description='Description of Tour 2'}"));
    }

    @Test
    void testGenerateReport() {
        reportGenerator.generateReport();
        String output = outputStream.toString().trim();
        String expectedOutput = "----- Генерация общего отчета -----\n" +
                "Отчет по всем клиентам:\n" +
                "ID: 1, Имя: John, Фамилия: Doe, Контакт: john@example.com\n" +
                "ID: 2, Имя: Jane, Фамилия: Smith, Контакт: jane@example.com\n" +
                "Отчет по всем турам:\n" +
                "Tour{name='Tour 1', description='Description of Tour 1'}\n" +
                "Tour{name='Tour 2', description='Description of Tour 2'}\n" +
                "Отчет о текущей очереди клиентов:\n" +
                "Клиент ID: 1, Запрос: Request A, Время запроса: " +
                "Клиент ID: 2, Запрос: Request B, Время запроса: \n" +
                "------------------------------------";
        assertEquals(expectedOutput, output);
    }

} // test ended
/*
1. testGenerateClientReport: Этот тест проверяет, что метод generateClientReport
выводит корректную информацию о клиентах.

2. testGenerateQueueReport: Проверяет, что generateQueueReport
правильно выводит информацию о текущей очереди клиентов.

3. testGenerateTourReport: Тестирует, что generateTourReport выводит правильную информацию о турах.

4. testGenerateReport: Проверяет, что общий отчет, генерируемый методом generateReport,
 содержит всю необходимую информацию о клиентах, турах и очереди.

 Используемые методы
- System.setOut(): Для перенаправления стандартного вывода в ByteArrayOutputStream,
 так что мы можем проверить, какой текст был выведен.
- assertTrue() и assertEquals(): Для проверки соответствия ожидаемого и фактического вывода.
 */