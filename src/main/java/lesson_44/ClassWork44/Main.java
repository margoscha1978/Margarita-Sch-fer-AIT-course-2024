package lesson_44.ClassWork44;

public class Main {
    public static void main(String[] args) {
        ArtGallery<Painting> gallery = new ArtGallery<>();
        gallery.addPainting(new Painting("Звёздная ночь", "Винсент Ван Гог"));
        gallery.addPainting(new Painting("Девушка с жемчужной серёжкой", "Ян Вермеер"));

        System.out.println("Экспонаты галереи:");
        gallery.printAllPaintings();
    }

} // klass ended
