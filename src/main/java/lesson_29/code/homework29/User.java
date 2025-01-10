package homework29;
/*
1. Класс User:
   - Имеет приватные атрибуты id, name и email.
   - Конструктор для инициализации атрибутов.
   Методы:
   - displayInfo() выводит информацию о пользователе.
   - addFriend(User user) для добавления друга.
   - removeFriend(User user) для удаления друга.
   - Список друзей должен быть реализован в виде коллекции (например, ArrayList).
   - createPost(String content) который возвращает объект класса Post.
   - viewFriendsPosts() в класс User, который выводит список всех постов, созданных друзьями.
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class User {

    private int id;
    private String name;
    private String email;
    private List<User> friends;
    private List<Post> posts;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }
    public String displayInfo() {
        return "User ID: " + id + ", Name: " + name + ", Email: " + email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        if (!friends.contains(user) && user != this) {
            friends.add(user);
            System.out.println(user.name + " added as a friend.");
        } else {
            System.out.println(user.name + " is already your friend or you cannot add yourself.");
        }
    }

    public void removeFriend(User user) {
        if (friends.remove(user)) {
            System.out.println(user.name + " removed from friends.");
        } else {
            System.out.println(user.name + " is not in your friends list.");
        }
    }

    public Post createPost(String content) {
        Post newPost = new Post(this, content);
        posts.add(newPost);
        return newPost;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void viewFriendsPosts() {
        System.out.println(name + "'s friends' posts:");
        for (User friend : friends) {
            for (Post post : friend.getPosts()) {
                System.out.println(friend.name + ": " + post.getContent());
            }
        }
    }
} // klass ended




