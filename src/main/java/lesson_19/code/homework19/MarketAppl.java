package homework19;
//Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
//Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.
////Во всех классах переопределить метод toString.

public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[]{
                new MeatFood(5.99,  "Beef", "1234567890L", "2024-12-31", "Beef"),
                new MilkFood(1.49,  "Milk", "9876543210L", "2024-07-15", "Cow",3.2),

                new NonFoodProdukts(7.5,"Stofftier","56473898L","Spilzeug"),
                new NonFoodProdukts(8.20,"Springler","2938475L","Gartenpflege"),
                new NonFoodProdukts(2.75,"Messer","29304657L","Hauswahren")
        };

        printProducts(products);
        System.out.println("Total Price: " + getTotalPrice(products));
        System.out.println("-------------------------------------------");
    }

    public static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static double getTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public static Product findProductByBarCode(Product[] products, String barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null; // продукт не найден
    }


    public static void printNonFoodProducts(Product[] products) {
        for (Product product : products) {
            if (product instanceof NonFoodProdukts) { // проверка на тип
                System.out.println(product);
            }
            printProducts(products);
            System.out.println("Total Price: " + getTotalPrice(products));
            System.out.println("-------------------------------------------");
        }
    }
}