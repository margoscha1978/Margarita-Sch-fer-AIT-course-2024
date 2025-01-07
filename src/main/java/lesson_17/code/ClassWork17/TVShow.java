package ClassWork17;
/*
1.	TVShow – Класс, представляющий телешоу.
	•	Поля:
	•	String name – Название телешоу.
	•	int rating – Рейтинг телешоу от 1 до 5.
	•	Конструкторы:
	•	TVShow(String name, int rating) – Создает новое телешоу с названием и рейтингом.
	•	Методы:
	•	getName() – Возвращает название телешоу.
	•	getRating() – Возвращает рейтинг телешоу.
	•	setRating(int rating) – Устанавливает новый рейтинг телешоу.
 */

import java.util.Objects;

public class TVShow {

    //Название телешоу
    String name;

    //Рейтинг телешоу от 1 до 5
    int rating;

    public TVShow(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVShow tvShow = (TVShow) o;
        return  Objects.equals(name, tvShow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "TVShow {" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

} // klass ended
