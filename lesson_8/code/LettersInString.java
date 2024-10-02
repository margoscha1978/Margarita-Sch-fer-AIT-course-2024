import java.util.Scanner;

public class LettersInString {
    public static void main(String[] args) {

        // arbei mit Tastatur,jede Buchstabe pro Scritt( linie)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();

        System.out.println(str); //str(stroka) peremennaja,imja,obekt

        //metod length,und charAt()

        int l = str.length();
        System.out.println( l );// bukva postrokam,lm ybrati bydet tekst na odnoi stroke

        int i = 0;
        //margarita
        // 1 simvol = 0; i dalee,0123456789

      while ( i < l ){
          System.out.println(str.charAt( i ));
          i++; // i = i+1
        }//ende zikl

    }//ende main
}//ende klass
