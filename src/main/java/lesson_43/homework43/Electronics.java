package lesson_43.homework43;
/*
 Потомки класса Product
    Создайте, как минимум, два конкретных класса, наследующих Product. Например, «Книга» и «Электроника».
    Добавьте каждому классу собственное специфичное поле:
        «автор» у книг;
        «бренд» у электроники.
    Переопределите метод описания товара так, чтобы он учитывал специфичные поля
     (например, «Книга [название] от [автор], цена: …»).
 */
class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getDescription() {
        return "Электроника \"" + name + "\" от бренда " + brand + ", цена: " + price;
    }

} // klass ended
