package lesson_43.homework43;
/*
 Потомки класса Product

    Создайте, как минимум, два конкретных класса, наследующих Product. Например, «Книга» и «Электроника».
    Добавьте каждому классу собственное специфичное поле:
        «автор» у книг;
        «бренд» у электроники.
    Переопределите метод описания товара так, чтобы он учитывал специфичные поля
    (например, «Книга [название] от [автор], цена: …»).

 */
class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Книга \"" + name + "\" от " + author + ", цена: " + price;
    }

} // klass ended
