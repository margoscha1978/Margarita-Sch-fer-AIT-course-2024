package lesson_30.TourismBureauManagementSystem.core;
/*
 Метод `getWaitingReports()`, который выводит отчеты о времени ожидания для всех клиентов в очереди.
 Проверка всех выбранных методов
 */
import lesson_30.TourismBureauManagementSystem.model.QueueItem;

import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private Queue<QueueItem> requestQueue; // Очередь запросов

    public QueueManager() {
        requestQueue = new LinkedList<>();
    }

    // Метод для добавления клиента в очередь
    public void addClientToQueue(int clientId, String requestType) {
        QueueItem item = new QueueItem(clientId, requestType);
        requestQueue.offer(item);
        System.out.println("Клиент с id " + clientId + " добавлен в очередь для запроса: " + requestType);
    }

    // Метод для вызова следующего клиента
    public QueueItem callNextClient() {
        QueueItem nextClient = requestQueue.poll();
        if (nextClient != null) {
            System.out.println("Клиент с id " + nextClient.getClientId() + " вызван из очереди.");
        } else {
            System.out.println("Очередь пуста!");
        }
        return nextClient;
    }

    // Метод для просмотра текущей очереди
    public void viewCurrentQueue() {
        System.out.println("Текущая очередь:");
        for (QueueItem item : requestQueue) {
            System.out.println(item);
        }
    }

    // Метод для получения отчета о времени ожидания
    public void getWaitingReports() {
        System.out.println("Отчеты о текущем времени ожидания:");
        for (QueueItem item : requestQueue) {
            System.out.println("Клиент id: " + item.getClientId() + ", тип запроса: " + item.getRequestType() +
                    ", время ожидания: " + item.getWaitingTime() + " минут.");
        }
    }
} // klass ended

/*
Метод для добавления клиента в очередь addClientToQueue;
Метод для вызова следующего клиента callNextClient;
Метод для просмотра текущей очереди viewCurrentQueue;
Метод для получения отчета о времени ожидания getWaitingReports;
 */
