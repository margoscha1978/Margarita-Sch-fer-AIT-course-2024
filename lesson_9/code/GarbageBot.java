   import java.util.Scanner;

public class GarbageBot {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


      System.out.println(" Welcome to the garbage disposal bot!");

        System.out.println(" What type of garbage do you want to dispose of? (paper,food,packaging,other)");



        String garbageType = scanner.nextLine().toLowerCase().trim();

        System.out.println(" Entered garbage type: '" + garbageType + "'");



        String binColor;



        if(garbageType.equals("packaging")) {

            binColor = "yellow";

        } else if(garbageType.equals("food") ) {

            binColor = "brown";

        } else if(garbageType.equals("paper") ) {

            binColor = "green";

        } else if(garbageType.equals("other") ){

            binColor = "black";

        } else {

            binColor = "unknown";



        }

        System.out.println("Current bin color:  " + binColor);



        System.out.println(binColor.equals("unknown") ? "Please specifity a valid type of garbage !" :

                " Throw the " + garbageType + " into the " + binColor + " bin.");



    }// ende main



}// ende


















