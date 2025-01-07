public class ArrayAndMethod {
    public static void main(String[] args) {

     int[] ageOfGroup = { 47, 49, 37, 47, 52, 60, 44 };

     double averageAge = averageAge(ageOfGroup);
        System.out.println(averageAge);

    }

    private static double averageAge( int[]array) {
        int sum= 0;
        for (int j : array) {
            sum = sum + j;
        }

return (double) sum / array.length;
    }
}

