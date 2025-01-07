package ClassWork21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class LottoGame {

    HashMap<String, ArrayList<Integer>> playerTickets = new HashMap<>();
    static final Logger log = LoggerFactory.getLogger(LottoGame.class);
    boolean gameStatus = false;
    int maxPlayers = 100;
    int[] winningNumbers = new int[6];

    public LottoGame() {
        System.out.println("LottoGame создан");
        log.info("LottoGame создан");
    }

    public void startGame() {
        log.info("Игра начата");
        System.out.println("Игра начата");
        if (gameStatus) {
            log.info("Игра уже запущена");
            System.out.println("Игра уже запущена");
        }
        else {
            gameStatus = true;
            generateWinningNumbers();
            checkWinners();
        }
    }

    public void addPlayer(String playerName, ArrayList<Integer> ticketNumbers) {
        if (playerTickets.size() >= maxPlayers) {
            log.warn("Достигнуто максимальное количество игроков");
            System.out.println("Достигнуто максимальное количество игроков");

        }
        else {
            playerTickets.put(playerName, ticketNumbers);
            log.info("Добавлен игрок: " + playerName);
            System.out.println("Добавлен игрок: " + playerName);
        }
    }

    private void generateWinningNumbers() {
        Random rand = new Random();
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = rand.nextInt(49) + 1;
            System.out.println("Выигрышний номер " + winningNumbers[i]);
        }
        log.info("Выигрышные номера сгенерированы");
        System.out.println("Выигрышные номера сгенерированы");
    }

    public void endGame() {
        log.info("Игра завершена");
        checkWinners();
        gameStatus = false;
    }

    private void checkWinners() {
        Iterator<Map.Entry<String, ArrayList<Integer>>> it = playerTickets.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, ArrayList<Integer>> pair =  it.next();
            String player = (String) pair.getKey();
            ArrayList<Integer> ticket = (ArrayList<Integer>) pair.getValue();
            int matches = 0;
            for (int num : winningNumbers) {
                if (ticket.contains(num)) {
                    matches++;
                }
            }
            if (matches >= 3) {
                log.info("У нас есть победитель: " + player);
                System.out.println("У нас есть победитель: " + player);
            }
            else if (matches < 3) {
                System.out.println("Вы проиграли. Совпадений " + matches);
            }
        }
    }

    public void printResults() {
        System.out.println("Выигрышные номера: ");
        for (int num : winningNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        log.info("Результаты напечатаны");
    }

} // klass ended
