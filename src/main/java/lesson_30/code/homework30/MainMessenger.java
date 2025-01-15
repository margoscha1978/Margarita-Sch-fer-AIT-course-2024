package homework30;
/*
В методе main():
    Продемонстрируйте отправку и получение сообщений
    между несколькими пользователями.
 */
public class MainMessenger {
    public static void main(String[] args) {
        UserMessenger userMessenger = new UserMessenger();

        // Отправка сообщений
        userMessenger.sendMessage("Привет!", "user1");
        userMessenger.sendMessage("Как дела?", "user2");
        userMessenger.sendMessage("На связи", "user1");

        // Получение и вывод сообщений
        System.out.println("Сообщения для user1: " + userMessenger.receiveMessages("user1"));
        System.out.println("Сообщения для user2: " + userMessenger.receiveMessages("user2"));
    }
} // klass ended
