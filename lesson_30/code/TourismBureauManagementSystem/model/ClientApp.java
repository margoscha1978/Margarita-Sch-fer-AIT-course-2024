package TourismBureauManagementSystem.model;

import TourismBureauManagementSystem.core.ClientManager;

import java.util.List;
import java.util.Scanner;

public class ClientApp {
    private ClientManager clientManager;
    private Scanner scanner;

    public ClientApp() {
        clientManager = new ClientManager();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Клиентский менеджер ---");
            System.out.println("1. Добавить клиента");
            System.out.println("2. Удалить клиента");
            System.out.println("3. Получить клиента по ID");
            System.out.println("4. Найти клиентов по имени");
            System.out.println("5. Обновить контактную информацию");
            System.out.println("6. Показать всех клиентов");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addClient();
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
                case 0:
                    System.out.println("Выход из приложения.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private void addClient() {
        System.out.print("Введите имя клиента: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию клиента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите контактную информацию клиента: ");
        String contactInfo = scanner.nextLine();

        try {
            clientManager.registerClient(firstName, lastName, contactInfo);
            System.out.println("Клиент успешно добавлен.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void removeClient() {
        System.out.print("Введите ID клиента для удаления: ");
        String clientId = scanner.nextLine();
        if (clientManager.removeClient(clientId)) {
            System.out.println("Клиент успешно удален.");
        } else {
            System.out.println("Клиент с таким ID не найден.");
        }
    }

    private void getClientById() {
        System.out.print("Введите ID клиента: ");
        String clientId = scanner.nextLine();
        clientManager.getClient(clientId)
                .ifPresentOrElse(client -> System.out.println(client),
                        () -> System.out.println("Клиент с таким ID не найден."));
    }

    private void findClientsByName() {
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

    public static void main(String[] args) {
        ClientApp app = new ClientApp();
        app.start();
    }
}

/*
 - `clientManager`: экземпляр класса `ClientManager` для управления клиентами.
   - `scanner`: объект `Scanner` для считывания пользовательского ввода.

2. **Метод `start()`:**
   - Основной цикл приложения, который предлагает пользователю меню с вариантами действий и обрабатывает выбор пользователя.

3. **Методы для работы с клиентами:**
   - **`addClient()`:** Запрашивает данные клиента и добавляет его в систему, обрабатывает возможное исключение.
   - **`removeClient()`:** Запрашивает ID клиента и удаляет его из системы.
   - **`getClientById()`:** Запрашивает ID клиента и выводит информацию о нём.
   - **`findClientsByName()`:** Запрашивает имя или фамилию и выводит соответствующих клиентов.
   - **`updateContactInfo()`:** Запрашивает ID и новую контактную информацию для обновления.
   - **`showAllClients()`:** Выводит всех клиентов, если таковые имеются.

 */
