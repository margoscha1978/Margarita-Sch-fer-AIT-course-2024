public class AppelsXL {
    public static void main(String[] args) {
        // Äpfeln von 1 bis 25

        int apples= 25;//daten
        int count= 0;//rechner,parametr vo zikl
        int startApples= 25;

        while ( count < startApples){

            System.out.println(" Take one apple from the basket ");
            apples = apples - 1;
            count = count + 1;
            System.out.println(" Now we have only " + apples + " apples in the basket " );
        }//zikl ende

        System.out.println(" The job is done! " + count + " apples added in the pie.");

    }// ende main
}//ende klass


