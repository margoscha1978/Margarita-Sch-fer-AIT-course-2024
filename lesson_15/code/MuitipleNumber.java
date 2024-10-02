public class MuitipleNumber {
    public static void main(String[] args) {

        int number = 1;
        boolean correctNumber =false;

        for (int i=10; i<=99; i++){
            if (i% 2 != 0 && i % 17 == 0){

                number *= i;
                correctNumber =true;
                System.out.println("Correct numbers are: " + i);

            }
        }
        if (correctNumber){
            System.out.println("Two-digit numbers multiples of 17: " + number);
        }else {
            System.out.println("there are no double-digit multiples of 17.");
        }
    }
}
