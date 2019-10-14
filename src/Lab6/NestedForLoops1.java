package Lab6;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class NestedForLoops1 {
   public static void main(String[] args) {
      for (int row = 1; row <= 5; row++){
         for (int column = 1; column <= row; column++){
            System.out.print("\t" + column);
         }
         System.out.println();
      }//for

   }//main
}//class
