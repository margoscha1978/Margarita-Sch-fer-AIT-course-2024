package lesson_39.homework39;
/*
Создадим класс для разработки проверки данных по погоде разными способами
Задание 1: Фильтрация данных по температуре 1. Найти все записи (Weather),
 у которых температура опускается ниже нуля. 2. Вывести результат в удобном для вас формате (например, список или строку).
Подсказка • используйте фильтрацию (filter) по условию temperature < 0.
Задание 2: Проверка условий и нахождение максимума
состоит из двух частей: 1. Определить, есть ли хотя бы один город с температурой выше определённого порога
 (например, 25 градусов). 2. Найти город (объект Weather) с максимальной температурой.
Подсказка • Для проверки какого-либо условия можно использовать anyMatch.
• Для поиска максимума используйте max с Comparator по температуре.
 */
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeatherAnalysis {
    public static void main(String[] args) {
        List<Weather> weatherList = WeatherTestData.getWeatherList();

        // Задание 1: Фильтрация
        List<Weather> coldWeather = weatherList.stream()
                .filter(weather -> weather.getTemperature() < 0)
                .collect(Collectors.toList());

        System.out.println("Города с температурой ниже нуля:");
        coldWeather.forEach(System.out::println);

        // Задание 2: Проверка условий
        boolean hasHotWeather = weatherList.stream()
                .anyMatch(weather -> weather.getTemperature() > 25);

        System.out.println("Есть ли город с температурой выше 25 градусов? " + hasHotWeather);

        // Нахождение города с максимальной температурой
        Weather hottestWeather = weatherList.stream()
                .max(Comparator.comparingDouble(Weather::getTemperature))
                .orElse(null);

        System.out.println("Город с максимальной температурой:");
        System.out.println(hottestWeather);
    }

} // klass ended
