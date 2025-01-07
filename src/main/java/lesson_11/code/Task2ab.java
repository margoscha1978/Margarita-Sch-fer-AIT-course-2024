public class Task2ab {
    public static void main(String[] args) {

        //massiv chisel,esti chislo x mnogo raz,gde stoit x?

        int[] array = { -145, 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        int x = -145;
        int count = 0;

        // algoritm zikla poiska chisla,skoliko raz vstrechaetsja

        for (int i = 0; i < array.length; i++) {
            if(array [i] == x){
               count++;
                System.out.print(i + " ");

            }//if ende

        }// fpr ende

        System.out.println();
        System.out.println(count);

    }//ende main

}// ende klass
