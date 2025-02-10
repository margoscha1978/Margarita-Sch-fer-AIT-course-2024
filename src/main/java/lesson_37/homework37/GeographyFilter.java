package lesson_37.homework37;
/*
Задания по Java Stream API (География)
1. Фильтрация стран по первой букве
У вас есть список стран:
List<String> countries = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China", "Australia",
 "India");
Используя Stream API, отфильтруйте страны, названия которых начинаются на букву "C".
2. Фильтрация городов по длине названия
У вас есть список городов:
List<String> cities = Arrays.asList("Berlin", "Buenos Aires", "Paris", "Los Angeles", "New York", "London", "Beijing");
Используя Stream API, отфильтруйте города, название которых длиннее 6 символов.
3. Фильтрация рек с четным количеством букв в названии
Дан список рек:
List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");
Используя Stream API, отфильтруйте только те реки, у которых чётное количество букв в названии.
4. Фильтрация континентов по количеству символов
Дан список континентов:
List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America",
 "North America");
Используя Stream API, отфильтруйте континенты, у которых название короче 7 символов.
5. Фильтрация стран с названием из 6 букв
Дан список стран:
List<String> countries = Arrays.asList("Mexico", "Sweden", "Brazil", "Russia", "Canada", "France", "Norway");
Используя Stream API, отфильтруйте страны, название которых состоит из 6 букв.
6. Поиск стран с названием, содержащим букву "a"
Используя Stream API, отфильтруйте страны, названия которых содержат букву "a".
7. Фильтрация городов по последней букве
Используя Stream API, отфильтруйте города, у которых название заканчивается на "o".
8. Определение рек, содержащих более 7 букв
Используя Stream API, отфильтруйте реки, название которых содержит более 7 букв.
9. Фильтрация континентов по первой букве
Используя Stream API, отфильтруйте континенты, названия которых начинаются на "A".
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeographyFilter {

    public static void main(String[] args) {
        // Списки данных
        List<String> countries = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China",
                "Australia", "India");
        List<String> cities = Arrays.asList("Berlin", "Buenos Aires", "Paris", "Los Angeles", "New York", "London",
                "Beijing");
        List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");
        List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America",
                "North America");

        // Примеры фильтраций
        System.out.println("Страны, начинающиеся на 'C': " + filterCountriesByFirstLetter(countries, 'C'));
        System.out.println("Города, длиннее 6 символов: " + filterCitiesByLength(cities, 6));
        System.out.println("Реки с четным количеством букв: " + filterRiversByEvenLength(rivers));
        System.out.println("Континенты короче 7 символов: " + filterContinentsByLength(continents, 7));
        System.out.println("Страны из 6 букв: " + filterCountriesByLength(countries, 6));
        System.out.println("Страны, содержащие букву 'a': " + filterCountriesContainingLetter(countries, 'a'));
        System.out.println("Города, заканчивающиеся на 'o': " + filterCitiesByLastLetter(cities, 'o'));
        System.out.println("Реки с более чем 7 буквами: " + filterRiversByMinLength(rivers, 7));
        System.out.println("Континенты, начинающиеся на 'A': " + filterContinentsByFirstLetter(continents, 'A'));
    }

    public static List<String> filterCountriesByFirstLetter(List<String> countries, char letter) {
        return countries.stream()
                .filter(country -> country.startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }

    public static List<String> filterCitiesByLength(List<String> cities, int length) {
        return cities.stream()
                .filter(city -> city.length() > length)
                .collect(Collectors.toList());
    }

    public static List<String> filterRiversByEvenLength(List<String> rivers) {
        return rivers.stream()
                .filter(river -> river.length() % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> filterContinentsByLength(List<String> continents, int length) {
        return continents.stream()
                .filter(continent -> continent.length() < length)
                .collect(Collectors.toList());
    }

    public static List<String> filterCountriesByLength(List<String> countries, int length) {
        return countries.stream()
                .filter(country -> country.length() == length)
                .collect(Collectors.toList());
    }

    public static List<String> filterCountriesContainingLetter(List<String> countries, char letter) {
        return countries.stream()
                .filter(country -> country.contains(String.valueOf(letter)))
                .collect(Collectors.toList());
    }

    public static List<String> filterCitiesByLastLetter(List<String> cities, char letter) {
        return cities.stream()
                .filter(city -> city.endsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }

    public static List<String> filterRiversByMinLength(List<String> rivers, int minLength) {
        return rivers.stream()
                .filter(river -> river.length() > minLength)
                .collect(Collectors.toList());
    }

    public static List<String> filterContinentsByFirstLetter(List<String> continents, char letter) {
        return continents.stream()
                .filter(continent -> continent.startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }

} // klass ended

/*
1. Импорт библиотек: Мы импортируем Arrays, List, и Collectors для работы с коллекциями.
2. Основной метод: В методе main определяется список стран, городов, рек и континентов.
   Для каждой фильтрации вызывается соответствующий метод.
3. Функции фильтрации: Каждая функция принимает список и критерий фильтрации.
   Внутри каждой функции используется Stream API для фильтрации данных и сбора результата в новый список.
4. Вывод результатов: Результаты фильтрации выводятся на экран.
 */