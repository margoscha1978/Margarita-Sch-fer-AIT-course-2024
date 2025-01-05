package TourismBureauManagementSystem.core;
/*
создаем списки клиентов для работы программы
 */
import TourismBureauManagementSystem.model.Client;

import java.util.List;
import java.util.Scanner;

public class ClientManagerApp {
  private ClientManager clientManager;
  private Scanner scanner;

  public ClientManagerApp() {
    clientManager = new ClientManager();
    scanner = new Scanner(System.in);
  }

  public void start() {
    System.out.println("Добро пожаловать в систему управления клиентами");
    while (true) {
      displayMenu();
      int choice = getUserInput("Выберите действие: ");
      switch (choice) {
        case 1:
          registerClient();
          break;
        case 2:
          removeClient();
          break;
        case 3:
          getClientById();
          break;
        case 4:
          findClientsByName();
          break;
        case 5:
          updateContactInfo();
          break;
        case 6:
          showAllClients();
          break;
        case 7:
          saveClientsToFile();
          break;
        case 8:
          loadClientsFromFile();
          break;
        case 0:
          System.out.println("Выход из приложения.");
          return;
        default:
          System.out.println("Неверный выбор. Попробуйте снова.");
      }
    }
  }

  private void displayMenu() {
    System.out.println("\n--- Меню ---");
    System.out.println("1. Добавить клиента");
    System.out.println("2. Удалить клиента");
    System.out.println("3. Получить клиента по ID");
    System.out.println("4. Найти клиентов по имени");
    System.out.println("5. Обновить контактную информацию");
    System.out.println("6. Показать всех клиентов");
    System.out.println("7. Сохранить клиентов в файл");
    System.out.println("8. Загрузить клиентов из файла");
    System.out.println("0. Выход");
  }

  private int getUserInput(String prompt) {
    System.out.print(prompt);
    return scanner.nextInt();
  }

  private void registerClient() {
    scanner.nextLine(); // Очистка буфера
    System.out.print("Введите имя клиента: ");
    String firstName = scanner.nextLine();
    System.out.print("Введите фамилию клиента: ");
    String lastName = scanner.nextLine();
    System.out.print("Введите контактную информацию клиента: ");
    String contactInfo = scanner.nextLine();
    // создание нового клиента
    Client newClient = new Client("Иван","Иванов","ivan@mail.ru");
    try {
      // Вызов метода registerClient для добавления клиента
      clientManager.registerClient(firstName, lastName, contactInfo);
      System.out.println("Клиент успешно добавлен.");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private void removeClient() {
    scanner.nextLine(); // Очистка буфера
    System.out.print("Введите ID клиента для удаления: ");
    String clientId = scanner.nextLine();
    if (clientManager.removeClient(clientId)) {
      System.out.println("Клиент успешно удален.");
    } else {
      System.out.println("Клиент с таким ID не найден.");
    }
  }

  private void getClientById() {
    scanner.nextLine(); // Очистка буфера
    System.out.print("Введите ID клиента: ");
    String clientId = scanner.nextLine();
    clientManager.getClient(clientId)
            .ifPresentOrElse(client -> System.out.println(client),
                    () -> System.out.println("Клиент с таким ID не найден."));
  }

  private void findClientsByName() {
    scanner.nextLine(); // Очистка буфера
    System.out.print("Введите имя или фамилию для поиска: ");
    String name = scanner.nextLine();
    List<Client> foundClients = clientManager.findClientsByName(name);

    if (foundClients.isEmpty()) {
      System.out.println("Клиенты не найдены.");
    } else {
      foundClients.forEach(System.out::println);
    }
  }

  private void updateContactInfo() {
    System.out.print("Введите ID клиента: ");
    int clientId = scanner.nextInt();
    scanner.nextLine(); // Очистка буфера
    System.out.print("Введите новую контактную информацию: ");
    String newContactInfo = scanner.nextLine();

    if (clientManager.updateContactInfo(clientId, newContactInfo)) {
      System.out.println("Контактная информация успешно обновлена.");
    } else {
      System.out.println("Клиент с таким ID не найден.");
    }
  }

  private void showAllClients() {
    List<Client> clients = clientManager.getAllClients();
    if (clients.isEmpty()) {
      System.out.println("Нет зарегистрированных клиентов.");
    } else {
      clients.forEach(System.out::println);
    }
  }

  private void saveClientsToFile() {
    // Используйте логику для сохранения клиентов в файл (по вашему выбору)
    System.out.println("Сохранение клиентов в файл. (Функционал пока не реализован)");
  }

  private void loadClientsFromFile() {
    // Используйте логику для загрузки клиентов из файла (по вашему выбору)
    System.out.println("Загрузка клиентов из файла. (Функционал пока не реализован)");
  }

  public static void main(String[] args) {
    ClientManagerApp app = new ClientManagerApp();
    app.start();
  }
}

