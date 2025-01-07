package TourismBureauManagementSystem.core;
/*
Создаем класс QueueManager:
 - создаем поле queue, которое представляет собой очередь клиентов с помощью LinkedList.
Методы для этого класса:
1. addClient(Client client): Добавляет клиента в очередь.
2. removeClient(): Удаляет клиента из начала очереди и возвращает его. Если очередь пуста, возвращает null.
3. peekNextClient(): Проверяет следующего клиента в очереди, не удаляя его. Полезно, если хотите увидеть,
кто будет следующим, без изменений в очереди.
4. isQueueEmpty(): Проверяет, пуста ли очередь, что может быть полезно в логике программы.
5. getQueueSize(): Возвращает текущий размер очереди.
6. getQueueItems(): Возвращает копию списка клиентов в очереди.
Класс должен быть универсальным для работы с другими типами объектов очереди.
Проверяем возможные исключения, ошибки:
   например, если клиент не был правильно добавлен и нужны исправления.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueManager<T> {
    private final Queue<T> queue; // Обобщенная очередь

    // Конструктор
    public QueueManager() {
        this.queue = new LinkedList<>(); // Инициализация очереди с использованием LinkedList
    }

    // Метод для добавления клиента в очередь
    public void addClient(T client) {
        if (client == null) {
            throw new IllegalArgumentException("Клиент не может быть null");
        }
        queue.add(client);
        System.out.println("Клиент добавлен в очередь: " + client);
    }

    // Метод для удаления клиента из начала очереди
    public T removeClient() { // Вернули старое имя метода
        T removedClient = queue.poll();
        if (removedClient == null) {
            System.out.println("Очередь пуста. Невозможно удалить клиента.");
        } else {
            System.out.println("Удален клиент из очереди: " + removedClient);
        }
        return removedClient;
    }

    // Метод для проверки следующего клиента в очереди
    public T peekNextClient() { // Вернули старое имя метода
        T nextClient = queue.peek();
        if (nextClient == null) {
            System.out.println("Очередь пуста. Нет следующего клиента.");
        }
        return nextClient;
    }

    // Метод для проверки, пуста ли очередь
    public boolean isQueueEmpty() {
        return queue.isEmpty();
    }

    // Метод для получения текущей очереди
    public List<T> getCurrentQueue() {
        return new ArrayList<>(queue); // Возвращаем копию текущей очереди
    }

    // Метод для получения текущего размера очереди
    public int getQueueSize() {
        return queue.size();
    }

    // Метод для получения копии списка клиентов в очереди
    public List<T> getQueueItems() {
        return new LinkedList<>(queue);
    }

} // klass ended

