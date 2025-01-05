package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

public class QueueManagerApp {

    /*
        public static void main(String[] args) {
            QueueManager<Client> clientQueue = getClientQueueManager();
            //clientQueue.addClient(client6);

            // Проверка следующего клиента
            System.out.println("Следующий клиент: " + clientQueue.peekNextClient());

            // Проверка размера очереди
            System.out.println("Размер очереди: " + clientQueue.getQueueSize());

            // Удаление клиента из очереди
            clientQueue.removeClient();

            // Проверка, пуста ли очередь
            System.out.println("Очередь пуста: " + clientQueue.isQueueEmpty());

            // Получение текущих клиентов в очереди
            System.out.println("Клиенты в очереди: " + clientQueue.getQueueItems());
        }

    private static QueueManager<Client> getClientQueueManager() {
        QueueManager<Client> clientQueue = new QueueManager<>();

        // Регистрация клиентов
        Client client1 = new Client("Иван","Иванов" ,"ivan@mail.ru");
        Client client2 = new Client("Петр","Петров" ,"petr@mail.ru");
        Client client3 = new Client("Мария","Петрова" ,"maria@mail.ru");
        Client client4 = new Client("Николай","Федоров" ,"nikolai@mail.ru");
        Client client5 = new Client("Светлана","Сидорова", "svetlana@mail.ru");
        //Client client6 = new Client("6", "Сергей","Колокольцев","sergei@mail.ru");

        // Добавление клиентов в очередь
        clientQueue.addClient(client1);
        clientQueue.addClient(client2);
        clientQueue.addClient(client3);
        clientQueue.addClient(client4);
        clientQueue.addClient(client5);
        return clientQueue;
    }

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueManager<QueueItem> clientQueue = new QueueManager<>();
        ClientManager clientManager = new ReportGeneratorTest.SimpleClientManager(); // Или любой другой менеджер клиентов

        // Пример регистрации клиентов
        registerClients(clientManager);

        // Показать доступных клиентов
        System.out.println("Доступные клиенты:");
        clientManager.getAllClients().forEach(client ->
                System.out.println("ID: " + client.getId() + ", имя: " + client.getFirstName() + ", фамилия: " + client.getLastName())
        );

        // Запрос ID клиента для добавления в очередь
        System.out.print("Введите ID клиента, которого хотите добавить в очередь: ");
        int clientId = scanner.nextInt();

        // Проверьте наличие клиента и добавьте его в очередь
        Optional<Client> clientToAddOpt = clientManager.findClientById(clientId);
        if (clientToAddOpt.isPresent()) {
            Client clientToAdd = clientToAddOpt.get();
            // Создание нового QueueItem для этого клиента
            QueueItem queueItem = new QueueItem(String.valueOf(clientToAdd.getId()), QueueItem.RequestType.BOOKING,
                    LocalDateTime.now());
            clientQueue.addClient(queueItem);
            System.out.println("Клиент добавлен в очередь: " + queueItem);
        } else {
            System.out.println("Клиент с ID " + clientId + " не найден.");
        }

        // Обработка очереди клиентов
        processClientQueue(clientQueue);

        scanner.close();
    }

    private static void registerClients(ClientManager clientManager) {
        clientManager.registerClient("Иван", "Иванов", "ivan@mail.ru");
        clientManager.registerClient("Петр", "Петров", "petr@mail.ru");
        clientManager.registerClient("Светлана", "Сидорова", "svetlana@mail.ru");
        // Добавьте больше клиентов по желанию
    }

    private static void processClientQueue(QueueManager<QueueItem> clientQueue) {
        // Обработка клиентов в очереди
        while (!clientQueue.isQueueEmpty()) {
            QueueItem clientItem = clientQueue.removeClient();
            // Обработка клиента (например, печать информации о запросе)
            System.out.println("Обработка клиента: " + clientItem.getClientId() + ", тип запроса: "
                    + clientItem.getRequestType() + ", время запроса: " + clientItem.getTimestamp());
        }
    }

} // klass ended

