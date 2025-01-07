package homework271.model;

    public abstract class Pet extends Guest {
        public String petType;
        public String bread;

        protected Pet(String name, int age) {
            super(name, age);
        }

        public Pet(String name, int age, String petType, String bread) {
            super(name, age);
            this.petType = petType;
            this.bread = bread;
        }

        @Override
        public void performAction() {
            // Реализация действий для питомца
        }

        public String getBread() {
            return bread;
        }

        public String getPetType() {
            return petType;
        }
    }

