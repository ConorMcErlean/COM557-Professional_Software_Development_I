package Lab7;

/**
 * Created by pg19mec on 18/10/2019
 * draws the letter X in the form of asterisks
 */
public class DrawX {
   // Print the top & bottom layer
   private static void drawOuter(){
      System.out.println("* \t\t\t\t*");
   }//OuterLayer
   //Print the second and fourth lines
   private static void drawInner(){
      System.out.println("\t*\t\t*");
   }//innerLayer

   // Print the middle layer
   private static void drawMiddle(){
      System.out.println("\t\t*");
   }//middleLayer

   public static void main(String[] args) {
      drawOuter();
      drawInner();
      drawMiddle();
      drawInner();
      drawOuter();
   }//main
}//class
