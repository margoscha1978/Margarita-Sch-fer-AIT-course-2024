package lesson_31.homework31;
/*
 Класс Letter различает зарегистрированные и обычные письма.
  - boolean isRegistered (регистрированное письмо или нет).
  Метод calculateShippingCost: определяет стоимость письма, которая зависит
  от того, зарегистрированное оно или нет:
    Обычное письмо — 5 евро.
    Зарегистрированное письмо — 10 евро.
 */
public class Letter extends MailItem {
    private boolean isRegistered;

    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;
    }

    @Override
    public double calculateShippingCost() {
        return isRegistered ? 10 : 5;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Registered: " + (isRegistered ? "Yes" : "No"));
    }
} // klass ended
