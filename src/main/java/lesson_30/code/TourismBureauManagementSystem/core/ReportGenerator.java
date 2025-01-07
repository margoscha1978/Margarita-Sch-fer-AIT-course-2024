package TourismBureauManagementSystem.core;
    /*
 - Отчет по всем бронированиям за указанный период.
 - Отчет по текущему состоянию очередей.
 - Сохранение отчетов в текстовый файл(JavaDoc).
 - Использование коллекций HashMap и ArrayList для хранения данных в памяти.
  - clientManager: Для доступа к информации о клиентах.
  - clientQueue: Для доступа к текущей очереди клиентов.
  - tourManager: Для доступа к информации о турах.
     */

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;

import java.util.List;
import java.util.logging.Logger;


public class ReportGenerator {
    private static final Logger log = Logger.getLogger(ReportGenerator.class.getName());

    private final ClientManager clientManager; // Менеджер клиентов
    private final QueueManager<QueueItem> clientQueue; // Очередь клиентов
    private final TourManager tourManager; // Менеджер туров

    // Конструктор
    public ReportGenerator(ClientManager clientManager, QueueManager<QueueItem> clientQueue, TourManager tourManager) {
        this.clientManager = clientManager;
        this.clientQueue = clientQueue;
        this.tourManager = tourManager; // Инициализация TourManager
    }


    // Метод для генерации отчета по всем клиентам
    public void generateClientReport() {
        List<Client> clients = clientManager.getAllClients();
        System.out.println("Отчет по всем клиентам:");
        for (Client client : clients) {
            System.out.println("ID: " + client.getId() +
                    ", Имя: " + client.getFirstName() +
                    ", Фамилия: " + client.getLastName() +
                    ", Контакт: " + client.getContactInfo());
        }
    }

    // Метод для генерации отчета о текущей очереди клиентов
    public void generateQueueReport() {
        System.out.println("Отчет о текущей очереди клиентов:");
        if (clientQueue.isQueueEmpty()) {
            System.out.println("Очередь пуста.");
            return;
        }

        for (QueueItem item : clientQueue.getCurrentQueue()) { // Предполагается, что этот метод реализован
            System.out.println("Клиент ID: " + item.getClientId() +
                    ", Запрос: " + item.getRequestType() +
                    ", Время запроса: " + item.getTimestamp());
        }
    }

    // Метод для генерации отчета по всем турам
    public void generateTourReport() {
        List<Tour> tours = tourManager.getAllTours(); // Предполагается, что этот метод реализован
        System.out.println("Отчет по всем турам:");
        for (Tour tour : tours) {
            System.out.println(tour.toString()); // Используем метод toString для вывода информации о туре
        }
    }

    public void generateReport(){
        System.out.println("----- Генерация общего отчета -----");
        generateClientReport();
        generateTourReport();
        generateQueueReport();
        System.out.println("------------------------------------");
    }

} // klass ended

 /*
 Создаем класс ReportGenerator:
1. нужен конструктор со всеми классами:
   - ClientManager, TourManager и QueueManager, чтобы иметь доступ к необходимым данным.

2.методы для получения информации:
 - generateClientReport():отчет о всех клиентах, получая данные из ClientManager.
 - generateTourReport(): отчет о всех турах, получая данные из TourManager.
 - generateQueueReport(): отчет о текущей очереди клиентских запросов, получая данные из QueueManager.

3. возможные улучшения для функционирования класса и вывода данных:
 - форматирование выводимых данных: можно использовать различные форматы для вывода отчетов (например, CSV, JSON и т.д.).
 - сортировка и группировка информации:отчеты можно сделать более подробными, включая сортировку по различным критериям,
   таким как дата, тип запроса и т.д.
 - визуализация данных: для более удобного чтения, можно добавлять функции для визуализации данных, например,
 графики или диаграммы (для этого могут понадобиться дополнительные библиотеки).
 - создание интерфейса для удобного использования программы и более легкого управления данными.
 */