public class Task2a {
    public static void main(String[] args) {

        //massiv chisel{ 75, 34, -15, -123, 57, -145, 86, 77, 48, -59, -145 }

        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        // min, skolko

        int minOfArray = array[0];
        int indexOfMinElement = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minOfArray) {
                minOfArray = array[i];
                indexOfMinElement = i;

            }//if ende

        }//for ende

        System.out.println(" Min element of array = " + minOfArray + " , index of element " + indexOfMinElement);

        // max skolko

        int maxOfArray = array[0];
        int indexOfMaxElement = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
                indexOfMaxElement = i;

            }//if ende

        }// for ende

        System.out.println(" Min element of array = " + maxOfArray + " , index of element " + indexOfMaxElement);

        int temp = array[indexOfMinElement];
        array[indexOfMinElement] = array[indexOfMaxElement];
        array[indexOfMaxElement] = temp;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }//for ende

        System.out.println();

    }//main ende

}//klass ende
