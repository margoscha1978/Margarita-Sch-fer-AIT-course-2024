package lesson_31.homework31;
/*
 Класс Advertisement рассчитывает стоимость по количеству рекламных листовок.
 - int quantity (количество копий).
 Метод calculateShippingCost: рассчет происходит с помощью
 фиксированной стоимости: 1 евро за каждые 50 листовок.
 */
public class Advertisement extends MailItem {
    private int quantity;

    public Advertisement(String sender, String recipient, double weight, int quantity) {
        super(sender, recipient, weight);
        this.quantity = quantity;
    }

    @Override
    public double calculateShippingCost() {
        return Math.ceil((double) quantity / 50) * 1; // 1 euro per 50 leaflets
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Quantity: " + quantity);
    }

} // klass ended
