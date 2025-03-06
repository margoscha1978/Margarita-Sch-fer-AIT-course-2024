package lesson_44.ClassWork44;

public class Main2 {
    public static void main(String[] args) {
        ModernArtGallery<ArtPiece> gallery = new ModernArtGallery<>();
        gallery.addArtPiece(new ArtPiece("Композиция X", 1920));
        gallery.addArtPiece(new ArtPiece("Скульптура Y", 1895)); // Это произведение не будет добавлено

        System.out.println("Экспонаты современной галереи:");
        gallery.displayArtPieces();
    }

} // klass ended
