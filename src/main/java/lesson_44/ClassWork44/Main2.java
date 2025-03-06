package lesson_44.ClassWork44;

public class Main2 {
    public static void main(String[] args) {
        ModernArtGallery<ArtPiece> gallery = new ModernArtGallery<>();
        gallery.addArtPiece(new ArtPiece(1920, "Композиция X"));
        gallery.addArtPiece(new ArtPiece(1895, "Скульптура Y")); // Это произведение не будет добавлено

        System.out.println("Экспонаты современной галереи:");
        gallery.printAllArtPieces();
    }

} // klass ended
