package homework27.model;

public class MilkFood extends Food {
    private double pricePerLiter;

    public MilkFood(int prime, String name, String barCode, String expDate, String foodType, double pricePerLiter) {
        super(prime, name, barCode, expDate, foodType);
        this.pricePerLiter = pricePerLiter;
    }

    @Override
    public double getPrice() {
        return pricePerLiter; // Возвращаем цену за литр
    }
}
