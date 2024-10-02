public class RandomD {
    public static void main(String[] args) {

                int[] randomNumbers = new int[20]; //create array with 20 elements

                System.out.println("Random number sequence from 10 to 30: ");
                for (int i = 0; i < randomNumbers.length; i++) {
                    randomNumbers[i] = (int)(Math.random() * (30 - 10 + 1) + 10); //randomizer
                    System.out.print(randomNumbers[i] + " ");
                }
                System.out.println( );

                // Swap the values of the first and last elements
                int a = randomNumbers[19];  // Store the last element
                int b = randomNumbers[0];   // Store the first element
                randomNumbers [19] = b;     //Last element gets the value of the first
                randomNumbers [0] = a;      // First element gets the value of the last

                for (int i = 0; i < randomNumbers.length; i++) {

                    System.out.print(randomNumbers[i] + " ");
                }

            }
        }


