public class Alphabet {
    public static void main(String[] args) {

   // massiv c bukvami ot A do Z;simvolami upravljaet char

       char[] alphabet = new char[26];
       for (int i= 0; i < alphabet.length; i++ ) {

          alphabet[i] = (char) (65 + i);//int 65 perevesti v char; i idet ot 0 do 26

           System.out.print(alphabet[i] + " ");

       }

    }
}
