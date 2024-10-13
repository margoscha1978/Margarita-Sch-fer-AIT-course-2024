package ClassWork22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

        User user;

        final String email = "peter@mail.de"; // ideal email
        final String password = "123456Az!"; // ideal password


        @BeforeEach
        void setUp() {
            user = new User(email, password); // create new 'fresh' object user
        }

        @Test
        void testValidEmail(){
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail());
        }

        @Test
        void testValidPassword(){
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setEmailNoAt() {
            String email = "petermail.de"; // wrong email
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail()); // email didn't change

        }
        @Test
        void setEmailWithTwoDots() {
            String email = "peter@mailukco"; // wrong email
            user.setEmail(email);
            assertEquals("peter@mail.de", user.getEmail());
            System.out.println(user.getEmail());
        }

        @Test
        void setValidPasswordLength(){
            user.setPassword("1234Az!"); // 7 symbols
            assertEquals("123456Az!", user.getPassword());
            user.setPassword("123456123456123456Az!"); // 21 symbol
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setValidPasswordMinOneDigit(){
            user.setPassword("Asdfghj!");
            assertEquals("123456Az!", user.getPassword());
        }


        @Test
        void setValidPasswordOneLetterUpperCase(){
            user.setPassword("123456az!");
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setValidPasswordOneLetterLowerCase(){
            user.setPassword("123456AZ!");
            assertEquals("123456Az!", user.getPassword());
        }

        @Test
        void setValidPasswordOneSpecialSymbol(){
            user.setPassword("123456Az"); // no Special Symbol
            assertEquals("123456Az!", user.getPassword());
        }
    }
