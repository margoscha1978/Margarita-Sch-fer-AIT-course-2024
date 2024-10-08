package homework19;
// Создать класс MilkFood расширяющий класс Food с полями private String milkType,
// private double fat, которые хранят тип молока и жирность продукта соответственно.
////Во всех классах переопределить метод toString.

import java.util.Objects;

public class MilkFood extends Food {

    private String milkType;//moloko
    private double fat;//schirnost produkta

    public MilkFood(double price, String name, long barCode, String expDate, String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return "MillkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilkFood millkFood)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(fat, millkFood.fat) == 0 && Objects.equals(milkType, millkFood.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }
}
