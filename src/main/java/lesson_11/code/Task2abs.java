 //versija c coxraneniem dannich vo vtorom massive

public class Task2abs {
    public static void main(String[] args) {

        int[] array = { -145, 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        int [] arrayOfIndex = new int[array.length ];

        int x = -145;
        int count = 0;

        int j = 0;// vtoroi massiv

        // algoritm zikla poiska chisla,skoliko raz vstrechaetsja

        for (int i = 0; i < array.length; i++) {
            if(array [i] == x){
                count++;//uvelechenie
                System.out.print(i + " ");

                arrayOfIndex[j] = i;// indeks vtorogo massiva
                j++;//uvelechenie

            }//if ende

        }// fpr ende

        System.out.println();
        System.out.println(count);

        // ves massiv

        for (int i = 0; i < j; i++) {

            System.out.print(arrayOfIndex[i] + " ");

        }// for ende

    }//main ende

}//klass ende

