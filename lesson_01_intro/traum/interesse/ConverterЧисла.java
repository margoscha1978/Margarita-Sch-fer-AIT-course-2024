package interesse;

public class ConverterЧисла {
    // Напишите на Java простой код, который переводит целое число в строку,
    // при том что его можно применить в любой системе счисления.
    // Решить эту простую задачу Java не составит труда. Для перевода целого числа в строку в любой системе счисления,
    // можно воспользоваться методом Integer.toString() или Long.toString(),
    // которые позволяют задать основание системы счисления вторым аргументом:

    public class NumberToStringConverter{
       public static void main(String[] args) {
          int number = 123;
          int base = 16; // Задаем систему счисления (например, 16 для шестнадцатеричной)

           String numberAsString = convertToString(number, base);
            System.out.println(number + " в системе счисления " + base + ": " + numberAsString);
       }

      public static String convertToString(int number, int base) {
          return Integer.toString(number, base);
       }
    }
}
