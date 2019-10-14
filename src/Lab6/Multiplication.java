package Lab6;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Multiplication {
   public static void main(String[] args) {
      for (int row = 1; row <=10; row++){
         for (int column = 1; column <=10; column++){
            System.out.print("\t" + (row*column));
         }//for
         System.out.println();
      }//for

   }//main
}//class
