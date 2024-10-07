public class ShopAppl {
    public static void main(String[] args) {
//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2", 8, 256, "Apple AirBook", 2200, 14,
                1.5, 10, "blue");
        System.out.println(laptop);

        System.out.println("---------------------------------------------------------------------------------------");
        Smartphone smartphone = new Smartphone("Intel2",8,128,"Nokia", 867, 12,
                300,12,
                "metallic",2435263754843635L);
        System.out.println(smartphone);
        System.out.println("---------------------------------------------------------------------------------------");

        Computer[] computers = new Computer[5];
        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD", 8, 256, "NoName", 2000);
        computers[3] = new Laptop("Apple", 8, 256, "MacBook", 2000,  14,
                1.5, 10, "white");
        computers[4] = new Laptop("Apple", 16, 512, "MacBook Air", 2500,  14.2,
                1.8, 12, "black");

        int totalSsd = 0;
        for (Computer value : computers) {
            totalSsd += value.getSsd();
        }

        System.out.println("Total ssd: " + totalSsd);

        double totalPrice = 0;
        for (Computer value : computers) {
            totalPrice += value.getPrice();
        }

        System.out.println("Total price: " + totalPrice);
        System.out.println("--------------------------");


        for (Computer value : computers) {
            System.out.println(value);
        }

        System.out.println("---------------------------");
        for (Computer value : computers) {
            System.out.println(value.getBrand());
        }

    }
}