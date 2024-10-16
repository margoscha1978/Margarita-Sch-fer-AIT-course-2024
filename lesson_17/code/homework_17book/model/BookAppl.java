package homework_17book.model;

public class BookAppl {
    public static void main(String[] args) {

      Book book1 = new Book(0,"Harry Potter,the Boy Who Lived","Djoanne Rowling",0,"Fantasie");
      Book book2 = new Book(0,"Harry Potter,Orden of the Phoeenix","Djoanne Rowling",0,"Fantasie");

        System.out.println(book1);
        System.out.println(book2);

        book1.display();
        book2.display();
    }

}//klass ende
