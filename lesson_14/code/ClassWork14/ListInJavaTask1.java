package ClassWork14;
//   Добавление и вывод книг
//        1. Создайте список для хранения названий книг.
//        2. Добавьте в список три книги.
//        3. Выведите все книги из списка.
//
//        Adding and displaying books
//        1. Create a list to store book titles.
//        2. Add three books to the list.
//        3. Display all books from the list.

import java.util.ArrayList;

public class ListInJavaTask1 {
    public static void main(String[] args) {
        // Создаем список для хранения названий книг
        // Create a list to store book titles
        ArrayList<String> books = new ArrayList<>();

        // Добавляем три книги в список
        // Add three books to the list
        books.add("The Hobbit");
        books.add("The Lord");
        books.add("The Ring");

          // Выводим весь список книг (в одну строку)
          // Display the entire list of books (in one line)
        System.out.println(books );// вывод списка книг

        // Выводим каждую книгу на отдельной строке с помощью цикла for-each
        // Display each book on a separate line using a for-each loop
        for (String book : books);
        System.out.println(books); // вывод списка в другом формате
    }

} // klass ende
