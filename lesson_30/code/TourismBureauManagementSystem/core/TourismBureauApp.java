package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;

import java.time.LocalDateTime;

import java.util.Scanner;
import java.time.LocalDate;

/*
public class TourismBureauInterface {
// эксперимент с одним туром и одним клиентом
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Инициализация менеджеров
        ClientManager clientManager = new ReportGeneratorTest.SimpleClientManager();
        TourManager tourManager = new ReportGeneratorTest.SimpleTourManager();
        QueueManager queueManager = new ReportGeneratorTest.SimpleQueueManager();

        // Создание объекта генератора отчетов
        ReportGenerator reportGenerator = new ReportGenerator(clientManager, tourManager, queueManager);

        // Пример добавления данных
        clientManager.addClient(new Client("1", "Иван", "Иванов", "ivan@mail.ru"));
        tourManager.addTour(new Tour("5", "Греция", LocalDate.parse("2024-10-12"), 5,
                2500, 5));

        System.out.println("Добро пожаловать в Туристическое бюро!");
        boolean running = true;

        while (running) {
            System.out.println("Введите команду (1 - Отчет по клиентам, 2 - Отчет по турам, 0 - Выход): ");
            int command = scanner.nextInt(); // Чтение команды

            switch (command) {
                case 1:
                    String clientReport = reportGenerator.generateClientReport();
                    System.out.println(clientReport);
                    break;
                case 2:
                    String tourReport = reportGenerator.generateTourReport();
                    System.out.println(tourReport);
                    break;
                case 0:
                    System.out.println("Выход...");
                    running = false; // Выход из цикла
                    break;
                default:
                    System.out.println("Неверная команда. Пожалуйста, попробуйте еще раз.");
            }
        }

        scanner.close();
    }

} // klass ended

 */

public class TourismBureauApp {
    public static void main(String[] args) {
        // Инициализация менеджеров
        Manager<Client> clientManager = new SimpleClientManager();
        Manager<QueueItem> queueManager = new SimpleQueueManager<>();
        Manager<Tour> tourManager = new SimpleTourManager();
        ReportGenerator reportGenerator = new ReportGenerator(clientManager, queueManager, tourManager);
        // Добавление клиентов
        clientManager.add(new Client("Иван", "Иванов", "ivan@example.com"));
        clientManager.add(new Client("Петр", "Петров", "petr@example.com"));

        // Задаем текущее время как startDate
        LocalDateTime startDate = LocalDateTime.now().plusDays(10); // Здесь задаём дату через 10 дней

        // Добавление туров
        tourManager.add(new Tour("1", "Греция", startDate, 7, 1000.0, 20));
        tourManager.add(new Tour("2", "Испания", startDate.plusDays(10), 5, 800.0, 15));
        // Здесь добавляем еще 10 дней

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
                    Tour tour = new Tour(tourId, destination, lokaleDatenTime, duration, price, availableSeats);
                    tourManager.add(tour);
                    System.out.println("Тур добавлен: " + tour.getId() + " в " + tour.getDestination());
                    scanner.nextLine(); // Очистка буфера
                    break;

                case 3:
                    // Запросить тур
                    System.out.print("Введите ID клиента, который запросил тур: ");
                    String clientId = scanner.nextLine();
                    System.out.print("Введите тип запроса: ");
                    String requestType = scanner.nextLine();
                    QueueItem queueItem = new QueueItem(clientId, requestType);
                    queueManager.add(queueItem);
                    System.out.println("Запрос клиента добавлен в очередь.");
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

