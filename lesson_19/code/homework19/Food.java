package homework19;
//Создать класс Food расширяющий класс Product с полем private String expDate,
//которое хранит дату истечения срока годности.
//Во всех классах переопределить метод toString.

import java.util.Objects;

public class Food extends Product {

    private String expDate;//istechenie sroka godnosti

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }
}//klass ende
