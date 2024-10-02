import java.util.Random;

// brosaem kubik 20 raz,schitaem skolko raz vipala kachdaja gran,ravni li verojatnosti vipadenija kubika

public class Dice {
    public static void main(String[] args) {

        Random random = new Random();// generator sluchainogo chisla

       int [] toss = new int[20] ;

       // zapolnjaem massiv

        for (int i = 0; i < toss.length ; i++) {

            //zovem datchik random

         int n = random.nextInt(6) + 1;// diapazon ot 0 do 5 c +1,poluchaetsja zifri ot 1 do 6
            toss[i] = n;
            System.out.print (n + "  ");

        }// ende for

        System.out.println();

        // podschet verojatnoctei

        int []res = new int[6];// elementi granei kubika,sdvig pri podschete na 1 nasad ot 0 do 5
        for (int n : toss) {
            switch (n) {

                case 1 -> res[0]++;
                case 2 -> res[1]++;
                case 3 -> res[2]++;
                case 4 -> res[3]++;
                case 5 -> res[4]++;
                case 6 -> res[5]++;

            }

        }

// pechataem

        for (int re : res) {
            System.out.print( re + " " );

        }



    }//ende main

}//ende klass
