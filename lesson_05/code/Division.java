public class Division {
    public static void main(String[] args) {

   int a= 45;
   int b=9;
   boolean res = isDivided( a, a);
        System.out.println( " a = " + a + " b = " + b + " is divided " + res );




    }
 public static boolean isDivided(int a,int b) {
  return a % b == 0;
 }


}
