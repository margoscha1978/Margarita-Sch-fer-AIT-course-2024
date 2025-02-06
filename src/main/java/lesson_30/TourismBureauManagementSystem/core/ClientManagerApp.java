package lesson_30.TourismBureauManagementSystem.core;
/*
 Активная работа с пользователем, или
 проверка работы выбранных для класса ClientManager методов.
1. Импорт и использование логгера:
   - Мы импортируем java.util.logging.Logger и создаем экземпляр logger для записи событий.
2. Подключение Faker:
   - для генерации фейковых данных о клиентах.
3. Методы для генерации фейковых клиентов:
   - В методе generateFakeClients() генерируется заданное количество фейковых клиентов,
     которые затем добавляются в ClientManager. Каждого клиента добавляем с использованием метода addClient().
4. Основной метод main:
   - Метод main инициализирует приложение, генерирует фейковых клиентов и демонстрирует возможности обновления,
     поиска и удаления клиентов.
5. Обработка логов:
   - Приложение записывает важные операции в логи (добавление клиентов, успехи и неудачи при обновлении или удалении).
 */
import com.github.javafaker.Faker;
import lesson_30.TourismBureauManagementSystem.model.Client;

import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

public class ClientManagerApp {
    private static final Logger logger = Logger.getLogger(ClientManagerApp.class.getName());
    private static final ClientManager clientManager = new ClientManager();
    private static final Faker faker = new Faker();

    public static void main(String[] args) {
        logger.info("Запуск приложения ClientManagerApp.");

        // Генерация фейковых данных и добавление клиентов
        generateFakeClients(10);

        // Просмотр всех клиентов
        viewAllClients();

        // Пример поиска клиента
        int sampleClientId = 1; // Замените на реальный id для тестирования
        Client foundClient = clientManager.findClientById(sampleClientId);
        if (foundClient != null) {
            logger.info("Клиент найден: " + foundClient);
        } else {
            logger.warning("Клиент с id " + sampleClientId + " не найден.");
        }

        // Пример обновления клиента
        if (clientManager.updateClientName(sampleClientId, "ОбновлённоеИмя", "ОбновлённаяФамилия")) {
            logger.info("Имя клиента успешно обновлено.");
        } else {
            logger.warning("Не удалось обновить имя клиента.");
        }

        // Пример удаления клиента
        if (clientManager.removeClient(sampleClientId)) {
            logger.info("Клиент успешно удалён.");
        } else {
            logger.warning("Не удалось удалить клиента.");
        }
    }

    private static void generateFakeClients(int count) {
        for (int i = 0; i < count; i++) {
            Client client = new Client(
                    i + 1, // ID клиента
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.internet().emailAddress(),
                    LocalDateTime.now()
            );
            clientManager.addClient(client);
            logger.info("Добавлен фейковый клиент: " + client);
        }
        logger.info(count + " фейковых клиентов успешно добавлены.");
    }

    private static void viewAllClients() {
        List<Client> clients = clientManager.listAllClients();
        logger.info("Список всех клиентов:");
        for (Client client : clients) {
            System.out.println(client);
        }
    }

}  // klass ended
