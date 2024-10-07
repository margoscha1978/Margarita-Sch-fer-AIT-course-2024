public class Smartphone extends Laptop {
        private long imei;

        public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei) {
            super(cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
            this.imei = imei;
        }

        @Override
        public String toString() {
            return super.toString() + ", Smartphone{" +
                    "imei=" + imei +
                    '}';
        }
}
