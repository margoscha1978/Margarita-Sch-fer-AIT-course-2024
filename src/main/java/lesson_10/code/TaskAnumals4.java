import java.util.Scanner;

public class TaskAnumals4 {
    public class TaskAnimals4 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String animalList = "";
            String stopWord = "stop";

            while (true) {
                System.out.print("Enter the name of a favorite animal (or 'stop' to finish): ");
                String animal = scanner.nextLine();

                //Check animal "stop"
                if (animal.trim().equalsIgnoreCase(stopWord)) { //Stop
                    if (animalList.isEmpty()) {
                        System.err.println("Error! You don't enter anything!");
                    } else {
                        break;
                    }
                } else {// animal is not "stop"
                    if (animal.trim().isEmpty()) {
                        System.out.println("You don't enter any animal name!");
                    } else {
                        if (!animalList.isEmpty()) {
                            animalList = animalList.concat("\n");
                        }

                        if(animalList.contains(animal)){
                            System.out.println(animal + " was added already.");
                        }
                        else {
                            if (!animalList.isEmpty()) {
                                animalList = animalList.concat("\n");
                            }
                            animalList = animalList.concat(animal);

                        }
                    }
                }
            }

            System.out.println("Your favorite animals:\n" + animalList);

            scanner.close();

        }
    }
}
