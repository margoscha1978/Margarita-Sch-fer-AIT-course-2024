package homework12;

public class ApartamentSearch1 {
    public static void main(String[] args) {

    // Упражнение 4:Поиск квартиры в бюджете:
    // У вас есть массив цен квартир, а также бюджет пользователя.
    // Напишите программу, которая выводит все квартиры,
    //цена которых меньше или равна бюджету пользователя.
    //int[] prices = {100000, 150000, 200000, 250000, 300000}; int budget = 200000;

            int[] prices = {100000, 150000, 200000, 250000, 300000};
            int budget = 200000;
            boolean propertyFound = false;


            for(int i = 0; i < prices.length; i++){
                int priceElement = prices[i];
                if(priceElement <= budget){
                    System.out.println("Найденные квартиры: " + priceElement + ".бюджет: " + budget);
                    propertyFound = true;
                }
            }
            if(!propertyFound){
                System.out.println("Квартира для вас не найденна !");
            }
    }

} // klass ende
