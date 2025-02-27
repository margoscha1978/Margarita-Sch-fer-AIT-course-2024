package lesson_41.homework41;
/*
Класс Product:
    Поля:
 String name — название
 double price — цена
 int quantity — количество на складе
 transient String promoCode — промо-код (помечен как transient, чтобы не сериализоваться)
    Реализуйте интерфейс Serializable.
 */
import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L; // Контроль версий
    private String name;
    private double price;
    private int quantity;
    transient private String promoCode;

    public Product(String name, double price, int quantity, String promoCode) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promoCode = promoCode;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && quantity == product.quantity
                && Objects.equals(name, product.name) && Objects.equals(promoCode, product.promoCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity, promoCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", promoCode='").append(promoCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

} // klass ended

/*
Для будущих изменений в классе Product можно добавить поле serialVersionUID, для расширения возможностей. Например:
private static final long serialVersionUID = 2L; // L будет увеличиваться при изменениях в классе
 - Это поможет избежать проблем с совместимостью при десериализации, если структура класса изменится.
 - Если вы добавляете поля, рекомендуем сохранять ранние версии для старых данных.
При расширении этого класса:
- Классах-наследниках: где можно создать подклассы для различных категорий товаров
 (например:Electronics, Clothing и любые другие), которые будут наследоваться от Product.
- продумать меры по хранению дополнительных данных, разными способами, например в файлах или библиотеках.
 */