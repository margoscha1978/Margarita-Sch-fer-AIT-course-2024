package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;
import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import static TourismBureauManagementSystem.core.ReportGeneratorTest.*;

// Консольный интерфейс
public class TourismBureauConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Инициализация менеджеров
        ClientManager clientManager = new SimpleClientManager();
        TourManager tourManager = new SimpleTourManager();
        QueueManager<QueueItem> queueManager = new SimpleTourManager.SimpleQueueManager<>();

        // Создание объекта генератора отчетов
        ReportGenerator reportGenerator = new ReportGenerator(clientManager, queueManager, tourManager);

        // Основной цикл программы
        while (true) {
            System.out.println("\n--- Туристическое агентство ---");
            System.out.println("1. Зарегистрировать нового клиента");
            System.out.println("2. Добавить тур");
            System.out.println("3. Добавить клиента в очередь");
            System.out.println("4. Сгенерировать отчет");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Для очистки буфера ввода

            switch (choice) {
                case 1:
                    // Регистрация нового клиента
                    System.out.print("Введите имя клиента: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введите фамилию клиента: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите контактную информацию клиента: ");
                    String contactInfo = scanner.nextLine();
                    clientManager.registerClient(firstName, lastName, contactInfo);
                    System.out.println("Клиент зарегистрирован.");
                    break;

                case 2:
                    // Добавление нового тура
                    System.out.print("Введите ID тура: ");
                    String tourId = scanner.nextLine();

                    System.out.print("Введите направление тура: ");
                    String destination = scanner.nextLine();

                    // Запрос даты
                    System.out.print("Введите местные данные (дата начала тура в формате ГГГГ-ММ-ДД): ");
                    String lokaleDatenString = scanner.nextLine();
                    LocalDate lokaleDaten = null;

                    // Преобразование строки в LocalDate
                    try {
                        lokaleDaten = LocalDate.parse(lokaleDatenString);
                    } catch (Exception e) {
                        System.out.println("Ошибка: неверный формат даты. Используйте ГГГГ-ММ-ДД.");
                        continue; // Пропускаем, если неверный формат
                    }

                    System.out.print("Введите продолжительность тура (в днях): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера

                    System.out.print("Введите цену тура: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Очистка буфера

                    System.out.print("Введите количество свободных мест: ");
                    int availableSeats = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера

                    // Создаем новый объект Tour
                    Tour tour = new Tour(tourId, destination, lokaleDaten, duration, price, availableSeats);

                    // Добавляем тур в менеджер
                    tourManager.addTour(tour);
                    System.out.println("Тур добавлен: " + tour);
                    break;

                case 3:
                    // Добавление клиента в очередь
                    System.out.print("Введите ID клиента, которого хотите добавить в очередь: ");
                    String clientId = scanner.nextLine();
                    QueueItem queueItem = new QueueItem(clientId, QueueItem.RequestType.BOOKING, LocalDateTime.now());
                    queueManager.addClient(queueItem);
                    System.out.println("Клиент добавлен в очередь: " + queueItem);
                    break;

                case 4:
                    // Генерация отчета
                    System.out.println("Генерация отчета...");
                    reportGenerator.generateReport(); // Предполагается, что метод generateReport реализован
                    break;

                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
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
   - `scanner.nextLine()` используется для считывания оставшейся строки после ввода,
    чтобы избежать проблем с буферизацией.
   - Даты форматируются как `LocalDate`, что требует правильного ввода от пользователя.

3. Отправка сообщений:
   - Программа выводит сообщения о том, что клиент или тур успешно добавлены.
 */


