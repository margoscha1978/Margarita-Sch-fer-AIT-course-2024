package ClassWork30;

/**
 * Этот класс представляет администратора, который является особым типом пользователя.
 * Администраторы обладают дополнительными правами, например, возможностью блокировать других пользователей.
 */
public class AdminUser extends User {

    /**
     * Конструктор для инициализации администратора с ID, именем и адресом электронной почты.
     */
    public AdminUser(String id, String name, String email) {
        super(id, name, email);
    }

    /**
     * Блокирует пользователя, отображая сообщение.
     */
    public void banUser() {
        System.out.println("User is banned!");
    }

    /**
     * Переопределяет метод для вывода дополнительной информации о администраторах.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Admin User");
    }
} // klass ended
