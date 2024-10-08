package ClassWork19.compare_string;

/// равенство строк - как понять?
public class CompareStringAppl {
    public static void main(String[] args) {

    int x= 5;//platz stek
    int y= 5;//platz stek

    boolean checker = ( x == y) ;//sravnenie
    System.out.println(checker);

    String str1 = "Europe";//str1 lechsit v stek->(links)Europe heap
    String str2 = "Europe";//str2 lechsit v stek->(links)Europe heap//str1=str2 odinakovie
    System.out.println("------------------------------------");

    checker = (str1 == str2);//compare strings(cravnili)
    System.out.println(checker);
    System.out.println("-----------------------------------");

    String str3 = new String("Europe");//create,sozdali novii pochochsii vid
    checker = (str1 == str3);
    System.out.println(checker);//false,potomu,chto proverjaetsa ssilka,a new sozdal novuju ssilku dlja str3!!!

    System.out.println("-----------------------------------");
    checker = str1.equals(str3);//cravnenie metodom .equals
    System.out.println(checker);

    }
}
