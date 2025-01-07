package homework27.model;
// Product (Product, Food, MeatFood, MilkFood) - Supermarket,
// искать продукты по сроку годности (срок задается строкой вида yyyy-MM-dd), общая стоимость всех товаров,

    public abstract class Produkt {
        protected int prime; // Уникальный идентификатор
        protected String name; // Название продукта
        protected String barCode; // Штрих-код
        protected String expDate; // Дата истечения срока годности

        public Produkt(int prime, String name, String barCode, String expDate) {
            this.prime = prime;
            this.name = name;
            this.barCode = barCode;
            this.expDate = expDate;
        }

        // Геттеры для доступа к полям
        public int getPrime() {
            return prime;
        }

        public String getName() {
            return name;
        }

        public String getBarCode() {
            return barCode;
        }

        public String getExpDate() {
            return expDate;
        }

        // Абстрактный метод, который будет реализован в подклассах
        public abstract double getPrice();
    }

