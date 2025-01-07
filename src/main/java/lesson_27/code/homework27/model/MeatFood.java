package homework27.model;

public class MeatFood extends Food {
    private double pricePerKg;

    public MeatFood(int prime, String name, String barCode, String expDate, String foodType, double pricePerKg) {
        super(prime, name, barCode, expDate, foodType);
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double getPrice() {
        return pricePerKg; // Возвращаем цену за килограмм
    }
}
