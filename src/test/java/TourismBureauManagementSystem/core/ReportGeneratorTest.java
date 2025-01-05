package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportGeneratorTest {
    private ClientManager clientManager;
    private QueueManager<QueueItem> queueManager;
    private TourManager tourManager;
    private ReportGenerator reportGenerator;

    @Before
    public void setUp() {
        clientManager = new SimpleClientManager(); //замените на вашу реализацию
        queueManager = new SimpleQueueManager<>(); //замените на вашу реализацию
        tourManager = new SimpleTourManager(); //замените на вашу реализацию
        reportGenerator = new ReportGenerator(clientManager, queueManager, tourManager);

        // Подготовка тестовых данных
        prepareTestData();
    }

    private void prepareTestData() {
        // Добавление клиентов
        clientManager.registerClient("Иван", "Иванов", "ivan@example.com"));
        clientManager.registerClient("Петр", "Петров", "petr@example.com"));

        // Добавление туров
        LocalDate startDate = LocalDate.of(2023, 6, 15);
        tourManager.addTour(new Tour("1", "Греция", startDate, 7, 1000.0,
                20));
        tourManager.addTour(new Tour("2", "Испания", startDate.plusDays(10), 5,
                800.0, 15));

        // Добавление элементов очереди
        queueManager.add(new QueueItem("1", "Запрос на информацию о турах"));
        queueManager.addToQueue(new QueueItem("2", "Запрос на цены"));
    }

    @org.testng.annotations.Test
    public void testGenerateReport() {
        // Перенаправление вывода в байтовый поток для захвата вывода
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Генерация отчета
        reportGenerator.generateReport();

        // Восстановление оригинального вывода
        System.setOut(originalOut);

        // Проверка, что вывод содержит ожидаемые данные
        String output = outputStream.toString();

        // Проверка на наличие конкретных строк в выводе
        assertTrue(output.contains("=== Отчет о клиентах ==="));
        assertTrue(output.contains("Клиент: Иван Иванов, Контакт: ivan@example.com"));
        assertTrue(output.contains("Тур: 1, Направление: Греция"));
        assertTrue(output.contains("Клиент ID: 1, Запрос: Запрос на информацию о турах"));
    }

    @org.testng.annotations.Test
    public void testNoClients() {
        // Подготовка тестового состояния без клиентов
        ClientManager emptyClientManager = new SimpleClientManager(); // пустой менеджер
        reportGenerator = new ReportGenerator(emptyClientManager, queueManager, tourManager);

        // Перенаправление вывода в байтовый поток
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Генерация отчета
        reportGenerator.generateReport();

        // Восстановление оригинального вывода
        System.setOut(originalOut);

        // Проверка вывода, что он будет соответствовать отсутствию клиентов
        String output = outputStream.toString();
        assertTrue(output.contains("=== Отчет о клиентах ==="));
        assertTrue(output.contains("Клиентов не найдено.")); // нужно будет настроить этот вывод в методе генерации
    }
}