package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;

import java.time.LocalDateTime;

import java.util.Scanner;
import java.time.LocalDate;

public class TourismBureauApp {
    public static void main(String[] args) {
        // Инициализация менеджеров
        Manager<Client> clientManager = new SimpleClientManager();
        Manager<QueueItem> queueManager = new SimpleQueueManager<>();
        Manager<Tour> tourManager = new SimpleTourManager();

        ReportGenerator reportGenerator = new ReportGenerator((ClientManager) clientManager,
                (QueueManager<QueueItem>) queueManager, (TourManager) tourManager);

        // Добавление клиентов
        clientManager.add(new Client("Иван", "Иванов", "ivan@example.com"));
        clientManager.add(new Client("Петр", "Петров", "petr@example.com"));

        // Задаем текущее время как startDate
        LocalDateTime startDate = LocalDateTime.now().plusDays(10); // Здесь задаём дату через 10 дней
        // Добавление туров
        tourManager.add(new Tour("1", startDate.toLocalDate(), 7, 1000.0, 20));
        // Правильный вызов с LocalDate
        tourManager.add(new Tour("2", startDate.toLocalDate(), 8, 800.0, 15));

        // Добавление элементов в очередь
        queueManager.add(new QueueItem("1", QueueItem.RequestType.CONSULTATION, LocalDateTime.now()));
        queueManager.add(new QueueItem("2", QueueItem.RequestType.BOOKING, LocalDateTime.now()));


        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Туристическое бюро ===");
            System.out.println("1. Добавить клиента");
            System.out.println("2. Добавить тур");
            System.out.println("3. Запросить тур");
            System.out.println("4. Сгенерировать отчет");
            System.out.println("0. Выход");
            System.out.print("Введите ваш выбор: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    // Добавление клиента
                    System.out.print("Введите имя клиента: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введите фамилию клиента: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите контактные данные клиента: ");
                    String contactInfo = scanner.nextLine();
                    Client client = new Client(firstName, lastName, contactInfo);
                    clientManager.add(client);
                    System.out.println("Клиент добавлен: " + client.getFirstName() + " " + client.getLastName());
                    break;

                case 2:
                    // Добавление тура
                    System.out.print("Введите ID тура: ");
                    String tourId = scanner.nextLine();
                    System.out.print("Введите направление тура: ");
                    String destination = scanner.nextLine();
                    System.out.print("Введите дату начала тура (ГГГГ-ММ-ДД): ");
                    String lokaleDatenString = scanner.nextLine();
                    LocalDate lokaleDatenTime = LocalDate.parse(lokaleDatenString);
                    System.out.print("Введите продолжительность тура (в днях): ");
                    int duration = scanner.nextInt();
                    System.out.print("Введите цену тура: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введите количество свободных мест: ");
                    int availableSeats = scanner.nextInt();
                    Tour tour = new Tour( destination, lokaleDatenTime, duration, price, availableSeats);
                    tourManager.add(tour);
                    System.out.println("Тур добавлен: " + tour.getId() + " в " + tour.getDestination());
                    scanner.nextLine(); // Очистка буфера
                    break;

                case 3:
                    // Запросить тур
                    System.out.print("Введите ID клиента, который запросил тур: ");
                    String clientId = scanner.nextLine(); // Считываем ID клиента

                    // Предполагаем, что у вас есть enum RequestType
                    QueueItem.RequestType requestType = null;
                    boolean validRequestType = false;

                    // Цикл для ввода корректного типа запроса
                    while (!validRequestType) {
                        System.out.print("Введите тип запроса (например, TOUR, CANCELLATION, INFO): ");
                        String requestTypeString = scanner.nextLine();

                        try {
                            // Преобразование строки в RequestType
                            requestType = QueueItem.RequestType.valueOf(requestTypeString.toUpperCase());
                            validRequestType = true; // Если преобразование успешно, выходим из цикла
                        } catch (IllegalArgumentException e) {
                            System.out.println("Неверный тип запроса. Попробуйте снова."); // Сообщение об ошибке
                        }
                    }

                    // Получаем текущее время
                    LocalDateTime timestamp = LocalDateTime.now();

                    // Создаем новый элемент очереди с учетом метки времени
                    QueueItem queueItem = new QueueItem(clientId, requestType, timestamp);
                    queueManager.add(queueItem); // Добавляем в очередь
                    System.out.println("Запрос клиента добавлен в очередь."); // Подтверждение
                    break;

                case 4:
                    // Генерация отчета
                    System.out.println("Генерация отчета...");
                    reportGenerator.generateReport();
                    break;

                case 0:
                    // Выход из приложения
                    System.out.println("Выход из приложения. Спасибо за использование.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

} // klass ended

