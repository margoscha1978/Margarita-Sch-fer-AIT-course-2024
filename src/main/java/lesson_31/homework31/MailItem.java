package lesson_31.homework31;
/*
1. Абстрактный класс MailItem:
  - Он содержит общие поля и методы для всех почтовых отправлений.
    String sender (отправитель)
    String recipient (получатель)
    double weight (вес отправления в кг)
  - Метод calculateShippingCost — абстрактный, требует переопределения в подклассах.
  - Метод printDetails выводит информацию о почтовом отправлении.
 */
public abstract class MailItem {
    private String sender;
    private String recipient;
    private double weight;

    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public abstract double calculateShippingCost();

    public void printDetails() {
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Weight: " + weight + " kg");
    }

    // геттеры в конструкторе
    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getWeight() {
        return weight;
    }
} // klass ended
