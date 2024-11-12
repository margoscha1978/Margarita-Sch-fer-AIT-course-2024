package interesse;

public class SummaВсехЧисел {
     // Напишите программу, которая находит сумму всех чисел от 1 до 100.
     // В данном случае также вполне достаточно рассчитать сумму в цикле for:

    public class SumOfNumbers {
      public static void main(String[] args) {
           int sum = 0;
          for (int i = 1; i <= 100; i++) {
             sum += i;
          }
           System.out.println("Сумма чисел от 1 до 100: " + sum);
      }
    }
}
