package ClassWork17.bank_accout.model.homework17;

import java.util.Scanner;
  /*
Player player1 = new Player("Alice", "1");
Player player2 = new Player("Bob", "2");
Player player3 = new Player("Charlie", "3");
Player player4 = new Player("David", "4");
Player player5 = new Player("Eve", "5");
  */

public class CasinoApp {
    public static void main(String[] args) {
        CasinoSystem casinoSystem = new CasinoSystem();
        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить игрока");
            System.out.println("2. Добавить игру");
            System.out.println("3. Сделать ставку");
            System.out.println("4. Выплатить выигрыш");
            System.out.println("5. Показать всех игроков");
            System.out.println("6. Показать все игры");
            System.out.println("7. Выйти");

            action = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (action) {
                case 1:
                    System.out.print("Введите id игрока: ");
                    String id = scanner.nextLine();
                    System.out.print("Введите имя игрока: ");
                    String name = scanner.nextLine();
                    casinoSystem.addPlayer(new Player(id, name));
                    break;
                case 2:
                    System.out.print("Введите название игры: ");
                    String gameName = scanner.nextLine();
                    System.out.print("Введите коэффициент выигрыша: ");
                    double odds = scanner.nextDouble();
                    casinoSystem.addGame(new Game(gameName, odds));
                    break;
                case 3:
                    System.out.print("Введите id игрока: ");
                    String playerId = scanner.nextLine();
                    System.out.print("Введите название игры: ");
                    String betGameName = scanner.nextLine();
                    System.out.print("Введите сумму ставки: ");
                    double amount = scanner.nextDouble();
                    casinoSystem.placeBet(playerId, betGameName, amount);
                    break;
                case 4:
                    System.out.print("Введите id игрока: ");
                    String winnerId = scanner.nextLine();
                    System.out.print("Введите название игры: ");
                    String winGameName = scanner.nextLine();
                    System.out.print("Введите ставку: ");
                    double betAmount = scanner.nextDouble();
                    casinoSystem.awardWin(winnerId, winGameName, betAmount);
                    break;
                case 5:
                    casinoSystem.displayPlayers();
                    break;
                case 6:
                    casinoSystem.displayGames();
                    break;
                case 7:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный ввод! Попробуйте снова.");
            }
        } while (action != 7);

        scanner.close();
    }

} // klass ended

/*
// Примеры размещения ставок
casino.placeBet("1", 100); // Alice ставит 100
casino.placeBet("2", 150); // Bob ставит 150
casino.placeBet("3", 1200); // Charlie пытается поставить 1200 (не хватает средств)
 */