package lesson_44.ClassWork44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sculpture implements Artwork {
    private static final Logger log = LoggerFactory.getLogger(Sculpture.class);
    private String title; // название
    private String material; // скульптор

    public Sculpture(String title, String material) {
        this.title = title;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String sculptor) {
        this.material = sculptor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sculpture{");
        sb.append("title='").append(title).append('\'');
        sb.append(", material='").append(material).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void display() {
        System.out.println("Скульптура: " + title + ", материал: " + material);
    }

} // klass ended
