package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class LargestNumber {
   public static void main(String[] args) {
      // Declare & Initialise
      Scanner sc = new Scanner(System.in);
      final int TERMINATOR = -999;
      int number, largestNumber;

      // User prompt
      System.out.print("Please enter your first number: ");
      number = sc.nextInt();
      largestNumber = number;

      //While loop
      while (number != TERMINATOR){
         System.out.print("Please enter a number (or -999 to exit): ");
         number = sc.nextInt();

         if (number> largestNumber){
            largestNumber = number;
         }
      }//while
      System.out.println("\nThe largest number in that list was :" + largestNumber);

   }//main
}//class
