import java.util.Scanner;

public class ChildTrain {
    public static void main(String[] args) {

        //aufgabe 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which mark have you got today? 1,2,3,4,5 ");
        int mark = scanner.nextInt();

        int timeForGame = 60;//switch-umschalter für viele gleiche aufgaben
        switch (mark) {

            case 1 : {
                System.out.println("Good Job");
                timeForGame = timeForGame + 30;
                System.out.println("Time for game" + timeForGame );
                break;
            }
            case 2 : {
                System.out.println("Good");
                System.out.println(" Time for Game: " + timeForGame );
                break;
            }
            case 3 :{
                System.out.println("Okay...");
                timeForGame = timeForGame - 30;
                System.out.println("Time for Game: " + timeForGame );
                break;
            }
            case 4 :{
                System.out.println("very bad...");
                timeForGame = 0;
                System.out.println(" No Game Today...");
                break;
            }
            case 5 :{
                System.out.println(" Oy...");
                timeForGame = -120;
                System.out.println(" No,no,no Game...");
                break;
            }
            default : {
                System.out.println("Wrong input");


            }

        }




    }//main ende
}//klass ende
