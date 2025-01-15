package homework30;
/*
Создайте интерфейс Commentable с методами:
    void addComment(String comment) — добавляет комментарий.
    List<String> getComments() — возвращает список комментариев.
 */
import java.util.List;

public interface Commentable {
    void addComment(String comment);
    List<String> getComments();

} // interface ended
