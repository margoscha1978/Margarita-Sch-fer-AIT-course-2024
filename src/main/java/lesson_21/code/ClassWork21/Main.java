package ClassWork21;

// контрольный класс класса LottoGame

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ticket = new ArrayList<>();
        ticket.add(10);
        ticket.add(25);
        ticket.add(37);
        ticket.add(42);
        ticket.add(15);
        ticket.add(12);

        LottoGame lottoGame = new LottoGame();
        lottoGame.addPlayer("Müller", ticket);

        lottoGame.startGame();

    }

} // klass ended
