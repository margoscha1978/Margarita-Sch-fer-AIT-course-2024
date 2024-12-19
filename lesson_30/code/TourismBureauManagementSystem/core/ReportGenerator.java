package TourismBureauManagementSystem.core;
    /*
 - Отчет по всем бронированиям за указанный период.
 - Отчет по текущему состоянию очередей.
 - Сохранение отчетов в текстовый файл(JavaDoc).
 - Использование коллекций HashMap и ArrayList для хранения данных в памяти.
     */

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.Tour;

import java.util.List;
import java.util.logging.Logger;

public class ReportGenerator {
    private static final Logger log = Logger.getLogger(ReportGenerator.class.getName());

    private final ClientManager clientManager;
    private final TourManager tourManager;
    private final QueueManager queueManager;

    public ReportGenerator(ClientManager clientManager, TourManager tourManager, QueueManager queueManager) {
        this.clientManager = clientManager;
        this.tourManager = tourManager;
        this.queueManager = queueManager;
    }

    // Генерация отчета по клиентам
    public String generateClientReport() {
        List<Client> clients = clientManager.getAllClients();
        StringBuilder report = new StringBuilder("Отчет по клиентам:\n");

        for (Client client : clients) {
            report.append(client.toString()).append("\n");
        }
        log.info("Сгенерирован отчет по клиентам.");
        return report.toString();
    }

    // Генерация отчета по турам
    public String generateTourReport() {
        List<Tour> tours = tourManager.getAllTours();
        StringBuilder report = new StringBuilder("Отчет по турам:\n");

        for (Tour tour : tours) {
            report.append(tour.toString()).append("\n");
        }
        log.info("Сгенерирован отчет по турам.");
        return report.toString();
    }

    // Генерация отчета о текущей очереди
    public String generateQueueReport() {
        List queueItems = queueManager.getQueueItems(); // Изменено на QueueItem
        StringBuilder report = new StringBuilder("Текущая очередь:\n");

        for (Object item : queueItems) {
            report.append(item.toString()).append("\n");
        }
        log.info("Сгенерирован отчет по очереди.");
        return report.toString();
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