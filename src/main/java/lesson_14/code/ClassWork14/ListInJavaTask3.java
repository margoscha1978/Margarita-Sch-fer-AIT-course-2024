package ClassWork14;
// Задача 2.
//1.  Создайте список для хранения названий книг.
//2.  Добавьте несколько книг в список.
//3.  Проверьте, содержится ли определённая книга в списке
//4.  Выведите результат поиска.

import java.util.ArrayList;
import java.util.Iterator;

public class ListInJavaTask3 {

        public static void main(String[] args) {
            //  Создаем список для хранения названий книг
            //  Create a list to store book titles
            ArrayList<String> books = new ArrayList<>();
            // Добавляем несколько книг в список
            // Add several books to the list
            books.add("The Hobbit");
            books.add("The Lord");
            books.add("The Ring");
            // Печатаем список книг
            // Print the list of books
            System.out.println(books); // вывод полного списка книг

            // удаление объекта
            // тип 1
            books.remove(1); // по индексу
            books.remove("The Lord"); // по названию

            // тип 2
            Iterator<String> iterator = books.iterator();
            while (iterator.hasNext()) {
                String booksInList = iterator.next();
                if (booksInList.equals("The Lord")) {
                    iterator.remove();
                }
                System.out.println(books); // вывод списка после удаления

                // Определяем книгу для поиска
                // Define the book to search for
                String searchBook = "The Lord ";

                // Проверяем, содержится ли книга в списке до или после удаления
                // Check if the book is in the list
                if (books.contains(searchBook)) {
                    // Если книга найдена, выводим сообщение
                    // If the book is found, display a message
                    System.out.println("Book " + searchBook + " was found in the list.");
                } else {
                    // Если книга не найдена, выводим сообщение
                    // If the book is not found, display a message
                    System.out.println("Book " + searchBook + " was not found in the list.");
                }
            }
        }

} // klass ende
