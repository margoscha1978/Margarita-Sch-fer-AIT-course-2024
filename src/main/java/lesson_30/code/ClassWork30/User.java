package ClassWork30;

import ClassWork30.Post;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

/**
 * Этот класс представляет пользователя в социальной медиа-программе.
 * Он содержит информацию о пользователе и предоставляет методы для управления друзьями и публикациями.
 */
@Slf4j
public class User {
    // Уникальный идентификатор пользователя
    private String id;

    // Имя пользователя
    private String name;

    // Адрес электронной почты пользователя
    private String email;

    // Список друзей пользователя
    private List<User> friends = new ArrayList<>();

    // Список публикаций, созданных пользователем
    private ArrayList<Post> posts = new ArrayList<>();

    /**
     * Конструктор для инициализации пользователя с ID, именем и адресом электронной почты.
     */
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Добавляет друга в список друзей пользователя.
     */
    public void addFriend(User friend) {
        if(friend != null) {
            friends.add(friend);
            System.out.println("Friend added: " + friend.name);
            log.info("Friend added: " + friend.name);
        } else {
            System.out.println("Friend is not valid!");
        }
    }

    /**
     * Удаляет друга из списка друзей пользователя.
     */
    public void removeFriend(User friend) {
        if(friend != null && friends.contains(friend)) {
            friends.remove(friend);
            System.out.println("Friend removed: " + friend.name);
        } else {
            System.out.println("Friend not found!");
        }
    }

    /**
     * Возвращает список друзей пользователя.
     */
    public ArrayList<User> getFriends() {
        return new ArrayList<>(friends);
    }

    /**
     * Создает новую публикацию от имени пользователя.
     */
    public Post createPost(String content) {
        if(content == null || content.isEmpty()) {
            return null;
        }
        Post post = new Post(this, content);
        System.out.println("Post was created: " + content + " by " + name);
        posts.add(post);
        return post;
    }

    /**
     * Возвращает список публикаций пользователя.
     */
    public ArrayList<Post> getPosts() {
        return new ArrayList<>(posts);
    }

    /**
     * Показывает публикации, сделанные друзьями пользователя.
     */
    public void viewFriendsPosts() {
        for(User friend : friends) {
            ArrayList<Post> friendPosts = friend.getPosts();
            for(final Post post : friendPosts){
                System.out.println("Author " + post.getAuthor().getName() +
                        " Post: " + post.getContent() +
                        " Likes " + post.getLikes());
            }
        }
    }

    /**
     * Возвращает ID пользователя.
     */
    public String getId() {
        return id;
    }

    /**
     * Возвращает имя пользователя.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает адрес электронной почты пользователя.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Prints the user's basic information.
     *
     * Печатает основную информацию о пользователе.
     */
    protected void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
} // klass ended
