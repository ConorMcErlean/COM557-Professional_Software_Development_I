package Lab6;

/**
 * Created by pg19mec on 14/10/2019
 * Make a pyramide
 */
public class NestedForLoops2 {
   public static void main(String[] args) {
      for (int row = 1; row <= 5; row++){
         // Tabs loop
         for (int tabs = 5 - row; tabs > 0; tabs--){
            System.out.print("\t");
         }//for

         // Descending numbers loop
         for (int column = row; column >= 1; column--){
            System.out.print((column) + "\t");
         }//for

         // Ascending numbers loop
         for (int column = 2; column <= row; column++){
            System.out.print(column + "\t");
         }//for
         System.out.println();
      }//for

   }//main
}//class
