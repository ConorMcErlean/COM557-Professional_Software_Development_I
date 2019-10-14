package Lab6;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class NestedForX {
   public static void main(String[] args) {
      final String figure = "X";

      for (int row = 1; row <= 3; row++){
         for (int column = 1; column <=4; column++){
            System.out.print("\t" + figure);
         }//for
         System.out.println();
      }//for

   }//main
}//class
