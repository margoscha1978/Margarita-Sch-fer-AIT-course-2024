public class Konwertation {
    public static void main(String[] args) {
      // конвертер валют
        double money = 100;// pound
        double pound = exchangelPoundsToEuro(money);
        System.out.println("Euro=:" + pound);//pr ende

        double money1 = 100;// yuan
        double yuan = exchangelYuanToEuro( money1);
        System.out.println("Euro=:" + yuan);//pr ende

        double money2 = 100;//swissfrank
        double swissfrank = exchangelSwissfrankToEuro( money2);
        System.out.println( "Euro=:" + swissfrank);

    }// main ende

    private static double exchangelPoundsToEuro(double money) {
        double rate = 0.8447;
        return money * rate;// pn ende
    }
     private static double exchangelYuanToEuro(double money) {
         double rate = 0.1269;
         return money * rate;
     }
     private static double exchangelSwissfrankToEuro(double money){
        double rate = 1.07;
        return money * rate;
    }//metod
}//klass ende