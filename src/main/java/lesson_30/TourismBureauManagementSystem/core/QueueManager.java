package lesson_30.TourismBureauManagementSystem.core;
/*
 Метод `getWaitingReports()`, который выводит отчеты о времени ожидания для всех клиентов в очереди.
 Проверка всех выбранных методов
 */
import com.github.javafaker.Faker;
import lesson_30.TourismBureauManagementSystem.model.Booking;
import lesson_30.TourismBureauManagementSystem.model.Client;
import lesson_30.TourismBureauManagementSystem.model.QueueItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class QueueManager {
    private static final Logger logger = Logger.getLogger(QueueManager.class.getName());

    private List<Client> clients; // Список клиентов
    private List<Booking> bookings; // Список бронирований
    private List<QueueItem> queue; // Очередь запросов
    private Faker faker;

    // Конструктор
    public QueueManager() {
        this.clients = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.queue = new ArrayList<>();
        this.faker = new Faker();
        logger.info("Manager initialized.");
    }

    // Метод для добавления клиента
    public void addClient(Client client) {
        if (client == null) {
            logger.severe("Attempted to add a null client.");
            throw new IllegalArgumentException("Client cannot be null.");
        }

        clients.add(client);
        logger.info("Client added: " + client);
    }

    // Метод для создания бронирования
    public void createBooking(int clientId, String service, String dateTime) {

        Client client = findClientById(clientId);
        if (client == null) {
            logger.severe("Client not found for booking: " + clientId);
            throw new IllegalArgumentException("Client not found.");
        }
        LocalDateTime bookingDateTime = DateTimeUtils.parseDateTime(dateTime);
        Booking booking = new Booking(bookings.size() + 1, client, service, bookingDateTime);
        bookings.add(booking);
        logger.info("Booking created: " + booking);
    }

    // Метод для обработки запросов
    public void processRequest(int clientId, String requestType) {
        QueueItem item = new QueueItem(clientId, requestType);
        queue.add(item);
        logger.info("Request added to queue: " + item);
    }

    // Метод для поиска клиента по ID
    private Client findClientById(int clientId) {
        return clients.stream()
                .filter(client -> client.getClientId() == clientId)
                .findFirst()
                .orElse(null);
    }

    // Метод для добавления случайных данных для тестирования
    public void generateFakeData(int numberOfClients) {
        LocalDateTime createdAt = LocalDateTime.now();
        for (int i = 0; i < numberOfClients; i++) {
            Client fakeClient = new Client(

                    faker.number().randomDigitNotZero(),
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.internet().emailAddress(),
                    createdAt
            );
            addClient(fakeClient);
        }
    }

    // Геттеры
    public List<Client> getClients() {
        return clients;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<QueueItem> getQueue() {
        return queue;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "clients=" + clients +
                ", bookings=" + bookings +
                ", queue=" + queue +
                '}';
    }

} // klass ended
/*
Объяснение функциональности класса QueueManager:
1. Поля класса:
 -clients: Список клиентов.
 - bookings: Список всех бронирований.
 - queue: Список запросов клиентов.
 - faker: Экземпляр Faker, используемый для генерации тестовых данных.
2. Методы:
 - addClient(Client client): Добавляет клиента в список. Включает проверку на `null` и логирует добавление.
 - createBooking(int clientId, String service, String dateTime): Создает новое бронирование для клиента
  по его идентификатору. Включает логику поиска клиента и выбрасывает исключение, если клиент не найден.
 - processRequest(int clientId, String requestType): Обрабатывает запрос от клиента и добавляет его в очередь.
   Логирует добавление запроса.
 - findClientById(int clientId): Вспомогательный метод для поиска клиента по ID.
 - generateFakeData(int numberOfClients): Генерирует указанное количество фейковых клиентов с использованием Faker.
 - Геттеры: Позволяют получать списки клиентов, бронирований и очереди.
3. Логирование:
  - Все ключевые действия логируются с информативными сообщениями, что упрощает отладку и мониторинг.

4.  Обработка исключений:
 - Методы проверяют входные данные и выбрасывают соответствующие исключения, если данные некорректны.

 Идеи для улучшения, что можно добавить еще:
1. Расширение функциональности:
        - Дополнительные методы для управления очередями, например, для обработки запросов или их приоритизации.
        - Добавление методов для удаления клиентов или бронирований.
2. Анализ данных:
        - Можно добавить методы для анализа данных о клиентах и их бронировании, чтобы лучше учитывать
          и понимать поведение клиентов
 */