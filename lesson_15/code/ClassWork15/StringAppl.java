package ClassWork15;

public class StringAppl {
    public static void main(String[] args){

    String str1 = " Hello, ";
    char[] chars = { 32, 'W', 'o', 'r', 'd', '!'};//32 kod probela

    String str2 = new String(chars);//str2 eto chast klaassa orint,obiekt...v konstruktore string,on metod
    // hew visivaet konstruktor lijubogo klassa ili massiva

    System.out.println(str1);// hello
    System.out.println(str2);// word

     // concat - skladivaem i objrdenjaem obiekti
     String str = str1+ str2;
        System.out.println(str);

        // str1 polocshit v str2
        str1.concat(str2) ;// konkatinazija metoda
        System.out.println(str1);// str2 ne pridet,potomu,chto metod ne rabotaet,tolko str1 aktiviruetsa
        System.out.println(str1.concat(str2));

        // dlinna stroki - lengt of String
        int l = str.length();// poisk dlinni stroki str,int dlja zelogo chisla
        System.out.println(l);

       //first symbol - pervii simvol
       char ch = str.charAt(0);
        System.out.println( " First symbol: " + ch);

        // last symbol - poslednii cimvol
        ch = str.charAt(str.length() -1 );
        System.out.println( " Last symbol : " +ch);

        //print with spaces - petchataem c probelami
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();// perecho na odnu stroku iz stolbika s print funkziei

        // check equals - metod cravnenija ctrok tekcta
        String str3 = "  wOrDl !";
        boolean checker = str3.equals(str2);// Wordl
       // str1 = str1 + " Margo ! "; prowerka iskaschenija
       // System.out.println(str1); vnesli ismenenija
        System.out.println(checker);// falce
        checker = str3.equalsIgnoreCase(str2);// ignir
        System.out.println(checker);

        System.out.println("------------------------------------");
        // position
        System.out.println(str);
        int index = str.indexOf( 'H');
        System.out.println(index);
         int index1 = str.lastIndexOf('d');//c prava na verch,poisk
        System.out.println(index1);
        index = str.indexOf('o');
        index1 = str.lastIndexOf('o');
        System.out.println( index  + ", " + index1 );
        index = str.indexOf('X');
        System.out.println(index);


        System.out.println( "-------------substring------------------------");
        // vidilinie chasti indeksa
        System.out.println(str.substring( 7 ));
        System.out.println(str.substring( 7, 10 ));


        System.out.println( "----------------replace------------------------------");
        // samena chasti indeksa
        System.out.println(str.replace("o", "ALT") );


        System.out.println( "------------split----------------------- ");
        // schet slov predlocshenija
        String str4 = "I love you";
        String[] words = str4.split( " ");
        int w = words.length;
        System.out.println( " Numbers of words in sentence : " + w);//schitaet vce chto cherez probel,ostoroschno s probelami!!!
        // schet bukv v slovach
        String[] letters = str4.split( "");
        int let = letters.length;
        System.out.println(" Numbers of letters in sentence : " + let);


        System.out.println( "-------------String.format--------------------");
        //Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число(int) – месяц(wort) – год(int)." и напечатайте ее в консоли.
        //Используйте String.format()
         int day = 12;//%d
         String month = "April";//%s
         int year = 1961;//%d

        String gagarinDay = String.format(" First flight into spase : %d - %s - %d", day, month, year);
        System.out.println(gagarinDay);


     }
}
