import java.util.Arrays;
import java.util.Random;

public class ArRanScan {
    public static void main(String[] args) {

   // massiv 1 ot 1 do 100
   int[] originalArray = new int[100];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = i + 1;// zapolnili massiv
        }
   //massiv 2,na 1 element bolsche
   int[] extendetArray = new int[originalArray.length +1];
        System.arraycopy(originalArray,0, extendetArray,0,originalArray.length );

    // randomnoe chislo
        Random random = new Random();
        int randomValue = random.nextInt(100) + 1;// sluchainie chislo ot 1 do 100
        int randomIndex = random.nextInt(originalArray.length + 1);

//dvigaem elementi ,mesto dla sluchainogo
        for (int i = originalArray.length - 1; i > randomIndex; i--) {
            originalArray[i] = originalArray[i - 1];
        }
originalArray[randomIndex] = randomValue;//bstawili novoe znachenie

 // cmotrim kakoe chislo dobavili
        System.out.println( " Random number : " + randomValue );

 //proverjaem vse
        System.out.println( " Added number : " + randomValue);
        System.out.println( " Sourse arrey : "  + Arrays.toString(originalArray));
        System.out.println( " Sekond massiv : " + Arrays.toString(extendetArray ));

    }

}// klass ende
