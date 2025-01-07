public class Faktorial {
    public static void main(String[] args) {
            calculateFaktorial();
        }
    public static void calculateFaktorial(){
        int n = 0;
        int result = 1;

        while (true) {
            if (n > 0) {
                result *= n;
            }
            if (result < 0) {
                System.out.println(" The system will be oveloaded when n  = " + n);
                break;
            }
            System.out.println(" Faktorial " + n + " = " + result);
            n++;
        }

    }
}
