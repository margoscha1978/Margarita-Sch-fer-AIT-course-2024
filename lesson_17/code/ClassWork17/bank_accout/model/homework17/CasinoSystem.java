package ClassWork17.bank_accout.model.homework17;
      /*
   addPlayer(Player player): Метод добавляет игрока в систему.
   Если игрок с таким id уже существует, выводится сообщение об ошибке.
• placeBet(String playerId, double amount): Метод для размещения ставки от игрока.
  Метод находит игрока по id, проверяет его баланс и, если возможно, уменьшает баланс на указанную сумму.
• displayPlayers(): Метод для отображения текущей информации о всех игроках.
         */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CasinoSystem {
    // создаем листы для игроков, что бы система не пропускала дубликаты, защита
    private HashSet<Player> players;
    private HashSet<Game> games;

    public CasinoSystem() {
        players = new HashSet<>();
        games = new HashSet<>();
    }

    public void addPlayer(Player player) {
        if (!players.add(player)) {
            System.out.println("Игрок с таким id уже существует.");
        }
    }

    public void addGame(Game game) {
        if (!games.add(game)) {
            System.out.println("Игра с таким названием уже существует.");
        }
    }

    public void placeBet(String playerId, String gameName, double amount) {
        Player player = findPlayerById(playerId);
        Game game = findGameByName(gameName);

        if (player != null && game != null) {
            player.placeBet(amount);
            System.out.println("Ставка на игру " + gameName + " размещена: " + amount);
        } else {
            if (player == null) {
                System.out.println("Игрок с таким id не найден.");
            }
            if (game == null) {
                System.out.println("Игра с таким названием не найдена.");
            }
        }
    }

    public void awardWin(String playerId, String gameName, double amount) {
        Player player = findPlayerById(playerId);
        Game game = findGameByName(gameName);

        if (player != null && game != null) {
            double winnings = amount * game.getOdds();
            player.addBalance(winnings);
            System.out.printf("Игроку %s выплачено выигрыш: %.2f%n", playerId, winnings);
        } else {
            if (player == null) {
                System.out.println("Игрок с таким id не найден.");
            }
            if (game == null) {
                System.out.println("Игра с таким названием не найдена.");
            }
        }
    }

    private Player findPlayerById(String playerId) {
        for (Player player : players) {
            if (player.getId().equals(playerId)) {
                return player;
            }
        }
        return null;
    }

    private Game findGameByName(String gameName) {
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                return game;
            }
        }
        return null;
    }

    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void displayGames() {
        for (Game game : games) {
            System.out.println(game);
        }
    }

} // klass ended