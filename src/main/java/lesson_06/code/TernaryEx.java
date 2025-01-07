import java.util.Scanner;

public class TernaryEx {
    public static void main(String[] args) {

int a= 24;
int b= 36;
int min =( a < b ) ? a : b;//kann luge sein,ternary operator
        //wenn a,mehr als b,dann luge,und b minimum wird
        System.out.println(" min = " + min);

int max = ( a > b) ? a : b;//: dann
        System.out.println(" max = " + max);

//input data
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        a = scanner.nextInt();
        System.out.println(" Input 2st number: ");
        b = scanner.nextInt();
        min = minAB( a, b );
        System.out.println(" Min = " + min );
    }//main ende

    public static int minAB( int a, int b){
      return(a < b) ?  a : b;

    }

}//klass ende
