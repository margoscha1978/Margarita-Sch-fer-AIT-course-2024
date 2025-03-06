package lesson_44.ClassWork44;

public class Main1 {
    public static void main(String[] args) {
        Museum<Artwork> museum = new Museum<>();
        museum.addExhibit(new Painting("Мона Лиза", "Леонардо да Винчи"));
        museum.addExhibit(new Sculpture("Давид", "Микеланджело"));

        System.out.println("Экспонаты музея:");
        museum.displayExhibits();
    }

} // klass ended

