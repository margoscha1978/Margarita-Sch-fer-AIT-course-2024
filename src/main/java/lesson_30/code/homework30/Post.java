package homework30;

import java.util.ArrayList;
import java.util.List;
/*
Создайте класс Post, реализующий оба интерфейса:
Внутри класса должны быть поля для хранения количества лайков и списка комментариев.
 */
class Post implements Likable, Commentable {
    private int likesCount;
    private List<String> comments;

    public Post() {
        this.likesCount = 0;
        this.comments = new ArrayList<>();
    }

    @Override
    public void like() {
        likesCount++;
    }

    @Override
    public int getLikesCount() {
        return likesCount;
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public List<String> getComments() {
        return comments;
    }
} // klass ended
