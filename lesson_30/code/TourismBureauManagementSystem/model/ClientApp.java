package TourismBureauManagementSystem.model;

import TourismBureauManagementSystem.model.Client;
import java.util.List;

public class ClientApp {
    public static void main(String[] args) {
        // Регистрация клиентов
        Client.registerClient("1", "Иван", "Иванов", "ivan@mail.ru");
        Client.registerClient("2", "Мария","Петрова","maria@mail.ru");
        Client.registerClient("3", "Николай","Федоров","nikolai@mail.ru");
        Client.registerClient("4", "Светлана", "Сидорова", "svetlana@mail.ru");
        Client.registerClient("5", "Петр", "Петров", "petr@mail.ru");
        //Client.registerClient("6", "Сергей","Колокольцев","sergei@mail.ru");

        // Поиск клиента по ID
        System.out.println("Поиск клиента по ID 1:");
        Client foundClient = Client.findClientById("1");
        System.out.println(foundClient != null ? "Найден клиент: " + foundClient : "Клиент не найден.");

        // Обновление контактной информации
        System.out.println("\nОбновление контактной информации клиента с ID 1:");
        if (foundClient != null) {
            foundClient.updateContactInfo("ivan_updated@mail.ru");
            System.out.println("Обновленный клиент: " + foundClient);
        }

        // Поиск клиентов по имени
        System.out.println("\nПоиск клиентов по имени 'Петр':");
        List<Client> clientsByName = Client.findClientsByName("Петр");
        System.out.println("Найденные клиенты: " + clientsByName);

        // Удаление клиента по ID
        System.out.println("\nУдаление клиента с ID 1:");
        boolean removed = Client.removeClientById("1");
        System.out.println("Удален клиент с ID 1: " + removed);

        // Проверка оставшихся клиентов
        System.out.println("\nТекущий список клиентов:");
        for (Client client : Client.getClientsList()) {
            System.out.println(client);
        }
    }

} // Klass ended
