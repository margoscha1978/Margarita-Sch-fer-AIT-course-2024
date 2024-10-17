package homework26.model;
//ЗАДАНИЕ 1. Реализовать приложение по следующему плану:
// - Абстрактный класс Detail (деталь) с полями: barCode: long size: double material: String vendor: String weight: double
// - Дочерний класс Gear (шестеренка) с полями: radius: double tooth: int
// - Дочерний класс Lever (рычаг) с полями: power: double
// - Интерфейс Stock c методами:
//    добавить деталь на склад
//    найти деталь по barCode
//    обновить данные о детали
//    удалить деталь
//    общая масса всех деталей на складе
//    средняя масса деталей на складе
// - StockImpl
//    унаследовать методы из интерфейса Stock
//    StockImplTest
//    реализовать тесты

public abstract class Detail {
    protected long barCode;
    protected double size;
    protected String material;
    protected int vendor;
    protected double weight;

    public Detail(long barCode, double size, String material, int vendor, double weight) {
        this.barCode = barCode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    public long getBarCode() {

        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getSize() {

        return size;
    }

    public void setSize(double size) {

        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVendor() {
        return vendor;
    }

    public void setVendor(int vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}// klass ende