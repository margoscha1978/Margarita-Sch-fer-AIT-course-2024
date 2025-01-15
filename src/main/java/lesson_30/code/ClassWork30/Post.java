package ClassWork30;

/**
 * Этот класс представляет публикацию в социальной медиа-программе.
 * Публикация имеет автора, содержание и количество лайков.
 */
public class Post {

    // Автор публикации
    private User author;

    // Содержание публикации
    private String content;

    // Количество лайков, которые получила публикация
    private int likes;

    /**
     * Конструктор для создания публикации с автором и содержанием.
     * Изначально у публикации ноль лайков.
     */
    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    /**
     * Увеличивает количество лайков у публикации.
     */
    public void like() {
        likes++;
    }

    /**
     * Возвращает количество лайков у публикации.
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Возвращает автора публикации.
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Возвращает содержание публикации.
     */
    public String getContent() {
        return content;
    }

    /**
     * Возвращает строковое представление публикации, включая автора, содержание и количество лайков.
     */
    @Override
    public String toString() {
        return "Post{" +
                "author=" + author +
                ", content='" + content + ", likes=" + likes + '}';
    }
} // klass ended
