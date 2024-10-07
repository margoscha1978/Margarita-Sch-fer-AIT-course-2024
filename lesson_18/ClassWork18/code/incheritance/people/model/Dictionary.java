public class Dictionary extends Book  {
    private String language;
    private String[] entries;

    // Конструктор
    public Dictionary(String title, String author, int year, int id, String language, String[] entries) {
        super(title, author, year, id);
        this.language = language;
        this.entries = entries;
    }

    // Переопределение метода display
    @Override
    public void display() {
        super.display();
        System.out.println("Язык: " + language);
        System.out.print("Записи: ");
        for (String entry : entries) {
            System.out.print(entry + " ");
        }
        System.out.println();
    }
}
