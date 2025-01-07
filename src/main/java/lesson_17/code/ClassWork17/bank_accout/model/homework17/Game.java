package ClassWork17.bank_accout.model.homework17;

public class Game {

    // вводим новые поля
    private String name; // название игры
    private double odds; // коэффициент выигрыша в случае победы

    // конструктор
    public Game(String name, double odds) {
        this.name = name;
        this.odds = odds;
    }

    public String getName() {
        return name;
    }

    public double getOdds() {
        return odds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return name.equals(game.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Game{name='" + name + "', odds=" + odds + '}';
    }

} // klass ended

