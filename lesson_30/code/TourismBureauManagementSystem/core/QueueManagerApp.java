package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;

public class QueueManagerApp {

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
        Client client1 = new Client("1", "Иван","Иванов","ivan@mail.ru");
        Client client2 = new Client("2", "Петр","Петров","petr@mail.ru");
        Client client3 = new Client("3", "Мария","Петрова","maria@mail.ru");
        Client client4 = new Client("4", "Николай","Федоров","nikolai@mail.ru");
        Client client5 = new Client("5", "Светлана","Сидорова","svetlana@mail.ru");
        //Client client6 = new Client("6", "Сергей","Колокольцев","sergei@mail.ru");

        // Добавление клиентов в очередь
        clientQueue.addClient(client1);
        clientQueue.addClient(client2);
        clientQueue.addClient(client3);
        clientQueue.addClient(client4);
        clientQueue.addClient(client5);
        return clientQueue;
    }

} // klass ended

