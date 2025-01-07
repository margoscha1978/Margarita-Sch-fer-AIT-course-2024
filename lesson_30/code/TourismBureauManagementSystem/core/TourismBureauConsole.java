package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


// Консольный интерфейс
public class TourismBureauConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClientManager clientManager = new SimpleClientManager();
        QueueManager<QueueItem> clientQueue = new QueueManager<>();
        TourManager tourManager = new TourManager();
        ReportGenerator reportGenerator = new ReportGenerator(clientManager, clientQueue, tourManager);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить клиента");
            System.out.println("2. Добавить тур");
            System.out.println("3. Добавить клиента в очередь");
            System.out.println("4. Обработать клиента из очереди");
            System.out.println("5. Генерировать отчет по клиентам");
            System.out.println("6. Генерировать отчет по турам");
            System.out.println("7. Генерировать отчет по очереди");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем оставшийся символ новой строки

            switch (choice) {
                case 1: // Добавить клиента
                    System.out.print("Введите имя клиента: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введите фамилию клиента: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите контактную информацию: ");
                    String contactInfo = scanner.nextLine();
                    clientManager.registerClient(firstName, lastName, contactInfo);
                    break;

                case 2: // Добавить тур
                    System.out.print("Введите место назначения: ");
                    String destination = scanner.nextLine();
                    System.out.print("Введите дату (гггг-мм-дд): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    System.out.print("Введите продолжительность тура (дни): ");
                    int duration = scanner.nextInt();
                    System.out.print("Введите цену тура: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введите количество доступных мест: ");
                    int availableSeats = scanner.nextInt();
                    scanner.nextLine(); // Считываем оставшийся символ новой строки

                    tourManager.addTour(new Tour(destination, date, duration, price, availableSeats));
                    break;

                case 3: // Добавить клиента в очередь
                    System.out.print("Введите ID клиента (строка): ");
                    String clientId = scanner.nextLine(); // Теперь это строка
                    System.out.print("Введите тип запроса (например, INFO или BOOKING): ");
                    String requestTypeInput = scanner.nextLine();
                    QueueItem.RequestType requestType = QueueItem.RequestType.valueOf(requestTypeInput.toUpperCase()); // Преобразуем строку в RequestType
                    LocalDateTime timestamp = LocalDateTime.now(); // Текущая дата и время

                    QueueItem queueItem = new QueueItem(clientId, requestType, timestamp);
                    clientQueue.addClient(queueItem);
                    break;

                case 4: // Обработать клиента из очереди
                    clientQueue.removeClient();
                    break;

                case 5: // Генерировать отчет по клиентам
                    reportGenerator.generateClientReport();
                    break;

                case 6: // Генерировать отчет по турам
                    reportGenerator.generateTourReport();
                    break;

                case 7: // Генерировать отчет по очереди
                    reportGenerator.generateQueueReport();
                    break;

                case 0: // Выход
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Недопустимый выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    } // klass ended
/*
1. Добавление клиентов и туров:
   - Команда 3 позволяет пользователю ввести данные о новом клиенте (id, имя, фамилию и контактную информацию).
   - Команда 4 позволяет пользователю ввести информацию о новом туре (id, направление, дату, продолжительность,
    цену и доступные места).

2. Пользовательский ввод:
   - scanner.nextLine() используется для считывания оставшейся строки после ввода,
    чтобы избежать проблем с буферизацией.
   - Даты форматируются как LocalDate, что требует правильного ввода от пользователя.

3. Отправка сообщений:
   - Программа выводит сообщения о том, что клиент или тур успешно добавлены.
 */


