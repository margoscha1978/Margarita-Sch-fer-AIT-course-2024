package lesson_32.homeworrk32;
/*
 4. класс RealEstateAgency (Агентство недвижимости):
    Поля:
        List<Property> properties (список объектов недвижимости).
    Методы:
        void addProperty(Property property) — добавляет объект недвижимости в список.
        void calculateTotalPrice() — выводит общую стоимость всех объектов недвижимости.
        void printAllDetails() — выводит информацию обо всех объектах недвижимости, используя метод printDetails().
        методы сортировки недвижимости.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RealEstateAgency {
    private List<Property> properties;

    public RealEstateAgency() {
        properties = new ArrayList<>();
    }
    // добавляем недвижимость
    public void addProperty(Property property) {
        properties.add(property);
    }
    // считаем предполагаемую по вариантам стоимость
    public double calculateTotalPrice() {
        double total = 0;
        for (Property property : properties) {
            total += property.calculatePrice();
        }
        return total;
    }
    // вывод деталей сделки по недвижимости
    public void printAllDetails() {
        for (Property property : properties) {
            property.printDetails();
        }
    }

    // Метод фильтрации по цене
    public List<Property> filterByPrice(double minPrice, double maxPrice) {
        List<Property> filteredProperties = new ArrayList<>();
        for (Property property : properties) {
            double price = property.calculatePrice();
            if (price >= minPrice && price <= maxPrice) {
                filteredProperties.add(property);
            }
        }
        return filteredProperties;
    }

    // Метод сортировки по цене
    public void sortByPrice() {
        Collections.sort(properties, new Comparator<Property>() {
            @Override
            public int compare(Property p1, Property p2) {
                return Double.compare(p1.calculatePrice(), p2.calculatePrice());
            }
        });
    }

    // Метод для печати отсортированных и отфильтрованных объектов
    public void printFilteredAndSorted(double minPrice, double maxPrice) {
        List<Property> filteredProperties = filterByPrice(minPrice, maxPrice);
        Collections.sort(filteredProperties, new Comparator<Property>() {
            @Override
            public int compare(Property p1, Property p2) {
                return Double.compare(p1.calculatePrice(), p2.calculatePrice());
            }
        });

        // Печать отфильтрованных и отсортированных объектов
        for (Property property : filteredProperties) {
            property.printDetails();
        }
    }
} // klass ended
