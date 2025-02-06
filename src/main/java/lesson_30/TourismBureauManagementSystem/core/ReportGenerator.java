package lesson_30.TourismBureauManagementSystem.core;
/*
 - отчеты по всем бронированиям за определенный период.
 - отчет по текущему состоянию очередей.
 - сохранение отчетов, можно в текстовый файл.
 - использование коллекций HashMap и ArrayList для хранения данных в памяти.
 */

import lesson_30.TourismBureauManagementSystem.model.Booking;
import lesson_30.TourismBureauManagementSystem.model.Client;
import lesson_30.TourismBureauManagementSystem.model.QueueItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class ReportGenerator {
    // Ссылки на другие важные классы
    private List<Client> clients;
    private List<Booking> bookings;
    private List<QueueItem> queue;

    // Конструктор
    public ReportGenerator(List<Client> clients, List<Booking> bookings, List<QueueItem> queue) {
        this.clients = clients;
        this.bookings = bookings;
        this.queue = queue;
    }

    // Получение отчета по количеству новых клиентов за период
    public String generateClientReport(LocalDateTime startDate, LocalDateTime endDate) {
        long newClientsCount = clients.stream()
                .filter(client -> client.getCreatedAt().isAfter(startDate) && client.getCreatedAt().isBefore(endDate))
                .count();

        return "Number of new clients from " + startDate + " to " + endDate + ": " + newClientsCount;
    }

    // Получение отчета по количеству бронирований за период
    public String generateBookingReport(LocalDateTime startDate, LocalDateTime endDate) {
        long bookingsCount = bookings.stream()
                .filter(booking -> booking.getDateTime().isAfter(startDate) && booking.getDateTime().isBefore(endDate))
                .count();

        return "Number of bookings from " + startDate + " to " + endDate + ": " + bookingsCount;
    }

    // Получение отчета по времени ожидания в очереди
    public String generateQueueReport() {
        double averageWaitingTime = queue.stream()
                .mapToDouble(QueueItem::getWaitingTime)
                .average()
                .orElse(0);

        return "Average waiting time in queue: " + averageWaitingTime + " minutes";
    }

    // Функция для генерации общего отчета
    public String generateFullReport(LocalDateTime startDate, LocalDateTime endDate) {
        StringBuilder report = new StringBuilder();
        report.append(generateClientReport(startDate, endDate)).append("\n");
        report.append(generateBookingReport(startDate, endDate)).append("\n");
        report.append(generateQueueReport()).append("\n");
        return report.toString();
    }

} // klass ended

/*
1. Поля класса:
   - clients, bookings, queue: Списки, которые хронически хранят информацию о клиентах,
    бронированиях и запросах соответственно.
2. Методы класса**:
   - generateClientReport(): Генерирует отчет о количестве клиентов, добавленных в заданный период.
   - generateBookingReport(): Генерирует отчет о количестве бронирований в заданный период.
   - generateQueueReport(): Вычисляет среднее время ожидания в очереди.
   - generateFullReport(): Генерирует полный отчет, объединяя данные от всех трех методов.
3. Форматирование дат: добавить форматирование для представления дат в удобочитаемом виде для клиента и менеджера.
Есть еще идеи для расширения функциональности:
1. Экспорт данных: Добавить возможность экспортировать отчеты в формате CSV, JSON или PDF для удобства использования и анализа.
2. Графики и визуализация данных: Интегрировать библиотеку для построения графиков для визуализации данных,
   чтобы пользователи могли легче анализировать информацию.
3. Фильтры и сортировка: Добавить параметры для фильтрации и сортировки данных в отчетах,
   чтобы пользователи могли получать более детальную информацию по определённым критериям.
4. Уведомления: Разработка системы уведомлений о предстоящих бронированиях и статистике, например, через электронную почту.
 */