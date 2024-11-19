package ClassWork18a;

import java.util.Objects;

public class Player {
    // Поля класса Player
    String id; // Уникальный идентификатор игрока
    String name; // Имя игрока
    double balance; // Баланс игрока

    // Конструктор класса Player, принимающий ID и имя
    public Player(String id, String name) {
        this.id = id; // Устанавливаем идентификатор игрока
        this.name = name; // Устанавливаем имя игрока
        this.balance = 1000.0; // Устанавливаем начальный баланс в 1000.0
    }

    // Метод для размещения ставки игроком
    public void placeBet(double amount) {
        // Проверка, хватает ли средств на балансе для ставки
        if (amount > balance) {
            System.out.println("You don't have enough money to deposit"); // Вывод сообщения о недостатке средств
        } else {
            // Снимаем сумму ставки с баланса
            // Deducts the bet amount from the balance
            balance = balance - amount; // balance -= amount;
            // Сообщаем о принятии ставки и выводим оставшийся баланс
            System.out.println("Amount " + amount + " was accepted. Your balance is: " + balance);
        }
    }

    // Переопределение метода equals для сравнения объектов класса Player
    @Override
    public boolean equals(Object o) {
        // Если текущий объект и переданный объект - один и тот же экземпляр, возвращаем true
        if (this == o) return true;

        // Если переданный объект null или они разных классов, возвращаем false
        if (o == null || getClass() != o.getClass()) return false;

        // Приводим объект o к типу Player и сравниваем ID
        Player player = (Player) o;
        return Objects.equals(id, player.id); // Если ID совпадают, возвращаем true
    }

    // Переопределение метода hashCode для генерации хеш-кода на основе ID
    @Override
    public int hashCode() {
        return Objects.hashCode(id); // Используем id для расчета хеш-кода
    }

    // Переопределение метода toString для вывода информации об объекте Player в строковом формате
    @Override
    public String toString() {
        return "Player{" + // Начало строки, обозначающее класс Player
                "id='" + id + '\'' + // Печать ID игрока
                ", name='" + name + '\'' + // Печать имени игрока
                ", balance=" + balance + // Печать баланса игрока
                '}'; // Закрывающая фигурная скобка
    }

} // klass ended
