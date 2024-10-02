public class Puzzle {
    public static void main(String[] args) {

        int x= 5;
        int x1= --x;
        int x2= x--;
        int y = x-- + --x;
        y= x1+ x2;
        System.out.println( " x-- + --x mit x= 5 ist gleih " + y + " aber: --x" + x1 + " und x-- = " + x2 );

    }
}
