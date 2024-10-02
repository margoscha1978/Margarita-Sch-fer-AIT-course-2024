package ClassWork13;

public class ArrayMethods {
    // O(log(n))
    // binary search

    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if(array[midIndex] == n){
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; // правую половину надо отбросить
            } else {
                leftIndex = midIndex + 1; // левую половину надо отбросить
            }
        }
        return -leftIndex - 1; // если элемент не нашёлся
    }

//-------------------------------------------------------------------------------

    // O(n) - чем больше элементов массива, тем дольше работает метод
    // linear search, return index (if element absent return -1 )

    public static int linearSearch(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                return i; // go out from method
            }
        }
        return -1;
    }

    // ---------------------------------------------------------------------------

    // fill array random numbers
    // a - left border, b - right border, n - quantity

    public static int[] fillArray(int a, int b, int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int)(Math.random()*(b - a + 1) + a); //
        }
        return res;
    }

    //-----------------------------------------------------------------------------------

    // print array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    //-----------------------------------------------------------------------------------

    // search in array
    public static boolean searchInArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                return true;
            }
        }
        return false;
    } // end of method

//-------------------------------------------------------

}

