package lesson_33.homework33;
/*
2. Класс Gift: Этот класс хранит информацию о подарке,
используем конструктор для инициализации полей и метод toString() для удобного вывода.
    String name — название подарка.
    GiftCategory category — категория подарка (используйте enum GiftCategory).
    GiftStatus status — статус подарка (используйте enum GiftStatus).
    - метод toString() для вывода информации о подарке.
 */

public class Gift {
    private String name; // Название подарка
    private GiftCategory category; // Категория подарка
    private GiftStatus status; // Статус подарка

    // Конструктор для инициализации всех полей
    public Gift(String name, GiftCategory category, GiftStatus status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    // Метод toString() для вывода информации о подарке
    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public GiftStatus getStatus() {
        return status;
    }

    public void setStatus(GiftStatus status) {
        this.status = status;
    }

    public GiftCategory getCategory() {
        return category;
    }

} // klass ended
