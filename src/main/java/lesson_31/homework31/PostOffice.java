package lesson_31.homework31;
/*
 Класс PostOffice:
 - Хранит список отправлений и методы для добавления отправлений, расчета общей стоимости и вывода данных.
   List<MailItem> mailItems (список почтовых отправлений).
  Методы:
   - void addMailItem(MailItem item) — добавляет отправление в список.
   - void calculateTotalShippingCost() — выводит общую стоимость доставки для всех отправлений в списке.
   - void printAllDetails() — выводит информацию обо всех отправлениях, используя метод printDetails().
 */
import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    public List<MailItem> mailItems;

    public PostOffice() {
        this.mailItems = new ArrayList<>();
    }

    public void addMailItem(MailItem item) {
        mailItems.add(item);
    }

    public double calculateTotalShippingCost() {
        double totalCost = 0;
        for (MailItem item : mailItems) {
            totalCost += item.calculateShippingCost();
        }
        return totalCost;
        //System.out.println("Total Shipping Cost: " + totalCost + " euros");
    }

    public void printAllDetails() {
        for (MailItem item : mailItems) {
            item.printDetails();
            System.out.println("---");
        }
    }
} // klass ended
