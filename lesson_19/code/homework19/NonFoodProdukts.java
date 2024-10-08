package homework19;

import java.util.Objects;

public class NonFoodProdukts extends Product  {

private String produktType;

    public NonFoodProdukts(double price, String name, long barCode, String produktType) {
        super(price, name, barCode);
        this.produktType = produktType;
    }

    @Override
    public String toString() {
        return "NonFoodProdukts{" +
                "produktType='" + produktType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonFoodProdukts that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(produktType, that.produktType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), produktType);
    }
}
