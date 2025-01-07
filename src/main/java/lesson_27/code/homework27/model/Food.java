package homework27.model;

    public abstract class Food extends Produkt {
        protected String foodType; // Тип пищи (например, мясо, молоко и т.д.)

        public Food(int prime, String name, String barCode, String expDate, String foodType) {
            super(prime, name, barCode, expDate); // Вызов конструктора суперкласса
            this.foodType = foodType;
        }

        public String getFoodType() {
            return foodType;
        }

        @Override
        public abstract double getPrice(); // Объявление абстрактного метода для получения цены
    }

