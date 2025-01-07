public class ArrayCopyExample {

  public static int[]  copyOfArray(int[] originalArray, int newLength) {

   //novii massiv s zadannoi dlinnoi
   int[] newArray =  new int[newLength];

   // perenosim elementi

   for ( int  i = 0; i < newLength && i < originalArray.length;i++)  {
       newArray[i] = originalArray[i];
      }
     return newArray; //vernuli novii massiv
  }
    public static void main(String[] args) {

      int[] array = { 0, 1, 2, 3, 4, 5, 6};
      int[]copiedArrey = copyOfArray(array, 3);

        // resultat
        System.out.print( " { " );
        for (int i = 0; i <copiedArrey.length; i++) {
            System.out.print(copiedArrey[i]);
            if( i < copiedArrey.length  -1 ) {
                System.out.print( ", ");
            }
        }
        System.out.println( " } ");//zakrili
    }
}
