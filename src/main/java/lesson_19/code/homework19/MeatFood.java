package homework19;
// Создать класс MeatFood расширяющий класс Food с полем private String meatType,
//которое хранит тип мяса, из которого изготовлен продукт.
////Во всех классах переопределить метод toString.

import java.util.Objects;

public class MeatFood extends Food  {

    private String meatType;//tip mjasa ispolzovannogo pri izgotovlenii

    public MeatFood(double price, String name, String barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeatFood meatFood)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }
}//klass ende
