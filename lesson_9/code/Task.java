public class Task {
    public static void main(String[] args) {

        // massiv  zapolnite  ziframi ot 1 do 20

        int[] numbers = new int[20];// dlinna massiva,legt = 20,indexes from 0 till 19

// numbers[0] - 1st element of array,elementi massiva
// numbers[numbers lengs - 1],schagi massiva
// numbers.length = 20

        // zapolnili massiv

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;

        }

// print array numbers

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

        //System.out.println();
       //System.out.println(numbers); ne verno,fals po etomu print polnostiju,eto doroga v operativhuju pamjat

    }
}

// naznachit i= 1? zadanie vkljuchaet 20, 1 ne podchodit i= 0;
//yvelichit element massiva numbers[i]= i; pribaviv 1;