package homework15;
/*
Пояснения к программе:
Создаем отдельный класс "Book" с геттерами и сеттерами.
 - Хранит информацию о книге: название, автора и год издания.
 - Реализует метод toString(), чтобы удобно выводить информацию о книге.

Главный класс "LibraryBookDatabase"
- Содержит все методы для управления библиотекой, включая добавление, удаление, обновление, сортировку и отображение книг.
- Меню пользователя
- Пользователь вводит номер действия, и программа выполняет соответствующий метод.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LibraryBookDatabase {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> searchBook();
                case 4 -> updateBook();
                case 5 -> sortBook();
                case 6 -> showBooks();
                case 7 -> clearBooks();
                case 8 -> {
                    System.out.println("Программа завершена.");
                    running = false;
                }
                default -> System.err.println("Неверный ввод, попробуйте снова.");
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--- Меню управления базой данных библиотеки ---");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Найти книгу");
        System.out.println("4. Обновить данные или переименовать книгу");
        System.out.println("5. Отсортировать книги");
        System.out.println("6. Показать список книг");
        System.out.println("7. Очистить список книг");
        System.out.println("8. Выйти");
        System.out.print("Выберите ваше дальнейшее действие: ");
    }

    private static void addBook() { // добавим книгу и введем все ее данные
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите название книги: ");
        String bookName = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String authorName = scanner.nextLine();
        System.out.print("Введите год издания: ");
        int publicationYear = scanner.nextInt();

        books.add(new Book(bookName, authorName, publicationYear));
        System.out.println("Книга добавлена.");
    }

    private static void removeBook() { // удаляем книгу по названию
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите название книги для удаления: ");
        String bookName = scanner.nextLine();
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(bookName));
        System.out.println("Книга удалена, если она существовала.");
    }

    private static void searchBook() { // поиск книги по названию
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите название книги для поиска: ");
        String bookName = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookName)) {
                System.out.println("Найдена книга: " + book);
                return;
            }
        }
        System.out.println("Книга не найдена.");
    }

    private static void updateBook() { // манипуляции с книгой.вносим изменения
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите название книги для обновления: ");
        String bookName = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookName)) {
                System.out.print("Введите новое название (или оставьте пустым, чтобы не менять): ");
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) {
                    book.setTitle(newTitle);
                }

                System.out.print("Введите нового автора (или оставьте пустым, чтобы не менять): ");
                String newAuthor = scanner.nextLine();
                if (!newAuthor.isEmpty()) {
                    book.setAuthor(newAuthor);
                }

                System.out.print("Введите новый год издания (или оставьте пустым, чтобы не менять): ");
                String newYear = scanner.nextLine();
                if (!newYear.isEmpty()) {
                    book.setPublicationYear(Integer.parseInt(newYear));
                }
                System.out.println("Данные книги обновлены!");
                return;
            }
        }

        System.out.println("Книга не найдена.");
    }

    private static void sortBook() { // сортировка по названию или году выпуска
        System.out.println("Выберите критерий сортировки:");
        System.out.println("1. По названию");
        System.out.println("2. По году издания");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Collections.sort(books, Comparator.comparing(Book::getTitle));
            System.out.println("Сортировка по названию завершена.");
        } else if (choice == 2) {
            Collections.sort(books, Comparator.comparingInt(Book::getPublicationYear));
            System.out.println("Сортировка по году издания завершена.");
        } else {
            System.out.println("Неверный выбор сортировки.");
        }
    }

    private static void showBooks() { // проверка нашего списка книг после возможных манипуляций с ними.
        // контроль наличия книг в библиотеке(списке)
        if (books.isEmpty()) {
            System.out.println("Список книг пуст.");
        } else {
            System.out.println("Список книг:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private static void clearBooks() {  // очистка списка книг
        books.clear();
        System.out.println("Список книг очищен.");
    }

} // klass ended

