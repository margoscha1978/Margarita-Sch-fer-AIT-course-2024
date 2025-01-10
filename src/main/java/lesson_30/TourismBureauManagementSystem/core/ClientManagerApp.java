package lesson_30.TourismBureauManagementSystem.core;
/*
 Активная работа с пользователем, или
 проверка работы выбранных для класса ClientManager методов.
 Простейший интерфейс для пользователя или менеджера для ввода данных клиента.
 */
import lesson_30.TourismBureauManagementSystem.model.Client;

import java.util.List;
import java.util.Scanner;

public class ClientManagerApp {
    private ClientManager clientManager;
    private Scanner scanner;

    public ClientManagerApp() {
        clientManager = new ClientManager();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить клиента");
            System.out.println("2. Обновить контактную информацию");
            System.out.println("3. Удалить клиента");
            System.out.println("4. Показать всех клиентов");
            System.out.println("5. Найти клиента по ID");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addClient();
                    break;
                case 2:
                    updateContactInfo();
                    break;
                case 3:
                    removeClient();
                    break;
                case 4:
                    listAllClients();
                    break;
                case 5:
                    findClientById();
                    break;
                case 6:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте еще раз.");
            }
        }
    }

    private void addClient() {
        System.out.print("Введите ID клиента: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите имя клиента: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию клиента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите контактную информацию: ");
        String contactInfo = scanner.nextLine();

        clientManager.addClient(new Client(id, firstName, lastName, contactInfo));
        System.out.println("Клиент добавлен.");
    }

    private void updateContactInfo() {
        // Реализация обновления контактной информации (аналогично добавлению)
    }

    private void removeClient() {
        // Реализация удаления клиента
    }

    private void listAllClients() {
        List<Client> clients = clientManager.listAllClients();
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    private void findClientById() {
        // Реализация поиска клиента по ID
    }

    public static void main(String[] args) {
        ClientManagerApp app = new ClientManagerApp();
        app.run();
    }
} // klass ended
