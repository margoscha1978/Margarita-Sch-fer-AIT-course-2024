package ClassWork24.book_library.model;

// Создать класс Book с полями:
// long isbn, String title, String author, int yearOfPublishing.
// Проверить ISBN на корректное количество цифр = 13.

import java.util.Objects;

public class Book {

    public static final int ISBN_LENGTH = 13;

    // field
    private String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    // constructor
    public Book(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
//        if(isIsbnValid){
//            this.isbn = isbn;
//        }
        this.isbn = checkIsbn(isbn);

    }

    private long checkIsbn(long isbn) {
        // проверить длину isbn по кол-ву цифр в этом числе
        if( countDigit(isbn) ) {
            return isbn;
        }
        return -1; // сигнал того, что isbn неверный
    }

    private boolean countDigit(long isbn) {
        //  String.valueOf(isbn).length() == 13 - хороший подход, требуется много ресурсов
        // можно циклом for так как известно сколько раз он должен отработать
        int count = 0;
        long temp = isbn; // чтобы не "испортить" значение isbn
        while ((temp != 0)) {
            temp = temp / 10;
            count++;
        }
        return count == ISBN_LENGTH;
    }

    public long getIsbn() {
        return isbn;
    }

    // TODO предусмотреть защиту по поводу 13 цифр и в этом случае
    public void setIsbn(long isbn) {
        if(checkIsbn(isbn) > 0){
            this.isbn = checkIsbn(isbn);
        } else {
            System.out.println("ISBN is not correct.");
        }

//        public void setIsbn(long isbn) {
//            if(countDigit(isbn)){
//                this.isbn = isbn;
//            } else{
//                System.out.println("Error! ISBN '" + isbn + "' is invalid.");
//            }
//        }

    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
}
