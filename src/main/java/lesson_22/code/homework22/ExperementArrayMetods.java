package homework22;

public class ExperementArrayMetods {
    public static void main(String[] args) {
        ArrayMetods arrayMethods = new ArrayMetods() ;

        // Тест массива для проверки
        int[] sampleArray = {1, 2, 3, 4, 5, 6, 7};

        // Тестирование метода суммы элементов с нечетными индексами
        int sum = arrayMethods.sumOddIndexElements(sampleArray);
        System.out.println("Сумма элементов с нечетными индексами: " + sum); // Ожидается 12 (2 + 4 + 6)

        // Тестирование метода нахождения 5-го элемента
        try {
            int fifthElement = arrayMethods.findFifthElement(sampleArray);
            System.out.println("5-й элемент массива: " + fifthElement); // Ожидается 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
