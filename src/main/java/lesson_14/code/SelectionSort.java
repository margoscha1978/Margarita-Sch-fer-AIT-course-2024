import java.util.Random;

public class SelectionSort {
    public static void selectionSort( int[] array) {
        int n = array.length ;
        for (int i = 0; i < n; i++) {

            // indeks samogo malenkogo elementa v massive
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

            }
            // menjaem mestami tekuschii element s naidennim menschim elementom
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }

    }
public static void main(String[] args) {
    //sozdaem massiv
    Random rand = new Random();
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(100);//cluchainie chisla ot 0 do 99

    }
 //pechat massiva
    System.out.println( " Print array  : ");
    printArray(array);
    // sortiruem massiv
    selectionSort(array);
    // pechataem sortirovannii massiv
    System.out.println( " The array was sorted...");
}
 //metod massiva
 public static void printArray(int[] array) {
     for (int num : array) {
         System.out.print(num + " ");
     }
     System.out.println();

 }

}
