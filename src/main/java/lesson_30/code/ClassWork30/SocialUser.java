package ClassWork30;

/**
 * Этот класс реализует интерфейсы SocialAuth и SocialSharing,
 * что позволяет ему авторизовывать пользователей и делиться контентом в социальных сетях.
 */
public class SocialUser implements SocialAuth, SocialSharing {

    // Token used for authentication and sharing
    // Токен, используемый для авторизации и публикации
    private String token;

    /**
     * Авторизует пользователя, используя его учетные данные.
     *
     * @param userCredentials The credentials used for authentication. / Учетные данные для авторизации.
     */
    @Override
    public void authenticate(String userCredentials) {
        this.token = userCredentials;
        System.out.println("Универсальная авторизация с общим токеном: " + token);
    }

    /**
     * Возвращает профиль пользователя после успешной авторизации.
     *
     * @return A string representation of the user profile. / Строковое представление профиля пользователя.
     */
    @Override
    public String getUserProfile() {
        return "Универсальный профиль (токен: " + token + ")";
    }

    /**
     * Публикует сообщение на платформе социальной сети, используя токен авторизации.
     *
     * @param message The message to post. / Сообщение для публикации.
     */
    @Override
    public void postMessage(String message) {
        System.out.println("Постим сообщение " + message + " с помощью токена " + token);
    }
} // klass ended
