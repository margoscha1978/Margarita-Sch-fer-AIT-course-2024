package ClassWork18a;

import java.util.Scanner;

public class CasinoManager {
    // Создаем статический сканер для получения ввода от пользователя
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true; // Переменная для управления циклом программы
        CasinoSystem casinoSystem = new CasinoSystem(); // Создаем объект CasinoSystem для управления игроками

        // Цикл, выполняющийся, пока run == true
        while (run) {
            showMenu(); // Показываем меню
            int choice = scanner.nextInt(); // Считываем выбор пользователя
            scanner.nextLine(); // Считываем оставшийся перевод строки

            // Обработка выбора пользователя
            switch (choice) {
                case 1 -> {
                    // Добавление нового игрока
                    // Adding a new player
                    System.out.println("Player ID: ");
                    String playerId = scanner.nextLine(); // Ввод ID игрока
                    System.out.println("Player Name: ");
                    String playerName = scanner.nextLine(); // Ввод имени игрока
                    Player player = new Player(playerId, playerName); // Создаем нового игрока
                    casinoSystem.addPlayer(player); // Добавляем игрока в систему казино
                }
                case 2 -> {
                    // Размещение ставки игроком
                    // Placing a bet by the player
                    System.out.println("Player ID: ");
                    String playerId = scanner.nextLine(); // Ввод ID игрока
                    System.out.println("Player bet: ");
                    double bet = scanner.nextDouble(); // Ввод суммы ставки
                    casinoSystem.placeBet(playerId, bet); // Размещение ставки
                }
                case 3 -> {
                    // Показать всех игроков
                    // Display all players
                    casinoSystem.displayPlayers();
                }
                case 4 -> {
                    // Завершение работы приложения
                    // Exit the application
                    System.out.println("Close Application");
                    run = false; // Устанавливаем run в false для выхода из цикла
                }
                default -> System.out.println("Invalid choice"); // Сообщение об ошибке при неверном вводе
            }
        }
    }

    // Метод для отображения меню
    public static void showMenu() {
        System.out.println("\nChoose an action:");
        System.out.println("1. Add a player");
        System.out.println("2. Place a bet");
        System.out.println("3. Show all players");
        System.out.println("4. Exit");
        System.out.print("Enter action number: ");
    }

} // klass ended
