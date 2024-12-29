package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.Tour;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReportGeneratorTest {

    // Подразумеваем простые реализации для тестирования
    static class SimpleClientManager extends ClientManager {
        private List<Client> clients = new ArrayList<>();

        public void addClient(Client client) {
            clients.add(client);
        }

        @Override
        public List<Client> getAllClients() {
            return clients;
        }
    }

    static class SimpleTourManager extends TourManager {
        private List<Tour> tours = new ArrayList<>();

        public void addTour(Tour tour) {
            tours.add(tour);
        }

        @Override
        public List<Tour> getAllTours() {
            return tours;
        }
    }

    static class SimpleQueueManager extends QueueManager {
        private List<Object> queueItems = new ArrayList<>();

        public void addQueueItem(Object item) {
            queueItems.add(item);
        }

        @Override
        public List<Object> getQueueItems() {
            return queueItems;
        }
    }

    @Test
    public void testGenerateClientReport_EmptyList() {
        // Arrange
        SimpleClientManager clientManager = new SimpleClientManager();
        ReportGenerator reportGenerator = new ReportGenerator(clientManager, null, null);

        // Act
        String result = reportGenerator.generateClientReport();

        // Assert
        assertEquals("Отчет по клиентам:\n", result);
    }

    @Test
    public void testGenerateClientReport_SomeClients() {
        // Arrange
        SimpleClientManager clientManager = new SimpleClientManager();
        clientManager.addClient(new Client("1", "Иван", "Иванов", "ivan@mail.ru"));
        clientManager.addClient(new Client("6", "Петр", "Петров", "petr@mail.ru"));

        ReportGenerator reportGenerator = new ReportGenerator(clientManager, null, null);

        // Act
        String result = reportGenerator.generateClientReport();

        // Assert
        assertTrue(result.contains("Client{id='1', firstName='Иван', lastName='Иванов', contactInfo='ivan@mail.ru'}"));
        assertTrue(result.contains("Client{id='6', firstName='Петр', lastName='Петров', contactInfo='petr@mail.ru'}"));
    }

    @Test
    public void testGenerateTourReport_EmptyList() {
        // Arrange
        SimpleTourManager tourManager = new SimpleTourManager();
        ReportGenerator reportGenerator = new ReportGenerator(null, tourManager, null);

        // Act
        String result = reportGenerator.generateTourReport();

        // Assert
        assertEquals("Отчет по турам:\n", result);
    }

    @Test
    public void testGenerateTourReport_SomeTours() {
        // Arrange
        SimpleTourManager tourManager = new SimpleTourManager();
        tourManager.addTour(new Tour("5", "Греция", LocalDate.parse("2024-10-12"), 5,
                2500, 5));
        tourManager.addTour(new Tour("2", "Италия", LocalDate.parse("2024-12-25"), 15,
                2300, 5));

        ReportGenerator reportGenerator = new ReportGenerator(null, tourManager, null);

        // Act
        String result = reportGenerator.generateTourReport();

        // Assert
        assertTrue(result.contains("Tour{id='5', destination='Греция', date=" + LocalDate.parse("2024-10-12") +
                ", duration=5, price=2500.0, availableSeats=5}"));
        assertTrue(result.contains("Tour{id='2', destination='Италия', date=" + LocalDate.parse("2024-12-25") +
                ", duration=15, price=2300.0, availableSeats=5}"));
    }

    @Test
    public void testGenerateQueueReport_EmptyQueue() {
        // Arrange
        SimpleQueueManager queueManager = new SimpleQueueManager();
        ReportGenerator reportGenerator = new ReportGenerator(null, null, queueManager);

        // Act
        String result = reportGenerator.generateQueueReport();

        // Assert
        assertEquals("Текущая очередь:\n", result);
    }

    @Test
    public void testGenerateQueueReport_SomeQueueItems() {
        // Arrange
        SimpleQueueManager queueManager = new SimpleQueueManager();
        queueManager.addQueueItem("Запрос 1");
        queueManager.addQueueItem("Запрос 2");

        ReportGenerator reportGenerator = new ReportGenerator(null, null, queueManager);

        // Act
        String result = reportGenerator.generateQueueReport();

        // Assert
        assertTrue(result.contains("Запрос 1"));
        assertTrue(result.contains("Запрос 2"));
    }

    @Test
    public void testGenerateClientReport_ExceptionHandling() {
        // Arrange
        SimpleClientManager clientManager = new SimpleClientManager() {
            @Override
            public List<Client> getAllClients() {
                throw new RuntimeException("Ошибка получения клиентов");
            }
        };
        ReportGenerator reportGenerator = new ReportGenerator(clientManager, null, null);

        // Act & Assert
        RuntimeException thrown = assertThrows(RuntimeException.class, reportGenerator::generateClientReport);
        assertEquals("Ошибка получения клиентов", thrown.getMessage());
    }
} // test ended

/*

1. Тестирование пустого списка клиентов. Проверим, что метод возвращает корректный отчет, когда нет клиентов.
2. Тестирование клиентов в списке. Проверим, включает ли отчет информацию о клиентах.
3. Тестирование пустого списка туров. Проверяем,
         что метод возвращает корректный отчет для пустого списка туров.
4. Тестирование туров в списке. Проверяем, что отчет содержит информацию о турах.
5. Тестирование пустой очереди. Проверяем, корректно ли метод обрабатывает пустую очередь.
6. Тестирование очереди с элементами. Проверим,
         содержит ли отчет корректную информацию о предметах очереди.
7. Тестирование обработки исключений для клиентов.  Проверим,
        выбрасывает ли метод исключение при ошибке получения списка клиентов.
*/
