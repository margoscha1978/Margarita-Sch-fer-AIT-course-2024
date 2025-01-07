package ClassWork17.bank_accout.model.homework17;
/*
1.	Класс Player:
	Поля:
	id — уникальный идентификатор игрока (строка).
	Name — имя игрока (строка).
	Balance — баланс игрока (double), начальное значение — 1000.0.
	Конструкторы:
	Конструктор, принимающий id и name, который создает игрока с балансом 1000.0.
	Методы:
	placeBet(double amount): Метод для размещения ставки. Если баланс меньше суммы ставки,
    выводится сообщение об ошибке. Если достаточно средств, баланс уменьшается на указанную сумму.
	equals() и hashCode(): Переопределите методы для сравнения игроков по id.
	toString(): Метод для отображения информации об игроке.
  Методы работы с данными игрока и его ставками:
     - для размещения ставки. Если баланс меньше суммы ставки, выводится сообщение об ошибке.
     - Если достаточно средств, баланс уменьшается на указанную сумму.
     - addPlayer(Player player): Метод добавляет игрока в систему.
   Если игрок с таким id уже существует, выводится сообщение об ошибке.
   - placeBet(String playerId, double amount): Метод для размещения ставки от игрока.
   - Метод находит игрока по id, проверяет его баланс и, если возможно, уменьшает баланс на указанную сумму.
   - displayPlayers(): Метод для отображения текущей информации о всех игроках.
         */

class Player {
    // поля с личными данными игроков
    private String id;
    private String name;
    private double balance;

    // конструктор
    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 1000.0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // метод для работы с данными игрока
    public void placeBet(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств для размещения ставки.");
        } else {
            balance -= amount; // balance = balance - amount это то же возможная версия
            System.out.println("Ставка сделана: " + amount);
        }
    }
    // Новый метод для добавления выигрыша к балансу
    public void addBalance(double amount) {
        balance += amount;
    }

    // Метод, чтобы получить текущий баланс (опционально, если нужно)
    public double getBalance() {
        return balance;
    }

    // конструкторы
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return id.equals(player.id); // return Objekts.eqalis(id, player id) возможная версия
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Player{id='" + id + "', name='" + name + "', balance=" + balance + '}';
    }

} // klass ended

