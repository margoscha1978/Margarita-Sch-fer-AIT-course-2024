import java.util.Scanner;

public class AthleteProgress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" die erste lauf Tag (s) kolimetr ");
        double s = scanner.nextDouble();//erste tag km
        System.out.println(" Ziel in kilometr ( target) ");
        double target = scanner.nextDouble();//end ziel in km

        int day = 1;//tages rechner
        double currentDistance = s;// täglich km in lafen

        while(currentDistance < target) {

        currentDistance *=  1.1;  //+10%
        day++;// lauftages rechner
    }
        System.out.println( " Der Sportler hat Ziel erreicht in tag: " + day);


    }
}
