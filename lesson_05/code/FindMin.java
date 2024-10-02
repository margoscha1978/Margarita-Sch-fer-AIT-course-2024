public class FindMin {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 15;
        int minNumber = findMin(number1, number2);
        System.out.println("minNumber" + minNumber);

    }

    public static int findMin(int number1,int number2){
    if (number1 < number2){
        return number1;
    }else

        return number2;
    }
}























