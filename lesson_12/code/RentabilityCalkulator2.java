public class RentabilityCalkulator2 {
    public static void main(String[] args) {

    // Упражнение 3:Расчет рентабельности аренды:
    // В одном массиве хранится стоимость аренды за месяц для
    //нескольких объектов недвижимости,
    // в другом — их цена продажи. Напишите программу,
    // которая вычислит и выведет рентабельность аренды для
    //каждого объекта (отношение стоимости аренды к стоимости недвижимости).
    // Пример: int[] rentPrices = {1200, 1500, 1800, 1300, 1600};int[] sellPrices = {250000, 300000, 350000, 280000, 320000};

    int[] rentPrices = {1200, 1500, 1800, 1300, 1600};
        int[] sellPrices = {250000, 300000, 350000, 280000, 320000};

            for(int i = 0; i < rentPrices.length; i++){
                int rentPrice = rentPrices[i];
                int sellPrice = sellPrices[i];

                double rentPriceYeild =  ( (double) rentPrice / sellPrice) * 100;
                rentPriceYeild = (double) Math.round(rentPriceYeild * 100)/100;
                System.out.println("Profit Object : " +( i + 1 ) +  " --> " +rentPriceYeild + "%");

            }
    }

} // klass ende
