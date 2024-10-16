package ClassWork25.regex_appl;

public class RegexAppl {
    public static void main(String[] args) {

    String text = " Java";
    String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?"; // 1-9 |(ili) 1-9,0-9..." ? " ukazivaet na versii daet vibor,esli ego net to delat

    boolean checker = text.matches(pattern);
        System.out.println(checker);

        // probel,i ix kolichestvo ne vlijaet na check pered *,zdesi 1 probel
        // cmena J na Y oschibka
        // cmena J na j ne vlijaet,dopustimo
        // vnesenie zifr,false...no vozmocshno ukazannie,zdesi 1-9 | 1-9,0-9 vozmocshen vvod do 2 zifr ot 1 do 9
        // * razreschaet povtorjati simvol pered nei
        // "?" daet vibor,esli ego net to delati
        System.out.println("-------------------------------------");

        // domain - domen
        String domain = "A-b-r.a-kadabra.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)"; // vse dopucshenija ispolisovanni
        checker = domain.matches(pattern);
        System.out.println(checker);
        // v domenach vozmocshi dopustimie variazii,zamena com na de dopucshenna

        //mail,e-mail
        //1) @ exists and only one (done)
        //2) dot after @ (done)
        //3) after last dot 2 or more symbols (done)
        //4) alphabetic, digits, '_', '-', '.', '@' (done)

        System.out.println("----------------------------------------------------------");
        String email = "peter@mail.Co";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)@[a-zA-Z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        checker = email.matches(pattern);
        System.out.println(checker);




    }
}