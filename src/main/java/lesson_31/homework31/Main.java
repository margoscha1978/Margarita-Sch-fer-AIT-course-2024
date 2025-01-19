package lesson_31.homework31;
/*
 - создаем проверочные экземпляры классов для каждого типа отправления и работаем с созданными классами.
 - добавляем их в PostOffice, инициализируем.
 - вызываем printDetails() для каждого отправления и выводим общую стоимость.
 - пакет принят, обработан, выставлен счет и идет доставка адресату...

 */
public class Main {
    public static void main(String[] args) {
        // Создаем офис почты
        PostOffice postOffice = new PostOffice();

        // Создаем письмо и добавляем его в офис
        MailItem letter = new Letter("Leonardo DiCaprio", "Brad Pitt", 0.05, true);
        postOffice.addMailItem(letter);

        // Создаем посылку и добавляем ее в офис
        MailItem pkg = new Package("Scarlett Johansson", "Chris Hemsworth", 2.5, 30,
                20, 15);
        postOffice.addMailItem(pkg);

        // Создаем рекламную листовку и добавляем ее в офис
        MailItem advertisement = new Advertisement("Tom Cruise", "Все жители Голливуда", 0.1,
                100);
        postOffice.addMailItem(advertisement);

        // Выводим детали всех отправлений
        postOffice.printAllDetails();

        // Вычисляем и выводим общую стоимость доставки
        double totalCost = postOffice.calculateTotalShippingCost();
        System.out.println("Общая стоимость доставки: " + totalCost + " евро");
    }
} // klass ended
