package lesson_32.homeworrk32;
/*
создаем объекты и проверяем как функционирует программа
 */
public class Main {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        Apartment apartment = new Apartment("ул. Лизунова, 1", 5, 45, true);
        House house = new House("ул. Пушкина, 2", 120, 500, true);
        CommercialProperty commercial = new CommercialProperty("ул. Горького, 3", 200, "офис");

        agency.addProperty(apartment);
        agency.addProperty(house);
        agency.addProperty(commercial);

        agency.printAllDetails();
        System.out.println("Общая стоимость: " + agency.calculateTotalPrice() + " евро");
    }

} // klass ended

