package ClassWork14;
// Задача 1.
//1.  Создайте список для хранения названий книг.
//2.  Добавьте в список несколько книг.
//3.  Удалите книгу по названию
//4.  Выведите список после удаления.

import java.util.ArrayList;
import java.util.Iterator;

//   Removing a book by title
//    1. Create a list to store book titles.
//    2. Add several books to the list.
//    3. Remove a book by its title.
//    4. Display the list after the removal.

public class ListInJavaTask2 {
    public static void main(String[] args) {
        //  Создаем список для хранения названий книг
        //  Create a list to store book titles
        ArrayList<String> books = new ArrayList<>();

        // Добавляем несколько книг в список
        // Add several books to the list
        books.add("The Hobbit");
        books.add("The Lord");
        books.add("The Ring");

        // Печатаем список книг до удаления
        // Print the list of books before removal
        System.out.println(books); // вывод полного списка книг

        // удаление объекта
        // тип 1 удаление с помощью удалителя remov
        books.remove(1); // по индексу
        books.remove("The Lord"); // по названию

        // тип 2,Используем итератор для удаления книги по названию
        //  Use an iterator to remove the book by its title
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String booksInList = iterator.next();
            if (booksInList.equals("The Lord")) { // удаляем указанную книгу
                iterator.remove();
            }
            // Печатаем список книг после удаления
            // Print the list of books after removal
            System.out.println(books); // вывод списка после удаления
        }

    }

} // klass ende
