public class Mischung {
    public static void main(String[] args) {

        // money
        double money = 500;// dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro:" + euro);//ende

        //calorage
        double weight = 200;//gramm
        double colorage = 50;//cal. pro 100gr
        double energie = calkulateCalorie(weight, colorage);
        System.out.println("Energy=" + energie);//ende


    }// main

    // money
    private static double exchangeDollarsToEuro(double money) {
        double rate = 0.90;
        return money * rate;
    }//ende

    // calorage
        private static double calkulateCalorie(double weight, double colorage){
        return weight * colorage / 100;
    }//ende

    } //klass



