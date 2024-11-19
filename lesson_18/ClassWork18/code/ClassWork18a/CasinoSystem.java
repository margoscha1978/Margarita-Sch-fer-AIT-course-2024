package ClassWork18a;

import java.util.HashSet;

public class CasinoSystem {

    // Коллекция игроков, использующая HashSet для хранения уникальных игроков
    // HashSet используется, чтобы избежать дублирования игроков по их ID
    HashSet<Player> players;

    // Конструктор инициализирует пустой HashSet
    public CasinoSystem() {
        players = new HashSet<>();
    }

    // Метод для добавления нового игрока
    public void addPlayer(Player player) {
        // Проверяем, существует ли уже игрок с таким ID
        if (players.contains(player)) {
            System.out.println("Player ID " + player.id + " already exists");
        } else {
            // Если игрок не найден, добавляем его в HashSet
            players.add(player);
            System.out.println("Player ID " + player.id + " added");
        }
    }

    // Метод для размещения ставки игроком по его ID
    public void placeBet(String playerId, double amount) {
        boolean found = false; // Флаг для отслеживания, найден ли игрок
        // Перебираем всех игроков в HashSet
        for (Player player : players) {
            // Если ID игрока совпадает с переданным ID
            if (player.id.equals(playerId)) {
                player.placeBet(amount); // Размещаем ставку
                found = true; // Устанавливаем флаг в true, так как игрок найден
            }
        }
        // Если игрок с указанным ID не найден, выводим сообщение
        if (!found) {
            System.out.println("Player ID " + playerId + " not found");
        }
    }

    // Метод для отображения всех игроков
    public void displayPlayers() {
        // Если в базе нет игроков, выводим сообщение
        if (players.isEmpty()) {
            System.out.println("No players in database");
        } else {
            // Иначе, выводим информацию обо всех игроках
            for (Player player : players) {
                System.out.println(player); // Вывод информации об игроке
            }
        }
    }

} //klass ended
