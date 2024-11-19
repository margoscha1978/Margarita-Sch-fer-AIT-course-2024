package homework18;
/*
Упражнение 1: Список напитков и их цены

Создайте HashMap, в котором ключами будут названия напитков (например, “Кофе”, “Чай”, “Сок”),
 а значениями — их цены (целые числа). Добавьте 5 напитков с разными ценами, затем:
 1. Выведите цену конкретного напитка по его названию.
 2. Проверьте, есть ли в списке напиток “Чай”.
 3. Удалите напиток “Сок” и выведите обновленный список.

Упражнение 2: Калорийность напитков

Создайте HashMap, где ключами будут названия напитков, а значениями — количество калорий в одной порции (целое число).
 1. Добавьте 3–4 напитка и задайте их калорийность.
 2. Напишите код, перебирающий все напитки и выводящий только те, которые имеют калорийность более 50 калорий.
 3. Подсчитайте и выведите общее количество напитков в HashMap.

Упражнение 3: Проверка наличия напитка

  Создайте HashMap, где ключами будут названия напитков,
  а значениями — их доступность (логический тип: true — доступен, false — недоступен).
  1. Заполните HashMap пятью напитками, укажите их доступность.
  2. Напишите код, который проверяет, доступен ли конкретный напиток (например, “Кофе”).
  3. Выведите список всех доступных напитков.

Упражнение 4: Меню с ценами и обновление цен

Создайте HashMap, где ключами будут названия напитков, а значениями — их цены.
 1. Заполните меню несколькими напитками и ценами.
 2. Обновите цену одного из напитков.
 3. Выведите цену каждого напитка, добавив условие, чтобы выводилась фраза “Цена обновлена”, если цена была изменена.

Упражнение 5: Перебор и вывод напитков с фильтрацией

Создайте HashMap, где ключами будут названия напитков, а значениями — их объем в миллилитрах (например, 250 мл, 500 мл).
  1. Добавьте 4 напитка с разными объемами.
  2. Переберите и выведите только те напитки, объем которых более 300 мл.
  3. Напишите код, который проверяет, есть ли в HashMap напиток с объемом ровно 250 мл, и выведите результат проверки.
 */

import java.util.HashMap;
import java.util.Map;

public class Drinks {
    // HashMap для хранения информации о напитках "ключ" сам напиток, "значение" это цена, калорийность, объем, наличие
    static HashMap<String,Integer > drinks = new HashMap<>(); // имя напитка String, Integer цена

    static HashMap<String, Integer> drinksPrices = new HashMap<>(); // название напитка: цена
    static HashMap<String, Integer> drinksCalories = new HashMap<>(); // название напитка: калорийность
    static HashMap<String, Boolean> drinksAvailability = new HashMap<>(); // название напитка: наличие в продаже
    static HashMap<String, Integer> drinksVolume = new HashMap<>(); // название напитка: объем

    public static void main(String[] args) {

        // Упражнение 1: список напитков и их цены
        addDrinksPrices(); // добавление напитков и цен
        System.out.println("Цена Чая: " + drinksPrices.get("Чай")); // 1
        System.out.println("Есть ли Чай ? " + drinksPrices.containsKey("Чай")); // 2
        drinksPrices.remove("Сок"); // 3
        System.out.println("Обновленный список цен: " + drinksPrices);

        // Упражнение 2: калорийность напитков
        addDrinksCalories(); // добавление напитков и калорийности
        System.out.println("Напитки с калорийностью более 50:");
        for (Map.Entry<String, Integer> entry : drinksCalories.entrySet()) {
            if (entry.getValue() > 50) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " ккал");
            }
        }
        System.out.println("Общее количество напитков: " + drinksCalories.size()); // 3

        // Упражнение 3: проверка наличия напитка
        addDrinksAvailability(); // добавление напитков и их доступности
        System.out.println("Кофе доступен ? " + drinksAvailability.get("Кофе")); // 2
        System.out.println("Список доступных напитков:");
        for (Map.Entry<String, Boolean> entry : drinksAvailability.entrySet()) {
            if (entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }

        // Упражнение 4: меню с ценами и обновление цен,
        updateDrinkPrice(); // обновление цены напитка

        // Упражнение 5: перебор и вывод напитков по объему
        addDrinksVolume(); //  добавление напитков и их объемов
        System.out.println("Напитки объемом более 300 мл:");
        for (Map.Entry<String, Integer> entry : drinksVolume.entrySet()) {
            if (entry.getValue() > 300) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " мл");
            }
        }
        System.out.println("Есть ли напиток с объемом 250 мл? " + drinksVolume.containsValue(250)); // 3
    }

    // метод для добавления напитков и цен
    static void addDrinksPrices() {
        drinksPrices.put("Кофе", 9);
        drinksPrices.put("Чай", 5);
        drinksPrices.put("Сок", 7);
        drinksPrices.put("Вода", 3);
        drinksPrices.put("Пиво", 15);
    }

    // Метод для добавления напитков и калорийности
    static void addDrinksCalories() {
        drinksCalories.put("Кофе", 125);
        drinksCalories.put("Чай", 25);
        drinksCalories.put("Сок", 55);
        drinksCalories.put("Вода", 5);
        drinksCalories.put("Пиво", 180);
    }

    // метод для добавления напитков и их доступности
    static void addDrinksAvailability() {
        drinksAvailability.put("Кофе", true);
        drinksAvailability.put("Чай", true);
        drinksAvailability.put("Сок", false);
        drinksAvailability.put("Вода", true);
        drinksAvailability.put("Пиво", true);
    }

    // метод для обновления цены напитка
    static void updateDrinkPrice() {
        // Обновляем цену кофе
        int oldPrice = drinksPrices.get("Кофе");
        drinksPrices.put("Кофе", 120);
        System.out.println("Цена Кофе: " + drinksPrices.get("Кофе") + (oldPrice != drinksPrices.get("Кофе") ? " (Цена обновлена)" : ""));
    }

    // метод для добавления напитков и их объемов
    static void addDrinksVolume() {
        drinksVolume.put("Кофе", 150);
        drinksVolume.put("Чай", 200);
        drinksVolume.put("Сок", 250);
        drinksVolume.put("Газировка", 350);
        drinksVolume.put("Вода", 500);
    }

} // klass ended