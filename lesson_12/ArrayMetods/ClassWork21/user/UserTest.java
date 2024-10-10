package ClassWork21.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    final String email = "peter@mail.de";//podxodjaschii mail
    final String password = "123456Az!";//podxodjaschii paroli

    @BeforeEach
    void setUp() {
       user = new User(email, password );//kontrol vvodimix dannix
    }

    @Test
    void testValidEmail(){
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail()); //podtverschdenie maila
    }

    @Test
    void setEmail() {
        String email = "petermail.de";// oschibka vo vvode propustil znak @
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail()); //sravnenie so standartom
    }

    @Test
    void setEmailnoDot(){ //poterjalas tochka
        String email = "petermail@de";
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail()); // sravnenie so standartom

    }
    @Test
    void setEmailnoLeeters(){
        String email = "peermail@.de";// propustil bukvu
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }
@Test
void setEmailmixedSingt(){
    String email = "petermail@,de"; //pereputal znak,zapjataja vmesto tochka
    user.setEmail(email);
    assertEquals("peter@mail.de",user.getEmail());
}
@Test
void setEmailaddedSpace(){
  String email = "peter@mail. de"; // lischnii probel
    user.setEmail(email);
    assertEquals("peter@mail.de",user.getEmail());
}
@Test
void setEmailInkorrektSign(){
   // String email = "pete@rmail.de"; // @ stoit neverno,tect upal
   // String email = "petermail@.de";
   // String email = "pteer@mail.de"; // pomehjal bujvi mestami
   // String email = "Peter@mail.de";
    String email = "peter@mail..de";
    user.setEmail(email);
    assertEquals("peter@mail.de",user.getEmail());
}


    @Test
    void setPassword() {

    }
}

// - email requirements:
// 1) @ exists and only one
// 2) dot after @ User
// 3) after last dot 2 or more symbols
// 4) alphabetic, digits, '_', '-', '.', '@'
