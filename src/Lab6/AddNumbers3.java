package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * Read in a list of numbers and print out their total, with no knowledge of the
 * number of numbers to be added ie. use a terminator value
 *
 *
 * */
public class AddNumbers3 {
   public static void main(String[] args) {

      // Scanner Set-up
      Scanner keyboard = new Scanner(System.in);

      // Declare Variables
      final int TERMINATOR = -999;
      int number, total = 0;

      // Initial user prompt
      System.out.print("Enter the first number: ");
      number = keyboard.nextInt();

      // While Loop
      while (number != TERMINATOR){
         total += number;
         System.out.print("Enter a number (or -999 to finish): ");
         number = keyboard.nextInt();
      }//While

      System.out.println("\nThe total of the numbers is " + total);

   }//main
}//class
