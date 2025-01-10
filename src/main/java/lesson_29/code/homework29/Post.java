package homework29;
/*
 5. Класс Post:
 - Теперь создадим класс Post,
   который будет представлять посты пользователя и лайки на него.
   Author (объект класса User, автор записи),
   Content (текст записи),
   Likes (количество лайков).
    Добавьте методы:
    - Конструктор для создания поста,
    - Метод like(), который увеличивает количество лайков на 1.
 */
class Post {
    private User author;
    private String content;
    private int likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    public void like() {
        likes++;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public User getAuthor() {
        return author;
    }
} // klass ended
