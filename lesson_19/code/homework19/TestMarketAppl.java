package homework19;

public class TestMarketAppl {

    public static void main(String[] args) {
        Product[] products = new Product[]{
                new MeatFood(5.99, "Beef", 1234567890L, "2024-12-31", "Beef"),
                new MilkFood(1.49, "Milk", 9876543210L, "2024-07-15", "Cow", 3.2),
                new NonFoodProdukts(7.5, "Stofftier", 56473898L, "Spielzeug"),
                new NonFoodProdukts(8.20, "Springler", 2938475L, "Gartenpflege"),
                new NonFoodProdukts(2.75, "Messer", 29304657L, "Hauswaren")
        };

        // Печать и расчет пищевых продуктов
        printFoodProducts(products);
        System.out.println("-------------------------------------------");
        // Печать и расчет непищевых продуктов
        printNonFoodProducts(products);
        System.out.println("-------------------------------------------");
        // Общая сумма всех покупок
        System.out.println("Total Price of All Products: " + getTotalPrice(products));
    }

    public static void printFoodProducts(Product[] products) {
        System.out.println("Food Products:");
        double totalPrice = 0;
        for (Product product : products) {
            if (product instanceof MeatFood || product instanceof MilkFood) { // Проверка на пищевые продукты
                System.out.println(product);
                totalPrice += product.getPrice();
            }
        }
        System.out.println("Total Price of Food Products: " + totalPrice);
    }

    public static void printNonFoodProducts(Product[] products) {
        System.out.println("Non-Food Products:");
        double totalPrice = 0;
        for (Product product : products) {
            if (product instanceof NonFoodProdukts) { // Проверка на непищевые продукты
                System.out.println(product);
                totalPrice += product.getPrice();
            }
        }
        System.out.println("Total Price of Non-Food Products: " + totalPrice);
    }

    public static double getTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

