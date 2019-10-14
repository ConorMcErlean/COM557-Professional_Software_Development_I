package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class AddNumbers4 {
   public static void main(String[] args) {
      // Declare & Initialise Variables
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.0");
      final int TERMINATOR = -999;
      int number, total = 0, count = 0;
      double average;

      // Initial user prompt
      System.out.print("Enter the first number: ");
      number = keyboard.nextInt();

      // While Loop
      while (number != TERMINATOR){
         total += number;
         count++;
         System.out.print("Enter a number (or -999 to finish): ");
         number = keyboard.nextInt();
      }//While

      //Work out the average
      average = total/count;

      System.out.println("\nThe total of the numbers is " + total+
            "\nThe average of the " + count + " numbers is "
            + df.format(average));

   }//main
}//class
