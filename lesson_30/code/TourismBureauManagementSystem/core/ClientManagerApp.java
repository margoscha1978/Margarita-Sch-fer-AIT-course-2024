package TourismBureauManagementSystem.core;
/*
создаем списки клиентов для работы программы
 */
import TourismBureauManagementSystem.model.Client;

public class ClientManagerApp {
    public static void main(String[] args) {
            ClientManager clientManager = new ClientManager();

      // Создание клиентов
      Client client1 = new Client("1", "Иван","Иванов","ivan@mail.ru");
      Client client2 = new Client("2", "Мария","Петрова","maria@mail.ru");
      Client client3 = new Client("3", "Николай","Федоров","nikolai@mail.ru");
      Client client4 = new Client("4", "Светлана","Сидорова","svetlana@mail.ru");
      Client client5 = new Client("5", "Сергей","Колокольцев","sergei@mail.ru");
      Client client6 = new Client("6", "Петр", "Петров", "petr@mail.ru");

      // Добавление клиентов в список
      clientManager.addClient(client1);
      clientManager.addClient(client2);
      clientManager.addClient(client3);
      clientManager.addClient(client4);
      clientManager.addClient(client5);

      // Поиск и вывод клиента по id
      Client foundClient = clientManager.findClientById("1");
      System.out.println("Найденный клиент: " + foundClient);

      // Удаление клиента по id
      clientManager.removeClient("1");

      // Получение всех клиентов из списка
      System.out.println("Все клиенты: " + clientManager.getAllClients());

        }

    } // klass ended


