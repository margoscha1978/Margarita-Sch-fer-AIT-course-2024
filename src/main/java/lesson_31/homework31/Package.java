package lesson_31.homework31;
/*
 Класс Package рассчитывает стоимость по весу.
  - double length, double width, double height (размеры посылки в см).
 Метод calculateShippingCost: рассчитывает
 стоимость доставки, которая зависит от веса: 2 евро за каждый кг.
 */

public class Package extends MailItem {
    private double length;
    private double width;
    private double height;

    public Package(String sender, String recipient, double weight, double length, double width, double height) {
        super(sender, recipient, weight);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateShippingCost() {
        return 2 * getWeight(); // 2 euros per kg
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Dimensions: " + length + " x " + width + " x " + height + " cm");
    }
} // klass ended
