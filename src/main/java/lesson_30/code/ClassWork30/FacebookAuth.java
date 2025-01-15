package ClassWork30;

/**
 * Этот класс реализует интерфейс SocialAuth для предоставления функциональности авторизации через Facebook.
 * Он включает методы для авторизации, получения профилей пользователей и управления попытками входа.
 */
public class FacebookAuth implements SocialAuth {

    // Токен, используемый для авторизации
    private String token;

    /**
     * Авторизует пользователя, используя его учетные данные (например, токен доступа).
     *
     * @param userCredentials The credentials used for authentication. / Учетные данные для авторизации.
     */
    @Override
    public void authenticate(String userCredentials) {
        this.token = userCredentials;
        System.out.println("Авторизация через Facebook с токеном: " + token);
    }

    /**
     * Возвращает профиль пользователя на основе токена авторизации.
     *
     * @return A string representation of the user profile. / Строковое представление профиля пользователя.
     */
    @Override
    public String getUserProfile() {
        return "Facebook-профиль пользователя с токеном: " + token;
    }

    /**
     * Проверяет, находится ли текущая попытка входа в пределах допустимого лимита.
     *
     * @param currentAttempts The number of login attempts made. / Количество совершенных попыток входа.
     * @return True if the attempt is allowed; false otherwise. / True, если попытка допустима, иначе false.
     */
    @Override
    public boolean checkLoginAttempts(int currentAttempts) {
        if (currentAttempts <= 2) {
            System.out.println("Facebook попытка входа допустима");
            return true;
        } else {
            System.out.println("Facebook попытки входа превышены");
            return false;
        }
    }
} // klass ended
