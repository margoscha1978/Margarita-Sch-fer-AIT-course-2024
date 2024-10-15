package homework23;
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49

import java.util.Objects;

public class Car {

    private String brand;
    private boolean fuelType;   //benzin - true, disel - false
    private double fuelCost;
    private double fuelConsumption;
    private int rentalCost;

    public Car (String brand, boolean fuelType, double fuelCost, double fuelConsumption, int rentalCost) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.fuelCost = fuelCost;
        this.fuelConsumption = fuelConsumption;
        this.rentalCost = rentalCost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isFuelType() {
        return fuelType;
    }

    public void setFuelType(boolean fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return fuelType == car.fuelType && Double.compare(fuelCost, car.fuelCost) == 0
                && Double.compare(fuelConsumption, car.fuelConsumption) == 0 &&
                rentalCost == car.rentalCost && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, fuelType, fuelCost, fuelConsumption, rentalCost);
    }

    @Override
    public String toString() {
        return "CarAppl{" +
                "brand='" + brand + '\'' +
                ", fuelType=" + fuelType +
                ", fuelCost=" + fuelCost +
                ", fuelConsumption=" + fuelConsumption +
                ", rentalCost=" + rentalCost +
                '}';
    }

    //метод для расчета общей стоимости эксплуатации
    public double calculateTotalOperatingCost(int distance, int numberOfTravelDays) {
        double fuelCostForTrip = (distance / 100.0) * this.fuelConsumption * this.fuelCost;
        // стоимость топлива на поездку
        double tripRentalCost = (this.rentalCost / 7.0) * numberOfTravelDays;
        // стоимость аренды за поездку с учетом
        // цены в неделях
        return fuelCostForTrip + tripRentalCost; //складываем стоимость аренды и затраты на топливо
    }

}



