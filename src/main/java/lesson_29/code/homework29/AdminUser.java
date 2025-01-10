package homework29;
/*
3. Класс AdminUser:
Также наследуется от User.
 - Содержит список bannedUsers для хранения заблокированных пользователей.
 - Метод banUser(User user) добавляет пользователя в список заблокированных
   и возвращает сообщение о блокировке.
 - Метод displayBannedUsers() возвращает список имен заблокированных пользователей.
 - Переопределение метода displayInfo() для отображения роли пользователя как администратора.
 */
import java.util.ArrayList;
import java.util.List;

class AdminUser extends User {
    private List<User> bannedUsers;

    public AdminUser(int id, String name, String email) {
        super(id, name, email);
        this.bannedUsers = new ArrayList<>();
    }

    public String banUser(User user) {
        bannedUsers.add(user);
        return "User " + user.getName() + " has been banned.";
    }

    public List<String> displayBannedUsers() {
        List<String> bannedUserNames = new ArrayList<>();
        for (User user : bannedUsers) {
            bannedUserNames.add(user.getName());
        }
        return bannedUserNames;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Role: Admin";
    }
} // klass ended
