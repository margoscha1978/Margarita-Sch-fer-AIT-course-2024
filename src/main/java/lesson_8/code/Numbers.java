public class Numbers {
    public static void main(String[] args) {
     // drücken Ziffern von 1 bis 100 ,aber nur die durch 5 geteilt können sind

      int i = 0;// parametr von zikl
      int y = 100;

      while ( i <= y ){

          if ( i % 7 == 0){ //  7,zamenjaemoe chislo v zikle,lijuboe chislo
              //System.out.println( i + " "); v stolbik raspechataet
              System.out.print(  i + " ");// v stroku
              // " " cposob dobavit prostranstvo
          }// end of if
         // System.out.println( i ); napechataet slitno bez probelov
          i++; // fiksiruem yvelichenie na 1
         // System.out.print( i + " "); napechataet c probelom

      }// ende zikl

    } // ende main
} // ende klass
