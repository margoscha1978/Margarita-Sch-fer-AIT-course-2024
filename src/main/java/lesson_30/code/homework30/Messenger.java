package homework30;
/*
Создайте интерфейс Messenger с методами:
    void sendMessage(String message, String userId).
    List<String> receiveMessages(String userId).
 */
import java.util.List;

public interface Messenger {
    void sendMessage(String message, String userId);
    List<String> receiveMessages(String userId);

} // interface ended
