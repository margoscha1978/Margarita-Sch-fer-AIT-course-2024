package homework30;
/*
Создайте класс UserMessenger, который «отправляет» и «получает» сообщения:
    Используйте внутренний Map<String,
    List<String>> (где ключ — это userId, а значение — список сообщений) для хранения сообщений
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserMessenger implements Messenger {
    private Map<String, List<String>> messages = new HashMap<>();

    @Override
    public void sendMessage(String message, String userId) {
        messages.putIfAbsent(userId, new ArrayList<>());
        messages.get(userId).add(message);
    }

    @Override
    public List<String> receiveMessages(String userId) {
        return messages.getOrDefault(userId, new ArrayList<>());
    }
} // klass ended
