package interesse;

public class ArrayПереворотМассива {
    // Напишите программу, которая инвертирует массив (меняет порядок элементов на противоположный).
    public class ArrayReverse {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int temp;
            int length = array.length;
            for (int i = 0; i < length / 2; i++) {
                temp = array[i];
                array[i] = array[length - i - 1];
                array[length - i - 1] = temp;
            }
            System.out.print("Инвертированный массив: ");
            for (int element : array) {
                System.out.print(element + " ");
            }
        }
    }
}
