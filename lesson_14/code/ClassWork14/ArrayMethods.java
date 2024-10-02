package ClassWork14;

public class ArrayMethods {

    //bubblesort - puzirkovaja sortirovka,sravnivaem vsegda 2 elementa,perestavljaem poparno v porjadke vozrastanija
    // uporjadochennie elementi uhodjat iz zikla,zikl idet dalhe,rabotajut v void

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) { //zamena i na j,chtobi ne putatsja,delart sama Java,
                // minus i prichodit dlja togo chtobi proverennie chisla bolhe ne rabotali
                if (array[j] > array[j + 1]) { // esli bolsche menjaem mestami,esli net vse stoit

                    // zamena elementov s i na j.

                    int temp = array[j];// levii pervii menjaem c pravim
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }

    //---------------------------------------------

    // razvorot massiva - array turn around,reverse

    public static void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j + 1];
        array[j] = temp;
    }

    public static void reverseArray(int[] array) {

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {

            swap(array, i, j); // ne sortirovka massiva,eto smena mest elementov massiva,menjajutsja vse elementi vnutri

        }
    }

    //--------------------------------------------

    // O(log(n))
    // binary search

    public static int binarySearch(int[] array, int n) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n) {
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; // правую половину надо отбросить
            } else {
                leftIndex = midIndex + 1; // левую половину надо отбросить
            }
        }
        return -leftIndex - 1; // если элемент не нашёлся
    }

    // O(n) - чем больше элементов массива, тем дольше работает метод
    // linear search, return index (if element absent return -1 )
    public static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i; // go out from method
            }
        }
        return -1;
    }


    // =========================================================================================

    // fill array random numbers
    // a - left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a); //
        }
        return res;
    }

    // print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    // search in array
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    } // end of method
    public class StringMethods {
        // Метод для нахождения добавленного числа
        public static int findAddedNumber(int[] originalArray, int[] newArray) {// find Added Number - найти добавленный номер
            int sumOriginal = 0;
            int sumNew = 0;
            // Суммируем элементы исходного массива
            for (int num : originalArray) {
                sumOriginal += num;
            }
            // Суммируем элементы нового массива
            for (int num : newArray) {
                sumNew += num;
            }

            // Разница между суммами - это добавленное число
            return sumNew - sumOriginal;
        }

        // Метод для нахождения индекса добавленного числа в новом массиве
        public static int findAddedNumberIndex (int[] newArrayNumbers, int addedNumber) {
            // Проходим по новому массиву и ищем индекс добавленного числа
            for (int i = 0; i < newArrayNumbers.length; i++) {
                if (newArrayNumbers[i] == addedNumber) {
                    return i;
                }
            }
            return -1; // Вернем -1, если число не найдено, хотя это маловероятно
        }

    }

}