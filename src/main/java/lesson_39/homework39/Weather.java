package lesson_39.homework39;
/*
создадим класс погода Weather с исходными данными для дальнейшей работы
 */
public class Weather {
    private String city;
    private double temperature;  // в градусах Цельсия
    private boolean isRainy;

    public Weather(String city, double temperature, boolean isRainy) {
        this.city = city;
        this.temperature = temperature;
        this.isRainy = isRainy;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isRainy() {
        return isRainy;
    }

    @Override
    public String toString() {
        return String.format(
                "Weather{city='%s', temperature=%.1f, isRainy=%b}",
                city, temperature, isRainy
        );
    }

} // klass ended

