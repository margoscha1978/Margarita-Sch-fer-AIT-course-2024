package homework29;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user1;
    private User user2;
    private User user3;
    //user1.addFriend(user2);

    @BeforeEach
    public void setUp() {
        user1 = new User(1, "John Karter", "john@example.com");
        user2 = new User(2, "Jane Smithen", "jane@example.com");
        user3 = new User(3, "Mike Johnson", "mike@example.com");
    }

    @Test
    public void testAddFriend() {
        user1.addFriend(user2);
        assertTrue(user1.getFriends().contains(user2), "User2 should be a friend of User1");
    }

    @Test
    public void testRemoveFriend() {
        user1.addFriend(user2);
        user1.removeFriend(user2);
        assertFalse(user1.getFriends().contains(user2), "User2 should not be a friend of User1 anymore");
    }

    @Test
    public void testCreatePost() {
        Post post = user1.createPost("Hello, world!");
        assertNotNull(post, "Post should not be null");
        assertEquals("Hello, world!", post.getContent(), "Post content should match");
        assertEquals(user1, post.getAuthor(), "Post author should be User1");
    }

    @Test
    public void testViewFriendsPosts() {
        user1.addFriend(user2);
        user2.createPost("Hello from Jane!");

        user1.viewFriendsPosts();
        /* Здесь можно добавить еще варианты для более точной проверки, если это необходимо
        // у нас есть пост от User2
            String postContent = "Hello from Jane!";
            user2.createPost(postContent);

            // Перенаправляем стандартный вывод
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream oldOut = System.out; // Сохраняем текущее значение System.out
            System.setOut(new PrintStream(outputStream)); // Перенаправляем вывод в outputStream

            // Вызов тестируемого метода
            user1.viewFriendsPosts();

            // Возвращаем стандартный вывод
            System.setOut(oldOut);

            // Проверяем вывод
            String expectedOutput = "John Doe's friends' posts:\nJane Smith: Hello from Jane!\n";
            assertEquals(expectedOutput, outputStream.toString());
         */
      }

} // test ended

/*
Объяснение тестов:
1. setUp(): Этот метод запускается перед каждым тестом, создавая новых пользователей для тестирования.
2. testAddFriend(): Тестирует метод добавления друга и проверяет, что пользователь действительно стал другом.
3. testRemoveFriend(): Тестирует метод удаления друга и проверяет, что пользователь больше не является другом.
4. testCreatePost(): Тестирует метод создания поста и проверяет,
   что пост был успешно создан с правильным содержимым и автором.
5. testViewFriendsPosts(): Проверяет, что при просмотре постов друзей вы можете видеть их записи.
   Тут проверка может быть в том, чтобы отследить вывод. Для этого можно использовать заглушки
   или перенаправление вывода.
 */