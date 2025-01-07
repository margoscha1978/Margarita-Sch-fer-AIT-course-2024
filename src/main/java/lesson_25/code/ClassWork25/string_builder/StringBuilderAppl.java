package ClassWork25.string_builder;

public class StringBuilderAppl {

    public static void main(String[] args) {

    //metod gotovii v Java
  StringBuilder sb = new StringBuilder("Java"); // stroit strochki i izmenjaet ix,prisojedenjaet chasti
        System.out.println(sb);

        sb.append("_").append("21"); // izmenjaemii, i legko vnosit izmenenija pri rabote,
        System.out.println(sb);// posledovatelen v rabote v otlichii ot obichnogo String

        sb.reverse(); // perevorot stroki b obratnom napravlenii Java_21 = 12_avaJ,razvorot
        System.out.println(sb);

StringBuilder sbNew = new StringBuilder("Hello Word");
sbNew.insert(5,"!"); // vstavim znak ! na mesto,ykazati sam znak i mesto
        System.out.println(sbNew);
sbNew.insert(11,"!"); // vstavim znak ! na mesto,ykazati sam znak i mesto
        System.out.println(sbNew);
        sb.append(true); // vstavit znak avtomaticheski v konez,append - konez
        System.out.println(sbNew);









    }

}