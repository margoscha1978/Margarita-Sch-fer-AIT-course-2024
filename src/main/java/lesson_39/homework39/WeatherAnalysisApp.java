package lesson_39.homework39;
/*
Создадим класс с уточнениями для анализа погоды:
Идеи для самостоятельных упражнений по погоде
• Подсчёт средней температуры с помощью mapToDouble и average().
• Группировка по признаку isRainy (true/false) с помощью Collectors.groupingBy(...).
• Сортировка данных по названию города с помощью Comparator.comparing(Weather::getCity).
 */
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherAnalysisApp {
        public static void main(String[] args) {
            List<Weather> weatherList = WeatherTestData.getWeatherList();

            // 1. Фильтрация данных: Города с температурой ниже нуля
            List<Weather> coldWeather = weatherList.stream()
                    .filter(weather -> weather.getTemperature() < 0)
                    .collect(Collectors.toList());

            System.out.println("Города с температурой ниже нуля:");
            coldWeather.forEach(System.out::println);

            // 2. Проверка условий: Есть ли город с температурой выше 25 градусов
            boolean hasHotWeather = weatherList.stream()
                    .anyMatch(weather -> weather.getTemperature() > 25);

            System.out.println("Есть ли город с температурой выше 25 градусов? " + hasHotWeather);

            // Нахождение города с максимальной температурой
            Weather hottestWeather = weatherList.stream()
                    .max(Comparator.comparingDouble(Weather::getTemperature))
                    .orElse(null);

            System.out.println("Город с максимальной температурой:");
            System.out.println(hottestWeather);

            // 3. Подсчет средней температуры
            double averageTemperature = weatherList.stream()
                    .mapToDouble(Weather::getTemperature)
                    .average()
                    .orElse(0.0); // Возвращает 0, если список пустой

            System.out.println("Средняя температура: " + averageTemperature);

            // 4. Группировка по признаку isRainy
            Map<Boolean, List<Weather>> groupedByRainy = weatherList.stream()
                    .collect(Collectors.groupingBy(Weather::isRainy));

            System.out.println("Группировка по наличию дождя:");
            System.out.println("Дождливые города: " + groupedByRainy.get(true));
            System.out.println("Сухие города: " + groupedByRainy.get(false));

            // 5. Сортировка данных по названию города
            List<Weather> sortedByCity = weatherList.stream()
                    .sorted(Comparator.comparing(Weather::getCity))
                    .collect(Collectors.toList());

            System.out.println("Сортировка по названию города:");
            sortedByCity.forEach(System.out::println);
        }

} // klass ended
